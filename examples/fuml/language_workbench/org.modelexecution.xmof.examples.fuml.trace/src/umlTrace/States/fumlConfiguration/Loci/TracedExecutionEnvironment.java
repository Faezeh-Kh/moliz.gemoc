/**
 */
package umlTrace.States.fumlConfiguration.Loci;

import fumlConfiguration.Loci.ExecutionEnvironment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getLocus_ExecutionEnvironmentSequence <em>Locus Execution Environment Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionEnvironment()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Loci/ExecutionEnvironment'"
 * @generated
 */
public interface TracedExecutionEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Locus Execution Environment Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locus Execution Environment Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locus Execution Environment Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionEnvironment_Locus_ExecutionEnvironmentSequence()
	 * @see umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> getLocus_ExecutionEnvironmentSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ExecutionEnvironment)
	 * @see umlTrace.States.fumlConfiguration.Loci.LociPackage#getTracedExecutionEnvironment_OriginalObject()
	 * @model
	 * @generated
	 */
	ExecutionEnvironment getOriginalObject();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ExecutionEnvironment value);

} // TracedExecutionEnvironment
