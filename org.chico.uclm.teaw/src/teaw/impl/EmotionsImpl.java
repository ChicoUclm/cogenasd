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

import teaw.Emotions;
import teaw.EmotionsNode;
import teaw.GreenLink;
import teaw.RedLink;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emotions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.EmotionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link teaw.impl.EmotionsImpl#getEmotions <em>Emotions</em>}</li>
 *   <li>{@link teaw.impl.EmotionsImpl#getRedLinks <em>Red Links</em>}</li>
 *   <li>{@link teaw.impl.EmotionsImpl#getGreenLink <em>Green Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmotionsImpl extends NodeImpl implements Emotions {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<Emotions ...>";

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
	 * The cached value of the '{@link #getEmotions() <em>Emotions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmotions()
	 * @generated
	 * @ordered
	 */
	protected EList<EmotionsNode> emotions;

	/**
	 * The cached value of the '{@link #getRedLinks() <em>Red Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<RedLink> redLinks;

	/**
	 * The cached value of the '{@link #getGreenLink() <em>Green Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenLink()
	 * @generated
	 * @ordered
	 */
	protected GreenLink greenLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmotionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.EMOTIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmotionsNode> getEmotions() {
		if (emotions == null) {
			emotions = new EObjectContainmentEList<EmotionsNode>(EmotionsNode.class, this, TeawPackage.EMOTIONS__EMOTIONS);
		}
		return emotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RedLink> getRedLinks() {
		if (redLinks == null) {
			redLinks = new EObjectContainmentEList<RedLink>(RedLink.class, this, TeawPackage.EMOTIONS__RED_LINKS);
		}
		return redLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreenLink getGreenLink() {
		return greenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenLink(GreenLink newGreenLink, NotificationChain msgs) {
		GreenLink oldGreenLink = greenLink;
		greenLink = newGreenLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTIONS__GREEN_LINK, oldGreenLink, newGreenLink);
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
	public void setGreenLink(GreenLink newGreenLink) {
		if (newGreenLink != greenLink) {
			NotificationChain msgs = null;
			if (greenLink != null)
				msgs = ((InternalEObject)greenLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TeawPackage.EMOTIONS__GREEN_LINK, null, msgs);
			if (newGreenLink != null)
				msgs = ((InternalEObject)newGreenLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TeawPackage.EMOTIONS__GREEN_LINK, null, msgs);
			msgs = basicSetGreenLink(newGreenLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.EMOTIONS__GREEN_LINK, newGreenLink, newGreenLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TeawPackage.EMOTIONS__EMOTIONS:
				return ((InternalEList<?>)getEmotions()).basicRemove(otherEnd, msgs);
			case TeawPackage.EMOTIONS__RED_LINKS:
				return ((InternalEList<?>)getRedLinks()).basicRemove(otherEnd, msgs);
			case TeawPackage.EMOTIONS__GREEN_LINK:
				return basicSetGreenLink(null, msgs);
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
			case TeawPackage.EMOTIONS__NAME:
				return getName();
			case TeawPackage.EMOTIONS__EMOTIONS:
				return getEmotions();
			case TeawPackage.EMOTIONS__RED_LINKS:
				return getRedLinks();
			case TeawPackage.EMOTIONS__GREEN_LINK:
				return getGreenLink();
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
			case TeawPackage.EMOTIONS__NAME:
				setName((String)newValue);
				return;
			case TeawPackage.EMOTIONS__EMOTIONS:
				getEmotions().clear();
				getEmotions().addAll((Collection<? extends EmotionsNode>)newValue);
				return;
			case TeawPackage.EMOTIONS__RED_LINKS:
				getRedLinks().clear();
				getRedLinks().addAll((Collection<? extends RedLink>)newValue);
				return;
			case TeawPackage.EMOTIONS__GREEN_LINK:
				setGreenLink((GreenLink)newValue);
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
			case TeawPackage.EMOTIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TeawPackage.EMOTIONS__EMOTIONS:
				getEmotions().clear();
				return;
			case TeawPackage.EMOTIONS__RED_LINKS:
				getRedLinks().clear();
				return;
			case TeawPackage.EMOTIONS__GREEN_LINK:
				setGreenLink((GreenLink)null);
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
			case TeawPackage.EMOTIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TeawPackage.EMOTIONS__EMOTIONS:
				return emotions != null && !emotions.isEmpty();
			case TeawPackage.EMOTIONS__RED_LINKS:
				return redLinks != null && !redLinks.isEmpty();
			case TeawPackage.EMOTIONS__GREEN_LINK:
				return greenLink != null;
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

} //EmotionsImpl
