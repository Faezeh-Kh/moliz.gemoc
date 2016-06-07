/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

import fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Factory built In Types Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl#getBuiltInTypes <em>Built In Types</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.ExecutionFactory_builtInTypes_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionFactory_builtInTypes_ValueImpl extends MinimalEObjectImpl.Container implements ExecutionFactory_builtInTypes_Value {
	/**
	 * The cached value of the '{@link #getBuiltInTypes() <em>Built In Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPrimitiveTypeConfiguration> builtInTypes;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionFactory_builtInTypes_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPrimitiveTypeConfiguration> getBuiltInTypes() {
		if (builtInTypes == null) {
			builtInTypes = new EObjectResolvingEList<TracedPrimitiveTypeConfiguration>(TracedPrimitiveTypeConfiguration.class, this, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES);
		}
		return builtInTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionFactory getParent() {
		if (eContainerFeatureID() != StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT) return null;
		return (TracedExecutionFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedExecutionFactory newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedExecutionFactory newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE, TracedExecutionFactory.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES, StatesPackage.STATE__EXECUTION_FACTORY_BUILT_IN_TYPES_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedExecutionFactory)otherEnd, msgs);
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE, TracedExecutionFactory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES:
				return getBuiltInTypes();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				return getParent();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES:
				getBuiltInTypes().clear();
				getBuiltInTypes().addAll((Collection<? extends TracedPrimitiveTypeConfiguration>)newValue);
				return;
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				setParent((TracedExecutionFactory)newValue);
				return;
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES:
				getBuiltInTypes().clear();
				return;
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				setParent((TracedExecutionFactory)null);
				return;
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__BUILT_IN_TYPES:
				return builtInTypes != null && !builtInTypes.isEmpty();
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionFactory_builtInTypes_ValueImpl
