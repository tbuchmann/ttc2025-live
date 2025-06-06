/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.ArrowShape#getClipping <em>Clipping</em>}</li>
 *   <li>{@link DOT.ArrowShape#isIsPlain <em>Is Plain</em>}</li>
 *   <li>{@link DOT.ArrowShape#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getArrowShape()
 * @model
 * @generated
 */
public interface ArrowShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Clipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clipping</em>' attribute.
	 * @see #setClipping(String)
	 * @see DOT.DOTPackage#getArrowShape_Clipping()
	 * @model dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getClipping();

	/**
	 * Sets the value of the '{@link DOT.ArrowShape#getClipping <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clipping</em>' attribute.
	 * @see #getClipping()
	 * @generated
	 */
	void setClipping(String value);

	/**
	 * Returns the value of the '<em><b>Is Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Plain</em>' attribute.
	 * @see #setIsPlain(boolean)
	 * @see DOT.DOTPackage#getArrowShape_IsPlain()
	 * @model dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPlain();

	/**
	 * Sets the value of the '{@link DOT.ArrowShape#isIsPlain <em>Is Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Plain</em>' attribute.
	 * @see #isIsPlain()
	 * @generated
	 */
	void setIsPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see DOT.DOTPackage#getArrowShape_Size()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link DOT.ArrowShape#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // ArrowShape
