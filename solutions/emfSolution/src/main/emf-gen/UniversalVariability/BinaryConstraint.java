/**
 */
package UniversalVariability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.BinaryConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link UniversalVariability.BinaryConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see UniversalVariability.UniversalVariabilityPackage#getBinaryConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Constraint)
	 * @see UniversalVariability.UniversalVariabilityPackage#getBinaryConstraint_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getLeft();

	/**
	 * Sets the value of the '{@link UniversalVariability.BinaryConstraint#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Constraint value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Constraint)
	 * @see UniversalVariability.UniversalVariabilityPackage#getBinaryConstraint_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getRight();

	/**
	 * Sets the value of the '{@link UniversalVariability.BinaryConstraint#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Constraint value);

} // BinaryConstraint
