/**
 */
package DOT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Label#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getLabel()
 * @model abstract="true"
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DOT.GraphElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(GraphElement)
	 * @see DOT.DOTPackage#getLabel_Element()
	 * @see DOT.GraphElement#getLabel
	 * @model opposite="label" transient="false" ordered="false"
	 * @generated
	 */
	GraphElement getElement();

	/**
	 * Sets the value of the '{@link DOT.Label#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GraphElement value);

} // Label
