/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node Activation incoming Edges Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_incomingEdges_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/incomingEdges'"
 * @generated
 */
public interface ActivityNodeActivation_incomingEdges_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_incomingEdges_Value_IncomingEdges()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/ActivityNodeActivation/incomingEdges'"
	 * @generated
	 */
	EList<TracedActivityEdgeInstance> getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIncomingEdgesSequence <em>Incoming Edges Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedActivityNodeActivation)
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_incomingEdges_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation#getIncomingEdgesSequence
	 * @model opposite="incomingEdgesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedActivityNodeActivation getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.ActivityNodeActivation_incomingEdges_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getActivityNodeActivation_incomingEdges_Values <em>Activity Node Activation incoming Edges Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getActivityNodeActivation_incomingEdges_Value_States()
	 * @see umlTrace.States.State#getActivityNodeActivation_incomingEdges_Values
	 * @model opposite="activityNodeActivation_incomingEdges_Values" required="true"
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

} // ActivityNodeActivation_incomingEdges_Value
