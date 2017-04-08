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
import org.modelexecution.xmof.animation.core.controller.XMOFAnimationUtil;
import org.modelexecution.xmof.animation.core.decorator.internal.ActivityElementContainer;
import org.modelexecution.xmof.animation.core.decorator.internal.ElementState;

/**
 * DecoratorService class to specify which elements need to be decorated
 * (respectively animated).
 * 
 **/
public class DecoratorService {

	private static Map<String, ActivityElementContainer> activityElementContainerMap = new HashMap<>();

	private static ActivityElementContainer getContainer(Activity activity) {
		if (activity != null) {
			return activityElementContainerMap.get(XMOFAnimationUtil.toActivityID(activity));
		}
		return null;
	}

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
		ActivityElementContainer container = getContainer(XMOFAnimationUtil.getActivity(node));
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
		ActivityElementContainer container = getContainer(XMOFAnimationUtil.getActivity(node));
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
		ActivityElementContainer container = getContainer(XMOFAnimationUtil.getActivity(edge));
		if (container != null) {
			return container.getActiveEdges().contains(XMOFAnimationUtil.toEdgeID(edge));
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
		ActivityElementContainer container = getContainer(XMOFAnimationUtil.getActivity(edge));
		if (container != null) {
			return container.getTraversedEdges().contains(XMOFAnimationUtil.toEdgeID(edge));
		}
		return false;
	}

	public static void intializeContainer(Activity activity) {
		String id = XMOFAnimationUtil.toActivityID(activity);
		if (!activityElementContainerMap.containsKey(id)) {
			activityElementContainerMap.put(id, new ActivityElementContainer());
		}

	}

	public static void reset() {
		activityElementContainerMap = new HashMap<>();
	}

	public static void clear(Activity activity) {
		activityElementContainerMap.put(XMOFAnimationUtil.toActivityID(activity), new ActivityElementContainer());
	}

	private static void setActiveNode(Activity activity, ActivityNode node) {
		ActivityElementContainer container = getContainer(activity);
		if (container != null) {
			container.addActiveNode(node.getName());
		}
	}

	private static void addTraversedNode(Activity activity, ActivityNode node) {
		ActivityElementContainer container = getContainer(activity);
		if (container != null) {
			container.addTraversedNode(node.getName());
		}
	}

	private static void setActiveEdge(Activity activity, ActivityEdge edge) {
		ActivityElementContainer container = getContainer(activity);
		if (container != null) {
			container.addActiveEdge(XMOFAnimationUtil.toEdgeID(edge));
		}
	}

	private static void addTraversedEdge(Activity activity, ActivityEdge edge) {
		ActivityElementContainer container = getContainer(activity);
		if (container != null) {
			container.addTraversedEdge(XMOFAnimationUtil.toEdgeID(edge));
		}
	}

	private static void setNode(Activity activity, ActivityNode node, ElementState state) {
		if (state == ElementState.ACTIVE) {
			setActiveNode(activity, node);
		} else if (state == ElementState.TRAVERSED) {
			addTraversedNode(activity, node);
		}

	}

	private static void setEdge(Activity activity, ActivityEdge edge, ElementState state) {
		if (state == ElementState.ACTIVE) {
			setActiveEdge(activity, edge);
		} else if (state == ElementState.TRAVERSED) {
			addTraversedEdge(activity, edge);
		}
	}

}
