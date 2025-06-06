/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Arc#getFromNode <em>From Node</em>}</li>
 *   <li>{@link DOT.Arc#getToNode <em>To Node</em>}</li>
 *   <li>{@link DOT.Arc#getLayers <em>Layers</em>}</li>
 *   <li>{@link DOT.Arc#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link DOT.Arc#getGroup <em>Group</em>}</li>
 *   <li>{@link DOT.Arc#getMinlen <em>Minlen</em>}</li>
 *   <li>{@link DOT.Arc#getSameHead <em>Same Head</em>}</li>
 *   <li>{@link DOT.Arc#getSameTail <em>Same Tail</em>}</li>
 *   <li>{@link DOT.Arc#getLhead <em>Lhead</em>}</li>
 *   <li>{@link DOT.Arc#getLtail <em>Ltail</em>}</li>
 *   <li>{@link DOT.Arc#isDecorate <em>Decorate</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends GraphElement {
	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DOT.Nodelike#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference.
	 * @see #setFromNode(Nodelike)
	 * @see DOT.DOTPackage#getArc_FromNode()
	 * @see DOT.Nodelike#getRefers
	 * @model opposite="refers" required="true" ordered="false"
	 * @generated
	 */
	Nodelike getFromNode();

	/**
	 * Sets the value of the '{@link DOT.Arc#getFromNode <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Node</em>' reference.
	 * @see #getFromNode()
	 * @generated
	 */
	void setFromNode(Nodelike value);

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DOT.Nodelike#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(Nodelike)
	 * @see DOT.DOTPackage#getArc_ToNode()
	 * @see DOT.Nodelike#getReferredBy
	 * @model opposite="referredBy" required="true" ordered="false"
	 * @generated
	 */
	Nodelike getToNode();

	/**
	 * Sets the value of the '{@link DOT.Arc#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(Nodelike value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link DOT.Layer}.
	 * It is bidirectional and its opposite is '{@link DOT.Layer#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see DOT.DOTPackage#getArc_Layers()
	 * @see DOT.Layer#getArcs
	 * @model opposite="arcs" ordered="false"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(boolean)
	 * @see DOT.DOTPackage#getArc_Constraint()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isConstraint();

	/**
	 * Sets the value of the '{@link DOT.Arc#isConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #isConstraint()
	 * @generated
	 */
	void setConstraint(boolean value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see DOT.DOTPackage#getArc_Group()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link DOT.Arc#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Minlen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minlen</em>' attribute.
	 * @see #setMinlen(int)
	 * @see DOT.DOTPackage#getArc_Minlen()
	 * @model dataType="PrimitiveTypes.Integer" ordered="false"
	 * @generated
	 */
	int getMinlen();

	/**
	 * Sets the value of the '{@link DOT.Arc#getMinlen <em>Minlen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlen</em>' attribute.
	 * @see #getMinlen()
	 * @generated
	 */
	void setMinlen(int value);

	/**
	 * Returns the value of the '<em><b>Same Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Head</em>' attribute.
	 * @see #setSameHead(String)
	 * @see DOT.DOTPackage#getArc_SameHead()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getSameHead();

	/**
	 * Sets the value of the '{@link DOT.Arc#getSameHead <em>Same Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Head</em>' attribute.
	 * @see #getSameHead()
	 * @generated
	 */
	void setSameHead(String value);

	/**
	 * Returns the value of the '<em><b>Same Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Tail</em>' attribute.
	 * @see #setSameTail(String)
	 * @see DOT.DOTPackage#getArc_SameTail()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getSameTail();

	/**
	 * Sets the value of the '{@link DOT.Arc#getSameTail <em>Same Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Tail</em>' attribute.
	 * @see #getSameTail()
	 * @generated
	 */
	void setSameTail(String value);

	/**
	 * Returns the value of the '<em><b>Lhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhead</em>' reference.
	 * @see #setLhead(Nodelike)
	 * @see DOT.DOTPackage#getArc_Lhead()
	 * @model ordered="false"
	 * @generated
	 */
	Nodelike getLhead();

	/**
	 * Sets the value of the '{@link DOT.Arc#getLhead <em>Lhead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhead</em>' reference.
	 * @see #getLhead()
	 * @generated
	 */
	void setLhead(Nodelike value);

	/**
	 * Returns the value of the '<em><b>Ltail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltail</em>' reference.
	 * @see #setLtail(Nodelike)
	 * @see DOT.DOTPackage#getArc_Ltail()
	 * @model ordered="false"
	 * @generated
	 */
	Nodelike getLtail();

	/**
	 * Sets the value of the '{@link DOT.Arc#getLtail <em>Ltail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltail</em>' reference.
	 * @see #getLtail()
	 * @generated
	 */
	void setLtail(Nodelike value);

	/**
	 * Returns the value of the '<em><b>Decorate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorate</em>' attribute.
	 * @see #setDecorate(boolean)
	 * @see DOT.DOTPackage#getArc_Decorate()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isDecorate();

	/**
	 * Sets the value of the '{@link DOT.Arc#isDecorate <em>Decorate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorate</em>' attribute.
	 * @see #isDecorate()
	 * @generated
	 */
	void setDecorate(boolean value);

} // Arc
