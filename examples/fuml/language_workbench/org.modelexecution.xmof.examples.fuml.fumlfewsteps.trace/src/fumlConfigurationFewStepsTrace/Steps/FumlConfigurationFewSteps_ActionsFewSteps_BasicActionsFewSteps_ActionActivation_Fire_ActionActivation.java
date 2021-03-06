/**
 */
package fumlConfigurationFewStepsTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfigurationFewStepsTrace.Steps.StepsPackage#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation()
 * @model
 * @generated
 */
public interface FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_AbstractSubStep, SpecificStep, SequentialStep<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep>, FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_AbstractSubStep, FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedActionActivation getCaller();

} // FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation
