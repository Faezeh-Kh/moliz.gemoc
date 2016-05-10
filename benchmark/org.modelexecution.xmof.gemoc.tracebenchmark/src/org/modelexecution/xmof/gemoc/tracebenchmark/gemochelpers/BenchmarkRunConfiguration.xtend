package org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers

import org.eclipse.emf.common.util.URI
import org.modelexecution.xmof.gemoc.engine.ui.commons.IXMOFRunConfiguration

class BenchmarkRunConfiguration implements IXMOFRunConfiguration {
	
	private val String languageName
	private val URI modelURI
	private val String initModelURIString
	
	new(String languageName, URI modelURI, String initModelURI ) {
		this.languageName = languageName;
		this.modelURI = modelURI;
		this.initModelURIString = initModelURI;
	}
	
	
	override getNodewiseStepping() {
		false
	}
	
	override getAnimationDelay() {
		0
	}
	
	override getAnimatorURI() {
		null
	}
	
	override getDeadlockDetectionDepth() {
		0
	}
	
	override getEngineAddonExtensions() {
		#{}
	}
	
	override getExecutedModelAsMelangeURI() {
		null
	}
	
	override getExecutedModelURI() {
		 modelURI
	}
	
	override getLanguageName() {
		languageName
	}
	
	override getModelInitializationModel() {
		initModelURIString
	}
	
	override getMelangeQuery() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getModelEntryPoint() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getModelInitializationArguments() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getModelInitializationMethod() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getExecutionEntryPoint() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getIgnoreSteps() {
		return false;
	}
	
}