/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.ComplexLabel#getCompartments <em>Compartments</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getComplexLabel()
 * @model
 * @generated
 */
public interface ComplexLabel extends Label {
	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.Compartment}.
	 * It is bidirectional and its opposite is '{@link DOT.Compartment#getComplexLabel <em>Complex Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see DOT.DOTPackage#getComplexLabel_Compartments()
	 * @see DOT.Compartment#getComplexLabel
	 * @model opposite="complexLabel" containment="true" required="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

} // ComplexLabel
