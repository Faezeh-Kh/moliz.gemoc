/**
 */
package umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicBehaviorsFactoryImpl extends EFactoryImpl implements BasicBehaviorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicBehaviorsFactory init() {
		try {
			BasicBehaviorsFactory theBasicBehaviorsFactory = (BasicBehaviorsFactory)EPackage.Registry.INSTANCE.getEFactory(BasicBehaviorsPackage.eNS_URI);
			if (theBasicBehaviorsFactory != null) {
				return theBasicBehaviorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicBehaviorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasicBehaviorsPackage.TRACED_PARAMETER_VALUE: return createTracedParameterValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameterValue createTracedParameterValue() {
		TracedParameterValueImpl tracedParameterValue = new TracedParameterValueImpl();
		return tracedParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBehaviorsPackage getBasicBehaviorsPackage() {
		return (BasicBehaviorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicBehaviorsPackage getPackage() {
		return BasicBehaviorsPackage.eINSTANCE;
	}

} //BasicBehaviorsFactoryImpl
