/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.Reference;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Reference Set Feature Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference extends FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_AbstractSubStep, SpecificStep, SequentialStep<FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStep>, FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_AbstractSubStep, FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.Reference) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Reference getCaller();

} // FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference