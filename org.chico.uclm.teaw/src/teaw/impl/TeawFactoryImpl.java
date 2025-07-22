/**
 */
package teaw.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import teaw.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeawFactoryImpl extends EFactoryImpl implements TeawFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TeawFactory init() {
		try {
			TeawFactory theTeawFactory = (TeawFactory)EPackage.Registry.INSTANCE.getEFactory(TeawPackage.eNS_URI);
			if (theTeawFactory != null) {
				return theTeawFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TeawFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeawFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TeawPackage.TEAW_DIAGRAM: return createTEAWDiagram();
			case TeawPackage.EMOTIONS: return createEmotions();
			case TeawPackage.PLANNING: return createPlanning();
			case TeawPackage.PICTO: return createPicto();
			case TeawPackage.PERSON: return createPerson();
			case TeawPackage.ACTION: return createAction();
			case TeawPackage.PLACE: return createPlace();
			case TeawPackage.TRANSICTION: return createTransiction();
			case TeawPackage.WAIT_TIME: return createWaitTime();
			case TeawPackage.PRIZE: return createPrize();
			case TeawPackage.SOCIAL_STORY: return createSocialStory();
			case TeawPackage.SOOTHING_OBJECT: return createSoothingObject();
			case TeawPackage.REAMINING_OBJECT: return createReaminingObject();
			case TeawPackage.COMMUNICATION_BOOK: return createCommunicationBook();
			case TeawPackage.EMOTION_CHOICE: return createEmotionChoice();
			case TeawPackage.EMOTION: return createEmotion();
			case TeawPackage.POSITIVE_FEEDBACK: return createPositiveFeedback();
			case TeawPackage.NEGATIVE_FEEDBACK: return createNegativeFeedback();
			case TeawPackage.NORMAL_LINK: return createNormalLink();
			case TeawPackage.RED_LINK: return createRedLink();
			case TeawPackage.GREEN_LINK: return createGreenLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TeawPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TeawPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEAWDiagram createTEAWDiagram() {
		TEAWDiagramImpl teawDiagram = new TEAWDiagramImpl();
		return teawDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emotions createEmotions() {
		EmotionsImpl emotions = new EmotionsImpl();
		return emotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planning createPlanning() {
		PlanningImpl planning = new PlanningImpl();
		return planning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Picto createPicto() {
		PictoImpl picto = new PictoImpl();
		return picto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transiction createTransiction() {
		TransictionImpl transiction = new TransictionImpl();
		return transiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaitTime createWaitTime() {
		WaitTimeImpl waitTime = new WaitTimeImpl();
		return waitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prize createPrize() {
		PrizeImpl prize = new PrizeImpl();
		return prize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialStory createSocialStory() {
		SocialStoryImpl socialStory = new SocialStoryImpl();
		return socialStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoothingObject createSoothingObject() {
		SoothingObjectImpl soothingObject = new SoothingObjectImpl();
		return soothingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReaminingObject createReaminingObject() {
		ReaminingObjectImpl reaminingObject = new ReaminingObjectImpl();
		return reaminingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmotionChoice createEmotionChoice() {
		EmotionChoiceImpl emotionChoice = new EmotionChoiceImpl();
		return emotionChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Emotion createEmotion() {
		EmotionImpl emotion = new EmotionImpl();
		return emotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveFeedback createPositiveFeedback() {
		PositiveFeedbackImpl positiveFeedback = new PositiveFeedbackImpl();
		return positiveFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegativeFeedback createNegativeFeedback() {
		NegativeFeedbackImpl negativeFeedback = new NegativeFeedbackImpl();
		return negativeFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationBook createCommunicationBook() {
		CommunicationBookImpl communicationBook = new CommunicationBookImpl();
		return communicationBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalLink createNormalLink() {
		NormalLinkImpl normalLink = new NormalLinkImpl();
		return normalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedLink createRedLink() {
		RedLinkImpl redLink = new RedLinkImpl();
		return redLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GreenLink createGreenLink() {
		GreenLinkImpl greenLink = new GreenLinkImpl();
		return greenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeawPackage getTeawPackage() {
		return (TeawPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TeawPackage getPackage() {
		return TeawPackage.eINSTANCE;
	}

} //TeawFactoryImpl
