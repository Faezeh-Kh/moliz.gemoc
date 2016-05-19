/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation extends FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.CallBehaviorActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	CallBehaviorActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation