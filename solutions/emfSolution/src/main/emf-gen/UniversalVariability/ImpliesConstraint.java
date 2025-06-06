/**
 */
package UniversalVariability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implies Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.ImpliesConstraint#getGiven <em>Given</em>}</li>
 *   <li>{@link UniversalVariability.ImpliesConstraint#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @see UniversalVariability.UniversalVariabilityPackage#getImpliesConstraint()
 * @model
 * @generated
 */
public interface ImpliesConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference.
	 * @see #setGiven(Constraint)
	 * @see UniversalVariability.UniversalVariabilityPackage#getImpliesConstraint_Given()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getGiven();

	/**
	 * Sets the value of the '{@link UniversalVariability.ImpliesConstraint#getGiven <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given</em>' containment reference.
	 * @see #getGiven()
	 * @generated
	 */
	void setGiven(Constraint value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' containment reference.
	 * @see #setConsequence(Constraint)
	 * @see UniversalVariability.UniversalVariabilityPackage#getImpliesConstraint_Consequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getConsequence();

	/**
	 * Sets the value of the '{@link UniversalVariability.ImpliesConstraint#getConsequence <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' containment reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Constraint value);

} // ImpliesConstraint
