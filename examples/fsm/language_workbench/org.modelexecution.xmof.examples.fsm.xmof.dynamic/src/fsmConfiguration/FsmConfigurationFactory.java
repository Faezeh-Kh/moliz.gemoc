/**
 */
package fsmConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmConfiguration.FsmConfigurationPackage
 * @generated
 */
public interface FsmConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmConfigurationFactory eINSTANCE = fsmConfiguration.impl.FsmConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FSM Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Configuration</em>'.
	 * @generated
	 */
	FSMConfiguration createFSMConfiguration();

	/**
	 * Returns a new object of class '<em>State Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Configuration</em>'.
	 * @generated
	 */
	StateConfiguration createStateConfiguration();

	/**
	 * Returns a new object of class '<em>Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Configuration</em>'.
	 * @generated
	 */
	TransitionConfiguration createTransitionConfiguration();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FsmConfigurationPackage getFsmConfigurationPackage();

} //FsmConfigurationFactory
