/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation()
 * @model
 * @generated
 */
public interface FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedPinActivation getCaller();

} // FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation
