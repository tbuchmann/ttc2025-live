/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Node#isFixedSize <em>Fixed Size</em>}</li>
 *   <li>{@link DOT.Node#getFontname <em>Fontname</em>}</li>
 *   <li>{@link DOT.Node#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link DOT.Node#getHeight <em>Height</em>}</li>
 *   <li>{@link DOT.Node#getWidth <em>Width</em>}</li>
 *   <li>{@link DOT.Node#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Nodelike {
	/**
	 * Returns the value of the '<em><b>Fixed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Size</em>' attribute.
	 * @see #setFixedSize(boolean)
	 * @see DOT.DOTPackage#getNode_FixedSize()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isFixedSize();

	/**
	 * Sets the value of the '{@link DOT.Node#isFixedSize <em>Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Size</em>' attribute.
	 * @see #isFixedSize()
	 * @generated
	 */
	void setFixedSize(boolean value);

	/**
	 * Returns the value of the '<em><b>Fontname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontname</em>' attribute.
	 * @see #setFontname(String)
	 * @see DOT.DOTPackage#getNode_Fontname()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getFontname();

	/**
	 * Sets the value of the '{@link DOT.Node#getFontname <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontname</em>' attribute.
	 * @see #getFontname()
	 * @generated
	 */
	void setFontname(String value);

	/**
	 * Returns the value of the '<em><b>Fontsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fontsize</em>' attribute.
	 * @see #setFontsize(int)
	 * @see DOT.DOTPackage#getNode_Fontsize()
	 * @model dataType="PrimitiveTypes.Integer" ordered="false"
	 * @generated
	 */
	int getFontsize();

	/**
	 * Sets the value of the '{@link DOT.Node#getFontsize <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fontsize</em>' attribute.
	 * @see #getFontsize()
	 * @generated
	 */
	void setFontsize(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see DOT.DOTPackage#getNode_Height()
	 * @model dataType="PrimitiveTypes.Integer" ordered="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link DOT.Node#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see DOT.DOTPackage#getNode_Width()
	 * @model dataType="PrimitiveTypes.Integer" ordered="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link DOT.Node#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(NodeShape)
	 * @see DOT.DOTPackage#getNode_Shape()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NodeShape getShape();

	/**
	 * Sets the value of the '{@link DOT.Node#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(NodeShape value);

} // Node
