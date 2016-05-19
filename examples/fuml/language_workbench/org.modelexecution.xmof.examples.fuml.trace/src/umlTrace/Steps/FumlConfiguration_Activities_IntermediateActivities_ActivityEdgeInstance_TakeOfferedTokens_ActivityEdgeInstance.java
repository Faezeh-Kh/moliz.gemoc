/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ActivityEdgeInstance getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance