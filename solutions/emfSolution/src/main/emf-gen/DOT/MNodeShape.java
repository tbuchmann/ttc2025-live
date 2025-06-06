/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MNode Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.MNodeShape#getToplabel <em>Toplabel</em>}</li>
 *   <li>{@link DOT.MNodeShape#getBottomlabel <em>Bottomlabel</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getMNodeShape()
 * @model
 * @generated
 */
public interface MNodeShape extends ComplexNodeShape {
	/**
	 * Returns the value of the '<em><b>Toplabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toplabel</em>' containment reference.
	 * @see #setToplabel(Label)
	 * @see DOT.DOTPackage#getMNodeShape_Toplabel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Label getToplabel();

	/**
	 * Sets the value of the '{@link DOT.MNodeShape#getToplabel <em>Toplabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toplabel</em>' containment reference.
	 * @see #getToplabel()
	 * @generated
	 */
	void setToplabel(Label value);

	/**
	 * Returns the value of the '<em><b>Bottomlabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottomlabel</em>' containment reference.
	 * @see #setBottomlabel(Label)
	 * @see DOT.DOTPackage#getMNodeShape_Bottomlabel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Label getBottomlabel();

	/**
	 * Sets the value of the '{@link DOT.MNodeShape#getBottomlabel <em>Bottomlabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottomlabel</em>' containment reference.
	 * @see #getBottomlabel()
	 * @generated
	 */
	void setBottomlabel(Label value);

} // MNodeShape
