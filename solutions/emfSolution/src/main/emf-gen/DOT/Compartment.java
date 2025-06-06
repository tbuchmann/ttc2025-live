/**
 */
package DOT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Compartment#getComplexLabel <em>Complex Label</em>}</li>
 *   <li>{@link DOT.Compartment#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link DOT.Compartment#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getCompartment()
 * @model abstract="true"
 * @generated
 */
public interface Compartment extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex Label</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DOT.ComplexLabel#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Label</em>' container reference.
	 * @see #setComplexLabel(ComplexLabel)
	 * @see DOT.DOTPackage#getCompartment_ComplexLabel()
	 * @see DOT.ComplexLabel#getCompartments
	 * @model opposite="compartments" transient="false" ordered="false"
	 * @generated
	 */
	ComplexLabel getComplexLabel();

	/**
	 * Sets the value of the '{@link DOT.Compartment#getComplexLabel <em>Complex Label</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Label</em>' container reference.
	 * @see #getComplexLabel()
	 * @generated
	 */
	void setComplexLabel(ComplexLabel value);

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference.
	 * @see #setCompartments(Compartment)
	 * @see DOT.DOTPackage#getCompartment_Compartments()
	 * @model containment="true"
	 * @generated
	 */
	Compartment getCompartments();

	/**
	 * Sets the value of the '{@link DOT.Compartment#getCompartments <em>Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartments</em>' containment reference.
	 * @see #getCompartments()
	 * @generated
	 */
	void setCompartments(Compartment value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DOT.Anchor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' reference.
	 * @see #setAnchor(Anchor)
	 * @see DOT.DOTPackage#getCompartment_Anchor()
	 * @see DOT.Anchor#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	Anchor getAnchor();

	/**
	 * Sets the value of the '{@link DOT.Compartment#getAnchor <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' reference.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(Anchor value);

} // Compartment
