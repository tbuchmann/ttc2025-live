/**
 */
package DOT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DOT.DOTPackage
 * @generated
 */
public interface DOTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DOTFactory eINSTANCE = DOT.impl.DOTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Label</em>'.
	 * @generated
	 */
	SimpleLabel createSimpleLabel();

	/**
	 * Returns a new object of class '<em>Complex Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Label</em>'.
	 * @generated
	 */
	ComplexLabel createComplexLabel();

	/**
	 * Returns a new object of class '<em>Vertical Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Compartment</em>'.
	 * @generated
	 */
	VerticalCompartment createVerticalCompartment();

	/**
	 * Returns a new object of class '<em>Horizontal Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Compartment</em>'.
	 * @generated
	 */
	HorizontalCompartment createHorizontalCompartment();

	/**
	 * Returns a new object of class '<em>Simple Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Compartment</em>'.
	 * @generated
	 */
	SimpleCompartment createSimpleCompartment();

	/**
	 * Returns a new object of class '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anchor</em>'.
	 * @generated
	 */
	Anchor createAnchor();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Graph</em>'.
	 * @generated
	 */
	SubGraph createSubGraph();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Directed Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directed Arc</em>'.
	 * @generated
	 */
	DirectedArc createDirectedArc();

	/**
	 * Returns a new object of class '<em>Undirected Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undirected Arc</em>'.
	 * @generated
	 */
	UndirectedArc createUndirectedArc();

	/**
	 * Returns a new object of class '<em>Simple Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Node Shape</em>'.
	 * @generated
	 */
	SimpleNodeShape createSimpleNodeShape();

	/**
	 * Returns a new object of class '<em>Point Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Node Shape</em>'.
	 * @generated
	 */
	PointNodeShape createPointNodeShape();

	/**
	 * Returns a new object of class '<em>Polygon Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon Node Shape</em>'.
	 * @generated
	 */
	PolygonNodeShape createPolygonNodeShape();

	/**
	 * Returns a new object of class '<em>MNode Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MNode Shape</em>'.
	 * @generated
	 */
	MNodeShape createMNodeShape();

	/**
	 * Returns a new object of class '<em>Record Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Node Shape</em>'.
	 * @generated
	 */
	RecordNodeShape createRecordNodeShape();

	/**
	 * Returns a new object of class '<em>Arrow Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrow Shape</em>'.
	 * @generated
	 */
	ArrowShape createArrowShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DOTPackage getDOTPackage();

} //DOTFactory
