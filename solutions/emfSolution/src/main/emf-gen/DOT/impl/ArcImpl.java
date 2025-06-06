/**
 */
package DOT.impl;

import DOT.Arc;
import DOT.DOTPackage;
import DOT.Layer;
import DOT.Nodelike;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.ArcImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#isConstraint <em>Constraint</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getMinlen <em>Minlen</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getSameHead <em>Same Head</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getSameTail <em>Same Tail</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getLhead <em>Lhead</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#getLtail <em>Ltail</em>}</li>
 *   <li>{@link DOT.impl.ArcImpl#isDecorate <em>Decorate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArcImpl extends GraphElementImpl implements Arc {
	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected Nodelike fromNode;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected Nodelike toNode;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The default value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraint()
	 * @generated
	 * @ordered
	 */
	protected boolean constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinlen() <em>Minlen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlen()
	 * @generated
	 * @ordered
	 */
	protected static final int MINLEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinlen() <em>Minlen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlen()
	 * @generated
	 * @ordered
	 */
	protected int minlen = MINLEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSameHead() <em>Same Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameHead()
	 * @generated
	 * @ordered
	 */
	protected static final String SAME_HEAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSameHead() <em>Same Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameHead()
	 * @generated
	 * @ordered
	 */
	protected String sameHead = SAME_HEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSameTail() <em>Same Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameTail()
	 * @generated
	 * @ordered
	 */
	protected static final String SAME_TAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSameTail() <em>Same Tail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameTail()
	 * @generated
	 * @ordered
	 */
	protected String sameTail = SAME_TAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhead() <em>Lhead</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhead()
	 * @generated
	 * @ordered
	 */
	protected Nodelike lhead;

	/**
	 * The cached value of the '{@link #getLtail() <em>Ltail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtail()
	 * @generated
	 * @ordered
	 */
	protected Nodelike ltail;

	/**
	 * The default value of the '{@link #isDecorate() <em>Decorate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecorate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECORATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDecorate() <em>Decorate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDecorate()
	 * @generated
	 * @ordered
	 */
	protected boolean decorate = DECORATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodelike getFromNode() {
		if (fromNode != null && fromNode.eIsProxy()) {
			InternalEObject oldFromNode = (InternalEObject)fromNode;
			fromNode = (Nodelike)eResolveProxy(oldFromNode);
			if (fromNode != oldFromNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__FROM_NODE, oldFromNode, fromNode));
			}
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodelike basicGetFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromNode(Nodelike newFromNode, NotificationChain msgs) {
		Nodelike oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__FROM_NODE, oldFromNode, newFromNode);
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
	public void setFromNode(Nodelike newFromNode) {
		if (newFromNode != fromNode) {
			NotificationChain msgs = null;
			if (fromNode != null)
				msgs = ((InternalEObject)fromNode).eInverseRemove(this, DOTPackage.NODELIKE__REFERS, Nodelike.class, msgs);
			if (newFromNode != null)
				msgs = ((InternalEObject)newFromNode).eInverseAdd(this, DOTPackage.NODELIKE__REFERS, Nodelike.class, msgs);
			msgs = basicSetFromNode(newFromNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__FROM_NODE, newFromNode, newFromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodelike getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (Nodelike)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodelike basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToNode(Nodelike newToNode, NotificationChain msgs) {
		Nodelike oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__TO_NODE, oldToNode, newToNode);
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
	public void setToNode(Nodelike newToNode) {
		if (newToNode != toNode) {
			NotificationChain msgs = null;
			if (toNode != null)
				msgs = ((InternalEObject)toNode).eInverseRemove(this, DOTPackage.NODELIKE__REFERRED_BY, Nodelike.class, msgs);
			if (newToNode != null)
				msgs = ((InternalEObject)newToNode).eInverseAdd(this, DOTPackage.NODELIKE__REFERRED_BY, Nodelike.class, msgs);
			msgs = basicSetToNode(newToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__TO_NODE, newToNode, newToNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectWithInverseResolvingEList.ManyInverse<Layer>(Layer.class, this, DOTPackage.ARC__LAYERS, DOTPackage.LAYER__ARCS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraint(boolean newConstraint) {
		boolean oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinlen() {
		return minlen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinlen(int newMinlen) {
		int oldMinlen = minlen;
		minlen = newMinlen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__MINLEN, oldMinlen, minlen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSameHead() {
		return sameHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSameHead(String newSameHead) {
		String oldSameHead = sameHead;
		sameHead = newSameHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__SAME_HEAD, oldSameHead, sameHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSameTail() {
		return sameTail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSameTail(String newSameTail) {
		String oldSameTail = sameTail;
		sameTail = newSameTail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__SAME_TAIL, oldSameTail, sameTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodelike getLhead() {
		if (lhead != null && lhead.eIsProxy()) {
			InternalEObject oldLhead = (InternalEObject)lhead;
			lhead = (Nodelike)eResolveProxy(oldLhead);
			if (lhead != oldLhead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__LHEAD, oldLhead, lhead));
			}
		}
		return lhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodelike basicGetLhead() {
		return lhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLhead(Nodelike newLhead) {
		Nodelike oldLhead = lhead;
		lhead = newLhead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__LHEAD, oldLhead, lhead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nodelike getLtail() {
		if (ltail != null && ltail.eIsProxy()) {
			InternalEObject oldLtail = (InternalEObject)ltail;
			ltail = (Nodelike)eResolveProxy(oldLtail);
			if (ltail != oldLtail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DOTPackage.ARC__LTAIL, oldLtail, ltail));
			}
		}
		return ltail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodelike basicGetLtail() {
		return ltail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLtail(Nodelike newLtail) {
		Nodelike oldLtail = ltail;
		ltail = newLtail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__LTAIL, oldLtail, ltail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDecorate() {
		return decorate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecorate(boolean newDecorate) {
		boolean oldDecorate = decorate;
		decorate = newDecorate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARC__DECORATE, oldDecorate, decorate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.ARC__FROM_NODE:
				if (fromNode != null)
					msgs = ((InternalEObject)fromNode).eInverseRemove(this, DOTPackage.NODELIKE__REFERS, Nodelike.class, msgs);
				return basicSetFromNode((Nodelike)otherEnd, msgs);
			case DOTPackage.ARC__TO_NODE:
				if (toNode != null)
					msgs = ((InternalEObject)toNode).eInverseRemove(this, DOTPackage.NODELIKE__REFERRED_BY, Nodelike.class, msgs);
				return basicSetToNode((Nodelike)otherEnd, msgs);
			case DOTPackage.ARC__LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayers()).basicAdd(otherEnd, msgs);
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
			case DOTPackage.ARC__FROM_NODE:
				return basicSetFromNode(null, msgs);
			case DOTPackage.ARC__TO_NODE:
				return basicSetToNode(null, msgs);
			case DOTPackage.ARC__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
			case DOTPackage.ARC__FROM_NODE:
				if (resolve) return getFromNode();
				return basicGetFromNode();
			case DOTPackage.ARC__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
			case DOTPackage.ARC__LAYERS:
				return getLayers();
			case DOTPackage.ARC__CONSTRAINT:
				return isConstraint();
			case DOTPackage.ARC__GROUP:
				return getGroup();
			case DOTPackage.ARC__MINLEN:
				return getMinlen();
			case DOTPackage.ARC__SAME_HEAD:
				return getSameHead();
			case DOTPackage.ARC__SAME_TAIL:
				return getSameTail();
			case DOTPackage.ARC__LHEAD:
				if (resolve) return getLhead();
				return basicGetLhead();
			case DOTPackage.ARC__LTAIL:
				if (resolve) return getLtail();
				return basicGetLtail();
			case DOTPackage.ARC__DECORATE:
				return isDecorate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DOTPackage.ARC__FROM_NODE:
				setFromNode((Nodelike)newValue);
				return;
			case DOTPackage.ARC__TO_NODE:
				setToNode((Nodelike)newValue);
				return;
			case DOTPackage.ARC__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case DOTPackage.ARC__CONSTRAINT:
				setConstraint((Boolean)newValue);
				return;
			case DOTPackage.ARC__GROUP:
				setGroup((String)newValue);
				return;
			case DOTPackage.ARC__MINLEN:
				setMinlen((Integer)newValue);
				return;
			case DOTPackage.ARC__SAME_HEAD:
				setSameHead((String)newValue);
				return;
			case DOTPackage.ARC__SAME_TAIL:
				setSameTail((String)newValue);
				return;
			case DOTPackage.ARC__LHEAD:
				setLhead((Nodelike)newValue);
				return;
			case DOTPackage.ARC__LTAIL:
				setLtail((Nodelike)newValue);
				return;
			case DOTPackage.ARC__DECORATE:
				setDecorate((Boolean)newValue);
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
			case DOTPackage.ARC__FROM_NODE:
				setFromNode((Nodelike)null);
				return;
			case DOTPackage.ARC__TO_NODE:
				setToNode((Nodelike)null);
				return;
			case DOTPackage.ARC__LAYERS:
				getLayers().clear();
				return;
			case DOTPackage.ARC__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case DOTPackage.ARC__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case DOTPackage.ARC__MINLEN:
				setMinlen(MINLEN_EDEFAULT);
				return;
			case DOTPackage.ARC__SAME_HEAD:
				setSameHead(SAME_HEAD_EDEFAULT);
				return;
			case DOTPackage.ARC__SAME_TAIL:
				setSameTail(SAME_TAIL_EDEFAULT);
				return;
			case DOTPackage.ARC__LHEAD:
				setLhead((Nodelike)null);
				return;
			case DOTPackage.ARC__LTAIL:
				setLtail((Nodelike)null);
				return;
			case DOTPackage.ARC__DECORATE:
				setDecorate(DECORATE_EDEFAULT);
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
			case DOTPackage.ARC__FROM_NODE:
				return fromNode != null;
			case DOTPackage.ARC__TO_NODE:
				return toNode != null;
			case DOTPackage.ARC__LAYERS:
				return layers != null && !layers.isEmpty();
			case DOTPackage.ARC__CONSTRAINT:
				return constraint != CONSTRAINT_EDEFAULT;
			case DOTPackage.ARC__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case DOTPackage.ARC__MINLEN:
				return minlen != MINLEN_EDEFAULT;
			case DOTPackage.ARC__SAME_HEAD:
				return SAME_HEAD_EDEFAULT == null ? sameHead != null : !SAME_HEAD_EDEFAULT.equals(sameHead);
			case DOTPackage.ARC__SAME_TAIL:
				return SAME_TAIL_EDEFAULT == null ? sameTail != null : !SAME_TAIL_EDEFAULT.equals(sameTail);
			case DOTPackage.ARC__LHEAD:
				return lhead != null;
			case DOTPackage.ARC__LTAIL:
				return ltail != null;
			case DOTPackage.ARC__DECORATE:
				return decorate != DECORATE_EDEFAULT;
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(", group: ");
		result.append(group);
		result.append(", minlen: ");
		result.append(minlen);
		result.append(", sameHead: ");
		result.append(sameHead);
		result.append(", sameTail: ");
		result.append(sameTail);
		result.append(", decorate: ");
		result.append(decorate);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
