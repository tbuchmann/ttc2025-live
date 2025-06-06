/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.PolygonNodeShape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Node Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.PolygonNodeShapeImpl#getSides <em>Sides</em>}</li>
 *   <li>{@link DOT.impl.PolygonNodeShapeImpl#getSkew <em>Skew</em>}</li>
 *   <li>{@link DOT.impl.PolygonNodeShapeImpl#getDistortion <em>Distortion</em>}</li>
 *   <li>{@link DOT.impl.PolygonNodeShapeImpl#isIsRegular <em>Is Regular</em>}</li>
 *   <li>{@link DOT.impl.PolygonNodeShapeImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonNodeShapeImpl extends ComplexNodeShapeImpl implements PolygonNodeShape {
	/**
	 * The default value of the '{@link #getSides() <em>Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSides()
	 * @generated
	 * @ordered
	 */
	protected static final int SIDES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSides() <em>Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSides()
	 * @generated
	 * @ordered
	 */
	protected int sides = SIDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected static final int SKEW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSkew() <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkew()
	 * @generated
	 * @ordered
	 */
	protected int skew = SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistortion() <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortion()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTORTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistortion() <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistortion()
	 * @generated
	 * @ordered
	 */
	protected int distortion = DISTORTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRegular() <em>Is Regular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REGULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRegular() <em>Is Regular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRegular()
	 * @generated
	 * @ordered
	 */
	protected boolean isRegular = IS_REGULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final int ORIENTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected int orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonNodeShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.POLYGON_NODE_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSides() {
		return sides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSides(int newSides) {
		int oldSides = sides;
		sides = newSides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.POLYGON_NODE_SHAPE__SIDES, oldSides, sides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSkew() {
		return skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkew(int newSkew) {
		int oldSkew = skew;
		skew = newSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.POLYGON_NODE_SHAPE__SKEW, oldSkew, skew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDistortion() {
		return distortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistortion(int newDistortion) {
		int oldDistortion = distortion;
		distortion = newDistortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.POLYGON_NODE_SHAPE__DISTORTION, oldDistortion, distortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRegular() {
		return isRegular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRegular(boolean newIsRegular) {
		boolean oldIsRegular = isRegular;
		isRegular = newIsRegular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.POLYGON_NODE_SHAPE__IS_REGULAR, oldIsRegular, isRegular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(int newOrientation) {
		int oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.POLYGON_NODE_SHAPE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DOTPackage.POLYGON_NODE_SHAPE__SIDES:
				return getSides();
			case DOTPackage.POLYGON_NODE_SHAPE__SKEW:
				return getSkew();
			case DOTPackage.POLYGON_NODE_SHAPE__DISTORTION:
				return getDistortion();
			case DOTPackage.POLYGON_NODE_SHAPE__IS_REGULAR:
				return isIsRegular();
			case DOTPackage.POLYGON_NODE_SHAPE__ORIENTATION:
				return getOrientation();
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
			case DOTPackage.POLYGON_NODE_SHAPE__SIDES:
				setSides((Integer)newValue);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__SKEW:
				setSkew((Integer)newValue);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__DISTORTION:
				setDistortion((Integer)newValue);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__IS_REGULAR:
				setIsRegular((Boolean)newValue);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__ORIENTATION:
				setOrientation((Integer)newValue);
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
			case DOTPackage.POLYGON_NODE_SHAPE__SIDES:
				setSides(SIDES_EDEFAULT);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__SKEW:
				setSkew(SKEW_EDEFAULT);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__DISTORTION:
				setDistortion(DISTORTION_EDEFAULT);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__IS_REGULAR:
				setIsRegular(IS_REGULAR_EDEFAULT);
				return;
			case DOTPackage.POLYGON_NODE_SHAPE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case DOTPackage.POLYGON_NODE_SHAPE__SIDES:
				return sides != SIDES_EDEFAULT;
			case DOTPackage.POLYGON_NODE_SHAPE__SKEW:
				return skew != SKEW_EDEFAULT;
			case DOTPackage.POLYGON_NODE_SHAPE__DISTORTION:
				return distortion != DISTORTION_EDEFAULT;
			case DOTPackage.POLYGON_NODE_SHAPE__IS_REGULAR:
				return isRegular != IS_REGULAR_EDEFAULT;
			case DOTPackage.POLYGON_NODE_SHAPE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
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
		result.append(" (sides: ");
		result.append(sides);
		result.append(", skew: ");
		result.append(skew);
		result.append(", distortion: ");
		result.append(distortion);
		result.append(", isRegular: ");
		result.append(isRegular);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //PolygonNodeShapeImpl
