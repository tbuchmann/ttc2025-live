/**
 */
package UniversalVariability.impl;

import UniversalVariability.*;

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
public class UniversalVariabilityFactoryImpl extends EFactoryImpl implements UniversalVariabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversalVariabilityFactory init() {
		try {
			UniversalVariabilityFactory theUniversalVariabilityFactory = (UniversalVariabilityFactory)EPackage.Registry.INSTANCE.getEFactory(UniversalVariabilityPackage.eNS_URI);
			if (theUniversalVariabilityFactory != null) {
				return theUniversalVariabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversalVariabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalVariabilityFactoryImpl() {
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
			case UniversalVariabilityPackage.FEATURE_MODEL: return createFeatureModel();
			case UniversalVariabilityPackage.FEATURE: return createFeature();
			case UniversalVariabilityPackage.OR_FEATURE_GROUP: return createOrFeatureGroup();
			case UniversalVariabilityPackage.MANDATORY_FEATURE_GROUP: return createMandatoryFeatureGroup();
			case UniversalVariabilityPackage.OPTIONAL_FEATURE_GROUP: return createOptionalFeatureGroup();
			case UniversalVariabilityPackage.ALTERNATIVE_FEATURE_GROUP: return createAlternativeFeatureGroup();
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT: return createImpliesConstraint();
			case UniversalVariabilityPackage.EQUIVALENCE_CONSTRAINT: return createEquivalenceConstraint();
			case UniversalVariabilityPackage.AND_CONSTRAINT: return createAndConstraint();
			case UniversalVariabilityPackage.OR_CONSTRAINT: return createOrConstraint();
			case UniversalVariabilityPackage.FEATURE_CONSTRAINT: return createFeatureConstraint();
			case UniversalVariabilityPackage.NOT_CONSTRAINT: return createNotConstraint();
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
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrFeatureGroup createOrFeatureGroup() {
		OrFeatureGroupImpl orFeatureGroup = new OrFeatureGroupImpl();
		return orFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryFeatureGroup createMandatoryFeatureGroup() {
		MandatoryFeatureGroupImpl mandatoryFeatureGroup = new MandatoryFeatureGroupImpl();
		return mandatoryFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalFeatureGroup createOptionalFeatureGroup() {
		OptionalFeatureGroupImpl optionalFeatureGroup = new OptionalFeatureGroupImpl();
		return optionalFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternativeFeatureGroup createAlternativeFeatureGroup() {
		AlternativeFeatureGroupImpl alternativeFeatureGroup = new AlternativeFeatureGroupImpl();
		return alternativeFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpliesConstraint createImpliesConstraint() {
		ImpliesConstraintImpl impliesConstraint = new ImpliesConstraintImpl();
		return impliesConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EquivalenceConstraint createEquivalenceConstraint() {
		EquivalenceConstraintImpl equivalenceConstraint = new EquivalenceConstraintImpl();
		return equivalenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndConstraint createAndConstraint() {
		AndConstraintImpl andConstraint = new AndConstraintImpl();
		return andConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrConstraint createOrConstraint() {
		OrConstraintImpl orConstraint = new OrConstraintImpl();
		return orConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureConstraint createFeatureConstraint() {
		FeatureConstraintImpl featureConstraint = new FeatureConstraintImpl();
		return featureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotConstraint createNotConstraint() {
		NotConstraintImpl notConstraint = new NotConstraintImpl();
		return notConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalVariabilityPackage getUniversalVariabilityPackage() {
		return (UniversalVariabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversalVariabilityPackage getPackage() {
		return UniversalVariabilityPackage.eINSTANCE;
	}

} //UniversalVariabilityFactoryImpl
