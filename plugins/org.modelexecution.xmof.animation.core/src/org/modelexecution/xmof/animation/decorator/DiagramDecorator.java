/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.decorator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.JobHoldUntil;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectNode;
import org.modelexecution.xmof.animation.decorator.internal.EdgeID;
import org.modelexecution.xmof.animation.decorator.internal.ElementState;
import org.modelexecution.xmof.animation.mapping.Match;

/**
 * The DiagramDecorator is capable of manipulating the graphical representation
 * via decorating of diagram elements
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public abstract class DiagramDecorator {
	private boolean activityFinished = false;
	protected Activity activity;
	protected Map<String, ActivityNode> activityNodeMap;
	protected Map<EdgeID, Set<ActivityEdge>> activityEdgeMap;
	protected Map<ActivityNode, Set<ActivityParameterNode>> conncetedParameterNodeMap;
	protected ActivityNode activeNode;
	protected ActivityNode previouslyActiveNode;
	protected StructuredActivityNode inStructuredNode = null;
	protected Set<ActivityEdge> activeEdges;
	protected Set<ActivityEdge> previouslyActiveEdges;

	public DiagramDecorator(Activity activity) {
		this.activity = activity;
	}

	public void initializeMaps() {
		activityNodeMap = new HashMap<>();
		activityEdgeMap = new HashMap<>();
		conncetedParameterNodeMap = new HashMap<>();
		for (ActivityNode node : activity.getNode()) {
			processActivityNode(node);
		}
		for (ActivityEdge edge : activity.getEdge()) {
			processActivityEdge(edge);
		}

	}

	/**
	 * Decorates activity node in different nodes depending of the status
	 * (traversed or active)
	 * 
	 * @param match
	 *            matched debug event
	 * @return true if node has a xMOFName
	 */
	public boolean decorateActivityElement(Match match) {
		if (activityNodeMap == null) {
			initializeMaps();
		}
		if (isActivityFinished()) {
			resetDiagram();

		}
		activeNode = activityNodeMap.get(match.getXmofElementName());

		if (previouslyActiveNode != null) {
			if (conncetedParameterNodeMap.containsKey(previouslyActiveNode)) {
				for (ActivityNode node : conncetedParameterNodeMap.get(previouslyActiveNode)) {
					decorateElement(node, ElementState.TRAVERSED);
				}
			}
			if (!(previouslyActiveNode instanceof StructuredActivityNode)) {

				decorateElement(previouslyActiveNode, ElementState.TRAVERSED);
			}

		}
		if (inStructuredNode != null) {

			if (activeNode == null || activeNode.getInStructuredNode() == null
					|| !activeNode.getInStructuredNode().equals(inStructuredNode)) {
				previouslyActiveNode = inStructuredNode;
				decorateElement(previouslyActiveNode, ElementState.TRAVERSED);
				inStructuredNode = null;
			}
		}

		if (previouslyActiveEdges != null) {
			for (ActivityEdge edge : previouslyActiveEdges) {
				decorateElement(edge, ElementState.TRAVERSED);
			}

		}

		if (activeNode != null) {
			if (activeNode instanceof StructuredActivityNode) {
				inStructuredNode = (StructuredActivityNode) activeNode;
			}
			decorateElement(activeNode, ElementState.ACTIVE);
			if (conncetedParameterNodeMap.containsKey(activeNode)) {
				for (ActivityNode node : conncetedParameterNodeMap.get(activeNode)) {
					decorateElement(node, ElementState.ACTIVE);
				}
			}
		}

		activeEdges = retrieveActiveEdges();
		if (activeEdges != null) {
			for (ActivityEdge edge : activeEdges) {
				decorateElement(edge, ElementState.ACTIVE);
			}

		}

		previouslyActiveNode = activeNode;
		previouslyActiveEdges = activeEdges;
		return activeNode != null;

	}

	private void resetDiagram() {
		resetDecorations();
		setActivityFinished(false);
		activeEdges = null;
		previouslyActiveEdges = null;
		inStructuredNode = null;
		activeNode = null;
		previouslyActiveNode = null;

	}

	protected void resetDecorations() {
		DecoratorService.clear(activity.getName());
		refreshDiagram();
	};

	protected abstract void refreshDiagram();

	protected void decorateElement(EObject element, ElementState state) {
		DecoratorService.addDecoratedElement(activity, element, state);

	}

	public boolean isActivityFinished() {
		return activityFinished;
	}

	public void setActivityFinished(boolean activityFinished) {
		refreshDiagram();
		this.activityFinished = activityFinished;
	}

	public Activity getActivity() {
		return activity;
	}

	/**
	 * Determines source and target nodes of a edge and puts the result in the
	 * edge map
	 * 
	 * @param edge
	 *            Edge of an activity diagram
	 */
	private void processActivityEdge(ActivityEdge edge) {
		ActivityNode source = null, target = null;
		if (edge instanceof ControlFlow) {
			source = edge.getSource();
			target = edge.getTarget();
		} else if (edge instanceof ObjectFlow) {
			source = retrieveConnectedNode(edge.getSource());
			target = retrieveConnectedNode(edge.getTarget());
		}
		if (source != null && target != null) {
			addToEdgeMap(edge, source, target);
		}
		if (source instanceof ActivityParameterNode) {
			addToConnectedParameterNodeMap(target, (ActivityParameterNode) source);
		} else if (target instanceof ActivityParameterNode) {
			addToConnectedParameterNodeMap(source, (ActivityParameterNode) target);
		}

	}

	private void addToConnectedParameterNodeMap(ActivityNode key, ActivityParameterNode paramteterNode) {
		Set<ActivityParameterNode> paramNodes = conncetedParameterNodeMap.get(key);
		if (paramNodes == null) {
			paramNodes = new HashSet<>();
		}
		paramNodes.add(paramteterNode);
		conncetedParameterNodeMap.put(key, paramNodes);
	}

	private void addToEdgeMap(ActivityEdge edge, ActivityNode source, ActivityNode target) {
		EdgeID id = new EdgeID(source.getName(), target.getName());
		Set<ActivityEdge> edges = activityEdgeMap.get(id);
		if (edges == null) {
			edges = new HashSet<>();
		}
		edges.add(edge);
		activityEdgeMap.put(id, edges);
	}

	private ActivityNode retrieveConnectedNode(ActivityNode node) {
		if (node instanceof ObjectNode) {
			if (node instanceof Pin) {
				return retrieveConnectedNode((Pin) node);
			} else if (node instanceof ExpansionNode) {
				return retrieveConnectedNode((ExpansionNode) node);
			} else if (node instanceof ActivityParameterNode) {
				return node;
			}
		}
		return node;

	}

	private ActivityNode retrieveConnectedNode(ExpansionNode expansionNode) {
		if (expansionNode.getRegionAsInput() != null) {
			return expansionNode.getRegionAsInput();
		} else
			return expansionNode.getRegionAsOutput();
	}

	private ActivityNode retrieveConnectedNode(Pin pin) {
		if (pin.eContainer() instanceof ActivityNode) {
			return (ActivityNode) pin.eContainer();
		}

		return null;
	}

	/**
	 * Determines nodes that are linked with the node
	 * 
	 * @param node
	 *            Node of an activity diagram
	 */
	private void processActivityNode(ActivityNode node) {
		if (node.getName() != null) {
			if (node instanceof StructuredActivityNode) {

				getActivityNodes((StructuredActivityNode) node);
				getActivityEdges((StructuredActivityNode) node);
			}
			activityNodeMap.put(node.getName(), node);
		}
	}

	private void getActivityEdges(StructuredActivityNode node) {
		for (ActivityEdge edge : node.getEdge()) {
			processActivityEdge(edge);
		}

	}

	private void getActivityNodes(StructuredActivityNode expNode) {
		for (ActivityNode actNode : expNode.getNode()) {
			processActivityNode(actNode);
		}

	}

	private Set<ActivityEdge> retrieveActiveEdges() {

		if (activeNode == null)
			return null;
		Set<ActivityEdge> edges = new HashSet<>();
		if (conncetedParameterNodeMap.containsKey(activeNode)) {
			edges.addAll(retrieveEdges(activeNode, conncetedParameterNodeMap.get(activeNode)));
		}
		if (previouslyActiveNode!=null){
			EdgeID id = new EdgeID(previouslyActiveNode.getName(), activeNode.getName());
			if (activityEdgeMap.get(id)!=null){
				edges.addAll(activityEdgeMap.get(id));
			}
		
		}
		

		return edges;
	}

	private Set<ActivityEdge> retrieveEdges(ActivityNode activityNode, Set<ActivityParameterNode> parameterNodes) {
		Set<ActivityEdge> edges = new HashSet<>();
		for (ActivityParameterNode paramNode : parameterNodes) {
			edges.addAll(extractEdge(activityNode, paramNode));
		}
		return edges;
	}

	private Set<ActivityEdge> extractEdge(ActivityNode activityNode, ActivityParameterNode paramNode) {
		EdgeID id = new EdgeID(activityNode.getName(), paramNode.getName());
		if (activityEdgeMap.containsKey(id)) {
			return activityEdgeMap.get(id);
		} else {
			id = new EdgeID(paramNode.getName(), activityNode.getName());
			return activityEdgeMap.get(id);
		}

	}

}
