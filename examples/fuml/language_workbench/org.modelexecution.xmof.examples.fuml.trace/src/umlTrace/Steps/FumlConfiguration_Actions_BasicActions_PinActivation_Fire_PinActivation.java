/**
 */
package umlTrace.Steps;

import fumlConfiguration.Actions.BasicActions.PinActivation;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation()
 * @model
 * @generated
 */
public interface FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation extends FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_AbstractSubStep, FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Actions.BasicActions.PinActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	PinActivation getCaller();

} // FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation
