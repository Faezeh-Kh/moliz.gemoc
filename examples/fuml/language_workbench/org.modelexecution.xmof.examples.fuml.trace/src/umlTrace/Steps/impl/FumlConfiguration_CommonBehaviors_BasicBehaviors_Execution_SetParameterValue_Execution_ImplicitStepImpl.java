/**
 */
package umlTrace.Steps.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionframework.engine.mse.impl.StepImpl;

import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.Steps.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStep;
import umlTrace.Steps.StepsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Implicit Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.Steps.impl.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepImpl#getEndingState <em>Ending State</em>}</li>
 *   <li>{@link umlTrace.Steps.impl.FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepImpl#getStartingState <em>Starting State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepImpl extends StepImpl implements FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStep {
	/**
	 * The cached value of the '{@link #getEndingState() <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingState()
	 * @generated
	 * @ordered
	 */
	protected State endingState;

	/**
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.eINSTANCE.getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEndingState() {
		if (endingState != null && endingState.eIsProxy()) {
			InternalEObject oldEndingState = (InternalEObject)endingState;
			endingState = (State)eResolveProxy(oldEndingState);
			if (endingState != oldEndingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE, oldEndingState, endingState));
			}
		}
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEndingState() {
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingState(State newEndingState, NotificationChain msgs) {
		State oldEndingState = endingState;
		endingState = newEndingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE, oldEndingState, newEndingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingState(State newEndingState) {
		if (newEndingState != endingState) {
			NotificationChain msgs = null;
			if (endingState != null)
				msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			if (newEndingState != null)
				msgs = ((InternalEObject)newEndingState).eInverseAdd(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			msgs = basicSetEndingState(newEndingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE, newEndingState, newEndingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStartingState() {
		if (startingState != null && startingState.eIsProxy()) {
			InternalEObject oldStartingState = (InternalEObject)startingState;
			startingState = (State)eResolveProxy(oldStartingState);
			if (startingState != oldStartingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE, oldStartingState, startingState));
			}
		}
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartingState() {
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingState(State newStartingState, NotificationChain msgs) {
		State oldStartingState = startingState;
		startingState = newStartingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE, oldStartingState, newStartingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingState(State newStartingState) {
		if (newStartingState != startingState) {
			NotificationChain msgs = null;
			if (startingState != null)
				msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			if (newStartingState != null)
				msgs = ((InternalEObject)newStartingState).eInverseAdd(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			msgs = basicSetStartingState(newStartingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE, newStartingState, newStartingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				if (endingState != null)
					msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
				return basicSetEndingState((State)otherEnd, msgs);
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				if (startingState != null)
					msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
				return basicSetStartingState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				return basicSetEndingState(null, msgs);
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				return basicSetStartingState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				if (resolve) return getEndingState();
				return basicGetEndingState();
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				setEndingState((State)newValue);
				return;
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				setStartingState((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				setEndingState((State)null);
				return;
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				setStartingState((State)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__ENDING_STATE:
				return endingState != null;
			case StepsPackage.FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_IMPLICIT_STEP__STARTING_STATE:
				return startingState != null;
		}
		return super.eIsSet(featureID);
	}

} //FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_ImplicitStepImpl
