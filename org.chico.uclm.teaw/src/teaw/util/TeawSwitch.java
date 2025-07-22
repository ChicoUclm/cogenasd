/**
 */
package teaw.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import teaw.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see teaw.TeawPackage
 * @generated
 */
public class TeawSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TeawPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeawSwitch() {
		if (modelPackage == null) {
			modelPackage = TeawPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TeawPackage.TEAW_DIAGRAM: {
				TEAWDiagram teawDiagram = (TEAWDiagram)theEObject;
				T result = caseTEAWDiagram(teawDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PLANNING_NODE: {
				PlanningNode planningNode = (PlanningNode)theEObject;
				T result = casePlanningNode(planningNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.EMOTIONS_NODE: {
				EmotionsNode emotionsNode = (EmotionsNode)theEObject;
				T result = caseEmotionsNode(emotionsNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.EMOTIONS: {
				Emotions emotions = (Emotions)theEObject;
				T result = caseEmotions(emotions);
				if (result == null) result = caseNode(emotions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PLANNING: {
				Planning planning = (Planning)theEObject;
				T result = casePlanning(planning);
				if (result == null) result = caseNode(planning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PICTO: {
				Picto picto = (Picto)theEObject;
				T result = casePicto(picto);
				if (result == null) result = casePlanningNode(picto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = casePicto(person);
				if (result == null) result = casePlanningNode(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = casePicto(action);
				if (result == null) result = casePlanningNode(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = casePicto(place);
				if (result == null) result = casePlanningNode(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.TRANSICTION: {
				Transiction transiction = (Transiction)theEObject;
				T result = caseTransiction(transiction);
				if (result == null) result = casePlanningNode(transiction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.WAIT_TIME: {
				WaitTime waitTime = (WaitTime)theEObject;
				T result = caseWaitTime(waitTime);
				if (result == null) result = caseTransiction(waitTime);
				if (result == null) result = casePlanningNode(waitTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.PRIZE: {
				Prize prize = (Prize)theEObject;
				T result = casePrize(prize);
				if (result == null) result = caseTransiction(prize);
				if (result == null) result = casePlanningNode(prize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.SOCIAL_STORY: {
				SocialStory socialStory = (SocialStory)theEObject;
				T result = caseSocialStory(socialStory);
				if (result == null) result = caseTransiction(socialStory);
				if (result == null) result = casePlanningNode(socialStory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.SOOTHING_OBJECT: {
				SoothingObject soothingObject = (SoothingObject)theEObject;
				T result = caseSoothingObject(soothingObject);
				if (result == null) result = caseTransiction(soothingObject);
				if (result == null) result = casePlanningNode(soothingObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.REAMINING_OBJECT: {
				ReaminingObject reaminingObject = (ReaminingObject)theEObject;
				T result = caseReaminingObject(reaminingObject);
				if (result == null) result = caseTransiction(reaminingObject);
				if (result == null) result = casePlanningNode(reaminingObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.COMMUNICATION_BOOK: {
				CommunicationBook communicationBook = (CommunicationBook)theEObject;
				T result = caseCommunicationBook(communicationBook);
				if (result == null) result = casePlanningNode(communicationBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.EMOTIONS_PICTO: {
				EmotionsPicto emotionsPicto = (EmotionsPicto)theEObject;
				T result = caseEmotionsPicto(emotionsPicto);
				if (result == null) result = caseEmotionsNode(emotionsPicto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.FEEDBACK: {
				Feedback feedback = (Feedback)theEObject;
				T result = caseFeedback(feedback);
				if (result == null) result = caseEmotionsNode(feedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.EMOTION_CHOICE: {
				EmotionChoice emotionChoice = (EmotionChoice)theEObject;
				T result = caseEmotionChoice(emotionChoice);
				if (result == null) result = caseEmotionsPicto(emotionChoice);
				if (result == null) result = caseEmotionsNode(emotionChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.EMOTION: {
				Emotion emotion = (Emotion)theEObject;
				T result = caseEmotion(emotion);
				if (result == null) result = caseEmotionsPicto(emotion);
				if (result == null) result = caseEmotionsNode(emotion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.POSITIVE_FEEDBACK: {
				PositiveFeedback positiveFeedback = (PositiveFeedback)theEObject;
				T result = casePositiveFeedback(positiveFeedback);
				if (result == null) result = caseFeedback(positiveFeedback);
				if (result == null) result = caseEmotionsNode(positiveFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.NEGATIVE_FEEDBACK: {
				NegativeFeedback negativeFeedback = (NegativeFeedback)theEObject;
				T result = caseNegativeFeedback(negativeFeedback);
				if (result == null) result = caseFeedback(negativeFeedback);
				if (result == null) result = caseEmotionsNode(negativeFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.NORMAL_LINK: {
				NormalLink normalLink = (NormalLink)theEObject;
				T result = caseNormalLink(normalLink);
				if (result == null) result = caseLink(normalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.RED_LINK: {
				RedLink redLink = (RedLink)theEObject;
				T result = caseRedLink(redLink);
				if (result == null) result = caseLink(redLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TeawPackage.GREEN_LINK: {
				GreenLink greenLink = (GreenLink)theEObject;
				T result = caseGreenLink(greenLink);
				if (result == null) result = caseLink(greenLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEAW Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEAW Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEAWDiagram(TEAWDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotions Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotions Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotionsNode(EmotionsNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotions(Emotions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanningNode(PlanningNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanning(Planning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicto(Picto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transiction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transiction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransiction(Transiction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaitTime(WaitTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrize(Prize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Story</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Story</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialStory(SocialStory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soothing Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soothing Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoothingObject(SoothingObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reamining Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reamining Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaminingObject(ReaminingObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotion Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotion Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotionChoice(EmotionChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotion(Emotion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveFeedback(PositiveFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeFeedback(NegativeFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationBook(CommunicationBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emotions Picto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emotions Picto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmotionsPicto(EmotionsPicto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedback(Feedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalLink(NormalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Red Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Red Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedLink(RedLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Green Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Green Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreenLink(GreenLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TeawSwitch
