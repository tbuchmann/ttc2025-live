/**
 */
package UniversalVariability.impl;

import UniversalVariability.Constraint;
import UniversalVariability.ImpliesConstraint;
import UniversalVariability.UniversalVariabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implies Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UniversalVariability.impl.ImpliesConstraintImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link UniversalVariability.impl.ImpliesConstraintImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpliesConstraintImpl extends ConstraintImpl implements ImpliesConstraint {
	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected Constraint given;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected Constraint consequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpliesConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalVariabilityPackage.Literals.IMPLIES_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getGiven() {
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiven(Constraint newGiven, NotificationChain msgs) {
		Constraint oldGiven = given;
		given = newGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN, oldGiven, newGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGiven(Constraint newGiven) {
		if (newGiven != given) {
			NotificationChain msgs = null;
			if (given != null)
				msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN, null, msgs);
			if (newGiven != null)
				msgs = ((InternalEObject)newGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN, null, msgs);
			msgs = basicSetGiven(newGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN, newGiven, newGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsequence(Constraint newConsequence, NotificationChain msgs) {
		Constraint oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE, oldConsequence, newConsequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsequence(Constraint newConsequence) {
		if (newConsequence != consequence) {
			NotificationChain msgs = null;
			if (consequence != null)
				msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE, null, msgs);
			if (newConsequence != null)
				msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE, null, msgs);
			msgs = basicSetConsequence(newConsequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE, newConsequence, newConsequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN:
				return basicSetGiven(null, msgs);
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE:
				return basicSetConsequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN:
				return getGiven();
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE:
				return getConsequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN:
				setGiven((Constraint)newValue);
				return;
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE:
				setConsequence((Constraint)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN:
				setGiven((Constraint)null);
				return;
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE:
				setConsequence((Constraint)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__GIVEN:
				return given != null;
			case UniversalVariabilityPackage.IMPLIES_CONSTRAINT__CONSEQUENCE:
				return consequence != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpliesConstraintImpl
