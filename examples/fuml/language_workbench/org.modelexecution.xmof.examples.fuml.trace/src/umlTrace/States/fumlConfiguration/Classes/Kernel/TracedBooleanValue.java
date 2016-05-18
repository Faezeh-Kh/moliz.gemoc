/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.BooleanValue_value_BooleanValue_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue#getValue_BooleanValueSequence <em>Value Boolean Value Sequence</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedBooleanValue()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Classes/Kernel/BooleanValue'"
 * @generated
 */
public interface TracedBooleanValue extends TracedPrimitiveValue {
	/**
	 * Returns the value of the '<em><b>Value Boolean Value Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.BooleanValue_value_BooleanValue_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Boolean Value Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean Value Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage#getTracedBooleanValue_Value_BooleanValueSequence()
	 * @see umlTrace.States.BooleanValue_value_BooleanValue_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<BooleanValue_value_BooleanValue_Value> getValue_BooleanValueSequence();

} // TracedBooleanValue
