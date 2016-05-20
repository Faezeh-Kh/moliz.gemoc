/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue extends FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_AbstractSubStep, SpecificStep, SmallStep, FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedCompoundValue) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedCompoundValue getCaller();

} // FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue
