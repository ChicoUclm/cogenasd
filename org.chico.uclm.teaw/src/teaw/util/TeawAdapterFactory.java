/**
 */
package teaw.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import teaw.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see teaw.TeawPackage
 * @generated
 */
public class TeawAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TeawPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeawAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TeawPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeawSwitch<Adapter> modelSwitch =
		new TeawSwitch<Adapter>() {
			@Override
			public Adapter caseTEAWDiagram(TEAWDiagram object) {
				return createTEAWDiagramAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter casePlanningNode(PlanningNode object) {
				return createPlanningNodeAdapter();
			}
			@Override
			public Adapter caseEmotionsNode(EmotionsNode object) {
				return createEmotionsNodeAdapter();
			}
			@Override
			public Adapter caseEmotions(Emotions object) {
				return createEmotionsAdapter();
			}
			@Override
			public Adapter casePlanning(Planning object) {
				return createPlanningAdapter();
			}
			@Override
			public Adapter casePicto(Picto object) {
				return createPictoAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter casePlace(Place object) {
				return createPlaceAdapter();
			}
			@Override
			public Adapter caseTransiction(Transiction object) {
				return createTransictionAdapter();
			}
			@Override
			public Adapter caseWaitTime(WaitTime object) {
				return createWaitTimeAdapter();
			}
			@Override
			public Adapter casePrize(Prize object) {
				return createPrizeAdapter();
			}
			@Override
			public Adapter caseSocialStory(SocialStory object) {
				return createSocialStoryAdapter();
			}
			@Override
			public Adapter caseSoothingObject(SoothingObject object) {
				return createSoothingObjectAdapter();
			}
			@Override
			public Adapter caseReaminingObject(ReaminingObject object) {
				return createReaminingObjectAdapter();
			}
			@Override
			public Adapter caseCommunicationBook(CommunicationBook object) {
				return createCommunicationBookAdapter();
			}
			@Override
			public Adapter caseEmotionsPicto(EmotionsPicto object) {
				return createEmotionsPictoAdapter();
			}
			@Override
			public Adapter caseFeedback(Feedback object) {
				return createFeedbackAdapter();
			}
			@Override
			public Adapter caseEmotionChoice(EmotionChoice object) {
				return createEmotionChoiceAdapter();
			}
			@Override
			public Adapter caseEmotion(Emotion object) {
				return createEmotionAdapter();
			}
			@Override
			public Adapter casePositiveFeedback(PositiveFeedback object) {
				return createPositiveFeedbackAdapter();
			}
			@Override
			public Adapter caseNegativeFeedback(NegativeFeedback object) {
				return createNegativeFeedbackAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseNormalLink(NormalLink object) {
				return createNormalLinkAdapter();
			}
			@Override
			public Adapter caseRedLink(RedLink object) {
				return createRedLinkAdapter();
			}
			@Override
			public Adapter caseGreenLink(GreenLink object) {
				return createGreenLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link teaw.TEAWDiagram <em>TEAW Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.TEAWDiagram
	 * @generated
	 */
	public Adapter createTEAWDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.EmotionsNode <em>Emotions Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.EmotionsNode
	 * @generated
	 */
	public Adapter createEmotionsNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Emotions <em>Emotions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Emotions
	 * @generated
	 */
	public Adapter createEmotionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.PlanningNode <em>Planning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.PlanningNode
	 * @generated
	 */
	public Adapter createPlanningNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Planning <em>Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Planning
	 * @generated
	 */
	public Adapter createPlanningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Picto <em>Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Picto
	 * @generated
	 */
	public Adapter createPictoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Place
	 * @generated
	 */
	public Adapter createPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Transiction <em>Transiction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Transiction
	 * @generated
	 */
	public Adapter createTransictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.WaitTime <em>Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.WaitTime
	 * @generated
	 */
	public Adapter createWaitTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Prize <em>Prize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Prize
	 * @generated
	 */
	public Adapter createPrizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.SocialStory <em>Social Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.SocialStory
	 * @generated
	 */
	public Adapter createSocialStoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.SoothingObject <em>Soothing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.SoothingObject
	 * @generated
	 */
	public Adapter createSoothingObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.ReaminingObject <em>Reamining Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.ReaminingObject
	 * @generated
	 */
	public Adapter createReaminingObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.EmotionChoice <em>Emotion Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.EmotionChoice
	 * @generated
	 */
	public Adapter createEmotionChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Emotion <em>Emotion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Emotion
	 * @generated
	 */
	public Adapter createEmotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.PositiveFeedback <em>Positive Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.PositiveFeedback
	 * @generated
	 */
	public Adapter createPositiveFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.NegativeFeedback <em>Negative Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.NegativeFeedback
	 * @generated
	 */
	public Adapter createNegativeFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.CommunicationBook <em>Communication Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.CommunicationBook
	 * @generated
	 */
	public Adapter createCommunicationBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.EmotionsPicto <em>Emotions Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.EmotionsPicto
	 * @generated
	 */
	public Adapter createEmotionsPictoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Feedback
	 * @generated
	 */
	public Adapter createFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.NormalLink <em>Normal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.NormalLink
	 * @generated
	 */
	public Adapter createNormalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.RedLink <em>Red Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.RedLink
	 * @generated
	 */
	public Adapter createRedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link teaw.GreenLink <em>Green Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see teaw.GreenLink
	 * @generated
	 */
	public Adapter createGreenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TeawAdapterFactory
