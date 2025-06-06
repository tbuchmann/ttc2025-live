/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Nodelike;
import DOT.SubGraph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.SubGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.impl.SubGraphImpl#getLabelloc <em>Labelloc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubGraphImpl extends NodelikeImpl implements SubGraph {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodelike> nodes;

	/**
	 * The default value of the '{@link #getLabelloc() <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelloc()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELLOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelloc() <em>Labelloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelloc()
	 * @generated
	 * @ordered
	 */
	protected String labelloc = LABELLOC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.SUB_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nodelike> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Nodelike>(Nodelike.class, this, DOTPackage.SUB_GRAPH__NODES, DOTPackage.NODELIKE__OWNER);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelloc() {
		return labelloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelloc(String newLabelloc) {
		String oldLabelloc = labelloc;
		labelloc = newLabelloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.SUB_GRAPH__LABELLOC, oldLabelloc, labelloc));
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
			case DOTPackage.SUB_GRAPH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
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
			case DOTPackage.SUB_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case DOTPackage.SUB_GRAPH__NODES:
				return getNodes();
			case DOTPackage.SUB_GRAPH__LABELLOC:
				return getLabelloc();
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
			case DOTPackage.SUB_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Nodelike>)newValue);
				return;
			case DOTPackage.SUB_GRAPH__LABELLOC:
				setLabelloc((String)newValue);
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
			case DOTPackage.SUB_GRAPH__NODES:
				getNodes().clear();
				return;
			case DOTPackage.SUB_GRAPH__LABELLOC:
				setLabelloc(LABELLOC_EDEFAULT);
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
			case DOTPackage.SUB_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case DOTPackage.SUB_GRAPH__LABELLOC:
				return LABELLOC_EDEFAULT == null ? labelloc != null : !LABELLOC_EDEFAULT.equals(labelloc);
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
		result.append(" (labelloc: ");
		result.append(labelloc);
		result.append(')');
		return result.toString();
	}

} //SubGraphImpl
