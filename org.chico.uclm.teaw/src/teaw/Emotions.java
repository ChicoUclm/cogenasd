/**
 */
package teaw;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emotions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link teaw.Emotions#getName <em>Name</em>}</li>
 *   <li>{@link teaw.Emotions#getEmotions <em>Emotions</em>}</li>
 *   <li>{@link teaw.Emotions#getRedLinks <em>Red Links</em>}</li>
 *   <li>{@link teaw.Emotions#getGreenLink <em>Green Link</em>}</li>
 * </ul>
 *
 * @see teaw.TeawPackage#getEmotions()
 * @model annotation="gmf.node label='name' tool.name='Emotions' tool.small.bundle='org.chico.uclm.teaw.figures' tool.small.path='images/emotions_arasaac32.png'"
 * @generated
 */
public interface Emotions extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<Emotions ...>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see teaw.TeawPackage#getEmotions_Name()
	 * @model default="&lt;Emotions ...&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link teaw.Emotions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Emotions</b></em>' containment reference list.
	 * The list contents are of type {@link teaw.EmotionsNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emotions</em>' containment reference list.
	 * @see teaw.TeawPackage#getEmotions_Emotions()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='false'"
	 * @generated
	 */
	EList<EmotionsNode> getEmotions();

	/**
	 * Returns the value of the '<em><b>Red Links</b></em>' containment reference list.
	 * The list contents are of type {@link teaw.RedLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Links</em>' containment reference list.
	 * @see teaw.TeawPackage#getEmotions_RedLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<RedLink> getRedLinks();

	/**
	 * Returns the value of the '<em><b>Green Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green Link</em>' containment reference.
	 * @see #setGreenLink(GreenLink)
	 * @see teaw.TeawPackage#getEmotions_GreenLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GreenLink getGreenLink();

	/**
	 * Sets the value of the '{@link teaw.Emotions#getGreenLink <em>Green Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green Link</em>' containment reference.
	 * @see #getGreenLink()
	 * @generated
	 */
	void setGreenLink(GreenLink value);

} // Emotions
