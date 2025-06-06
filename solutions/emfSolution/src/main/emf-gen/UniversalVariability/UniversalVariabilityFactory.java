/**
 */
package UniversalVariability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UniversalVariability.UniversalVariabilityPackage
 * @generated
 */
public interface UniversalVariabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversalVariabilityFactory eINSTANCE = UniversalVariability.impl.UniversalVariabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model</em>'.
	 * @generated
	 */
	FeatureModel createFeatureModel();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Or Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Feature Group</em>'.
	 * @generated
	 */
	OrFeatureGroup createOrFeatureGroup();

	/**
	 * Returns a new object of class '<em>Mandatory Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Feature Group</em>'.
	 * @generated
	 */
	MandatoryFeatureGroup createMandatoryFeatureGroup();

	/**
	 * Returns a new object of class '<em>Optional Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Feature Group</em>'.
	 * @generated
	 */
	OptionalFeatureGroup createOptionalFeatureGroup();

	/**
	 * Returns a new object of class '<em>Alternative Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Feature Group</em>'.
	 * @generated
	 */
	AlternativeFeatureGroup createAlternativeFeatureGroup();

	/**
	 * Returns a new object of class '<em>Implies Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Constraint</em>'.
	 * @generated
	 */
	ImpliesConstraint createImpliesConstraint();

	/**
	 * Returns a new object of class '<em>Equivalence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence Constraint</em>'.
	 * @generated
	 */
	EquivalenceConstraint createEquivalenceConstraint();

	/**
	 * Returns a new object of class '<em>And Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Constraint</em>'.
	 * @generated
	 */
	AndConstraint createAndConstraint();

	/**
	 * Returns a new object of class '<em>Or Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Constraint</em>'.
	 * @generated
	 */
	OrConstraint createOrConstraint();

	/**
	 * Returns a new object of class '<em>Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Constraint</em>'.
	 * @generated
	 */
	FeatureConstraint createFeatureConstraint();

	/**
	 * Returns a new object of class '<em>Not Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Constraint</em>'.
	 * @generated
	 */
	NotConstraint createNotConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversalVariabilityPackage getUniversalVariabilityPackage();

} //UniversalVariabilityFactory
