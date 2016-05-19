/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.Token;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Token Withdraw Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token extends FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.Token) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Token getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token
