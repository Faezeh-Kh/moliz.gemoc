package org.modelexecution.xmof.animation.core.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.animation.core.ui.Activator;

public class AnimationProviderRegistry {
	private static final String CLASS_ATTRIBUTE = "animationProviderClass";
	private static String IANIMATIONPROVIDER_ID = "org.modelexecution.xmof.animationProvider";
	private static AnimationProviderRegistry instance;
	private Collection<IAnimationProvider> registeredProviders;

	private AnimationProviderRegistry() {
		loadRegisteredProviders();
	}

	private void loadRegisteredProviders() {
		registeredProviders = new LinkedHashSet<>();
		obtainProvidersFromRegistry();
	}

	private void obtainProvidersFromRegistry() {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(IANIMATIONPROVIDER_ID);
		for (IConfigurationElement element : config) {
			try {
				Object classObject = element.createExecutableExtension(CLASS_ATTRIBUTE);
				if (classObject instanceof IAnimationProvider) {
					registeredProviders.add((IAnimationProvider) classObject);
				}
			} catch (CoreException e) {
				Activator.error("Exception while obtaining registered converters", e);
			}
		}

	}

	public static AnimationProviderRegistry getInstance() {
		if (instance == null) {
			instance = new AnimationProviderRegistry();
		}
		return instance;
	}

	public boolean haveProvider(Resource resource) {
		return !getProviders(resource).isEmpty();
	}

	public List<IAnimationProvider> getProviders(Resource resource) {
		List<IAnimationProvider> possibleProviders = new ArrayList<>();
		for (IAnimationProvider provider : registeredProviders) {
			if (provider.canAnimateModel(resource)) {
				possibleProviders.add(provider);
			}
		}
		return possibleProviders;
	}
}
