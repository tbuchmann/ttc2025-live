/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodelike</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Nodelike#getOwner <em>Owner</em>}</li>
 *   <li>{@link DOT.Nodelike#getRefers <em>Refers</em>}</li>
 *   <li>{@link DOT.Nodelike#getReferredBy <em>Referred By</em>}</li>
 *   <li>{@link DOT.Nodelike#getGraph <em>Graph</em>}</li>
 *   <li>{@link DOT.Nodelike#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getNodelike()
 * @model abstract="true"
 * @generated
 */
public interface Nodelike extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DOT.SubGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SubGraph)
	 * @see DOT.DOTPackage#getNodelike_Owner()
	 * @see DOT.SubGraph#getNodes
	 * @model opposite="nodes" transient="false" ordered="false"
	 * @generated
	 */
	SubGraph getOwner();

	/**
	 * Sets the value of the '{@link DOT.Nodelike#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SubGraph value);

	/**
	 * Returns the value of the '<em><b>Refers</b></em>' reference list.
	 * The list contents are of type {@link DOT.Arc}.
	 * It is bidirectional and its opposite is '{@link DOT.Arc#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers</em>' reference list.
	 * @see DOT.DOTPackage#getNodelike_Refers()
	 * @see DOT.Arc#getFromNode
	 * @model opposite="fromNode" ordered="false"
	 * @generated
	 */
	EList<Arc> getRefers();

	/**
	 * Returns the value of the '<em><b>Referred By</b></em>' reference list.
	 * The list contents are of type {@link DOT.Arc}.
	 * It is bidirectional and its opposite is '{@link DOT.Arc#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By</em>' reference list.
	 * @see DOT.DOTPackage#getNodelike_ReferredBy()
	 * @see DOT.Arc#getToNode
	 * @model opposite="toNode" ordered="false"
	 * @generated
	 */
	EList<Arc> getReferredBy();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DOT.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see DOT.DOTPackage#getNodelike_Graph()
	 * @see DOT.Graph#getNodes
	 * @model opposite="nodes" transient="false" ordered="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link DOT.Nodelike#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link DOT.Layer}.
	 * It is bidirectional and its opposite is '{@link DOT.Layer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see DOT.DOTPackage#getNodelike_Layers()
	 * @see DOT.Layer#getNodes
	 * @model opposite="nodes" ordered="false"
	 * @generated
	 */
	EList<Layer> getLayers();

} // Nodelike
