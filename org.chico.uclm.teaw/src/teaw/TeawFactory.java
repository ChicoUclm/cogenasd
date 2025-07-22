/**
 */
package teaw;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see teaw.TeawPackage
 * @generated
 */
public interface TeawFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TeawFactory eINSTANCE = teaw.impl.TeawFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TEAW Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEAW Diagram</em>'.
	 * @generated
	 */
	TEAWDiagram createTEAWDiagram();

	/**
	 * Returns a new object of class '<em>Emotions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emotions</em>'.
	 * @generated
	 */
	Emotions createEmotions();

	/**
	 * Returns a new object of class '<em>Planning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planning</em>'.
	 * @generated
	 */
	Planning createPlanning();

	/**
	 * Returns a new object of class '<em>Picto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picto</em>'.
	 * @generated
	 */
	Picto createPicto();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Transiction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transiction</em>'.
	 * @generated
	 */
	Transiction createTransiction();

	/**
	 * Returns a new object of class '<em>Wait Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait Time</em>'.
	 * @generated
	 */
	WaitTime createWaitTime();

	/**
	 * Returns a new object of class '<em>Prize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prize</em>'.
	 * @generated
	 */
	Prize createPrize();

	/**
	 * Returns a new object of class '<em>Social Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Story</em>'.
	 * @generated
	 */
	SocialStory createSocialStory();

	/**
	 * Returns a new object of class '<em>Soothing Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soothing Object</em>'.
	 * @generated
	 */
	SoothingObject createSoothingObject();

	/**
	 * Returns a new object of class '<em>Reamining Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reamining Object</em>'.
	 * @generated
	 */
	ReaminingObject createReaminingObject();

	/**
	 * Returns a new object of class '<em>Emotion Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emotion Choice</em>'.
	 * @generated
	 */
	EmotionChoice createEmotionChoice();

	/**
	 * Returns a new object of class '<em>Emotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emotion</em>'.
	 * @generated
	 */
	Emotion createEmotion();

	/**
	 * Returns a new object of class '<em>Positive Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive Feedback</em>'.
	 * @generated
	 */
	PositiveFeedback createPositiveFeedback();

	/**
	 * Returns a new object of class '<em>Negative Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Feedback</em>'.
	 * @generated
	 */
	NegativeFeedback createNegativeFeedback();

	/**
	 * Returns a new object of class '<em>Communication Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Book</em>'.
	 * @generated
	 */
	CommunicationBook createCommunicationBook();

	/**
	 * Returns a new object of class '<em>Normal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Link</em>'.
	 * @generated
	 */
	NormalLink createNormalLink();

	/**
	 * Returns a new object of class '<em>Red Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Red Link</em>'.
	 * @generated
	 */
	RedLink createRedLink();

	/**
	 * Returns a new object of class '<em>Green Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Green Link</em>'.
	 * @generated
	 */
	GreenLink createGreenLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TeawPackage getTeawPackage();

} //TeawFactory
