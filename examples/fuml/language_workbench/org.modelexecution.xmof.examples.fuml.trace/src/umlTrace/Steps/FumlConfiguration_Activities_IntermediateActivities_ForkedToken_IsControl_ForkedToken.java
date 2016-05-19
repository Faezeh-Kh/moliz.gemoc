/**
 */
package umlTrace.Steps;

import fumlConfiguration.Activities.IntermediateActivities.ForkedToken;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken()
 * @model
 * @generated
 */
public interface FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken extends SpecificStep, SequentialStep<FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep>, FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_AbstractSubStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ForkedToken getCaller();

} // FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken
