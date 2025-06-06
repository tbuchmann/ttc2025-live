/**
 */
package DOT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DOT.Graph#getType <em>Type</em>}</li>
 *   <li>{@link DOT.Graph#getRankDir <em>Rank Dir</em>}</li>
 *   <li>{@link DOT.Graph#getLabeljust <em>Labeljust</em>}</li>
 *   <li>{@link DOT.Graph#getLabelloc <em>Labelloc</em>}</li>
 *   <li>{@link DOT.Graph#isConcentrate <em>Concentrate</em>}</li>
 *   <li>{@link DOT.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.Graph#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link DOT.Graph#isCompound <em>Compound</em>}</li>
 *   <li>{@link DOT.Graph#getLayers <em>Layers</em>}</li>
 *   <li>{@link DOT.Graph#getNodeSeparation <em>Node Separation</em>}</li>
 *   <li>{@link DOT.Graph#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link DOT.Graph#getSize <em>Size</em>}</li>
 *   <li>{@link DOT.Graph#getRatio <em>Ratio</em>}</li>
 *   <li>{@link DOT.Graph#isCenter <em>Center</em>}</li>
 * </ul>
 *
 * @see DOT.DOTPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see DOT.DOTPackage#getGraph_Type()
	 * @model dataType="PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link DOT.Graph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Rank Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank Dir</em>' attribute.
	 * @see #setRankDir(String)
	 * @see DOT.DOTPackage#getGraph_RankDir()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getRankDir();

	/**
	 * Sets the value of the '{@link DOT.Graph#getRankDir <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank Dir</em>' attribute.
	 * @see #getRankDir()
	 * @generated
	 */
	void setRankDir(String value);

	/**
	 * Returns the value of the '<em><b>Labeljust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeljust</em>' attribute.
	 * @see #setLabeljust(String)
	 * @see DOT.DOTPackage#getGraph_Labeljust()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getLabeljust();

	/**
	 * Sets the value of the '{@link DOT.Graph#getLabeljust <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeljust</em>' attribute.
	 * @see #getLabeljust()
	 * @generated
	 */
	void setLabeljust(String value);

	/**
	 * Returns the value of the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelloc</em>' attribute.
	 * @see #setLabelloc(String)
	 * @see DOT.DOTPackage#getGraph_Labelloc()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getLabelloc();

	/**
	 * Sets the value of the '{@link DOT.Graph#getLabelloc <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelloc</em>' attribute.
	 * @see #getLabelloc()
	 * @generated
	 */
	void setLabelloc(String value);

	/**
	 * Returns the value of the '<em><b>Concentrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentrate</em>' attribute.
	 * @see #setConcentrate(boolean)
	 * @see DOT.DOTPackage#getGraph_Concentrate()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isConcentrate();

	/**
	 * Sets the value of the '{@link DOT.Graph#isConcentrate <em>Concentrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentrate</em>' attribute.
	 * @see #isConcentrate()
	 * @generated
	 */
	void setConcentrate(boolean value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.Nodelike}.
	 * It is bidirectional and its opposite is '{@link DOT.Nodelike#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see DOT.DOTPackage#getGraph_Nodes()
	 * @see DOT.Nodelike#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<Nodelike> getNodes();

	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Box</em>' attribute.
	 * @see #setBoundingBox(String)
	 * @see DOT.DOTPackage#getGraph_BoundingBox()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getBoundingBox();

	/**
	 * Sets the value of the '{@link DOT.Graph#getBoundingBox <em>Bounding Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box</em>' attribute.
	 * @see #getBoundingBox()
	 * @generated
	 */
	void setBoundingBox(String value);

	/**
	 * Returns the value of the '<em><b>Compound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound</em>' attribute.
	 * @see #setCompound(boolean)
	 * @see DOT.DOTPackage#getGraph_Compound()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isCompound();

	/**
	 * Sets the value of the '{@link DOT.Graph#isCompound <em>Compound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound</em>' attribute.
	 * @see #isCompound()
	 * @generated
	 */
	void setCompound(boolean value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link DOT.Layer}.
	 * It is bidirectional and its opposite is '{@link DOT.Layer#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see DOT.DOTPackage#getGraph_Layers()
	 * @see DOT.Layer#getGraph
	 * @model opposite="graph" containment="true" ordered="false"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Node Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Separation</em>' attribute.
	 * @see #setNodeSeparation(double)
	 * @see DOT.DOTPackage#getGraph_NodeSeparation()
	 * @model dataType="PrimitiveTypes.Double" ordered="false"
	 * @generated
	 */
	double getNodeSeparation();

	/**
	 * Sets the value of the '{@link DOT.Graph#getNodeSeparation <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Separation</em>' attribute.
	 * @see #getNodeSeparation()
	 * @generated
	 */
	void setNodeSeparation(double value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(String)
	 * @see DOT.DOTPackage#getGraph_Ordering()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link DOT.Graph#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see DOT.DOTPackage#getGraph_Size()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link DOT.Graph#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(String)
	 * @see DOT.DOTPackage#getGraph_Ratio()
	 * @model dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getRatio();

	/**
	 * Sets the value of the '{@link DOT.Graph#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(String value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #setCenter(boolean)
	 * @see DOT.DOTPackage#getGraph_Center()
	 * @model dataType="PrimitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	boolean isCenter();

	/**
	 * Sets the value of the '{@link DOT.Graph#isCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #isCenter()
	 * @generated
	 */
	void setCenter(boolean value);

} // Graph
