/**
 */
package umlTrace.Steps;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution()
 * @model
 * @generated
 */
public interface FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution extends FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_AbstractSubStep, FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Execution getCaller();

} // FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution