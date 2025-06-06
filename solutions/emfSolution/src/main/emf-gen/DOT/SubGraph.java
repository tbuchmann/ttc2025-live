/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.SubGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.SubGraph#getLabelloc <em>Labelloc</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getSubGraph()
 * @model
 * @generated
 */
public interface SubGraph extends Nodelike {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.Nodelike}.
	 * It is bidirectional and its opposite is '{@link DOT.Nodelike#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see DOT.DOTPackage#getSubGraph_Nodes()
	 * @see DOT.Nodelike#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Nodelike> getNodes();

	/**
	 * Returns the value of the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelloc</em>' attribute.
	 * @see #setLabelloc(String)
	 * @see DOT.DOTPackage#getSubGraph_Labelloc()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getLabelloc();

	/**
	 * Sets the value of the '{@link DOT.SubGraph#getLabelloc <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelloc</em>' attribute.
	 * @see #getLabelloc()
	 * @generated
	 */
	void setLabelloc(String value);

} // SubGraph
