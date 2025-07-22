/**
 */
package teaw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Green Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.GreenLink#getOrigin <em>Origin</em>}</li>
 *   <li>{@link teaw.GreenLink#getTarget <em>Target</em>}</li>
 *   <li>{@link teaw.GreenLink#getNpFeedback <em>Np Feedback</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getGreenLink()
 * @model annotation="gmf.link source='origin' target='target' tool.name='Correct solution' style='solid' width='2' color='0,217,60' tool.small.bundle='org.chico.uclm.teaw.figures' tool.small.path='images/ok32.png' source.constraint='self &lt;&gt; oppositeEnd' target.constraint='self &lt;&gt; oppositeEnd'"
 * @generated
 */
public interface GreenLink extends Link {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(EmotionChoice)
	 * @see teaw.TeawPackage#getGreenLink_Origin()
	 * @model required="true"
	 * @generated
	 */
	EmotionChoice getOrigin();

	/**
	 * Sets the value of the '{@link teaw.GreenLink#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(EmotionChoice value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Emotion)
	 * @see teaw.TeawPackage#getGreenLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Emotion getTarget();

	/**
	 * Sets the value of the '{@link teaw.GreenLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Emotion value);

	/**
	 * Returns the value of the '<em><b>Np Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Np Feedback</em>' reference.
	 * @see #setNpFeedback(Feedback)
	 * @see teaw.TeawPackage#getGreenLink_NpFeedback()
	 * @model required="true"
	 * @generated
	 */
	Feedback getNpFeedback();

	/**
	 * Sets the value of the '{@link teaw.GreenLink#getNpFeedback <em>Np Feedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Np Feedback</em>' reference.
	 * @see #getNpFeedback()
	 * @generated
	 */
	void setNpFeedback(Feedback value);

} // GreenLink
