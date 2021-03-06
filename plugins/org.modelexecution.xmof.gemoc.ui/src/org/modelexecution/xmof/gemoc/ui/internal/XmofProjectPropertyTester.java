/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.ui.internal;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * Custom Project to test if the current selection is within an xMOF project. At the moment there is
 * no custom project nature for xMOF projects therefore other identifiers have to be used. A project
 * is considered as an xMOF project if
 * <ul>
 * <li>An folder named "xmof" exists in the project root</li>
 * <li>This folder contains at least one file with the ".xmof" file extension</li>
 * <li>A properties file named "xmof.properties" exists in the project root</li>
 * </ul>
 * 
 * @author tortm
 *
 */
public class XmofProjectPropertyTester extends PropertyTester {
  private static final String PROPERTY_IS_XMOF_PROJECT = "isXmofProject";

  @Override
  public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    if (property.equals(PROPERTY_IS_XMOF_PROJECT)) {
      IProject project = ((IResource) receiver).getProject();
      return hasXmofFolder(project) && hasPreferencesFile(project);
    }

    return false;
  }

  private boolean hasXmofFolder(IProject project) {
    try {
      IFolder xmofFolder = project.getFolder(XMOFProjectConstants.XMOF_FILE_FOLDER);
      if (xmofFolder.exists()) {
        for (IResource res : xmofFolder.members()) {
          if (res.getName().endsWith(XMOFProjectConstants.XMOF_FILE_EXTENSION)) {
            return true;
          }
        }
      }
    } catch (CoreException e) {
      e.printStackTrace();

    }
    return false;
  }

  private boolean hasPreferencesFile(IProject project) {
    return project.getFile(XMOFProjectConstants.XMOF_PROPERTIES_NAME).exists();
  }

}
