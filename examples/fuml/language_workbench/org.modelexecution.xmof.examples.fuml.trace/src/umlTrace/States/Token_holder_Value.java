/**
 */
package umlTrace.States;

import org.eclipse.emf.common.util.EList;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token holder Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.Token_holder_Value#getHolder <em>Holder</em>}</li>
 *   <li>{@link umlTrace.States.Token_holder_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.Token_holder_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.StatesPackage#getToken_holder_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Token/holder'"
 * @generated
 */
public interface Token_holder_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference.
	 * @see #setHolder(TracedActivityNodeActivation)
	 * @see umlTrace.States.StatesPackage#getToken_holder_Value_Holder()
	 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Token/holder'"
	 * @generated
	 */
	TracedActivityNodeActivation getHolder();

	/**
	 * Sets the value of the '{@link umlTrace.States.Token_holder_Value#getHolder <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(TracedActivityNodeActivation value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getHolderSequence <em>Holder Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedToken)
	 * @see umlTrace.States.StatesPackage#getToken_holder_Value_Parent()
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getHolderSequence
	 * @model opposite="holderSequence" required="true" transient="false"
	 * @generated
	 */
	TracedToken getParent();

	/**
	 * Sets the value of the '{@link umlTrace.States.Token_holder_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedToken value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.State#getToken_holder_Values <em>Token holder Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see umlTrace.States.StatesPackage#getToken_holder_Value_States()
	 * @see umlTrace.States.State#getToken_holder_Values
	 * @model opposite="token_holder_Values" required="true"
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

} // Token_holder_Value
