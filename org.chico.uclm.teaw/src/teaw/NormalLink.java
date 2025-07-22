/**
 */
package teaw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.NormalLink#getOrigin <em>Origin</em>}</li>
 *   <li>{@link teaw.NormalLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getNormalLink()
 * @model annotation="gmf.link source='origin' target='target' tool.name='Sequence/order' style='solid' width='3' color='82,82,82' tool.small.bundle='org.chico.uclm.teaw.figures' tool.small.path='images/link32.png' source.constraint='self &lt;&gt; oppositeEnd' target.constraint='self &lt;&gt; oppositeEnd' target.decoration='filledclosedarrow'"
 * @generated
 */
public interface NormalLink extends Link {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Picto)
	 * @see teaw.TeawPackage#getNormalLink_Origin()
	 * @model required="true"
	 * @generated
	 */
	Picto getOrigin();

	/**
	 * Sets the value of the '{@link teaw.NormalLink#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Picto value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Picto)
	 * @see teaw.TeawPackage#getNormalLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Picto getTarget();

	/**
	 * Sets the value of the '{@link teaw.NormalLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Picto value);

} // NormalLink
