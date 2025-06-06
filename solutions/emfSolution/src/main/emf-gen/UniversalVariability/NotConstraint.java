/**
 */
package UniversalVariability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.NotConstraint#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see UniversalVariability.UniversalVariabilityPackage#getNotConstraint()
 * @model
 * @generated
 */
public interface NotConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(Constraint)
	 * @see UniversalVariability.UniversalVariabilityPackage#getNotConstraint_Inner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getInner();

	/**
	 * Sets the value of the '{@link UniversalVariability.NotConstraint#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(Constraint value);

} // NotConstraint
