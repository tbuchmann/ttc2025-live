/**
 */
package UniversalVariability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.FeatureConstraint#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see UniversalVariability.UniversalVariabilityPackage#getFeatureConstraint()
 * @model
 * @generated
 */
public interface FeatureConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see UniversalVariability.UniversalVariabilityPackage#getFeatureConstraint_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link UniversalVariability.FeatureConstraint#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureConstraint
