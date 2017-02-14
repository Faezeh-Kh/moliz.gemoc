/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.extension.sirius.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.viewpoint.description.Customization;
import org.eclipse.sirius.viewpoint.description.DecorationDescriptionsSet;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.gemoc.xdsmlframework.extensions.sirius.Activator;
import org.gemoc.xdsmlframework.extensions.sirius.command.AddDebugLayerHandler;
import org.osgi.framework.BundleException;

import fr.inria.diverse.commons.eclipse.pde.manifest.ManifestChanger;

//TODO: Mostly redundant code which would be obsolete if the AddDebugLayerHandler class would be properly refactored;

public class AddAnimationLayerRunnable implements IRunnableWithProgress {
  private static final String ANIMATION_SERVICE_TEMPLATE_PATH = "org/modelexecution/xmof/gemoc/extension/sirius/wizards/animation_services_template.txt";

  private static final String PACKAGE_TAG = "PACKAGE";

  private static final String CLASS_NAME_TAG = "CLASS_NAME";

  private static final String LANGUAGE_NAME_TAG = "LANGUAGE_NAME";

  private static final String LAYER_NAME_TAG = "LAYER_NAME";

  private static final String XMOF_ANIMATION_SERVICES_QUALIFIED_NAME = "org.modelexecution.xmof.gemoc.engine.GenericXMOFAnimationServices";
  private static final String[] ADDITIONAL_PLUGIN_DEPENDENCIES = {
      "org.gemoc.executionframework.extensions.sirius", "org.modelexecution.xmof.gemoc.engine",
      "org.gemoc.execution.sequential.javaengine.ui" };
  private IFile diagramDescriptionFile;
  private final String diagramDescriptionName;

  public AddAnimationLayerRunnable(IFile diagramDescriptionFile, String diagramDescriptionName) {
    super();
    this.diagramDescriptionFile = diagramDescriptionFile;
    this.diagramDescriptionName = diagramDescriptionName;
  }

  private boolean result = true;

  private IEditorPart editor;

  public boolean getResult() {
    return result;
  }

  @Override
  public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

