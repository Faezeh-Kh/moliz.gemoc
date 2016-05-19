/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation extends FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.DecisionNodeActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	DecisionNodeActivation getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation
