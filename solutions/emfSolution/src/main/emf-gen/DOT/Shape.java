/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Shape#getWidth <em>Width</em>}</li>
 *   <li>{@link DOT.Shape#getHeight <em>Height</em>}</li>
 *   <li>{@link DOT.Shape#getPeripheries <em>Peripheries</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see DOT.DOTPackage#getShape_Width()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link DOT.Shape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see DOT.DOTPackage#getShape_Height()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link DOT.Shape#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheries</em>' attribute.
	 * @see #setPeripheries(int)
	 * @see DOT.DOTPackage#getShape_Peripheries()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPeripheries();

	/**
	 * Sets the value of the '{@link DOT.Shape#getPeripheries <em>Peripheries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheries</em>' attribute.
	 * @see #getPeripheries()
	 * @generated
	 */
	void setPeripheries(int value);

} // Shape
