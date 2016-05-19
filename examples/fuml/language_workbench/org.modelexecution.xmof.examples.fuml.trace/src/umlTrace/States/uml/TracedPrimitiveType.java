/**
 */
package umlTrace.States.uml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.uml.TracedPrimitiveType#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.uml.UmlPackage#getTracedPrimitiveType()
 * @model
 * @generated
 */
public interface TracedPrimitiveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(PrimitiveType)
	 * @see umlTrace.States.uml.UmlPackage#getTracedPrimitiveType_OriginalObject()
	 * @model
	 * @generated
	 */
	PrimitiveType getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.uml.TracedPrimitiveType#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(PrimitiveType value);

} // TracedPrimitiveType