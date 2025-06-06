/**
 */
package DOT.util;

import DOT.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DOT.DOTPackage
 * @generated
 */
public class DOTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DOTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOTSwitch() {
		if (modelPackage == null) {
			modelPackage = DOTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DOTPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.SIMPLE_LABEL: {
				SimpleLabel simpleLabel = (SimpleLabel)theEObject;
				T result = caseSimpleLabel(simpleLabel);
				if (result == null) result = caseLabel(simpleLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.COMPLEX_LABEL: {
				ComplexLabel complexLabel = (ComplexLabel)theEObject;
				T result = caseComplexLabel(complexLabel);
				if (result == null) result = caseLabel(complexLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.COMPARTMENT: {
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.VERTICAL_COMPARTMENT: {
				VerticalCompartment verticalCompartment = (VerticalCompartment)theEObject;
				T result = caseVerticalCompartment(verticalCompartment);
				if (result == null) result = caseCompartment(verticalCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.HORIZONTAL_COMPARTMENT: {
				HorizontalCompartment horizontalCompartment = (HorizontalCompartment)theEObject;
				T result = caseHorizontalCompartment(horizontalCompartment);
				if (result == null) result = caseCompartment(horizontalCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.SIMPLE_COMPARTMENT: {
				SimpleCompartment simpleCompartment = (SimpleCompartment)theEObject;
				T result = caseSimpleCompartment(simpleCompartment);
				if (result == null) result = caseCompartment(simpleCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.ANCHOR: {
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.GRAPH_ELEMENT: {
				GraphElement graphElement = (GraphElement)theEObject;
				T result = caseGraphElement(graphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.GRAPH: {
				Graph graph = (Graph)theEObject;
				T result = caseGraph(graph);
				if (result == null) result = caseGraphElement(graph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseGraphElement(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.NODELIKE: {
				Nodelike nodelike = (Nodelike)theEObject;
				T result = caseNodelike(nodelike);
				if (result == null) result = caseGraphElement(nodelike);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.SUB_GRAPH: {
				SubGraph subGraph = (SubGraph)theEObject;
				T result = caseSubGraph(subGraph);
				if (result == null) result = caseNodelike(subGraph);
				if (result == null) result = caseGraphElement(subGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseNodelike(node);
				if (result == null) result = caseGraphElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.ARC: {
				Arc arc = (Arc)theEObject;
				T result = caseArc(arc);
				if (result == null) result = caseGraphElement(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.DIRECTED_ARC: {
				DirectedArc directedArc = (DirectedArc)theEObject;
				T result = caseDirectedArc(directedArc);
				if (result == null) result = caseArc(directedArc);
				if (result == null) result = caseGraphElement(directedArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.UNDIRECTED_ARC: {
				UndirectedArc undirectedArc = (UndirectedArc)theEObject;
				T result = caseUndirectedArc(undirectedArc);
				if (result == null) result = caseArc(undirectedArc);
				if (result == null) result = caseGraphElement(undirectedArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = caseGraphElement(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.NODE_SHAPE: {
				NodeShape nodeShape = (NodeShape)theEObject;
				T result = caseNodeShape(nodeShape);
				if (result == null) result = caseShape(nodeShape);
				if (result == null) result = caseGraphElement(nodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.SIMPLE_NODE_SHAPE: {
				SimpleNodeShape simpleNodeShape = (SimpleNodeShape)theEObject;
				T result = caseSimpleNodeShape(simpleNodeShape);
				if (result == null) result = caseNodeShape(simpleNodeShape);
				if (result == null) result = caseShape(simpleNodeShape);
				if (result == null) result = caseGraphElement(simpleNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.POINT_NODE_SHAPE: {
				PointNodeShape pointNodeShape = (PointNodeShape)theEObject;
				T result = casePointNodeShape(pointNodeShape);
				if (result == null) result = caseNodeShape(pointNodeShape);
				if (result == null) result = caseShape(pointNodeShape);
				if (result == null) result = caseGraphElement(pointNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.COMPLEX_NODE_SHAPE: {
				ComplexNodeShape complexNodeShape = (ComplexNodeShape)theEObject;
				T result = caseComplexNodeShape(complexNodeShape);
				if (result == null) result = caseNodeShape(complexNodeShape);
				if (result == null) result = caseShape(complexNodeShape);
				if (result == null) result = caseGraphElement(complexNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.POLYGON_NODE_SHAPE: {
				PolygonNodeShape polygonNodeShape = (PolygonNodeShape)theEObject;
				T result = casePolygonNodeShape(polygonNodeShape);
				if (result == null) result = caseComplexNodeShape(polygonNodeShape);
				if (result == null) result = caseNodeShape(polygonNodeShape);
				if (result == null) result = caseShape(polygonNodeShape);
				if (result == null) result = caseGraphElement(polygonNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.MNODE_SHAPE: {
				MNodeShape mNodeShape = (MNodeShape)theEObject;
				T result = caseMNodeShape(mNodeShape);
				if (result == null) result = caseComplexNodeShape(mNodeShape);
				if (result == null) result = caseNodeShape(mNodeShape);
				if (result == null) result = caseShape(mNodeShape);
				if (result == null) result = caseGraphElement(mNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.RECORD_NODE_SHAPE: {
				RecordNodeShape recordNodeShape = (RecordNodeShape)theEObject;
				T result = caseRecordNodeShape(recordNodeShape);
				if (result == null) result = caseComplexNodeShape(recordNodeShape);
				if (result == null) result = caseNodeShape(recordNodeShape);
				if (result == null) result = caseShape(recordNodeShape);
				if (result == null) result = caseGraphElement(recordNodeShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DOTPackage.ARROW_SHAPE: {
				ArrowShape arrowShape = (ArrowShape)theEObject;
				T result = caseArrowShape(arrowShape);
				if (result == null) result = caseShape(arrowShape);
				if (result == null) result = caseGraphElement(arrowShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleLabel(SimpleLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexLabel(ComplexLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalCompartment(VerticalCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalCompartment(HorizontalCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleCompartment(SimpleCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodelike</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodelike</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodelike(Nodelike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubGraph(SubGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedArc(DirectedArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undirected Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undirected Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndirectedArc(UndirectedArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeShape(NodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleNodeShape(SimpleNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointNodeShape(PointNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexNodeShape(ComplexNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonNodeShape(PolygonNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MNode Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MNode Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMNodeShape(MNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Node Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Node Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordNodeShape(RecordNodeShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowShape(ArrowShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DOTSwitch
