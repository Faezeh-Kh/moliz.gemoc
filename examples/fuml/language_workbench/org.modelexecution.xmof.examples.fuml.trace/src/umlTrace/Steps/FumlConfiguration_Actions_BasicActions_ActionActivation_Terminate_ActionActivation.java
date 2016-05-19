/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.ActionActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStep>, FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.ActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ActionActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation