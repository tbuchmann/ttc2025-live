/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Node;
import DOT.NodeShape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.NodeImpl#isFixedSize <em>Fixed Size</em>}</li>
 *   <li>{@link DOT.impl.NodeImpl#getFontname <em>Fontname</em>}</li>
 *   <li>{@link DOT.impl.NodeImpl#getFontsize <em>Fontsize</em>}</li>
 *   <li>{@link DOT.impl.NodeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link DOT.impl.NodeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link DOT.impl.NodeImpl#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends NodelikeImpl implements Node {
	/**
	 * The default value of the '{@link #isFixedSize() <em>Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedSize()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_SIZE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixedSize() <em>Fixed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedSize()
	 * @generated
	 * @ordered
	 */
	protected boolean fixedSize = FIXED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontname() <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontname()
	 * @generated
	 * @ordered
	 */
	protected static final String FONTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontname() <em>Fontname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontname()
	 * @generated
	 * @ordered
	 */
	protected String fontname = FONTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontsize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONTSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontsize() <em>Fontsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontsize()
	 * @generated
	 * @ordered
	 */
	protected int fontsize = FONTSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected NodeShape shape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFixedSize() {
		return fixedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedSize(boolean newFixedSize) {
		boolean oldFixedSize = fixedSize;
		fixedSize = newFixedSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__FIXED_SIZE, oldFixedSize, fixedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontname() {
		return fontname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontname(String newFontname) {
		String oldFontname = fontname;
		fontname = newFontname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__FONTNAME, oldFontname, fontname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFontsize() {
		return fontsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontsize(int newFontsize) {
		int oldFontsize = fontsize;
		fontsize = newFontsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__FONTSIZE, oldFontsize, fontsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeShape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(NodeShape newShape, NotificationChain msgs) {
		NodeShape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__SHAPE, oldShape, newShape);
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
	public void setShape(NodeShape newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DOTPackage.NODE__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DOTPackage.NODE__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.NODE__SHAPE, newShape, newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DOTPackage.NODE__SHAPE:
				return basicSetShape(null, msgs);
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
			case DOTPackage.NODE__FIXED_SIZE:
				return isFixedSize();
			case DOTPackage.NODE__FONTNAME:
				return getFontname();
			case DOTPackage.NODE__FONTSIZE:
				return getFontsize();
			case DOTPackage.NODE__HEIGHT:
				return getHeight();
			case DOTPackage.NODE__WIDTH:
				return getWidth();
			case DOTPackage.NODE__SHAPE:
				return getShape();
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
			case DOTPackage.NODE__FIXED_SIZE:
				setFixedSize((Boolean)newValue);
				return;
			case DOTPackage.NODE__FONTNAME:
				setFontname((String)newValue);
				return;
			case DOTPackage.NODE__FONTSIZE:
				setFontsize((Integer)newValue);
				return;
			case DOTPackage.NODE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case DOTPackage.NODE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case DOTPackage.NODE__SHAPE:
				setShape((NodeShape)newValue);
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
			case DOTPackage.NODE__FIXED_SIZE:
				setFixedSize(FIXED_SIZE_EDEFAULT);
				return;
			case DOTPackage.NODE__FONTNAME:
				setFontname(FONTNAME_EDEFAULT);
				return;
			case DOTPackage.NODE__FONTSIZE:
				setFontsize(FONTSIZE_EDEFAULT);
				return;
			case DOTPackage.NODE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case DOTPackage.NODE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DOTPackage.NODE__SHAPE:
				setShape((NodeShape)null);
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
			case DOTPackage.NODE__FIXED_SIZE:
				return fixedSize != FIXED_SIZE_EDEFAULT;
			case DOTPackage.NODE__FONTNAME:
				return FONTNAME_EDEFAULT == null ? fontname != null : !FONTNAME_EDEFAULT.equals(fontname);
			case DOTPackage.NODE__FONTSIZE:
				return fontsize != FONTSIZE_EDEFAULT;
			case DOTPackage.NODE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case DOTPackage.NODE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case DOTPackage.NODE__SHAPE:
				return shape != null;
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
		result.append(" (fixedSize: ");
		result.append(fixedSize);
		result.append(", fontname: ");
		result.append(fontname);
		result.append(", fontsize: ");
		result.append(fontsize);
		result.append(", height: ");
		result.append(height);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
