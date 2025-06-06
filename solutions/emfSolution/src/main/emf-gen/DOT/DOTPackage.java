/**
 */
package DOT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DOT.DOTFactory
 * @model kind="package"
 * @generated
 */
public interface DOTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DOT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://transformationtoolcontest.github.io/dot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DOTPackage eINSTANCE = DOT.impl.DOTPackageImpl.init();

	/**
	 * The meta object id for the '{@link DOT.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.LabelImpl
	 * @see DOT.impl.DOTPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SimpleLabelImpl <em>Simple Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SimpleLabelImpl
	 * @see DOT.impl.DOTPackageImpl#getSimpleLabel()
	 * @generated
	 */
	int SIMPLE_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL__ELEMENT = LABEL__ELEMENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL__CONTENT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ComplexLabelImpl <em>Complex Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ComplexLabelImpl
	 * @see DOT.impl.DOTPackageImpl#getComplexLabel()
	 * @generated
	 */
	int COMPLEX_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_LABEL__ELEMENT = LABEL__ELEMENT;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_LABEL__COMPARTMENTS = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_LABEL_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_LABEL_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.CompartmentImpl
	 * @see DOT.impl.DOTPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Complex Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__COMPLEX_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__COMPARTMENTS = 1;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__ANCHOR = 2;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.VerticalCompartmentImpl <em>Vertical Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.VerticalCompartmentImpl
	 * @see DOT.impl.DOTPackageImpl#getVerticalCompartment()
	 * @generated
	 */
	int VERTICAL_COMPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Complex Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_COMPARTMENT__COMPLEX_LABEL = COMPARTMENT__COMPLEX_LABEL;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_COMPARTMENT__COMPARTMENTS = COMPARTMENT__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_COMPARTMENT__ANCHOR = COMPARTMENT__ANCHOR;

	/**
	 * The number of structural features of the '<em>Vertical Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_COMPARTMENT_FEATURE_COUNT = COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertical Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_COMPARTMENT_OPERATION_COUNT = COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.HorizontalCompartmentImpl <em>Horizontal Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.HorizontalCompartmentImpl
	 * @see DOT.impl.DOTPackageImpl#getHorizontalCompartment()
	 * @generated
	 */
	int HORIZONTAL_COMPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Complex Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COMPARTMENT__COMPLEX_LABEL = COMPARTMENT__COMPLEX_LABEL;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COMPARTMENT__COMPARTMENTS = COMPARTMENT__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COMPARTMENT__ANCHOR = COMPARTMENT__ANCHOR;

	/**
	 * The number of structural features of the '<em>Horizontal Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COMPARTMENT_FEATURE_COUNT = COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COMPARTMENT_OPERATION_COUNT = COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SimpleCompartmentImpl <em>Simple Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SimpleCompartmentImpl
	 * @see DOT.impl.DOTPackageImpl#getSimpleCompartment()
	 * @generated
	 */
	int SIMPLE_COMPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Complex Label</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__COMPLEX_LABEL = COMPARTMENT__COMPLEX_LABEL;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__COMPARTMENTS = COMPARTMENT__COMPARTMENTS;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__ANCHOR = COMPARTMENT__ANCHOR;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__CONTENT = COMPARTMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT_FEATURE_COUNT = COMPARTMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT_OPERATION_COUNT = COMPARTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.AnchorImpl <em>Anchor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.AnchorImpl
	 * @see DOT.impl.DOTPackageImpl#getAnchor()
	 * @generated
	 */
	int ANCHOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anchor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANCHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.GraphElementImpl
	 * @see DOT.impl.DOTPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__COLOR = 3;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DOT.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.GraphImpl
	 * @see DOT.impl.DOTPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__STYLE = GRAPH_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rank Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RANK_DIR = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labeljust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABELJUST = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LABELLOC = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concentrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CONCENTRATE = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__BOUNDING_BOX = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Compound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__COMPOUND = GRAPH_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__LAYERS = GRAPH_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Node Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODE_SEPARATION = GRAPH_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ORDERING = GRAPH_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SIZE = GRAPH_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__RATIO = GRAPH_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CENTER = GRAPH_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.LayerImpl
	 * @see DOT.impl.DOTPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__STYLE = GRAPH_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NODES = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ARCS = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__GRAPH = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layer Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LAYER_SEPARATOR = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodelikeImpl <em>Nodelike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodelikeImpl
	 * @see DOT.impl.DOTPackageImpl#getNodelike()
	 * @generated
	 */
	int NODELIKE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__STYLE = GRAPH_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__OWNER = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__REFERS = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__REFERRED_BY = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__GRAPH = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE__LAYERS = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Nodelike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Nodelike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODELIKE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SubGraphImpl <em>Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SubGraphImpl
	 * @see DOT.impl.DOTPackageImpl#getSubGraph()
	 * @generated
	 */
	int SUB_GRAPH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__NAME = NODELIKE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__LABEL = NODELIKE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__STYLE = NODELIKE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__COLOR = NODELIKE__COLOR;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__OWNER = NODELIKE__OWNER;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__REFERS = NODELIKE__REFERS;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__REFERRED_BY = NODELIKE__REFERRED_BY;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__GRAPH = NODELIKE__GRAPH;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__LAYERS = NODELIKE__LAYERS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__NODES = NODELIKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labelloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__LABELLOC = NODELIKE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_FEATURE_COUNT = NODELIKE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_OPERATION_COUNT = NODELIKE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodeImpl
	 * @see DOT.impl.DOTPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NODELIKE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = NODELIKE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = NODELIKE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COLOR = NODELIKE__COLOR;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNER = NODELIKE__OWNER;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERS = NODELIKE__REFERS;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERRED_BY = NODELIKE__REFERRED_BY;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = NODELIKE__GRAPH;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LAYERS = NODELIKE__LAYERS;

	/**
	 * The feature id for the '<em><b>Fixed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIXED_SIZE = NODELIKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fontname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FONTNAME = NODELIKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fontsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FONTSIZE = NODELIKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HEIGHT = NODELIKE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__WIDTH = NODELIKE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = NODELIKE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NODELIKE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NODELIKE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ArcImpl
	 * @see DOT.impl.DOTPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__STYLE = GRAPH_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FROM_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TO_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LAYERS = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__CONSTRAINT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GROUP = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minlen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__MINLEN = GRAPH_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Same Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SAME_HEAD = GRAPH_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Same Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SAME_TAIL = GRAPH_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LHEAD = GRAPH_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ltail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LTAIL = GRAPH_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Decorate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__DECORATE = GRAPH_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.DirectedArcImpl <em>Directed Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.DirectedArcImpl
	 * @see DOT.impl.DOTPackageImpl#getDirectedArc()
	 * @generated
	 */
	int DIRECTED_ARC = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__LABEL = ARC__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__STYLE = ARC__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__COLOR = ARC__COLOR;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__FROM_NODE = ARC__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__TO_NODE = ARC__TO_NODE;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__LAYERS = ARC__LAYERS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__CONSTRAINT = ARC__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__GROUP = ARC__GROUP;

	/**
	 * The feature id for the '<em><b>Minlen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__MINLEN = ARC__MINLEN;

	/**
	 * The feature id for the '<em><b>Same Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__SAME_HEAD = ARC__SAME_HEAD;

	/**
	 * The feature id for the '<em><b>Same Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__SAME_TAIL = ARC__SAME_TAIL;

	/**
	 * The feature id for the '<em><b>Lhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__LHEAD = ARC__LHEAD;

	/**
	 * The feature id for the '<em><b>Ltail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__LTAIL = ARC__LTAIL;

	/**
	 * The feature id for the '<em><b>Decorate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__DECORATE = ARC__DECORATE;

	/**
	 * The feature id for the '<em><b>Arrow Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__ARROW_HEAD = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Headlabel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__HEADLABEL = ARC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Taillabel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__TAILLABEL = ARC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arrow Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__ARROW_TAIL = ARC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tail lp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__TAIL_LP = ARC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Head lp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__HEAD_LP = ARC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Directed Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Directed Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.UndirectedArcImpl <em>Undirected Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.UndirectedArcImpl
	 * @see DOT.impl.DOTPackageImpl#getUndirectedArc()
	 * @generated
	 */
	int UNDIRECTED_ARC = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__LABEL = ARC__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__STYLE = ARC__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__COLOR = ARC__COLOR;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__FROM_NODE = ARC__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__TO_NODE = ARC__TO_NODE;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__LAYERS = ARC__LAYERS;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__CONSTRAINT = ARC__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__GROUP = ARC__GROUP;

	/**
	 * The feature id for the '<em><b>Minlen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__MINLEN = ARC__MINLEN;

	/**
	 * The feature id for the '<em><b>Same Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__SAME_HEAD = ARC__SAME_HEAD;

	/**
	 * The feature id for the '<em><b>Same Tail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__SAME_TAIL = ARC__SAME_TAIL;

	/**
	 * The feature id for the '<em><b>Lhead</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__LHEAD = ARC__LHEAD;

	/**
	 * The feature id for the '<em><b>Ltail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__LTAIL = ARC__LTAIL;

	/**
	 * The feature id for the '<em><b>Decorate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC__DECORATE = ARC__DECORATE;

	/**
	 * The number of structural features of the '<em>Undirected Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undirected Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE = GRAPH_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__WIDTH = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__HEIGHT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PERIPHERIES = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.NodeShapeImpl <em>Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.NodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getNodeShape()
	 * @generated
	 */
	int NODE_SHAPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE__PERIPHERIES = SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.SimpleNodeShapeImpl <em>Simple Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.SimpleNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getSimpleNodeShape()
	 * @generated
	 */
	int SIMPLE_NODE_SHAPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__NAME = NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__LABEL = NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__STYLE = NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__COLOR = NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__WIDTH = NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__HEIGHT = NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE__PERIPHERIES = NODE_SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Simple Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE_FEATURE_COUNT = NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_SHAPE_OPERATION_COUNT = NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.PointNodeShapeImpl <em>Point Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.PointNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getPointNodeShape()
	 * @generated
	 */
	int POINT_NODE_SHAPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__NAME = NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__LABEL = NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__STYLE = NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__COLOR = NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__WIDTH = NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__HEIGHT = NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE__PERIPHERIES = NODE_SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Point Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE_FEATURE_COUNT = NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_NODE_SHAPE_OPERATION_COUNT = NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ComplexNodeShapeImpl <em>Complex Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ComplexNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getComplexNodeShape()
	 * @generated
	 */
	int COMPLEX_NODE_SHAPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__NAME = NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__LABEL = NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__STYLE = NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__COLOR = NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__WIDTH = NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__HEIGHT = NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE__PERIPHERIES = NODE_SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Complex Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE_FEATURE_COUNT = NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_SHAPE_OPERATION_COUNT = NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.PolygonNodeShapeImpl <em>Polygon Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.PolygonNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getPolygonNodeShape()
	 * @generated
	 */
	int POLYGON_NODE_SHAPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__NAME = COMPLEX_NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__LABEL = COMPLEX_NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__STYLE = COMPLEX_NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__COLOR = COMPLEX_NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__WIDTH = COMPLEX_NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__HEIGHT = COMPLEX_NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__PERIPHERIES = COMPLEX_NODE_SHAPE__PERIPHERIES;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__SIDES = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__SKEW = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__DISTORTION = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Regular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__IS_REGULAR = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE__ORIENTATION = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Polygon Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE_FEATURE_COUNT = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Polygon Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_NODE_SHAPE_OPERATION_COUNT = COMPLEX_NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.MNodeShapeImpl <em>MNode Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.MNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getMNodeShape()
	 * @generated
	 */
	int MNODE_SHAPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__NAME = COMPLEX_NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__LABEL = COMPLEX_NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__STYLE = COMPLEX_NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__COLOR = COMPLEX_NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__WIDTH = COMPLEX_NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__HEIGHT = COMPLEX_NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__PERIPHERIES = COMPLEX_NODE_SHAPE__PERIPHERIES;

	/**
	 * The feature id for the '<em><b>Toplabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__TOPLABEL = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bottomlabel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE__BOTTOMLABEL = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MNode Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE_FEATURE_COUNT = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MNode Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNODE_SHAPE_OPERATION_COUNT = COMPLEX_NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.RecordNodeShapeImpl <em>Record Node Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.RecordNodeShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getRecordNodeShape()
	 * @generated
	 */
	int RECORD_NODE_SHAPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__NAME = COMPLEX_NODE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__LABEL = COMPLEX_NODE_SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__STYLE = COMPLEX_NODE_SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__COLOR = COMPLEX_NODE_SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__WIDTH = COMPLEX_NODE_SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__HEIGHT = COMPLEX_NODE_SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE__PERIPHERIES = COMPLEX_NODE_SHAPE__PERIPHERIES;

	/**
	 * The number of structural features of the '<em>Record Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE_FEATURE_COUNT = COMPLEX_NODE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Record Node Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NODE_SHAPE_OPERATION_COUNT = COMPLEX_NODE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DOT.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DOT.impl.ArrowShapeImpl
	 * @see DOT.impl.DOTPackageImpl#getArrowShape()
	 * @generated
	 */
	int ARROW_SHAPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__COLOR = SHAPE__COLOR;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__WIDTH = SHAPE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__HEIGHT = SHAPE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Peripheries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__PERIPHERIES = SHAPE__PERIPHERIES;

	/**
	 * The feature id for the '<em><b>Clipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__CLIPPING = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__IS_PLAIN = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE__SIZE = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arrow Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Arrow Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DOT.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see DOT.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Label#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see DOT.Label#getElement()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Element();

	/**
	 * Returns the meta object for class '{@link DOT.SimpleLabel <em>Simple Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Label</em>'.
	 * @see DOT.SimpleLabel
	 * @generated
	 */
	EClass getSimpleLabel();

	/**
	 * Returns the meta object for the attribute '{@link DOT.SimpleLabel#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see DOT.SimpleLabel#getContent()
	 * @see #getSimpleLabel()
	 * @generated
	 */
	EAttribute getSimpleLabel_Content();

	/**
	 * Returns the meta object for class '{@link DOT.ComplexLabel <em>Complex Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Label</em>'.
	 * @see DOT.ComplexLabel
	 * @generated
	 */
	EClass getComplexLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.ComplexLabel#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see DOT.ComplexLabel#getCompartments()
	 * @see #getComplexLabel()
	 * @generated
	 */
	EReference getComplexLabel_Compartments();

	/**
	 * Returns the meta object for class '{@link DOT.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see DOT.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Compartment#getComplexLabel <em>Complex Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Complex Label</em>'.
	 * @see DOT.Compartment#getComplexLabel()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_ComplexLabel();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.Compartment#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compartments</em>'.
	 * @see DOT.Compartment#getCompartments()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Compartments();

	/**
	 * Returns the meta object for the reference '{@link DOT.Compartment#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anchor</em>'.
	 * @see DOT.Compartment#getAnchor()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Anchor();

	/**
	 * Returns the meta object for class '{@link DOT.VerticalCompartment <em>Vertical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Compartment</em>'.
	 * @see DOT.VerticalCompartment
	 * @generated
	 */
	EClass getVerticalCompartment();

	/**
	 * Returns the meta object for class '{@link DOT.HorizontalCompartment <em>Horizontal Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Compartment</em>'.
	 * @see DOT.HorizontalCompartment
	 * @generated
	 */
	EClass getHorizontalCompartment();

	/**
	 * Returns the meta object for class '{@link DOT.SimpleCompartment <em>Simple Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Compartment</em>'.
	 * @see DOT.SimpleCompartment
	 * @generated
	 */
	EClass getSimpleCompartment();

	/**
	 * Returns the meta object for the attribute '{@link DOT.SimpleCompartment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see DOT.SimpleCompartment#getContent()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EAttribute getSimpleCompartment_Content();

	/**
	 * Returns the meta object for class '{@link DOT.Anchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anchor</em>'.
	 * @see DOT.Anchor
	 * @generated
	 */
	EClass getAnchor();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Anchor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DOT.Anchor#getName()
	 * @see #getAnchor()
	 * @generated
	 */
	EAttribute getAnchor_Name();

	/**
	 * Returns the meta object for the reference '{@link DOT.Anchor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DOT.Anchor#getSource()
	 * @see #getAnchor()
	 * @generated
	 */
	EReference getAnchor_Source();

	/**
	 * Returns the meta object for class '{@link DOT.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see DOT.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the attribute '{@link DOT.GraphElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DOT.GraphElement#getName()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.GraphElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see DOT.GraphElement#getLabel()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link DOT.GraphElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see DOT.GraphElement#getStyle()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Style();

	/**
	 * Returns the meta object for the attribute '{@link DOT.GraphElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see DOT.GraphElement#getColor()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Color();

	/**
	 * Returns the meta object for class '{@link DOT.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see DOT.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DOT.Graph#getType()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Type();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getRankDir <em>Rank Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank Dir</em>'.
	 * @see DOT.Graph#getRankDir()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_RankDir();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getLabeljust <em>Labeljust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labeljust</em>'.
	 * @see DOT.Graph#getLabeljust()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Labeljust();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getLabelloc <em>Labelloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labelloc</em>'.
	 * @see DOT.Graph#getLabelloc()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Labelloc();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#isConcentrate <em>Concentrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concentrate</em>'.
	 * @see DOT.Graph#isConcentrate()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Concentrate();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see DOT.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounding Box</em>'.
	 * @see DOT.Graph#getBoundingBox()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_BoundingBox();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#isCompound <em>Compound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compound</em>'.
	 * @see DOT.Graph#isCompound()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Compound();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.Graph#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see DOT.Graph#getLayers()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Layers();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getNodeSeparation <em>Node Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Separation</em>'.
	 * @see DOT.Graph#getNodeSeparation()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_NodeSeparation();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see DOT.Graph#getOrdering()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see DOT.Graph#getSize()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Size();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see DOT.Graph#getRatio()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Graph#isCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see DOT.Graph#isCenter()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Center();

	/**
	 * Returns the meta object for class '{@link DOT.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see DOT.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Layer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see DOT.Layer#getNodes()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Layer#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see DOT.Layer#getArcs()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Arcs();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Layer#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see DOT.Layer#getGraph()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Graph();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Layer#getLayerSeparator <em>Layer Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer Separator</em>'.
	 * @see DOT.Layer#getLayerSeparator()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_LayerSeparator();

	/**
	 * Returns the meta object for class '{@link DOT.Nodelike <em>Nodelike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodelike</em>'.
	 * @see DOT.Nodelike
	 * @generated
	 */
	EClass getNodelike();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Nodelike#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see DOT.Nodelike#getOwner()
	 * @see #getNodelike()
	 * @generated
	 */
	EReference getNodelike_Owner();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Nodelike#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers</em>'.
	 * @see DOT.Nodelike#getRefers()
	 * @see #getNodelike()
	 * @generated
	 */
	EReference getNodelike_Refers();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Nodelike#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referred By</em>'.
	 * @see DOT.Nodelike#getReferredBy()
	 * @see #getNodelike()
	 * @generated
	 */
	EReference getNodelike_ReferredBy();

	/**
	 * Returns the meta object for the container reference '{@link DOT.Nodelike#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see DOT.Nodelike#getGraph()
	 * @see #getNodelike()
	 * @generated
	 */
	EReference getNodelike_Graph();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Nodelike#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see DOT.Nodelike#getLayers()
	 * @see #getNodelike()
	 * @generated
	 */
	EReference getNodelike_Layers();

	/**
	 * Returns the meta object for class '{@link DOT.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Graph</em>'.
	 * @see DOT.SubGraph
	 * @generated
	 */
	EClass getSubGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link DOT.SubGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see DOT.SubGraph#getNodes()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link DOT.SubGraph#getLabelloc <em>Labelloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labelloc</em>'.
	 * @see DOT.SubGraph#getLabelloc()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_Labelloc();

	/**
	 * Returns the meta object for class '{@link DOT.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DOT.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#isFixedSize <em>Fixed Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Size</em>'.
	 * @see DOT.Node#isFixedSize()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_FixedSize();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getFontname <em>Fontname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fontname</em>'.
	 * @see DOT.Node#getFontname()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Fontname();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getFontsize <em>Fontsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fontsize</em>'.
	 * @see DOT.Node#getFontsize()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Fontsize();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see DOT.Node#getHeight()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Height();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Node#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see DOT.Node#getWidth()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Width();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.Node#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see DOT.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Shape();

	/**
	 * Returns the meta object for class '{@link DOT.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see DOT.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Node</em>'.
	 * @see DOT.Arc#getFromNode()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_FromNode();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see DOT.Arc#getToNode()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ToNode();

	/**
	 * Returns the meta object for the reference list '{@link DOT.Arc#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layers</em>'.
	 * @see DOT.Arc#getLayers()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Layers();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#isConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see DOT.Arc#isConstraint()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see DOT.Arc#getGroup()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Group();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#getMinlen <em>Minlen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlen</em>'.
	 * @see DOT.Arc#getMinlen()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Minlen();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#getSameHead <em>Same Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same Head</em>'.
	 * @see DOT.Arc#getSameHead()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_SameHead();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#getSameTail <em>Same Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same Tail</em>'.
	 * @see DOT.Arc#getSameTail()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_SameTail();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getLhead <em>Lhead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhead</em>'.
	 * @see DOT.Arc#getLhead()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Lhead();

	/**
	 * Returns the meta object for the reference '{@link DOT.Arc#getLtail <em>Ltail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ltail</em>'.
	 * @see DOT.Arc#getLtail()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Ltail();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Arc#isDecorate <em>Decorate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decorate</em>'.
	 * @see DOT.Arc#isDecorate()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Decorate();

	/**
	 * Returns the meta object for class '{@link DOT.DirectedArc <em>Directed Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Arc</em>'.
	 * @see DOT.DirectedArc
	 * @generated
	 */
	EClass getDirectedArc();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.DirectedArc#getArrowHead <em>Arrow Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrow Head</em>'.
	 * @see DOT.DirectedArc#getArrowHead()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_ArrowHead();

	/**
	 * Returns the meta object for the reference '{@link DOT.DirectedArc#getHeadlabel <em>Headlabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Headlabel</em>'.
	 * @see DOT.DirectedArc#getHeadlabel()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_Headlabel();

	/**
	 * Returns the meta object for the reference '{@link DOT.DirectedArc#getTaillabel <em>Taillabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taillabel</em>'.
	 * @see DOT.DirectedArc#getTaillabel()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_Taillabel();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.DirectedArc#getArrowTail <em>Arrow Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrow Tail</em>'.
	 * @see DOT.DirectedArc#getArrowTail()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_ArrowTail();

	/**
	 * Returns the meta object for the attribute '{@link DOT.DirectedArc#getTail_lp <em>Tail lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tail lp</em>'.
	 * @see DOT.DirectedArc#getTail_lp()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EAttribute getDirectedArc_Tail_lp();

	/**
	 * Returns the meta object for the attribute '{@link DOT.DirectedArc#getHead_lp <em>Head lp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head lp</em>'.
	 * @see DOT.DirectedArc#getHead_lp()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EAttribute getDirectedArc_Head_lp();

	/**
	 * Returns the meta object for class '{@link DOT.UndirectedArc <em>Undirected Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undirected Arc</em>'.
	 * @see DOT.UndirectedArc
	 * @generated
	 */
	EClass getUndirectedArc();

	/**
	 * Returns the meta object for class '{@link DOT.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see DOT.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see DOT.Shape#getWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see DOT.Shape#getHeight()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Height();

	/**
	 * Returns the meta object for the attribute '{@link DOT.Shape#getPeripheries <em>Peripheries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peripheries</em>'.
	 * @see DOT.Shape#getPeripheries()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Peripheries();

	/**
	 * Returns the meta object for class '{@link DOT.NodeShape <em>Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Shape</em>'.
	 * @see DOT.NodeShape
	 * @generated
	 */
	EClass getNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.SimpleNodeShape <em>Simple Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Node Shape</em>'.
	 * @see DOT.SimpleNodeShape
	 * @generated
	 */
	EClass getSimpleNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.PointNodeShape <em>Point Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Node Shape</em>'.
	 * @see DOT.PointNodeShape
	 * @generated
	 */
	EClass getPointNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.ComplexNodeShape <em>Complex Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node Shape</em>'.
	 * @see DOT.ComplexNodeShape
	 * @generated
	 */
	EClass getComplexNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.PolygonNodeShape <em>Polygon Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Node Shape</em>'.
	 * @see DOT.PolygonNodeShape
	 * @generated
	 */
	EClass getPolygonNodeShape();

	/**
	 * Returns the meta object for the attribute '{@link DOT.PolygonNodeShape#getSides <em>Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sides</em>'.
	 * @see DOT.PolygonNodeShape#getSides()
	 * @see #getPolygonNodeShape()
	 * @generated
	 */
	EAttribute getPolygonNodeShape_Sides();

	/**
	 * Returns the meta object for the attribute '{@link DOT.PolygonNodeShape#getSkew <em>Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skew</em>'.
	 * @see DOT.PolygonNodeShape#getSkew()
	 * @see #getPolygonNodeShape()
	 * @generated
	 */
	EAttribute getPolygonNodeShape_Skew();

	/**
	 * Returns the meta object for the attribute '{@link DOT.PolygonNodeShape#getDistortion <em>Distortion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distortion</em>'.
	 * @see DOT.PolygonNodeShape#getDistortion()
	 * @see #getPolygonNodeShape()
	 * @generated
	 */
	EAttribute getPolygonNodeShape_Distortion();

	/**
	 * Returns the meta object for the attribute '{@link DOT.PolygonNodeShape#isIsRegular <em>Is Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Regular</em>'.
	 * @see DOT.PolygonNodeShape#isIsRegular()
	 * @see #getPolygonNodeShape()
	 * @generated
	 */
	EAttribute getPolygonNodeShape_IsRegular();

	/**
	 * Returns the meta object for the attribute '{@link DOT.PolygonNodeShape#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see DOT.PolygonNodeShape#getOrientation()
	 * @see #getPolygonNodeShape()
	 * @generated
	 */
	EAttribute getPolygonNodeShape_Orientation();

	/**
	 * Returns the meta object for class '{@link DOT.MNodeShape <em>MNode Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MNode Shape</em>'.
	 * @see DOT.MNodeShape
	 * @generated
	 */
	EClass getMNodeShape();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.MNodeShape#getToplabel <em>Toplabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toplabel</em>'.
	 * @see DOT.MNodeShape#getToplabel()
	 * @see #getMNodeShape()
	 * @generated
	 */
	EReference getMNodeShape_Toplabel();

	/**
	 * Returns the meta object for the containment reference '{@link DOT.MNodeShape#getBottomlabel <em>Bottomlabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottomlabel</em>'.
	 * @see DOT.MNodeShape#getBottomlabel()
	 * @see #getMNodeShape()
	 * @generated
	 */
	EReference getMNodeShape_Bottomlabel();

	/**
	 * Returns the meta object for class '{@link DOT.RecordNodeShape <em>Record Node Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Node Shape</em>'.
	 * @see DOT.RecordNodeShape
	 * @generated
	 */
	EClass getRecordNodeShape();

	/**
	 * Returns the meta object for class '{@link DOT.ArrowShape <em>Arrow Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow Shape</em>'.
	 * @see DOT.ArrowShape
	 * @generated
	 */
	EClass getArrowShape();

	/**
	 * Returns the meta object for the attribute '{@link DOT.ArrowShape#getClipping <em>Clipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clipping</em>'.
	 * @see DOT.ArrowShape#getClipping()
	 * @see #getArrowShape()
	 * @generated
	 */
	EAttribute getArrowShape_Clipping();

	/**
	 * Returns the meta object for the attribute '{@link DOT.ArrowShape#isIsPlain <em>Is Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Plain</em>'.
	 * @see DOT.ArrowShape#isIsPlain()
	 * @see #getArrowShape()
	 * @generated
	 */
	EAttribute getArrowShape_IsPlain();

	/**
	 * Returns the meta object for the attribute '{@link DOT.ArrowShape#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see DOT.ArrowShape#getSize()
	 * @see #getArrowShape()
	 * @generated
	 */
	EAttribute getArrowShape_Size();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DOTFactory getDOTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DOT.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.LabelImpl
		 * @see DOT.impl.DOTPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__ELEMENT = eINSTANCE.getLabel_Element();

		/**
		 * The meta object literal for the '{@link DOT.impl.SimpleLabelImpl <em>Simple Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SimpleLabelImpl
		 * @see DOT.impl.DOTPackageImpl#getSimpleLabel()
		 * @generated
		 */
		EClass SIMPLE_LABEL = eINSTANCE.getSimpleLabel();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LABEL__CONTENT = eINSTANCE.getSimpleLabel_Content();

		/**
		 * The meta object literal for the '{@link DOT.impl.ComplexLabelImpl <em>Complex Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ComplexLabelImpl
		 * @see DOT.impl.DOTPackageImpl#getComplexLabel()
		 * @generated
		 */
		EClass COMPLEX_LABEL = eINSTANCE.getComplexLabel();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_LABEL__COMPARTMENTS = eINSTANCE.getComplexLabel_Compartments();

		/**
		 * The meta object literal for the '{@link DOT.impl.CompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.CompartmentImpl
		 * @see DOT.impl.DOTPackageImpl#getCompartment()
		 * @generated
		 */
		EClass COMPARTMENT = eINSTANCE.getCompartment();

		/**
		 * The meta object literal for the '<em><b>Complex Label</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__COMPLEX_LABEL = eINSTANCE.getCompartment_ComplexLabel();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__COMPARTMENTS = eINSTANCE.getCompartment_Compartments();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARTMENT__ANCHOR = eINSTANCE.getCompartment_Anchor();

		/**
		 * The meta object literal for the '{@link DOT.impl.VerticalCompartmentImpl <em>Vertical Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.VerticalCompartmentImpl
		 * @see DOT.impl.DOTPackageImpl#getVerticalCompartment()
		 * @generated
		 */
		EClass VERTICAL_COMPARTMENT = eINSTANCE.getVerticalCompartment();

		/**
		 * The meta object literal for the '{@link DOT.impl.HorizontalCompartmentImpl <em>Horizontal Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.HorizontalCompartmentImpl
		 * @see DOT.impl.DOTPackageImpl#getHorizontalCompartment()
		 * @generated
		 */
		EClass HORIZONTAL_COMPARTMENT = eINSTANCE.getHorizontalCompartment();

		/**
		 * The meta object literal for the '{@link DOT.impl.SimpleCompartmentImpl <em>Simple Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SimpleCompartmentImpl
		 * @see DOT.impl.DOTPackageImpl#getSimpleCompartment()
		 * @generated
		 */
		EClass SIMPLE_COMPARTMENT = eINSTANCE.getSimpleCompartment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_COMPARTMENT__CONTENT = eINSTANCE.getSimpleCompartment_Content();

		/**
		 * The meta object literal for the '{@link DOT.impl.AnchorImpl <em>Anchor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.AnchorImpl
		 * @see DOT.impl.DOTPackageImpl#getAnchor()
		 * @generated
		 */
		EClass ANCHOR = eINSTANCE.getAnchor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANCHOR__NAME = eINSTANCE.getAnchor_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANCHOR__SOURCE = eINSTANCE.getAnchor_Source();

		/**
		 * The meta object literal for the '{@link DOT.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.GraphElementImpl
		 * @see DOT.impl.DOTPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__NAME = eINSTANCE.getGraphElement_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ELEMENT__LABEL = eINSTANCE.getGraphElement_Label();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__STYLE = eINSTANCE.getGraphElement_Style();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__COLOR = eINSTANCE.getGraphElement_Color();

		/**
		 * The meta object literal for the '{@link DOT.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.GraphImpl
		 * @see DOT.impl.DOTPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__TYPE = eINSTANCE.getGraph_Type();

		/**
		 * The meta object literal for the '<em><b>Rank Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__RANK_DIR = eINSTANCE.getGraph_RankDir();

		/**
		 * The meta object literal for the '<em><b>Labeljust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__LABELJUST = eINSTANCE.getGraph_Labeljust();

		/**
		 * The meta object literal for the '<em><b>Labelloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__LABELLOC = eINSTANCE.getGraph_Labelloc();

		/**
		 * The meta object literal for the '<em><b>Concentrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__CONCENTRATE = eINSTANCE.getGraph_Concentrate();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__BOUNDING_BOX = eINSTANCE.getGraph_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Compound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__COMPOUND = eINSTANCE.getGraph_Compound();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__LAYERS = eINSTANCE.getGraph_Layers();

		/**
		 * The meta object literal for the '<em><b>Node Separation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NODE_SEPARATION = eINSTANCE.getGraph_NodeSeparation();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__ORDERING = eINSTANCE.getGraph_Ordering();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__SIZE = eINSTANCE.getGraph_Size();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__RATIO = eINSTANCE.getGraph_Ratio();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__CENTER = eINSTANCE.getGraph_Center();

		/**
		 * The meta object literal for the '{@link DOT.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.LayerImpl
		 * @see DOT.impl.DOTPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__NODES = eINSTANCE.getLayer_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__ARCS = eINSTANCE.getLayer_Arcs();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__GRAPH = eINSTANCE.getLayer_Graph();

		/**
		 * The meta object literal for the '<em><b>Layer Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__LAYER_SEPARATOR = eINSTANCE.getLayer_LayerSeparator();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodelikeImpl <em>Nodelike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodelikeImpl
		 * @see DOT.impl.DOTPackageImpl#getNodelike()
		 * @generated
		 */
		EClass NODELIKE = eINSTANCE.getNodelike();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODELIKE__OWNER = eINSTANCE.getNodelike_Owner();

		/**
		 * The meta object literal for the '<em><b>Refers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODELIKE__REFERS = eINSTANCE.getNodelike_Refers();

		/**
		 * The meta object literal for the '<em><b>Referred By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODELIKE__REFERRED_BY = eINSTANCE.getNodelike_ReferredBy();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODELIKE__GRAPH = eINSTANCE.getNodelike_Graph();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODELIKE__LAYERS = eINSTANCE.getNodelike_Layers();

		/**
		 * The meta object literal for the '{@link DOT.impl.SubGraphImpl <em>Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SubGraphImpl
		 * @see DOT.impl.DOTPackageImpl#getSubGraph()
		 * @generated
		 */
		EClass SUB_GRAPH = eINSTANCE.getSubGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__NODES = eINSTANCE.getSubGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Labelloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__LABELLOC = eINSTANCE.getSubGraph_Labelloc();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodeImpl
		 * @see DOT.impl.DOTPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Fixed Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__FIXED_SIZE = eINSTANCE.getNode_FixedSize();

		/**
		 * The meta object literal for the '<em><b>Fontname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__FONTNAME = eINSTANCE.getNode_Fontname();

		/**
		 * The meta object literal for the '<em><b>Fontsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__FONTSIZE = eINSTANCE.getNode_Fontsize();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HEIGHT = eINSTANCE.getNode_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__WIDTH = eINSTANCE.getNode_Width();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '{@link DOT.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ArcImpl
		 * @see DOT.impl.DOTPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__FROM_NODE = eINSTANCE.getArc_FromNode();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TO_NODE = eINSTANCE.getArc_ToNode();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__LAYERS = eINSTANCE.getArc_Layers();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__CONSTRAINT = eINSTANCE.getArc_Constraint();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__GROUP = eINSTANCE.getArc_Group();

		/**
		 * The meta object literal for the '<em><b>Minlen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__MINLEN = eINSTANCE.getArc_Minlen();

		/**
		 * The meta object literal for the '<em><b>Same Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__SAME_HEAD = eINSTANCE.getArc_SameHead();

		/**
		 * The meta object literal for the '<em><b>Same Tail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__SAME_TAIL = eINSTANCE.getArc_SameTail();

		/**
		 * The meta object literal for the '<em><b>Lhead</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__LHEAD = eINSTANCE.getArc_Lhead();

		/**
		 * The meta object literal for the '<em><b>Ltail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__LTAIL = eINSTANCE.getArc_Ltail();

		/**
		 * The meta object literal for the '<em><b>Decorate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__DECORATE = eINSTANCE.getArc_Decorate();

		/**
		 * The meta object literal for the '{@link DOT.impl.DirectedArcImpl <em>Directed Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.DirectedArcImpl
		 * @see DOT.impl.DOTPackageImpl#getDirectedArc()
		 * @generated
		 */
		EClass DIRECTED_ARC = eINSTANCE.getDirectedArc();

		/**
		 * The meta object literal for the '<em><b>Arrow Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_ARC__ARROW_HEAD = eINSTANCE.getDirectedArc_ArrowHead();

		/**
		 * The meta object literal for the '<em><b>Headlabel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_ARC__HEADLABEL = eINSTANCE.getDirectedArc_Headlabel();

		/**
		 * The meta object literal for the '<em><b>Taillabel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_ARC__TAILLABEL = eINSTANCE.getDirectedArc_Taillabel();

		/**
		 * The meta object literal for the '<em><b>Arrow Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_ARC__ARROW_TAIL = eINSTANCE.getDirectedArc_ArrowTail();

		/**
		 * The meta object literal for the '<em><b>Tail lp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_ARC__TAIL_LP = eINSTANCE.getDirectedArc_Tail_lp();

		/**
		 * The meta object literal for the '<em><b>Head lp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTED_ARC__HEAD_LP = eINSTANCE.getDirectedArc_Head_lp();

		/**
		 * The meta object literal for the '{@link DOT.impl.UndirectedArcImpl <em>Undirected Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.UndirectedArcImpl
		 * @see DOT.impl.DOTPackageImpl#getUndirectedArc()
		 * @generated
		 */
		EClass UNDIRECTED_ARC = eINSTANCE.getUndirectedArc();

		/**
		 * The meta object literal for the '{@link DOT.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__WIDTH = eINSTANCE.getShape_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__HEIGHT = eINSTANCE.getShape_Height();

		/**
		 * The meta object literal for the '<em><b>Peripheries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__PERIPHERIES = eINSTANCE.getShape_Peripheries();

		/**
		 * The meta object literal for the '{@link DOT.impl.NodeShapeImpl <em>Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.NodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getNodeShape()
		 * @generated
		 */
		EClass NODE_SHAPE = eINSTANCE.getNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.SimpleNodeShapeImpl <em>Simple Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.SimpleNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getSimpleNodeShape()
		 * @generated
		 */
		EClass SIMPLE_NODE_SHAPE = eINSTANCE.getSimpleNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.PointNodeShapeImpl <em>Point Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.PointNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getPointNodeShape()
		 * @generated
		 */
		EClass POINT_NODE_SHAPE = eINSTANCE.getPointNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.ComplexNodeShapeImpl <em>Complex Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ComplexNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getComplexNodeShape()
		 * @generated
		 */
		EClass COMPLEX_NODE_SHAPE = eINSTANCE.getComplexNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.PolygonNodeShapeImpl <em>Polygon Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.PolygonNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getPolygonNodeShape()
		 * @generated
		 */
		EClass POLYGON_NODE_SHAPE = eINSTANCE.getPolygonNodeShape();

		/**
		 * The meta object literal for the '<em><b>Sides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_NODE_SHAPE__SIDES = eINSTANCE.getPolygonNodeShape_Sides();

		/**
		 * The meta object literal for the '<em><b>Skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_NODE_SHAPE__SKEW = eINSTANCE.getPolygonNodeShape_Skew();

		/**
		 * The meta object literal for the '<em><b>Distortion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_NODE_SHAPE__DISTORTION = eINSTANCE.getPolygonNodeShape_Distortion();

		/**
		 * The meta object literal for the '<em><b>Is Regular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_NODE_SHAPE__IS_REGULAR = eINSTANCE.getPolygonNodeShape_IsRegular();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_NODE_SHAPE__ORIENTATION = eINSTANCE.getPolygonNodeShape_Orientation();

		/**
		 * The meta object literal for the '{@link DOT.impl.MNodeShapeImpl <em>MNode Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.MNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getMNodeShape()
		 * @generated
		 */
		EClass MNODE_SHAPE = eINSTANCE.getMNodeShape();

		/**
		 * The meta object literal for the '<em><b>Toplabel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MNODE_SHAPE__TOPLABEL = eINSTANCE.getMNodeShape_Toplabel();

		/**
		 * The meta object literal for the '<em><b>Bottomlabel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MNODE_SHAPE__BOTTOMLABEL = eINSTANCE.getMNodeShape_Bottomlabel();

		/**
		 * The meta object literal for the '{@link DOT.impl.RecordNodeShapeImpl <em>Record Node Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.RecordNodeShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getRecordNodeShape()
		 * @generated
		 */
		EClass RECORD_NODE_SHAPE = eINSTANCE.getRecordNodeShape();

		/**
		 * The meta object literal for the '{@link DOT.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DOT.impl.ArrowShapeImpl
		 * @see DOT.impl.DOTPackageImpl#getArrowShape()
		 * @generated
		 */
		EClass ARROW_SHAPE = eINSTANCE.getArrowShape();

		/**
		 * The meta object literal for the '<em><b>Clipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_SHAPE__CLIPPING = eINSTANCE.getArrowShape_Clipping();

		/**
		 * The meta object literal for the '<em><b>Is Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_SHAPE__IS_PLAIN = eINSTANCE.getArrowShape_IsPlain();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW_SHAPE__SIZE = eINSTANCE.getArrowShape_Size();

	}

} //DOTPackage
