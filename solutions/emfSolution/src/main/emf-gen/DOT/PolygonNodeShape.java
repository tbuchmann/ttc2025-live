/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Node Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.PolygonNodeShape#getSides <em>Sides</em>}</li>
 *   <li>{@link DOT.PolygonNodeShape#getSkew <em>Skew</em>}</li>
 *   <li>{@link DOT.PolygonNodeShape#getDistortion <em>Distortion</em>}</li>
 *   <li>{@link DOT.PolygonNodeShape#isIsRegular <em>Is Regular</em>}</li>
 *   <li>{@link DOT.PolygonNodeShape#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getPolygonNodeShape()
 * @model
 * @generated
 */
public interface PolygonNodeShape extends ComplexNodeShape {
	/**
	 * Returns the value of the '<em><b>Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sides</em>' attribute.
	 * @see #setSides(int)
	 * @see DOT.DOTPackage#getPolygonNodeShape_Sides()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSides();

	/**
	 * Sets the value of the '{@link DOT.PolygonNodeShape#getSides <em>Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sides</em>' attribute.
	 * @see #getSides()
	 * @generated
	 */
	void setSides(int value);

	/**
	 * Returns the value of the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skew</em>' attribute.
	 * @see #setSkew(int)
	 * @see DOT.DOTPackage#getPolygonNodeShape_Skew()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSkew();

	/**
	 * Sets the value of the '{@link DOT.PolygonNodeShape#getSkew <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skew</em>' attribute.
	 * @see #getSkew()
	 * @generated
	 */
	void setSkew(int value);

	/**
	 * Returns the value of the '<em><b>Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distortion</em>' attribute.
	 * @see #setDistortion(int)
	 * @see DOT.DOTPackage#getPolygonNodeShape_Distortion()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDistortion();

	/**
	 * Sets the value of the '{@link DOT.PolygonNodeShape#getDistortion <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distortion</em>' attribute.
	 * @see #getDistortion()
	 * @generated
	 */
	void setDistortion(int value);

	/**
	 * Returns the value of the '<em><b>Is Regular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Regular</em>' attribute.
	 * @see #setIsRegular(boolean)
	 * @see DOT.DOTPackage#getPolygonNodeShape_IsRegular()
	 * @model dataType="PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRegular();

	/**
	 * Sets the value of the '{@link DOT.PolygonNodeShape#isIsRegular <em>Is Regular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Regular</em>' attribute.
	 * @see #isIsRegular()
	 * @generated
	 */
	void setIsRegular(boolean value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(int)
	 * @see DOT.DOTPackage#getPolygonNodeShape_Orientation()
	 * @model dataType="PrimitiveTypes.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getOrientation();

	/**
	 * Sets the value of the '{@link DOT.PolygonNodeShape#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(int value);

} // PolygonNodeShape
