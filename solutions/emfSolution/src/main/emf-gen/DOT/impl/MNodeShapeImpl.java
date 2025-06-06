/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Label;
import DOT.MNodeShape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MNode Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.MNodeShapeImpl#getToplabel <em>Toplabel</em>}</li>
 *   <li>{@link DOT.impl.MNodeShapeImpl#getBottomlabel <em>Bottomlabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MNodeShapeImpl extends ComplexNodeShapeImpl implements MNodeShape {
	/**
	 * The cached value of the '{@link #getToplabel() <em>Toplabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToplabel()
	 * @generated
	 * @ordered
	 */
	protected Label toplabel;

	/**
	 * The cached value of the '{@link #getBottomlabel() <em>Bottomlabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomlabel()
	 * @generated
	 * @ordered
	 */
	protected Label bottomlabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MNodeShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.MNODE_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getToplabel() {
		return toplabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToplabel(Label newToplabel, NotificationChain msgs) {
		Label oldToplabel = toplabel;
		toplabel = newToplabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.MNODE_SHAPE__TOPLABEL, oldToplabel, newToplabel);
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
	public void setToplabel(Label newToplabel) {
		if (newToplabel != toplabel) {
			NotificationChain msgs = null;
			if (toplabel != null)
				msgs = ((InternalEObject)toplabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.MNODE_SHAPE__TOPLABEL, null, msgs);
			if (newToplabel != null)
				msgs = ((InternalEObject)newToplabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.MNODE_SHAPE__TOPLABEL, null, msgs);
			msgs = basicSetToplabel(newToplabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.MNODE_SHAPE__TOPLABEL, newToplabel, newToplabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getBottomlabel() {
		return bottomlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottomlabel(Label newBottomlabel, NotificationChain msgs) {
		Label oldBottomlabel = bottomlabel;
		bottomlabel = newBottomlabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.MNODE_SHAPE__BOTTOMLABEL, oldBottomlabel, newBottomlabel);
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
	public void setBottomlabel(Label newBottomlabel) {
		if (newBottomlabel != bottomlabel) {
			NotificationChain msgs = null;
			if (bottomlabel != null)
				msgs = ((InternalEObject)bottomlabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.MNODE_SHAPE__BOTTOMLABEL, null, msgs);
			if (newBottomlabel != null)
				msgs = ((InternalEObject)newBottomlabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.MNODE_SHAPE__BOTTOMLABEL, null, msgs);
			msgs = basicSetBottomlabel(newBottomlabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.MNODE_SHAPE__BOTTOMLABEL, newBottomlabel, newBottomlabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.MNODE_SHAPE__TOPLABEL:
				return basicSetToplabel(null, msgs);
			case DOTPackage.MNODE_SHAPE__BOTTOMLABEL:
				return basicSetBottomlabel(null, msgs);
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
			case DOTPackage.MNODE_SHAPE__TOPLABEL:
				return getToplabel();
			case DOTPackage.MNODE_SHAPE__BOTTOMLABEL:
				return getBottomlabel();
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
			case DOTPackage.MNODE_SHAPE__TOPLABEL:
				setToplabel((Label)newValue);
				return;
			case DOTPackage.MNODE_SHAPE__BOTTOMLABEL:
				setBottomlabel((Label)newValue);
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
			case DOTPackage.MNODE_SHAPE__TOPLABEL:
				setToplabel((Label)null);
				return;
			case DOTPackage.MNODE_SHAPE__BOTTOMLABEL:
				setBottomlabel((Label)null);
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
			case DOTPackage.MNODE_SHAPE__TOPLABEL:
				return toplabel != null;
			case DOTPackage.MNODE_SHAPE__BOTTOMLABEL:
				return bottomlabel != null;
		}
		return super.eIsSet(featureID);
	}

} //MNodeShapeImpl
