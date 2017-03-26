/*******************************************************************************
 * Copyright (c) 2016 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.decorator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.animation.core.decorator.internal.ActivityElementContainer;
import org.modelexecution.xmof.animation.core.decorator.internal.DiagramUtil;
import org.modelexecution.xmof.animation.core.decorator.internal.ElementState;

/**
 * DecoratorService class to specify which elements need to be decorated
 * (respectively animated).
 * 
 **/
public class DecoratorService {

	private static Map<String, ActivityElementContainer> activityElementContainerMap = new HashMap<>();

	public static void addDecoratedElement(Activity activity, EObject element, ElementState state) {
		if (element instanceof ActivityNode) {
			setNode(activity, (ActivityNode) element, state);
		} else if (element instanceof ActivityEdge) {
			setEdge(activity, (ActivityEdge) element, state);
		}
	}

	/**
	 * Determines if passed node is the active node in the current diagram
	 * 
	 * @param node
	 *            Node of activity diagram
	 * @return boolean active node or not
	 */
	public static boolean isActiveNode(ActivityNode node) {

		String key = getActivityName(node);
		ActivityElementContainer container = activityElementContainerMap.get(key);
		if (container != null) {
			return container.getActiveNodes().contains(node.getName());
		}

		return false;

	}

	/**
	 * Determines if passed node was already used in diagram
	 * 
	 * @param node
	 *            Node of activity diagram
	 * @return boolean traversed node or not
	 */
	public static boolean isTraversedNode(ActivityNode node) {

		String key = getActivityName(node);
		ActivityElementContainer container = activityElementContainerMap.get(key);
		if (container != null) {
			return container.getTraversedNodes().contains(node.getName());
		}
		return false;
	}

	/**
	 * Determines if passed edge is the active edge in the current diagram
	 * 
	 * @param edge
	 *            Edge of activity diagram
	 * @return boolean active edge or not
	 */
	public static boolean isActiveEdge(ActivityEdge edge) {
		String key = getActivityName(edge);
		ActivityElementContainer container = activityElementContainerMap.get(key);
		if (container != null && container.getActiveEdges() != null) {

			return container.getActiveEdges().contains(DiagramUtil.toEdgeID(edge));
		}
		return false;
	}

	/**
	 * Determines if passed edge was already used in diagram
	 * 
	 * @param edge
	 *            Edge of activity diagram
	 * @return boolean traversed edge or not
	 */
	public static boolean isTraversedEdge(ActivityEdge edge) {
		String key = getActivityName(edge);
		ActivityElementContainer container = activityElementContainerMap.get(key);
		if (container != null) {

			return container.getTraversedEdges().contains(DiagramUtil.toEdgeID(edge));
		}
		return false;
	}

	public static void intializeContainer(String activityName) {
		if (!activityElementContainerMap.containsKey(activityName)) {
			activityElementContainerMap.put(activityName, new ActivityElementContainer());
		}

	}

	public static void reset() {
		activityElementContainerMap = new HashMap<>();

	}

	public static void clear(String activityName) {
		activityElementContainerMap.put(activityName, new ActivityElementContainer());
	}

	private static void setActiveNode(Activity activity, ActivityNode node) {
		ActivityElementContainer container = activityElementContainerMap.get(activity.getName());
		if (container != null) {
			container.addActiveNode(node.getName());
		}
	}

	private static void addTraversedNode(Activity activity, ActivityNode node) {
		ActivityElementContainer container = activityElementContainerMap.get(activity.getName());
		if (container != null) {
			container.addTraversedNode(node.getName());
		}
	}

	private static void setActiveEdge(Activity activity, ActivityEdge edge) {
		ActivityElementContainer container = activityElementContainerMap.get(activity.getName());
		if (container != null) {

			container.addActiveEdge(DiagramUtil.toEdgeID(edge));
		}
	}

	private static void addTraversedEdge(Activity activity, ActivityEdge edge) {
		ActivityElementContainer container = activityElementContainerMap.get(activity.getName());
		if (container != null) {
			container.addTraversedEdge(DiagramUtil.toEdgeID(edge));
		}
	}

	/**
	 * Extracts name of node from the diagram
	 * 
	 * @param node
	 *            Node of activity diagram
	 * @return String name of node
	 */
	private static String getActivityName(ActivityNode node) {
		if (node.getActivity() != null) {
			return node.getActivity().getName();
		} else if (node.getInStructuredNode() != null) {
			if (node.getInStructuredNode().getActivity() != null) {
				return node.getInStructuredNode().getActivity().getName();
			}
		}
		return "";
	}

	/**
	 * Extracts name of edge from the diagram
	 * 
	 * @param edge
	 *            Edge of activity diagram
	 * @return String name of edge
	 */
	private static String getActivityName(ActivityEdge edge) {
		if (edge.getActivity() != null) {
			return edge.getActivity().getName();
		} else if (edge.getInStructuredNode() != null) {
			if (edge.getInStructuredNode().getActivity() != null) {
				return edge.getInStructuredNode().getActivity().getName();
			}
		}
		return "";
	}

	/**
	 * Sets the status of a node in a diagram to traversed or active
	 * 
	 * @param activity
	 *            Activity diagram
	 * @param node
	 *            Node of activity diagram
	 * @param state
	 *            State of node
	 */
	private static void setNode(Activity activity, ActivityNode node, ElementState state) {
		if (state == ElementState.ACTIVE) {
			setActiveNode(activity, node);
		} else if (state == ElementState.TRAVERSED) {
			addTraversedNode(activity, node);
		}

	}

	/**
	 * Sets the status of a edge in a diagram to traversed or active
	 * 
	 * @param activity
	 *            Activity diagram
	 * @param edge
	 *            Edge of activity diagram
	 * @param state
	 *            State of edge
	 */
	private static void setEdge(Activity activity, ActivityEdge edge, ElementState state) {
		if (state == ElementState.ACTIVE) {
			setActiveEdge(activity, edge);
		} else if (state == ElementState.TRAVERSED) {
			addTraversedEdge(activity, edge);
		}
	}

}
