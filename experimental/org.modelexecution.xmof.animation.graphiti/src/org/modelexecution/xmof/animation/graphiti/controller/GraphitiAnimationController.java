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
package org.modelexecution.xmof.animation.graphiti.controller;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.presentation.KernelEditor;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.graphiti.decorator.GraphitiDiagramDecorator;
import org.modelexecution.xmof.animation.graphiti.handler.GraphitiDiagramHandler;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;


public class GraphitiAnimationController extends AnimationController {
	private URI xmofModelUri;
	private boolean editorOpend=true;

	public GraphitiAnimationController(URI xmofModelURI, XMOFBasedModel model) {
		super(model, new GraphitiDiagramHandler(xmofModelURI));
		this.xmofModelUri = xmofModelURI;
		addPartListener();
	}

	@Override
	public void processMSE(MSEOccurrence mseOccurrence, boolean verbose){
		if (!editorOpend){
			reopenEditor();
		}
		super.processMSE(mseOccurrence, verbose);
	}
	private void reopenEditor() {
		diagramHandler=new GraphitiDiagramHandler(xmofModelUri);
		Activity activity= activeDecorator.getActivity();
		openOrShowDiagram(activity);
		editorOpend=true;
		
	}

	// By adding a PartListener we can identify if an editor has been closed (e.g. on accident) during
	// the debugging process and can reopen it again.
	private void addPartListener() {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

			@Override
			public void run() {
				IPartListener listener = new IPartListener() {

					@Override
					public void partOpened(IWorkbenchPart part) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partDeactivated(IWorkbenchPart part) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partClosed(IWorkbenchPart part) {
						if (part instanceof KernelEditor) {
							editorOpend=false;
						}

					}

					@Override
					public void partBroughtToTop(IWorkbenchPart part) {
						// TODO Auto-generated method stub

					}

					@Override
					public void partActivated(IWorkbenchPart part) {
						// TODO Auto-generated method stub

					}
				};
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(listener);

			}
		});

	}


	@Override
	protected void initializeDecorators() {
		for (Activity activity : controllerMap.getActivities()) {
			controllerMap.addDecorator(activity.getName(), new GraphitiDiagramDecorator(activity,
					((GraphitiDiagramHandler) diagramHandler).getKernelEditor()));
		}
	}

}
