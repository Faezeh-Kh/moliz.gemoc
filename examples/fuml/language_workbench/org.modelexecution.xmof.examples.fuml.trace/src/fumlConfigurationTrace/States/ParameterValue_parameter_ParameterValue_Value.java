/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value parameter Parameter Value Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParameter_ParameterValue <em>Parameter Parameter Value</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_parameter_ParameterValue_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/ParameterValue/parameter_ParameterValue'"
 * @generated
 */
public interface ParameterValue_parameter_ParameterValue_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parameter Parameter Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Parameter Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Parameter Value</em>' reference.
	 * @see #setParameter_ParameterValue(TracedParameterConfiguration)
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_parameter_ParameterValue_Value_Parameter_ParameterValue()
	 * @model required="true"
	 *        annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//CommonBehaviors/BasicBehaviors/ParameterValue/parameter_ParameterValue'"
	 * @generated
	 */
	TracedParameterConfiguration getParameter_ParameterValue();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParameter_ParameterValue <em>Parameter Parameter Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Parameter Value</em>' reference.
	 * @see #getParameter_ParameterValue()
	 * @generated
	 */
	void setParameter_ParameterValue(TracedParameterConfiguration value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence <em>Parameter Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedParameterValue)
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_parameter_ParameterValue_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue#getParameter_ParameterValueSequence
	 * @model opposite="parameter_ParameterValueSequence" required="true" transient="false"
	 * @generated
	 */
	TracedParameterValue getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedParameterValue value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getParameterValue_parameter_ParameterValue_Values <em>Parameter Value parameter Parameter Value Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getParameterValue_parameter_ParameterValue_Value_States()
	 * @see fumlConfigurationTrace.States.State#getParameterValue_parameter_ParameterValue_Values
	 * @model opposite="parameterValue_parameter_ParameterValue_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ParameterValue_parameter_ParameterValue_Value
