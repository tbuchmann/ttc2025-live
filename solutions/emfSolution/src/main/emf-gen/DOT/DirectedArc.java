/**
 */
package DOT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.DirectedArc#getArrowHead <em>Arrow Head</em>}</li>
 *   <li>{@link DOT.DirectedArc#getHeadlabel <em>Headlabel</em>}</li>
 *   <li>{@link DOT.DirectedArc#getTaillabel <em>Taillabel</em>}</li>
 *   <li>{@link DOT.DirectedArc#getArrowTail <em>Arrow Tail</em>}</li>
 *   <li>{@link DOT.DirectedArc#getTail_lp <em>Tail lp</em>}</li>
 *   <li>{@link DOT.DirectedArc#getHead_lp <em>Head lp</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getDirectedArc()
 * @model
 * @generated
 */
public interface DirectedArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Arrow Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Head</em>' containment reference.
	 * @see #setArrowHead(ArrowShape)
	 * @see DOT.DOTPackage#getDirectedArc_ArrowHead()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrowShape getArrowHead();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getArrowHead <em>Arrow Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Head</em>' containment reference.
	 * @see #getArrowHead()
	 * @generated
	 */
	void setArrowHead(ArrowShape value);

	/**
	 * Returns the value of the '<em><b>Headlabel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headlabel</em>' reference.
	 * @see #setHeadlabel(Label)
	 * @see DOT.DOTPackage#getDirectedArc_Headlabel()
	 * @model ordered="false"
	 * @generated
	 */
	Label getHeadlabel();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getHeadlabel <em>Headlabel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headlabel</em>' reference.
	 * @see #getHeadlabel()
	 * @generated
	 */
	void setHeadlabel(Label value);

	/**
	 * Returns the value of the '<em><b>Taillabel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taillabel</em>' reference.
	 * @see #setTaillabel(Label)
	 * @see DOT.DOTPackage#getDirectedArc_Taillabel()
	 * @model ordered="false"
	 * @generated
	 */
	Label getTaillabel();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getTaillabel <em>Taillabel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taillabel</em>' reference.
	 * @see #getTaillabel()
	 * @generated
	 */
	void setTaillabel(Label value);

	/**
	 * Returns the value of the '<em><b>Arrow Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow Tail</em>' containment reference.
	 * @see #setArrowTail(ArrowShape)
	 * @see DOT.DOTPackage#getDirectedArc_ArrowTail()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ArrowShape getArrowTail();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getArrowTail <em>Arrow Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow Tail</em>' containment reference.
	 * @see #getArrowTail()
	 * @generated
	 */
	void setArrowTail(ArrowShape value);

	/**
	 * Returns the value of the '<em><b>Tail lp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail lp</em>' attribute.
	 * @see #setTail_lp(double)
	 * @see DOT.DOTPackage#getDirectedArc_Tail_lp()
	 * @model dataType="PrimitiveTypes.Double" ordered="false"
	 * @generated
	 */
	double getTail_lp();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getTail_lp <em>Tail lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail lp</em>' attribute.
	 * @see #getTail_lp()
	 * @generated
	 */
	void setTail_lp(double value);

	/**
	 * Returns the value of the '<em><b>Head lp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head lp</em>' attribute.
	 * @see #setHead_lp(double)
	 * @see DOT.DOTPackage#getDirectedArc_Head_lp()
	 * @model dataType="PrimitiveTypes.Double" ordered="false"
	 * @generated
	 */
	double getHead_lp();

	/**
	 * Sets the value of the '{@link DOT.DirectedArc#getHead_lp <em>Head lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head lp</em>' attribute.
	 * @see #getHead_lp()
	 * @generated
	 */
	void setHead_lp(double value);

} // DirectedArc
