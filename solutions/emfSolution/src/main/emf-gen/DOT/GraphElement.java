/**
 */
package DOT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.GraphElement#getName <em>Name</em>}</li>
 *   <li>{@link DOT.GraphElement#getLabel <em>Label</em>}</li>
 *   <li>{@link DOT.GraphElement#getStyle <em>Style</em>}</li>
 *   <li>{@link DOT.GraphElement#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getGraphElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DOT.DOTPackage#getGraphElement_Name()
	 * @model dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DOT.GraphElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link DOT.Label#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see DOT.DOTPackage#getGraphElement_Label()
	 * @see DOT.Label#getElement
	 * @model opposite="element" containment="true" ordered="false"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link DOT.GraphElement#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see DOT.DOTPackage#getGraphElement_Style()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link DOT.GraphElement#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see DOT.DOTPackage#getGraphElement_Color()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link DOT.GraphElement#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // GraphElement
