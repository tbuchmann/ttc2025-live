/**
 */
package DOT.impl;

import DOT.Anchor;
import DOT.Compartment;
import DOT.ComplexLabel;
import DOT.DOTPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.CompartmentImpl#getComplexLabel <em>Complex Label</em>}</li>
 *   <li>{@link DOT.impl.CompartmentImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link DOT.impl.CompartmentImpl#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompartmentImpl extends MinimalEObjectImpl.Container implements Compartment {
	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected Compartment compartments;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected Anchor anchor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexLabel getComplexLabel() {
		if (eContainerFeatureID() != DOTPackage.COMPARTMENT__COMPLEX_LABEL) return null;
		return (ComplexLabel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexLabel(ComplexLabel newComplexLabel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComplexLabel, DOTPackage.COMPARTMENT__COMPLEX_LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexLabel(ComplexLabel newComplexLabel) {
		if (newComplexLabel != eInternalContainer() || (eContainerFeatureID() != DOTPackage.COMPARTMENT__COMPLEX_LABEL && newComplexLabel != null)) {
			if (EcoreUtil.isAncestor(this, newComplexLabel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComplexLabel != null)
				msgs = ((InternalEObject)newComplexLabel).eInverseAdd(this, DOTPackage.COMPLEX_LABEL__COMPARTMENTS, ComplexLabel.class, msgs);
			msgs = basicSetComplexLabel(newComplexLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.COMPARTMENT__COMPLEX_LABEL, newComplexLabel, newComplexLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Compartment getCompartments() {
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartments(Compartment newCompartments, NotificationChain msgs) {
		Compartment oldCompartments = compartments;
		compartments = newCompartments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.COMPARTMENT__COMPARTMENTS, oldCompartments, newCompartments);
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
	public void setCompartments(Compartment newCompartments) {
		if (newCompartments != compartments) {
			NotificationChain msgs = null;
			if (compartments != null)
				msgs = ((InternalEObject)compartments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.COMPARTMENT__COMPARTMENTS, null, msgs);
			if (newCompartments != null)
				msgs = ((InternalEObject)newCompartments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.COMPARTMENT__COMPARTMENTS, null, msgs);
			msgs = basicSetCompartments(newCompartments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.COMPARTMENT__COMPARTMENTS, newCompartments, newCompartments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anchor getAnchor() {
		if (anchor != null && anchor.eIsProxy()) {
			InternalEObject oldAnchor = (InternalEObject)anchor;
			anchor = (Anchor)eResolveProxy(oldAnchor);
			if (anchor != oldAnchor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.COMPARTMENT__ANCHOR, oldAnchor, anchor));
			}
		}
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor basicGetAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchor(Anchor newAnchor, NotificationChain msgs) {
		Anchor oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.COMPARTMENT__ANCHOR, oldAnchor, newAnchor);
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
	public void setAnchor(Anchor newAnchor) {
		if (newAnchor != anchor) {
			NotificationChain msgs = null;
			if (anchor != null)
				msgs = ((InternalEObject)anchor).eInverseRemove(this, DOTPackage.ANCHOR__SOURCE, Anchor.class, msgs);
			if (newAnchor != null)
				msgs = ((InternalEObject)newAnchor).eInverseAdd(this, DOTPackage.ANCHOR__SOURCE, Anchor.class, msgs);
			msgs = basicSetAnchor(newAnchor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.COMPARTMENT__ANCHOR, newAnchor, newAnchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComplexLabel((ComplexLabel)otherEnd, msgs);
			case DOTPackage.COMPARTMENT__ANCHOR:
				if (anchor != null)
					msgs = ((InternalEObject)anchor).eInverseRemove(this, DOTPackage.ANCHOR__SOURCE, Anchor.class, msgs);
				return basicSetAnchor((Anchor)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				return basicSetComplexLabel(null, msgs);
			case DOTPackage.COMPARTMENT__COMPARTMENTS:
				return basicSetCompartments(null, msgs);
			case DOTPackage.COMPARTMENT__ANCHOR:
				return basicSetAnchor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				return eInternalContainer().eInverseRemove(this, DOTPackage.COMPLEX_LABEL__COMPARTMENTS, ComplexLabel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				return getComplexLabel();
			case DOTPackage.COMPARTMENT__COMPARTMENTS:
				return getCompartments();
			case DOTPackage.COMPARTMENT__ANCHOR:
				if (resolve) return getAnchor();
				return basicGetAnchor();
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
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				setComplexLabel((ComplexLabel)newValue);
				return;
			case DOTPackage.COMPARTMENT__COMPARTMENTS:
				setCompartments((Compartment)newValue);
				return;
			case DOTPackage.COMPARTMENT__ANCHOR:
				setAnchor((Anchor)newValue);
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
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				setComplexLabel((ComplexLabel)null);
				return;
			case DOTPackage.COMPARTMENT__COMPARTMENTS:
				setCompartments((Compartment)null);
				return;
			case DOTPackage.COMPARTMENT__ANCHOR:
				setAnchor((Anchor)null);
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
			case DOTPackage.COMPARTMENT__COMPLEX_LABEL:
				return getComplexLabel() != null;
			case DOTPackage.COMPARTMENT__COMPARTMENTS:
				return compartments != null;
			case DOTPackage.COMPARTMENT__ANCHOR:
				return anchor != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentImpl
