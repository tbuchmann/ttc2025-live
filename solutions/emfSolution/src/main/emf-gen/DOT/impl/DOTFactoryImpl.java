/**
 */
package DOT.impl;

import DOT.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DOTFactoryImpl extends EFactoryImpl implements DOTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DOTFactory init() {
		try {
			DOTFactory theDOTFactory = (DOTFactory)EPackage.Registry.INSTANCE.getEFactory(DOTPackage.eNS_URI);
			if (theDOTFactory != null) {
				return theDOTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DOTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DOTPackage.SIMPLE_LABEL: return createSimpleLabel();
			case DOTPackage.COMPLEX_LABEL: return createComplexLabel();
			case DOTPackage.VERTICAL_COMPARTMENT: return createVerticalCompartment();
			case DOTPackage.HORIZONTAL_COMPARTMENT: return createHorizontalCompartment();
			case DOTPackage.SIMPLE_COMPARTMENT: return createSimpleCompartment();
			case DOTPackage.ANCHOR: return createAnchor();
			case DOTPackage.GRAPH: return createGraph();
			case DOTPackage.LAYER: return createLayer();
			case DOTPackage.SUB_GRAPH: return createSubGraph();
			case DOTPackage.NODE: return createNode();
			case DOTPackage.DIRECTED_ARC: return createDirectedArc();
			case DOTPackage.UNDIRECTED_ARC: return createUndirectedArc();
			case DOTPackage.SIMPLE_NODE_SHAPE: return createSimpleNodeShape();
			case DOTPackage.POINT_NODE_SHAPE: return createPointNodeShape();
			case DOTPackage.POLYGON_NODE_SHAPE: return createPolygonNodeShape();
			case DOTPackage.MNODE_SHAPE: return createMNodeShape();
			case DOTPackage.RECORD_NODE_SHAPE: return createRecordNodeShape();
			case DOTPackage.ARROW_SHAPE: return createArrowShape();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleLabel createSimpleLabel() {
		SimpleLabelImpl simpleLabel = new SimpleLabelImpl();
		return simpleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexLabel createComplexLabel() {
		ComplexLabelImpl complexLabel = new ComplexLabelImpl();
		return complexLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCompartment createVerticalCompartment() {
		VerticalCompartmentImpl verticalCompartment = new VerticalCompartmentImpl();
		return verticalCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HorizontalCompartment createHorizontalCompartment() {
		HorizontalCompartmentImpl horizontalCompartment = new HorizontalCompartmentImpl();
		return horizontalCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleCompartment createSimpleCompartment() {
		SimpleCompartmentImpl simpleCompartment = new SimpleCompartmentImpl();
		return simpleCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor createAnchor() {
		AnchorImpl anchor = new AnchorImpl();
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubGraph createSubGraph() {
		SubGraphImpl subGraph = new SubGraphImpl();
		return subGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedArc createDirectedArc() {
		DirectedArcImpl directedArc = new DirectedArcImpl();
		return directedArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UndirectedArc createUndirectedArc() {
		UndirectedArcImpl undirectedArc = new UndirectedArcImpl();
		return undirectedArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleNodeShape createSimpleNodeShape() {
		SimpleNodeShapeImpl simpleNodeShape = new SimpleNodeShapeImpl();
		return simpleNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointNodeShape createPointNodeShape() {
		PointNodeShapeImpl pointNodeShape = new PointNodeShapeImpl();
		return pointNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonNodeShape createPolygonNodeShape() {
		PolygonNodeShapeImpl polygonNodeShape = new PolygonNodeShapeImpl();
		return polygonNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MNodeShape createMNodeShape() {
		MNodeShapeImpl mNodeShape = new MNodeShapeImpl();
		return mNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordNodeShape createRecordNodeShape() {
		RecordNodeShapeImpl recordNodeShape = new RecordNodeShapeImpl();
		return recordNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowShape createArrowShape() {
		ArrowShapeImpl arrowShape = new ArrowShapeImpl();
		return arrowShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DOTPackage getDOTPackage() {
		return (DOTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DOTPackage getPackage() {
		return DOTPackage.eINSTANCE;
	}

} //DOTFactoryImpl
