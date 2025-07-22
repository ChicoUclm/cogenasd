/**
 */
package teaw.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import teaw.NormalLink;
import teaw.Planning;
import teaw.PlanningNode;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.PlanningImpl#getName <em>Name</em>}</li>
 *   <li>{@link teaw.impl.PlanningImpl#getPlanningNodes <em>Planning Nodes</em>}</li>
 *   <li>{@link teaw.impl.PlanningImpl#getNormalLinks <em>Normal Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanningImpl extends NodeImpl implements Planning {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<Planning ...>";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlanningNodes() <em>Planning Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanningNode> planningNodes;

	/**
	 * The cached value of the '{@link #getNormalLinks() <em>Normal Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalLink> normalLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.PLANNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.PLANNING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlanningNode> getPlanningNodes() {
		if (planningNodes == null) {
			planningNodes = new EObjectContainmentEList<PlanningNode>(PlanningNode.class, this, TeawPackage.PLANNING__PLANNING_NODES);
		}
		return planningNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalLink> getNormalLinks() {
		if (normalLinks == null) {
			normalLinks = new EObjectContainmentEList<NormalLink>(NormalLink.class, this, TeawPackage.PLANNING__NORMAL_LINKS);
		}
		return normalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TeawPackage.PLANNING__PLANNING_NODES:
				return ((InternalEList<?>)getPlanningNodes()).basicRemove(otherEnd, msgs);
			case TeawPackage.PLANNING__NORMAL_LINKS:
				return ((InternalEList<?>)getNormalLinks()).basicRemove(otherEnd, msgs);
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
			case TeawPackage.PLANNING__NAME:
				return getName();
			case TeawPackage.PLANNING__PLANNING_NODES:
				return getPlanningNodes();
			case TeawPackage.PLANNING__NORMAL_LINKS:
				return getNormalLinks();
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
			case TeawPackage.PLANNING__NAME:
				setName((String)newValue);
				return;
			case TeawPackage.PLANNING__PLANNING_NODES:
				getPlanningNodes().clear();
				getPlanningNodes().addAll((Collection<? extends PlanningNode>)newValue);
				return;
			case TeawPackage.PLANNING__NORMAL_LINKS:
				getNormalLinks().clear();
				getNormalLinks().addAll((Collection<? extends NormalLink>)newValue);
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
			case TeawPackage.PLANNING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TeawPackage.PLANNING__PLANNING_NODES:
				getPlanningNodes().clear();
				return;
			case TeawPackage.PLANNING__NORMAL_LINKS:
				getNormalLinks().clear();
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
			case TeawPackage.PLANNING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TeawPackage.PLANNING__PLANNING_NODES:
				return planningNodes != null && !planningNodes.isEmpty();
			case TeawPackage.PLANNING__NORMAL_LINKS:
				return normalLinks != null && !normalLinks.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PlanningImpl
