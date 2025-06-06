/**
 */
package DOT.impl;

import DOT.ArrowShape;
import DOT.DOTPackage;
import DOT.DirectedArc;
import DOT.Label;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.DirectedArcImpl#getArrowHead <em>Arrow Head</em>}</li>
 *   <li>{@link DOT.impl.DirectedArcImpl#getHeadlabel <em>Headlabel</em>}</li>
 *   <li>{@link DOT.impl.DirectedArcImpl#getTaillabel <em>Taillabel</em>}</li>
 *   <li>{@link DOT.impl.DirectedArcImpl#getArrowTail <em>Arrow Tail</em>}</li>
 *   <li>{@link DOT.impl.DirectedArcImpl#getTail_lp <em>Tail lp</em>}</li>
 *   <li>{@link DOT.impl.DirectedArcImpl#getHead_lp <em>Head lp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedArcImpl extends ArcImpl implements DirectedArc {
	/**
	 * The cached value of the '{@link #getArrowHead() <em>Arrow Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowHead()
	 * @generated
	 * @ordered
	 */
	protected ArrowShape arrowHead;

	/**
	 * The cached value of the '{@link #getHeadlabel() <em>Headlabel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadlabel()
	 * @generated
	 * @ordered
	 */
	protected Label headlabel;

	/**
	 * The cached value of the '{@link #getTaillabel() <em>Taillabel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillabel()
	 * @generated
	 * @ordered
	 */
	protected Label taillabel;

	/**
	 * The cached value of the '{@link #getArrowTail() <em>Arrow Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrowTail()
	 * @generated
	 * @ordered
	 */
	protected ArrowShape arrowTail;

	/**
	 * The default value of the '{@link #getTail_lp() <em>Tail lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTail_lp()
	 * @generated
	 * @ordered
	 */
	protected static final double TAIL_LP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTail_lp() <em>Tail lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTail_lp()
	 * @generated
	 * @ordered
	 */
	protected double tail_lp = TAIL_LP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHead_lp() <em>Head lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead_lp()
	 * @generated
	 * @ordered
	 */
	protected static final double HEAD_LP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHead_lp() <em>Head lp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead_lp()
	 * @generated
	 * @ordered
	 */
	protected double head_lp = HEAD_LP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.DIRECTED_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowShape getArrowHead() {
		return arrowHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrowHead(ArrowShape newArrowHead, NotificationChain msgs) {
		ArrowShape oldArrowHead = arrowHead;
		arrowHead = newArrowHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__ARROW_HEAD, oldArrowHead, newArrowHead);
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
	public void setArrowHead(ArrowShape newArrowHead) {
		if (newArrowHead != arrowHead) {
			NotificationChain msgs = null;
			if (arrowHead != null)
				msgs = ((InternalEObject)arrowHead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.DIRECTED_ARC__ARROW_HEAD, null, msgs);
			if (newArrowHead != null)
				msgs = ((InternalEObject)newArrowHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.DIRECTED_ARC__ARROW_HEAD, null, msgs);
			msgs = basicSetArrowHead(newArrowHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__ARROW_HEAD, newArrowHead, newArrowHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getHeadlabel() {
		if (headlabel != null && headlabel.eIsProxy()) {
			InternalEObject oldHeadlabel = (InternalEObject)headlabel;
			headlabel = (Label)eResolveProxy(oldHeadlabel);
			if (headlabel != oldHeadlabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.DIRECTED_ARC__HEADLABEL, oldHeadlabel, headlabel));
			}
		}
		return headlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetHeadlabel() {
		return headlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadlabel(Label newHeadlabel) {
		Label oldHeadlabel = headlabel;
		headlabel = newHeadlabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__HEADLABEL, oldHeadlabel, headlabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getTaillabel() {
		if (taillabel != null && taillabel.eIsProxy()) {
			InternalEObject oldTaillabel = (InternalEObject)taillabel;
			taillabel = (Label)eResolveProxy(oldTaillabel);
			if (taillabel != oldTaillabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.DIRECTED_ARC__TAILLABEL, oldTaillabel, taillabel));
			}
		}
		return taillabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTaillabel() {
		return taillabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaillabel(Label newTaillabel) {
		Label oldTaillabel = taillabel;
		taillabel = newTaillabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__TAILLABEL, oldTaillabel, taillabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrowShape getArrowTail() {
		return arrowTail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrowTail(ArrowShape newArrowTail, NotificationChain msgs) {
		ArrowShape oldArrowTail = arrowTail;
		arrowTail = newArrowTail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__ARROW_TAIL, oldArrowTail, newArrowTail);
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
	public void setArrowTail(ArrowShape newArrowTail) {
		if (newArrowTail != arrowTail) {
			NotificationChain msgs = null;
			if (arrowTail != null)
				msgs = ((InternalEObject)arrowTail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.DIRECTED_ARC__ARROW_TAIL, null, msgs);
			if (newArrowTail != null)
				msgs = ((InternalEObject)newArrowTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.DIRECTED_ARC__ARROW_TAIL, null, msgs);
			msgs = basicSetArrowTail(newArrowTail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__ARROW_TAIL, newArrowTail, newArrowTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTail_lp() {
		return tail_lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTail_lp(double newTail_lp) {
		double oldTail_lp = tail_lp;
		tail_lp = newTail_lp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__TAIL_LP, oldTail_lp, tail_lp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHead_lp() {
		return head_lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHead_lp(double newHead_lp) {
		double oldHead_lp = head_lp;
		head_lp = newHead_lp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.DIRECTED_ARC__HEAD_LP, oldHead_lp, head_lp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.DIRECTED_ARC__ARROW_HEAD:
				return basicSetArrowHead(null, msgs);
			case DOTPackage.DIRECTED_ARC__ARROW_TAIL:
				return basicSetArrowTail(null, msgs);
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
			case DOTPackage.DIRECTED_ARC__ARROW_HEAD:
				return getArrowHead();
			case DOTPackage.DIRECTED_ARC__HEADLABEL:
				if (resolve) return getHeadlabel();
				return basicGetHeadlabel();
			case DOTPackage.DIRECTED_ARC__TAILLABEL:
				if (resolve) return getTaillabel();
				return basicGetTaillabel();
			case DOTPackage.DIRECTED_ARC__ARROW_TAIL:
				return getArrowTail();
			case DOTPackage.DIRECTED_ARC__TAIL_LP:
				return getTail_lp();
			case DOTPackage.DIRECTED_ARC__HEAD_LP:
				return getHead_lp();
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
			case DOTPackage.DIRECTED_ARC__ARROW_HEAD:
				setArrowHead((ArrowShape)newValue);
				return;
			case DOTPackage.DIRECTED_ARC__HEADLABEL:
				setHeadlabel((Label)newValue);
				return;
			case DOTPackage.DIRECTED_ARC__TAILLABEL:
				setTaillabel((Label)newValue);
				return;
			case DOTPackage.DIRECTED_ARC__ARROW_TAIL:
				setArrowTail((ArrowShape)newValue);
				return;
			case DOTPackage.DIRECTED_ARC__TAIL_LP:
				setTail_lp((Double)newValue);
				return;
			case DOTPackage.DIRECTED_ARC__HEAD_LP:
				setHead_lp((Double)newValue);
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
			case DOTPackage.DIRECTED_ARC__ARROW_HEAD:
				setArrowHead((ArrowShape)null);
				return;
			case DOTPackage.DIRECTED_ARC__HEADLABEL:
				setHeadlabel((Label)null);
				return;
			case DOTPackage.DIRECTED_ARC__TAILLABEL:
				setTaillabel((Label)null);
				return;
			case DOTPackage.DIRECTED_ARC__ARROW_TAIL:
				setArrowTail((ArrowShape)null);
				return;
			case DOTPackage.DIRECTED_ARC__TAIL_LP:
				setTail_lp(TAIL_LP_EDEFAULT);
				return;
			case DOTPackage.DIRECTED_ARC__HEAD_LP:
				setHead_lp(HEAD_LP_EDEFAULT);
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
			case DOTPackage.DIRECTED_ARC__ARROW_HEAD:
				return arrowHead != null;
			case DOTPackage.DIRECTED_ARC__HEADLABEL:
				return headlabel != null;
			case DOTPackage.DIRECTED_ARC__TAILLABEL:
				return taillabel != null;
			case DOTPackage.DIRECTED_ARC__ARROW_TAIL:
				return arrowTail != null;
			case DOTPackage.DIRECTED_ARC__TAIL_LP:
				return tail_lp != TAIL_LP_EDEFAULT;
			case DOTPackage.DIRECTED_ARC__HEAD_LP:
				return head_lp != HEAD_LP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tail_lp: ");
		result.append(tail_lp);
		result.append(", head_lp: ");
		result.append(head_lp);
		result.append(')');
		return result.toString();
	}

} //DirectedArcImpl