    try {
      DiagramDescription diagramDescription = getDiagramDescription();
      if (diagramDescription == null) {
        result = false;
        return;
      }

      final String layerName = "Animation";

      final IProject project = diagramDescriptionFile.getProject();
      final String projectName = project.getName();
      final IFolder serviceFolder = project.getFolder(
          new Path("src/" + projectName.replaceAll("\\.", "/").toLowerCase() + "/services"));
      final String languageName = diagramDescription.getName();
      final String qualifiedServiceClassName = getOrCreateAnimationServiceClass(serviceFolder,
          projectName, languageName, layerName, monitor);

      EditingDomain editingDomain = ((IEditingDomainProvider) diagramDescription.eResource()
          .getResourceSet()).getEditingDomain();
      editingDomain.getCommandStack().execute(new ChangeCommand(diagramDescription.eResource()) {

        @Override
        protected void doExecute() {
          emfModifications(monitor, layerName, diagramDescription, languageName,
              qualifiedServiceClassName);
        }

      });

      ManifestChanger changer = new ManifestChanger(project);
      try {
        for (String dependency : ADDITIONAL_PLUGIN_DEPENDENCIES) {
          changer.addPluginDependency(dependency);
        }

        changer.commit();
      } catch (BundleException | IOException | CoreException e) {
        Activator.getMessagingSystem().error(e.getMessage(), Activator.PLUGIN_ID, e);
      }

      editor.doSave(monitor);
    } catch (IOException | CoreException e) {
      Activator.getMessagingSystem().error(e.getMessage(), Activator.PLUGIN_ID, e);
      result = false;
    }

  }

  private DiagramDescription getDiagramDescription() throws PartInitException {

    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
        .openEditor(new FileEditorInput(diagramDescriptionFile), PlatformUI.getWorkbench()
            .getEditorRegistry().getDefaultEditor(diagramDescriptionFile.getName()).getId());
    final Group group = getGroup();
    for (Viewpoint viewpoint : group.getOwnedViewpoints()) {
      for (RepresentationDescription representation : viewpoint.getOwnedRepresentations()) {
        if (diagramDescriptionName.equals(representation.getName())) {
          return (DiagramDescription) representation;

        }
      }
    }
    return null;
  }

  private Group getGroup() {
    final Group res;
    editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

    if (editor instanceof IEditingDomainProvider) {
      final EditingDomain editingDomain = ((IEditingDomainProvider) editor).getEditingDomain();
      final ResourceSet resourceSet = editingDomain.getResourceSet();
      Group group = null;

      for (Resource resource : resourceSet.getResources()) {
        for (EObject eObj : resource.getContents()) {
          if (eObj instanceof Group) {
            group = (Group) eObj;
            break;
          }
        }
      }
      res = group;
    } else {
      res = null;
    }

    return res;
  }

  private static void emfModifications(IProgressMonitor monitor, String layerName,
      DiagramDescription description, String languageName, String qualifiedServiceClassName) {
    AddDebugLayerHandler.getOrCreateImport(description, qualifiedServiceClassName, monitor);

    AddDebugLayerHandler.getOrCreateImport(description, XMOF_ANIMATION_SERVICES_QUALIFIED_NAME,
        monitor);
    getOrCreateDebugLayer(description, layerName, monitor);
  }

  private static Layer getOrCreateDebugLayer(DiagramDescription description, String layerName,
      IProgressMonitor monitor) {
    final Layer res;
    Layer existingLayer = null;
    for (Layer layer : description.getAdditionalLayers()) {
      if ("Animation".equals(layer.getName())) {
        existingLayer = layer;
        break;
      }
    }

    if (existingLayer != null) {
      res = existingLayer;
    } else {
      res = createLayer(description, layerName, monitor);
    }

    return res;
  }

  private static Layer createLayer(DiagramDescription description, String layerName,
      IProgressMonitor monitor) {

    // Create Layer
    final AdditionalLayer res = org.eclipse.sirius.diagram.description.DescriptionPackage.eINSTANCE
        .getDescriptionFactory().createAdditionalLayer();
    res.setName("Animation");
    res.setActiveByDefault(true);

    // Add decoration set
    DecorationDescriptionsSet decorationSet = DescriptionPackage.eINSTANCE.getDescriptionFactory()
        .createDecorationDescriptionsSet();
    res.setDecorationDescriptionsSet(decorationSet);
    // Create customization
    Customization customization = DescriptionPackage.eINSTANCE.getDescriptionFactory()
        .createCustomization();
    res.setCustomization(customization);

    description.getAdditionalLayers().add(res);
    return res;
  }

  private static String getOrCreateAnimationServiceClass(IFolder serviceFolder, String projectName,
      String languageName, String layerName, IProgressMonitor monitor)
      throws CoreException, IOException {
    final String className = AddDebugLayerHandler.toCamelCase(languageName.replaceAll("\\W", ""))
        + "AnimationServices";
    final IFile classFile = serviceFolder.getFile(new Path(className + ".java"));
    final String packageName = projectName + ".services";
    final String res = packageName + "." + className;

    if (!classFile.exists()) {
      if (!serviceFolder.exists()) {
        AddDebugLayerHandler.createFolder(serviceFolder, monitor);
      }

      createAnimationServiceClass(classFile, packageName, className, languageName, layerName,
          monitor);
    }

    return res;

  }

  private static void createAnimationServiceClass(IFile classFile, String packageName,
      String className, String languageName, String layerName, IProgressMonitor monitor)
      throws IOException, CoreException {

    String content = AddDebugLayerHandler.getContent(AddAnimationLayerRunnable.class
        .getClassLoader().getResourceAsStream(ANIMATION_SERVICE_TEMPLATE_PATH), "UTF8");

    content = content.replaceFirst(PACKAGE_TAG, packageName);
    content = content.replaceFirst(CLASS_NAME_TAG, className);
    content = content.replaceFirst(LANGUAGE_NAME_TAG, languageName);
    content = content.replaceFirst(LAYER_NAME_TAG, layerName);

    classFile.create(new ByteArrayInputStream(content.getBytes(Charset.forName("UTF8"))), true,
        monitor);
  }

}
