/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Layer#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.Layer#getArcs <em>Arcs</em>}</li>
 *   <li>{@link DOT.Layer#getGraph <em>Graph</em>}</li>
 *   <li>{@link DOT.Layer#getLayerSeparator <em>Layer Separator</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link DOT.Nodelike}.
	 * It is bidirectional and its opposite is '{@link DOT.Nodelike#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see DOT.DOTPackage#getLayer_Nodes()
	 * @see DOT.Nodelike#getLayers
	 * @model opposite="layers" ordered="false"
	 * @generated
	 */
	EList<Nodelike> getNodes();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' reference list.
	 * The list contents are of type {@link DOT.Arc}.
	 * It is bidirectional and its opposite is '{@link DOT.Arc#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see DOT.DOTPackage#getLayer_Arcs()
	 * @see DOT.Arc#getLayers
	 * @model opposite="layers" ordered="false"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DOT.Graph#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see DOT.DOTPackage#getLayer_Graph()
	 * @see DOT.Graph#getLayers
	 * @model opposite="layers" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link DOT.Layer#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Layer Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Separator</em>' attribute.
	 * @see #setLayerSeparator(String)
	 * @see DOT.DOTPackage#getLayer_LayerSeparator()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getLayerSeparator();

	/**
	 * Sets the value of the '{@link DOT.Layer#getLayerSeparator <em>Layer Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Separator</em>' attribute.
	 * @see #getLayerSeparator()
	 * @generated
	 */
	void setLayerSeparator(String value);

} // Layer
