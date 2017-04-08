package org.modelexecution.xmof.animation.ui.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.modelexecution.xmof.animation.ui.launcher.tabs.LaunchConfigurationAnimationTab;
import org.modelexecution.xmof.animation.ui.launcher.tabs.LaunchConfigurationBackendsTab;
import org.modelexecution.xmof.animation.ui.launcher.tabs.LaunchConfigurationMainTab;

public class LauncherTabGroup extends AbstractLaunchConfigurationTabGroup {

	public LauncherTabGroup() {
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new LaunchConfigurationMainTab(),
				new LaunchConfigurationAnimationTab(), new LaunchConfigurationBackendsTab(), new CommonTab() };
		setTabs(tabs);

	}

}