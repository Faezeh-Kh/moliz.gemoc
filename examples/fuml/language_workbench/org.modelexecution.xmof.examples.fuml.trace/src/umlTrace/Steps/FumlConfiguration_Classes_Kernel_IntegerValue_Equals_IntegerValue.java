/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.IntegerValue;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Integer Value Equals Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue extends SpecificStep, SmallStep, FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.IntegerValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	IntegerValue getCaller();

} // FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue
