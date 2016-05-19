/**
 */
package umlTrace.Steps;

import fumlConfiguration.Classes.Kernel.Value;

import org.gemoc.executionframework.engine.mse.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Classes Kernel Value New Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Classes_Kernel_Value_New_Value()
 * @model
 * @generated
 */
public interface FumlConfiguration_Classes_Kernel_Value_New_Value extends FumlConfiguration_Classes_Kernel_Value_Copy_Value_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.Classes.Kernel.Value) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Value getCaller();

} // FumlConfiguration_Classes_Kernel_Value_New_Value
