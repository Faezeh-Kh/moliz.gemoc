/**
 */
package petrinet2Configuration.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import petrinet2.impl.NetImpl;

import petrinet2Configuration.NetConfiguration;
import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NetConfigurationImpl extends NetImpl implements NetConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinet2ConfigurationPackage.Literals.NET_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main(EList<Token> initialTokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeMarking(EList<Token> initialTokens) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Petrinet2ConfigurationPackage.NET_CONFIGURATION___RUN:
				run();
				return null;
			case Petrinet2ConfigurationPackage.NET_CONFIGURATION___MAIN__ELIST:
				main((EList<Token>)arguments.get(0));
				return null;
			case Petrinet2ConfigurationPackage.NET_CONFIGURATION___INITIALIZE_MARKING__ELIST:
				initializeMarking((EList<Token>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NetConfigurationImpl