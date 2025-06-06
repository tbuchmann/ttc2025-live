/**
 */
package UniversalVariability;

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
 * @see UniversalVariability.UniversalVariabilityFactory
 * @model kind="package"
 * @generated
 */
public interface UniversalVariabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UniversalVariability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://transformationtoolcontest.github.io/uvl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uvl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversalVariabilityPackage eINSTANCE = UniversalVariability.impl.UniversalVariabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.FeatureModelImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.FeatureImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ABSTRACT = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.ConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.FeatureGroupImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__FEATURES = 0;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.OrFeatureGroupImpl <em>Or Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.OrFeatureGroupImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOrFeatureGroup()
	 * @generated
	 */
	int OR_FEATURE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__FEATURES = FEATURE_GROUP__FEATURES;

	/**
	 * The number of structural features of the '<em>Or Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.MandatoryFeatureGroupImpl <em>Mandatory Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.MandatoryFeatureGroupImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getMandatoryFeatureGroup()
	 * @generated
	 */
	int MANDATORY_FEATURE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_GROUP__FEATURES = FEATURE_GROUP__FEATURES;

	/**
	 * The number of structural features of the '<em>Mandatory Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mandatory Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.OptionalFeatureGroupImpl <em>Optional Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.OptionalFeatureGroupImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOptionalFeatureGroup()
	 * @generated
	 */
	int OPTIONAL_FEATURE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_GROUP__FEATURES = FEATURE_GROUP__FEATURES;

	/**
	 * The number of structural features of the '<em>Optional Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Optional Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.AlternativeFeatureGroupImpl <em>Alternative Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.AlternativeFeatureGroupImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getAlternativeFeatureGroup()
	 * @generated
	 */
	int ALTERNATIVE_FEATURE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_GROUP__FEATURES = FEATURE_GROUP__FEATURES;

	/**
	 * The number of structural features of the '<em>Alternative Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.ImpliesConstraintImpl <em>Implies Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.ImpliesConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getImpliesConstraint()
	 * @generated
	 */
	int IMPLIES_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_CONSTRAINT__GIVEN = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_CONSTRAINT__CONSEQUENCE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implies Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implies Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.BinaryConstraintImpl <em>Binary Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.BinaryConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getBinaryConstraint()
	 * @generated
	 */
	int BINARY_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT__RIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.EquivalenceConstraintImpl <em>Equivalence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.EquivalenceConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getEquivalenceConstraint()
	 * @generated
	 */
	int EQUIVALENCE_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT__LEFT = BINARY_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT__RIGHT = BINARY_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Equivalence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT_FEATURE_COUNT = BINARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equivalence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT_OPERATION_COUNT = BINARY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.AndConstraintImpl <em>And Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.AndConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getAndConstraint()
	 * @generated
	 */
	int AND_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT__LEFT = BINARY_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT__RIGHT = BINARY_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>And Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT_FEATURE_COUNT = BINARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CONSTRAINT_OPERATION_COUNT = BINARY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.OrConstraintImpl <em>Or Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.OrConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOrConstraint()
	 * @generated
	 */
	int OR_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONSTRAINT__LEFT = BINARY_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONSTRAINT__RIGHT = BINARY_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Or Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONSTRAINT_FEATURE_COUNT = BINARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CONSTRAINT_OPERATION_COUNT = BINARY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.FeatureConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureConstraint()
	 * @generated
	 */
	int FEATURE_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT__FEATURE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UniversalVariability.impl.NotConstraintImpl <em>Not Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UniversalVariability.impl.NotConstraintImpl
	 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getNotConstraint()
	 * @generated
	 */
	int NOT_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONSTRAINT__INNER = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UniversalVariability.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see UniversalVariability.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversalVariability.FeatureModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see UniversalVariability.FeatureModel#getFeatures()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversalVariability.FeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see UniversalVariability.FeatureModel#getConstraints()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Constraints();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see UniversalVariability.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversalVariability.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see UniversalVariability.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the attribute '{@link UniversalVariability.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UniversalVariability.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link UniversalVariability.Feature#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see UniversalVariability.Feature#isIsAbstract()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsAbstract();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see UniversalVariability.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see UniversalVariability.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link UniversalVariability.FeatureGroup#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see UniversalVariability.FeatureGroup#getFeatures()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_Features();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.OrFeatureGroup <em>Or Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Feature Group</em>'.
	 * @see UniversalVariability.OrFeatureGroup
	 * @generated
	 */
	EClass getOrFeatureGroup();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.MandatoryFeatureGroup <em>Mandatory Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Feature Group</em>'.
	 * @see UniversalVariability.MandatoryFeatureGroup
	 * @generated
	 */
	EClass getMandatoryFeatureGroup();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.OptionalFeatureGroup <em>Optional Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Feature Group</em>'.
	 * @see UniversalVariability.OptionalFeatureGroup
	 * @generated
	 */
	EClass getOptionalFeatureGroup();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.AlternativeFeatureGroup <em>Alternative Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Feature Group</em>'.
	 * @see UniversalVariability.AlternativeFeatureGroup
	 * @generated
	 */
	EClass getAlternativeFeatureGroup();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.ImpliesConstraint <em>Implies Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Constraint</em>'.
	 * @see UniversalVariability.ImpliesConstraint
	 * @generated
	 */
	EClass getImpliesConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link UniversalVariability.ImpliesConstraint#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Given</em>'.
	 * @see UniversalVariability.ImpliesConstraint#getGiven()
	 * @see #getImpliesConstraint()
	 * @generated
	 */
	EReference getImpliesConstraint_Given();

	/**
	 * Returns the meta object for the containment reference '{@link UniversalVariability.ImpliesConstraint#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequence</em>'.
	 * @see UniversalVariability.ImpliesConstraint#getConsequence()
	 * @see #getImpliesConstraint()
	 * @generated
	 */
	EReference getImpliesConstraint_Consequence();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.EquivalenceConstraint <em>Equivalence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence Constraint</em>'.
	 * @see UniversalVariability.EquivalenceConstraint
	 * @generated
	 */
	EClass getEquivalenceConstraint();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.BinaryConstraint <em>Binary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Constraint</em>'.
	 * @see UniversalVariability.BinaryConstraint
	 * @generated
	 */
	EClass getBinaryConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link UniversalVariability.BinaryConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see UniversalVariability.BinaryConstraint#getLeft()
	 * @see #getBinaryConstraint()
	 * @generated
	 */
	EReference getBinaryConstraint_Left();

	/**
	 * Returns the meta object for the containment reference '{@link UniversalVariability.BinaryConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see UniversalVariability.BinaryConstraint#getRight()
	 * @see #getBinaryConstraint()
	 * @generated
	 */
	EReference getBinaryConstraint_Right();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.AndConstraint <em>And Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Constraint</em>'.
	 * @see UniversalVariability.AndConstraint
	 * @generated
	 */
	EClass getAndConstraint();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.OrConstraint <em>Or Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Constraint</em>'.
	 * @see UniversalVariability.OrConstraint
	 * @generated
	 */
	EClass getOrConstraint();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Constraint</em>'.
	 * @see UniversalVariability.FeatureConstraint
	 * @generated
	 */
	EClass getFeatureConstraint();

	/**
	 * Returns the meta object for the reference '{@link UniversalVariability.FeatureConstraint#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see UniversalVariability.FeatureConstraint#getFeature()
	 * @see #getFeatureConstraint()
	 * @generated
	 */
	EReference getFeatureConstraint_Feature();

	/**
	 * Returns the meta object for class '{@link UniversalVariability.NotConstraint <em>Not Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Constraint</em>'.
	 * @see UniversalVariability.NotConstraint
	 * @generated
	 */
	EClass getNotConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link UniversalVariability.NotConstraint#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see UniversalVariability.NotConstraint#getInner()
	 * @see #getNotConstraint()
	 * @generated
	 */
	EReference getNotConstraint_Inner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversalVariabilityFactory getUniversalVariabilityFactory();

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
		 * The meta object literal for the '{@link UniversalVariability.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.FeatureModelImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURES = eINSTANCE.getFeatureModel_Features();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONSTRAINTS = eINSTANCE.getFeatureModel_Constraints();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.FeatureImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_ABSTRACT = eINSTANCE.getFeature_IsAbstract();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.ConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.FeatureGroupImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__FEATURES = eINSTANCE.getFeatureGroup_Features();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.OrFeatureGroupImpl <em>Or Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.OrFeatureGroupImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOrFeatureGroup()
		 * @generated
		 */
		EClass OR_FEATURE_GROUP = eINSTANCE.getOrFeatureGroup();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.MandatoryFeatureGroupImpl <em>Mandatory Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.MandatoryFeatureGroupImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getMandatoryFeatureGroup()
		 * @generated
		 */
		EClass MANDATORY_FEATURE_GROUP = eINSTANCE.getMandatoryFeatureGroup();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.OptionalFeatureGroupImpl <em>Optional Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.OptionalFeatureGroupImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOptionalFeatureGroup()
		 * @generated
		 */
		EClass OPTIONAL_FEATURE_GROUP = eINSTANCE.getOptionalFeatureGroup();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.AlternativeFeatureGroupImpl <em>Alternative Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.AlternativeFeatureGroupImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getAlternativeFeatureGroup()
		 * @generated
		 */
		EClass ALTERNATIVE_FEATURE_GROUP = eINSTANCE.getAlternativeFeatureGroup();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.ImpliesConstraintImpl <em>Implies Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.ImpliesConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getImpliesConstraint()
		 * @generated
		 */
		EClass IMPLIES_CONSTRAINT = eINSTANCE.getImpliesConstraint();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES_CONSTRAINT__GIVEN = eINSTANCE.getImpliesConstraint_Given();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLIES_CONSTRAINT__CONSEQUENCE = eINSTANCE.getImpliesConstraint_Consequence();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.EquivalenceConstraintImpl <em>Equivalence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.EquivalenceConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getEquivalenceConstraint()
		 * @generated
		 */
		EClass EQUIVALENCE_CONSTRAINT = eINSTANCE.getEquivalenceConstraint();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.BinaryConstraintImpl <em>Binary Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.BinaryConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getBinaryConstraint()
		 * @generated
		 */
		EClass BINARY_CONSTRAINT = eINSTANCE.getBinaryConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONSTRAINT__LEFT = eINSTANCE.getBinaryConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONSTRAINT__RIGHT = eINSTANCE.getBinaryConstraint_Right();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.AndConstraintImpl <em>And Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.AndConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getAndConstraint()
		 * @generated
		 */
		EClass AND_CONSTRAINT = eINSTANCE.getAndConstraint();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.OrConstraintImpl <em>Or Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.OrConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getOrConstraint()
		 * @generated
		 */
		EClass OR_CONSTRAINT = eINSTANCE.getOrConstraint();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.FeatureConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getFeatureConstraint()
		 * @generated
		 */
		EClass FEATURE_CONSTRAINT = eINSTANCE.getFeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONSTRAINT__FEATURE = eINSTANCE.getFeatureConstraint_Feature();

		/**
		 * The meta object literal for the '{@link UniversalVariability.impl.NotConstraintImpl <em>Not Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UniversalVariability.impl.NotConstraintImpl
		 * @see UniversalVariability.impl.UniversalVariabilityPackageImpl#getNotConstraint()
		 * @generated
		 */
		EClass NOT_CONSTRAINT = eINSTANCE.getNotConstraint();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_CONSTRAINT__INNER = eINSTANCE.getNotConstraint_Inner();

	}

} //UniversalVariabilityPackage
