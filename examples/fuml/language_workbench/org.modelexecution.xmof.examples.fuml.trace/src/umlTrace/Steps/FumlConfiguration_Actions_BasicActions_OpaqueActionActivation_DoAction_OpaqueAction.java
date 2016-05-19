/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.OpaqueActionActivation;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction extends FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.OpaqueActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	OpaqueActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction