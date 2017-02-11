/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.ui.templates;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.PlatformUI;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.dialogs.SelectDSAIProjectDialog;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialTemplate;
import org.modelexecution.xmof.gemoc.ui.Activator;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.AbstractStringWithButtonOption;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.TemplateOption;
import fr.inria.diverse.melange.ui.templates.MelangeTemplateMessages;

public class XMOFSequentialTemplate extends SequentialTemplate {
  public static final String KEY_XMOFFILE_PATH ="xmofFilePath"; //$NON-NLS-1$
  
  public XMOFSequentialTemplate() {
    super();
    addOption(KEY_XMOFFILE_PATH, "", (String) null, 0);
  }

  @Override
  public String getSectionId() {
    return "XMOFLanguage";
  }

  @Override
  public URL getTemplateLocation() {
    // Need to override to get the local Activator
    try {
      String[] candidates = getDirectoryCandidates();
      for (int i = 0; i < candidates.length; i++) {
        if (Activator.getDefault().getBundle().getEntry(candidates[i]) != null) {
          URL candidate = new URL(getInstallURL(), candidates[i]);
          return candidate;
        }
      }
    } catch (MalformedURLException e) { // do nothing
    }
    return null;
  }

  @Override
  protected URL getInstallURL() {
    // Need to override to get the local Activator
    return Activator.getDefault().getBundle().getEntry("/");
  }

  public void updateOptions(Map<String, String> optionsMap) {
    TemplateOption[] allOptions = getOptions(0);
    for (TemplateOption option : allOptions) {
      for (String key : optionsMap.keySet()) {
        if (option.getName().equals(key) && optionsMap.get(key) != null) {
          option.setValue(optionsMap.get(key));
        }
      }
    }
  }

}
