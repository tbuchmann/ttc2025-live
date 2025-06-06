/**
 */
package DOT.impl;

import DOT.DOTPackage;
import DOT.Graph;
import DOT.Layer;
import DOT.Nodelike;

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
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DOT.impl.GraphImpl#getType <em>Type</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getRankDir <em>Rank Dir</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getLabeljust <em>Labeljust</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getLabelloc <em>Labelloc</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#isConcentrate <em>Concentrate</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#isCompound <em>Compound</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getNodeSeparation <em>Node Separation</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getSize <em>Size</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link DOT.impl.GraphImpl#isCenter <em>Center</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends GraphElementImpl implements Graph {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRankDir() <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankDir()
	 * @generated
	 * @ordered
	 */
	protected static final String RANK_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRankDir() <em>Rank Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankDir()
	 * @generated
	 * @ordered
	 */
	protected String rankDir = RANK_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabeljust() <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeljust()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELJUST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabeljust() <em>Labeljust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeljust()
	 * @generated
	 * @ordered
	 */
	protected String labeljust = LABELJUST_EDEFAULT;

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
	 * The default value of the '{@link #isConcentrate() <em>Concentrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConcentrate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONCENTRATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConcentrate() <em>Concentrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConcentrate()
	 * @generated
	 * @ordered
	 */
	protected boolean concentrate = CONCENTRATE_EDEFAULT;

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
	 * The default value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNDING_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected String boundingBox = BOUNDING_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompound() <em>Compound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPOUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompound() <em>Compound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompound()
	 * @generated
	 * @ordered
	 */
	protected boolean compound = COMPOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The default value of the '{@link #getNodeSeparation() <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSeparation()
	 * @generated
	 * @ordered
	 */
	protected static final double NODE_SEPARATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNodeSeparation() <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSeparation()
	 * @generated
	 * @ordered
	 */
	protected double nodeSeparation = NODE_SEPARATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected String ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected String ratio = RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean center = CENTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DOTPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRankDir() {
		return rankDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRankDir(String newRankDir) {
		String oldRankDir = rankDir;
		rankDir = newRankDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__RANK_DIR, oldRankDir, rankDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabeljust() {
		return labeljust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabeljust(String newLabeljust) {
		String oldLabeljust = labeljust;
		labeljust = newLabeljust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__LABELJUST, oldLabeljust, labeljust));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__LABELLOC, oldLabelloc, labelloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConcentrate() {
		return concentrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcentrate(boolean newConcentrate) {
		boolean oldConcentrate = concentrate;
		concentrate = newConcentrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__CONCENTRATE, oldConcentrate, concentrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nodelike> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Nodelike>(Nodelike.class, this, DOTPackage.GRAPH__NODES, DOTPackage.NODELIKE__GRAPH);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBoundingBox() {
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundingBox(String newBoundingBox) {
		String oldBoundingBox = boundingBox;
		boundingBox = newBoundingBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__BOUNDING_BOX, oldBoundingBox, boundingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompound() {
		return compound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompound(boolean newCompound) {
		boolean oldCompound = compound;
		compound = newCompound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__COMPOUND, oldCompound, compound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentWithInverseEList<Layer>(Layer.class, this, DOTPackage.GRAPH__LAYERS, DOTPackage.LAYER__GRAPH);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNodeSeparation() {
		return nodeSeparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeSeparation(double newNodeSeparation) {
		double oldNodeSeparation = nodeSeparation;
		nodeSeparation = newNodeSeparation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__NODE_SEPARATION, oldNodeSeparation, nodeSeparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdering(String newOrdering) {
		String oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatio(String newRatio) {
		String oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__RATIO, oldRatio, ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenter(boolean newCenter) {
		boolean oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DOTPackage.GRAPH__CENTER, oldCenter, center));
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
			case DOTPackage.GRAPH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case DOTPackage.GRAPH__LAYERS:
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
			case DOTPackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case DOTPackage.GRAPH__LAYERS:
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
			case DOTPackage.GRAPH__TYPE:
				return getType();
			case DOTPackage.GRAPH__RANK_DIR:
				return getRankDir();
			case DOTPackage.GRAPH__LABELJUST:
				return getLabeljust();
			case DOTPackage.GRAPH__LABELLOC:
				return getLabelloc();
			case DOTPackage.GRAPH__CONCENTRATE:
				return isConcentrate();
			case DOTPackage.GRAPH__NODES:
				return getNodes();
			case DOTPackage.GRAPH__BOUNDING_BOX:
				return getBoundingBox();
			case DOTPackage.GRAPH__COMPOUND:
				return isCompound();
			case DOTPackage.GRAPH__LAYERS:
				return getLayers();
			case DOTPackage.GRAPH__NODE_SEPARATION:
				return getNodeSeparation();
			case DOTPackage.GRAPH__ORDERING:
				return getOrdering();
			case DOTPackage.GRAPH__SIZE:
				return getSize();
			case DOTPackage.GRAPH__RATIO:
				return getRatio();
			case DOTPackage.GRAPH__CENTER:
				return isCenter();
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
			case DOTPackage.GRAPH__TYPE:
				setType((String)newValue);
				return;
			case DOTPackage.GRAPH__RANK_DIR:
				setRankDir((String)newValue);
				return;
			case DOTPackage.GRAPH__LABELJUST:
				setLabeljust((String)newValue);
				return;
			case DOTPackage.GRAPH__LABELLOC:
				setLabelloc((String)newValue);
				return;
			case DOTPackage.GRAPH__CONCENTRATE:
				setConcentrate((Boolean)newValue);
				return;
			case DOTPackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Nodelike>)newValue);
				return;
			case DOTPackage.GRAPH__BOUNDING_BOX:
				setBoundingBox((String)newValue);
				return;
			case DOTPackage.GRAPH__COMPOUND:
				setCompound((Boolean)newValue);
				return;
			case DOTPackage.GRAPH__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case DOTPackage.GRAPH__NODE_SEPARATION:
				setNodeSeparation((Double)newValue);
				return;
			case DOTPackage.GRAPH__ORDERING:
				setOrdering((String)newValue);
				return;
			case DOTPackage.GRAPH__SIZE:
				setSize((String)newValue);
				return;
			case DOTPackage.GRAPH__RATIO:
				setRatio((String)newValue);
				return;
			case DOTPackage.GRAPH__CENTER:
				setCenter((Boolean)newValue);
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
			case DOTPackage.GRAPH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DOTPackage.GRAPH__RANK_DIR:
				setRankDir(RANK_DIR_EDEFAULT);
				return;
			case DOTPackage.GRAPH__LABELJUST:
				setLabeljust(LABELJUST_EDEFAULT);
				return;
			case DOTPackage.GRAPH__LABELLOC:
				setLabelloc(LABELLOC_EDEFAULT);
				return;
			case DOTPackage.GRAPH__CONCENTRATE:
				setConcentrate(CONCENTRATE_EDEFAULT);
				return;
			case DOTPackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case DOTPackage.GRAPH__BOUNDING_BOX:
				setBoundingBox(BOUNDING_BOX_EDEFAULT);
				return;
			case DOTPackage.GRAPH__COMPOUND:
				setCompound(COMPOUND_EDEFAULT);
				return;
			case DOTPackage.GRAPH__LAYERS:
				getLayers().clear();
				return;
			case DOTPackage.GRAPH__NODE_SEPARATION:
				setNodeSeparation(NODE_SEPARATION_EDEFAULT);
				return;
			case DOTPackage.GRAPH__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case DOTPackage.GRAPH__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DOTPackage.GRAPH__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case DOTPackage.GRAPH__CENTER:
				setCenter(CENTER_EDEFAULT);
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
			case DOTPackage.GRAPH__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DOTPackage.GRAPH__RANK_DIR:
				return RANK_DIR_EDEFAULT == null ? rankDir != null : !RANK_DIR_EDEFAULT.equals(rankDir);
			case DOTPackage.GRAPH__LABELJUST:
				return LABELJUST_EDEFAULT == null ? labeljust != null : !LABELJUST_EDEFAULT.equals(labeljust);
			case DOTPackage.GRAPH__LABELLOC:
				return LABELLOC_EDEFAULT == null ? labelloc != null : !LABELLOC_EDEFAULT.equals(labelloc);
			case DOTPackage.GRAPH__CONCENTRATE:
				return concentrate != CONCENTRATE_EDEFAULT;
			case DOTPackage.GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case DOTPackage.GRAPH__BOUNDING_BOX:
				return BOUNDING_BOX_EDEFAULT == null ? boundingBox != null : !BOUNDING_BOX_EDEFAULT.equals(boundingBox);
			case DOTPackage.GRAPH__COMPOUND:
				return compound != COMPOUND_EDEFAULT;
			case DOTPackage.GRAPH__LAYERS:
				return layers != null && !layers.isEmpty();
			case DOTPackage.GRAPH__NODE_SEPARATION:
				return nodeSeparation != NODE_SEPARATION_EDEFAULT;
			case DOTPackage.GRAPH__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case DOTPackage.GRAPH__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case DOTPackage.GRAPH__RATIO:
				return RATIO_EDEFAULT == null ? ratio != null : !RATIO_EDEFAULT.equals(ratio);
			case DOTPackage.GRAPH__CENTER:
				return center != CENTER_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", rankDir: ");
		result.append(rankDir);
		result.append(", labeljust: ");
		result.append(labeljust);
		result.append(", labelloc: ");
		result.append(labelloc);
		result.append(", concentrate: ");
		result.append(concentrate);
		result.append(", boundingBox: ");
		result.append(boundingBox);
		result.append(", compound: ");
		result.append(compound);
		result.append(", nodeSeparation: ");
		result.append(nodeSeparation);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", size: ");
		result.append(size);
		result.append(", ratio: ");
		result.append(ratio);
		result.append(", center: ");
		result.append(center);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
