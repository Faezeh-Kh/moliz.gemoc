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
package org.modelexecution.xmof.animation.sirius.decorator;

import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.sirius.controller.SiriusAnimationController;

public class SiriusDiagramDecorator extends DiagramDecorator {

	private SiriusAnimationController controller;

	public SiriusDiagramDecorator(Activity activity, SiriusAnimationController controller) {
		super(activity);
		this.controller = controller;
	}

	@Override
	public void resetDecorations() {
		super.resetDecorations();

	}

	@Override
	public void refreshDiagram() {
		controller.refresh(this);

	}

}
