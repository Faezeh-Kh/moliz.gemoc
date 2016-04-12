/**
 */
package fumlConfiguration;

import fumlConfiguration.Loci.SemanticVisitor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fumlConfiguration.ElementConfiguration#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 * </ul>
 * </p>
 *
 * @see fumlConfiguration.FumlConfigurationPackage#getElementConfiguration()
 * @model
 * @generated
 */
public interface ElementConfiguration extends Element {
	/**
	 * Returns the value of the '<em><b>Semantic Visitor</b></em>' reference list.
	 * The list contents are of type {@link fumlConfiguration.Loci.SemanticVisitor}.
	 * It is bidirectional and its opposite is '{@link fumlConfiguration.Loci.SemanticVisitor#getRuntimeModelElement <em>Runtime Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Visitor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Visitor</em>' reference list.
	 * @see fumlConfiguration.FumlConfigurationPackage#getElementConfiguration_SemanticVisitor()
	 * @see fumlConfiguration.Loci.SemanticVisitor#getRuntimeModelElement
	 * @model opposite="runtimeModelElement"
	 * @generated
	 */
	EList<SemanticVisitor> getSemanticVisitor();

} // ElementConfiguration
