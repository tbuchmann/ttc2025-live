/**
 */
package DOT.util;

import DOT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DOT.DOTPackage
 * @generated
 */
public class DOTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DOTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DOTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOTSwitch<Adapter> modelSwitch =
		new DOTSwitch<Adapter>() {
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseSimpleLabel(SimpleLabel object) {
				return createSimpleLabelAdapter();
			}
			@Override
			public Adapter caseComplexLabel(ComplexLabel object) {
				return createComplexLabelAdapter();
			}
			@Override
			public Adapter caseCompartment(Compartment object) {
				return createCompartmentAdapter();
			}
			@Override
			public Adapter caseVerticalCompartment(VerticalCompartment object) {
				return createVerticalCompartmentAdapter();
			}
			@Override
			public Adapter caseHorizontalCompartment(HorizontalCompartment object) {
				return createHorizontalCompartmentAdapter();
			}
			@Override
			public Adapter caseSimpleCompartment(SimpleCompartment object) {
				return createSimpleCompartmentAdapter();
			}
			@Override
			public Adapter caseAnchor(Anchor object) {
				return createAnchorAdapter();
			}
			@Override
			public Adapter caseGraphElement(GraphElement object) {
				return createGraphElementAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseNodelike(Nodelike object) {
				return createNodelikeAdapter();
			}
			@Override
			public Adapter caseSubGraph(SubGraph object) {
				return createSubGraphAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter caseDirectedArc(DirectedArc object) {
				return createDirectedArcAdapter();
			}
			@Override
			public Adapter caseUndirectedArc(UndirectedArc object) {
				return createUndirectedArcAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseNodeShape(NodeShape object) {
				return createNodeShapeAdapter();
			}
			@Override
			public Adapter caseSimpleNodeShape(SimpleNodeShape object) {
				return createSimpleNodeShapeAdapter();
			}
			@Override
			public Adapter casePointNodeShape(PointNodeShape object) {
				return createPointNodeShapeAdapter();
			}
			@Override
			public Adapter caseComplexNodeShape(ComplexNodeShape object) {
				return createComplexNodeShapeAdapter();
			}
			@Override
			public Adapter casePolygonNodeShape(PolygonNodeShape object) {
				return createPolygonNodeShapeAdapter();
			}
			@Override
			public Adapter caseMNodeShape(MNodeShape object) {
				return createMNodeShapeAdapter();
			}
			@Override
			public Adapter caseRecordNodeShape(RecordNodeShape object) {
				return createRecordNodeShapeAdapter();
			}
			@Override
			public Adapter caseArrowShape(ArrowShape object) {
				return createArrowShapeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DOT.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.SimpleLabel <em>Simple Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.SimpleLabel
	 * @generated
	 */
	public Adapter createSimpleLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.ComplexLabel <em>Complex Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.ComplexLabel
	 * @generated
	 */
	public Adapter createComplexLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Compartment
	 * @generated
	 */
	public Adapter createCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.VerticalCompartment <em>Vertical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.VerticalCompartment
	 * @generated
	 */
	public Adapter createVerticalCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.HorizontalCompartment <em>Horizontal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.HorizontalCompartment
	 * @generated
	 */
	public Adapter createHorizontalCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.SimpleCompartment <em>Simple Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.SimpleCompartment
	 * @generated
	 */
	public Adapter createSimpleCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Anchor
	 * @generated
	 */
	public Adapter createAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.GraphElement
	 * @generated
	 */
	public Adapter createGraphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Nodelike <em>Nodelike</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Nodelike
	 * @generated
	 */
	public Adapter createNodelikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.SubGraph
	 * @generated
	 */
	public Adapter createSubGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.DirectedArc <em>Directed Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.DirectedArc
	 * @generated
	 */
	public Adapter createDirectedArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.UndirectedArc <em>Undirected Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.UndirectedArc
	 * @generated
	 */
	public Adapter createUndirectedArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.NodeShape <em>Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.NodeShape
	 * @generated
	 */
	public Adapter createNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.SimpleNodeShape <em>Simple Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.SimpleNodeShape
	 * @generated
	 */
	public Adapter createSimpleNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.PointNodeShape <em>Point Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.PointNodeShape
	 * @generated
	 */
	public Adapter createPointNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.ComplexNodeShape <em>Complex Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.ComplexNodeShape
	 * @generated
	 */
	public Adapter createComplexNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.PolygonNodeShape <em>Polygon Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.PolygonNodeShape
	 * @generated
	 */
	public Adapter createPolygonNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.MNodeShape <em>MNode Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.MNodeShape
	 * @generated
	 */
	public Adapter createMNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.RecordNodeShape <em>Record Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.RecordNodeShape
	 * @generated
	 */
	public Adapter createRecordNodeShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DOT.ArrowShape <em>Arrow Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DOT.ArrowShape
	 * @generated
	 */
	public Adapter createArrowShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DOTAdapterFactory
