/**
 */
package fumlConfigurationTrace.States;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation outgoing Edges Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_outgoingEdges_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/outgoingEdges'"
 * @generated
 */
public interface ActivityNodeActivation_outgoingEdges_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_outgoingEdges_Value_OutgoingEdges()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/outgoingEdges'"
	 * @generated
	 */
	EList<TracedActivityEdgeInstance> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getOutgoingEdgesSequence <em>Outgoing Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivation)
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_outgoingEdges_Value_Parent()
	 * @see fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getOutgoingEdgesSequence
	 * @model opposite="outgoingEdgesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivation getParent();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fumlConfigurationTrace.States.State#getActivityNodeActivation_outgoingEdges_Values <em>Activity Node Activation outgoing Edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fumlConfigurationTrace.States.StatesPackage#getActivityNodeActivation_outgoingEdges_Value_States()
	 * @see fumlConfigurationTrace.States.State#getActivityNodeActivation_outgoingEdges_Values
	 * @model opposite="activityNodeActivation_outgoingEdges_Values" required="true"
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

} // ActivityNodeActivation_outgoingEdges_Value
