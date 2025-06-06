/**
 */
package DOT.impl;

import DOT.ArrowShape;
import DOT.DOTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.ArrowShapeImpl#getClipping <em>Clipping</em>}</li>
 *   <li>{@link DOT.impl.ArrowShapeImpl#isIsPlain <em>Is Plain</em>}</li>
 *   <li>{@link DOT.impl.ArrowShapeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowShapeImpl extends ShapeImpl implements ArrowShape {
	/**
	 * The default value of the '{@link #getClipping() <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipping()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClipping() <em>Clipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipping()
	 * @generated
	 * @ordered
	 */
	protected String clipping = CLIPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlain() <em>Is Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlain() <em>Is Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlain = IS_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.ARROW_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClipping() {
		return clipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClipping(String newClipping) {
		String oldClipping = clipping;
		clipping = newClipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARROW_SHAPE__CLIPPING, oldClipping, clipping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPlain() {
		return isPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPlain(boolean newIsPlain) {
		boolean oldIsPlain = isPlain;
		isPlain = newIsPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARROW_SHAPE__IS_PLAIN, oldIsPlain, isPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.ARROW_SHAPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				return getClipping();
			case DOTPackage.ARROW_SHAPE__IS_PLAIN:
				return isIsPlain();
			case DOTPackage.ARROW_SHAPE__SIZE:
				return getSize();
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				setClipping((String)newValue);
				return;
			case DOTPackage.ARROW_SHAPE__IS_PLAIN:
				setIsPlain((Boolean)newValue);
				return;
			case DOTPackage.ARROW_SHAPE__SIZE:
				setSize((Integer)newValue);
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				setClipping(CLIPPING_EDEFAULT);
				return;
			case DOTPackage.ARROW_SHAPE__IS_PLAIN:
				setIsPlain(IS_PLAIN_EDEFAULT);
				return;
			case DOTPackage.ARROW_SHAPE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case DOTPackage.ARROW_SHAPE__CLIPPING:
				return CLIPPING_EDEFAULT == null ? clipping != null : !CLIPPING_EDEFAULT.equals(clipping);
			case DOTPackage.ARROW_SHAPE__IS_PLAIN:
				return isPlain != IS_PLAIN_EDEFAULT;
			case DOTPackage.ARROW_SHAPE__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(" (clipping: ");
		result.append(clipping);
		result.append(", isPlain: ");
		result.append(isPlain);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ArrowShapeImpl
