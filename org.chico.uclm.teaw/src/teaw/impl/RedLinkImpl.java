/**
 */
package teaw.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.Feedback;
import teaw.RedLink;
import teaw.TeawPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link teaw.impl.RedLinkImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link teaw.impl.RedLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link teaw.impl.RedLinkImpl#getNpFeedback <em>Np Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedLinkImpl extends LinkImpl implements RedLink {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EmotionChoice origin;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Emotion target;

	/**
	 * The cached value of the '{@link #getNpFeedback() <em>Np Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNpFeedback()
	 * @generated
	 * @ordered
	 */
	protected Feedback npFeedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeawPackage.Literals.RED_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmotionChoice getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (EmotionChoice)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeawPackage.RED_LINK__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmotionChoice basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(EmotionChoice newOrigin) {
		EmotionChoice oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.RED_LINK__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emotion getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Emotion)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeawPackage.RED_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emotion basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Emotion newTarget) {
		Emotion oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.RED_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feedback getNpFeedback() {
		if (npFeedback != null && npFeedback.eIsProxy()) {
			InternalEObject oldNpFeedback = (InternalEObject)npFeedback;
			npFeedback = (Feedback)eResolveProxy(oldNpFeedback);
			if (npFeedback != oldNpFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TeawPackage.RED_LINK__NP_FEEDBACK, oldNpFeedback, npFeedback));
			}
		}
		return npFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback basicGetNpFeedback() {
		return npFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNpFeedback(Feedback newNpFeedback) {
		Feedback oldNpFeedback = npFeedback;
		npFeedback = newNpFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TeawPackage.RED_LINK__NP_FEEDBACK, oldNpFeedback, npFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TeawPackage.RED_LINK__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case TeawPackage.RED_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TeawPackage.RED_LINK__NP_FEEDBACK:
				if (resolve) return getNpFeedback();
				return basicGetNpFeedback();
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
			case TeawPackage.RED_LINK__ORIGIN:
				setOrigin((EmotionChoice)newValue);
				return;
			case TeawPackage.RED_LINK__TARGET:
				setTarget((Emotion)newValue);
				return;
			case TeawPackage.RED_LINK__NP_FEEDBACK:
				setNpFeedback((Feedback)newValue);
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
			case TeawPackage.RED_LINK__ORIGIN:
				setOrigin((EmotionChoice)null);
				return;
			case TeawPackage.RED_LINK__TARGET:
				setTarget((Emotion)null);
				return;
			case TeawPackage.RED_LINK__NP_FEEDBACK:
				setNpFeedback((Feedback)null);
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
			case TeawPackage.RED_LINK__ORIGIN:
				return origin != null;
			case TeawPackage.RED_LINK__TARGET:
				return target != null;
			case TeawPackage.RED_LINK__NP_FEEDBACK:
				return npFeedback != null;
		}
		return super.eIsSet(featureID);
	}

} //RedLinkImpl
