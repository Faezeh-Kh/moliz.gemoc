/**
 */
package petrinetConfiguration;

import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetConfiguration.PetrinetConfigurationPackage#getTransitionConfiguration()
 * @model
 * @generated
 */
public interface TransitionConfiguration extends Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void fire();

} // TransitionConfiguration
