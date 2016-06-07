/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions;

import fumlConfigurationTrace.States.PinActivation_actionActivation_Value;
import fumlConfigurationTrace.States.PinActivation_count_temp_Value;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectNodeActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Pin Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getActionActivationSequence <em>Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedPinActivation#getCount_tempSequence <em>Count temp Sequence</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedPinActivation()
 * @model abstract="true"
 * @generated
 */
public interface TracedPinActivation extends TracedObjectNodeActivation {
	/**
	 * Returns the value of the '<em><b>Action Activation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PinActivation_actionActivation_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PinActivation_actionActivation_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Activation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Activation Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedPinActivation_ActionActivationSequence()
	 * @see fumlConfigurationTrace.States.PinActivation_actionActivation_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PinActivation_actionActivation_Value> getActionActivationSequence();

	/**
	 * Returns the value of the '<em><b>Count temp Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.PinActivation_count_temp_Value}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.PinActivation_count_temp_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count temp Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count temp Sequence</em>' containment reference list.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage#getTracedPinActivation_Count_tempSequence()
	 * @see fumlConfigurationTrace.States.PinActivation_count_temp_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PinActivation_count_temp_Value> getCount_tempSequence();

} // TracedPinActivation
