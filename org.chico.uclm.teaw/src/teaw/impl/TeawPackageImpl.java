/**
 */
package teaw.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import teaw.Action;
import teaw.CommunicationBook;
import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.Emotions;
import teaw.EmotionsNode;
import teaw.EmotionsPicto;
import teaw.Feedback;
import teaw.GreenLink;
import teaw.Link;
import teaw.NegativeFeedback;
import teaw.Node;
import teaw.NormalLink;
import teaw.Order;
import teaw.Person;
import teaw.Picto;
import teaw.Place;
import teaw.Planning;
import teaw.PlanningNode;
import teaw.PositiveFeedback;
import teaw.Prize;
import teaw.ReaminingObject;
import teaw.RedLink;
import teaw.SocialStory;
import teaw.SoothingObject;
import teaw.TEAWDiagram;
import teaw.TeawFactory;
import teaw.TeawPackage;
import teaw.Transiction;
import teaw.WaitTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeawPackageImpl extends EPackageImpl implements TeawPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teawDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionsNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialStoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soothingObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaminingObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emotionsPictoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greenLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see teaw.TeawPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TeawPackageImpl() {
		super(eNS_URI, TeawFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TeawPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TeawPackage init() {
		if (isInited) return (TeawPackage)EPackage.Registry.INSTANCE.getEPackage(TeawPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTeawPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TeawPackageImpl theTeawPackage = registeredTeawPackage instanceof TeawPackageImpl ? (TeawPackageImpl)registeredTeawPackage : new TeawPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTeawPackage.createPackageContents();

		// Initialize created meta-data
		theTeawPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTeawPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TeawPackage.eNS_URI, theTeawPackage);
		return theTeawPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEAWDiagram() {
		return teawDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEAWDiagram_ItsNodes() {
		return (EReference)teawDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotionsNode() {
		return emotionsNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotions() {
		return emotionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotions_Name() {
		return (EAttribute)emotionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotions_Emotions() {
		return (EReference)emotionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotions_RedLinks() {
		return (EReference)emotionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmotions_GreenLink() {
		return (EReference)emotionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanningNode() {
		return planningNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanningNode_Description() {
		return (EAttribute)planningNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanningNode_ImagePath() {
		return (EAttribute)planningNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanningNode_Order() {
		return (EAttribute)planningNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanningNode_Size() {
		return (EAttribute)planningNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanning() {
		return planningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlanning_Name() {
		return (EAttribute)planningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanning_PlanningNodes() {
		return (EReference)planningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanning_NormalLinks() {
		return (EReference)planningEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPicto() {
		return pictoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransiction() {
		return transictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWaitTime() {
		return waitTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrize() {
		return prizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialStory() {
		return socialStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoothingObject() {
		return soothingObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReaminingObject() {
		return reaminingObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotionChoice() {
		return emotionChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotion() {
		return emotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveFeedback() {
		return positiveFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeFeedback() {
		return negativeFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationBook() {
		return communicationBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmotionsPicto() {
		return emotionsPictoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionsPicto_Description() {
		return (EAttribute)emotionsPictoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionsPicto_ImagePath() {
		return (EAttribute)emotionsPictoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmotionsPicto_Size() {
		return (EAttribute)emotionsPictoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedback() {
		return feedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalLink() {
		return normalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalLink_Origin() {
		return (EReference)normalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalLink_Target() {
		return (EReference)normalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedLink() {
		return redLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedLink_Origin() {
		return (EReference)redLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedLink_Target() {
		return (EReference)redLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedLink_NpFeedback() {
		return (EReference)redLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGreenLink() {
		return greenLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGreenLink_Origin() {
		return (EReference)greenLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGreenLink_Target() {
		return (EReference)greenLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGreenLink_NpFeedback() {
		return (EReference)greenLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeawFactory getTeawFactory() {
		return (TeawFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		teawDiagramEClass = createEClass(TEAW_DIAGRAM);
		createEReference(teawDiagramEClass, TEAW_DIAGRAM__ITS_NODES);

		nodeEClass = createEClass(NODE);

		planningNodeEClass = createEClass(PLANNING_NODE);
		createEAttribute(planningNodeEClass, PLANNING_NODE__DESCRIPTION);
		createEAttribute(planningNodeEClass, PLANNING_NODE__IMAGE_PATH);
		createEAttribute(planningNodeEClass, PLANNING_NODE__ORDER);
		createEAttribute(planningNodeEClass, PLANNING_NODE__SIZE);

		emotionsNodeEClass = createEClass(EMOTIONS_NODE);

		emotionsEClass = createEClass(EMOTIONS);
		createEAttribute(emotionsEClass, EMOTIONS__NAME);
		createEReference(emotionsEClass, EMOTIONS__EMOTIONS);
		createEReference(emotionsEClass, EMOTIONS__RED_LINKS);
		createEReference(emotionsEClass, EMOTIONS__GREEN_LINK);

		planningEClass = createEClass(PLANNING);
		createEAttribute(planningEClass, PLANNING__NAME);
		createEReference(planningEClass, PLANNING__PLANNING_NODES);
		createEReference(planningEClass, PLANNING__NORMAL_LINKS);

		pictoEClass = createEClass(PICTO);

		personEClass = createEClass(PERSON);

		actionEClass = createEClass(ACTION);

		placeEClass = createEClass(PLACE);

		transictionEClass = createEClass(TRANSICTION);

		waitTimeEClass = createEClass(WAIT_TIME);

		prizeEClass = createEClass(PRIZE);

		socialStoryEClass = createEClass(SOCIAL_STORY);

		soothingObjectEClass = createEClass(SOOTHING_OBJECT);

		reaminingObjectEClass = createEClass(REAMINING_OBJECT);

		communicationBookEClass = createEClass(COMMUNICATION_BOOK);

		emotionsPictoEClass = createEClass(EMOTIONS_PICTO);
		createEAttribute(emotionsPictoEClass, EMOTIONS_PICTO__DESCRIPTION);
		createEAttribute(emotionsPictoEClass, EMOTIONS_PICTO__IMAGE_PATH);
		createEAttribute(emotionsPictoEClass, EMOTIONS_PICTO__SIZE);

		feedbackEClass = createEClass(FEEDBACK);

		emotionChoiceEClass = createEClass(EMOTION_CHOICE);

		emotionEClass = createEClass(EMOTION);

		positiveFeedbackEClass = createEClass(POSITIVE_FEEDBACK);

		negativeFeedbackEClass = createEClass(NEGATIVE_FEEDBACK);

		linkEClass = createEClass(LINK);

		normalLinkEClass = createEClass(NORMAL_LINK);
		createEReference(normalLinkEClass, NORMAL_LINK__ORIGIN);
		createEReference(normalLinkEClass, NORMAL_LINK__TARGET);

		redLinkEClass = createEClass(RED_LINK);
		createEReference(redLinkEClass, RED_LINK__ORIGIN);
		createEReference(redLinkEClass, RED_LINK__TARGET);
		createEReference(redLinkEClass, RED_LINK__NP_FEEDBACK);

		greenLinkEClass = createEClass(GREEN_LINK);
		createEReference(greenLinkEClass, GREEN_LINK__ORIGIN);
		createEReference(greenLinkEClass, GREEN_LINK__TARGET);
		createEReference(greenLinkEClass, GREEN_LINK__NP_FEEDBACK);

		// Create enums
		orderEEnum = createEEnum(ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emotionsEClass.getESuperTypes().add(this.getNode());
		planningEClass.getESuperTypes().add(this.getNode());
		pictoEClass.getESuperTypes().add(this.getPlanningNode());
		personEClass.getESuperTypes().add(this.getPicto());
		actionEClass.getESuperTypes().add(this.getPicto());
		placeEClass.getESuperTypes().add(this.getPicto());
		transictionEClass.getESuperTypes().add(this.getPlanningNode());
		waitTimeEClass.getESuperTypes().add(this.getTransiction());
		prizeEClass.getESuperTypes().add(this.getTransiction());
		socialStoryEClass.getESuperTypes().add(this.getTransiction());
		soothingObjectEClass.getESuperTypes().add(this.getTransiction());
		reaminingObjectEClass.getESuperTypes().add(this.getTransiction());
		communicationBookEClass.getESuperTypes().add(this.getPlanningNode());
		emotionsPictoEClass.getESuperTypes().add(this.getEmotionsNode());
		feedbackEClass.getESuperTypes().add(this.getEmotionsNode());
		emotionChoiceEClass.getESuperTypes().add(this.getEmotionsPicto());
		emotionEClass.getESuperTypes().add(this.getEmotionsPicto());
		positiveFeedbackEClass.getESuperTypes().add(this.getFeedback());
		negativeFeedbackEClass.getESuperTypes().add(this.getFeedback());
		normalLinkEClass.getESuperTypes().add(this.getLink());
		redLinkEClass.getESuperTypes().add(this.getLink());
		greenLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(teawDiagramEClass, TEAWDiagram.class, "TEAWDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEAWDiagram_ItsNodes(), this.getNode(), null, "itsNodes", null, 0, -1, TEAWDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planningNodeEClass, PlanningNode.class, "PlanningNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanningNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, PlanningNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningNode_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, PlanningNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningNode_Order(), this.getOrder(), "order", null, 0, 1, PlanningNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningNode_Size(), ecorePackage.getEIntegerObject(), "size", null, 0, 1, PlanningNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emotionsNodeEClass, EmotionsNode.class, "EmotionsNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emotionsEClass, Emotions.class, "Emotions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotions_Name(), ecorePackage.getEString(), "name", "<Emotions ...>", 0, 1, Emotions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmotions_Emotions(), this.getEmotionsNode(), null, "emotions", null, 0, -1, Emotions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmotions_RedLinks(), this.getRedLink(), null, "redLinks", null, 0, -1, Emotions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmotions_GreenLink(), this.getGreenLink(), null, "greenLink", null, 1, 1, Emotions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planningEClass, Planning.class, "Planning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanning_Name(), ecorePackage.getEString(), "name", "<Planning ...>", 0, 1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanning_PlanningNodes(), this.getPlanningNode(), null, "planningNodes", null, 0, -1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanning_NormalLinks(), this.getNormalLink(), null, "normalLinks", null, 0, -1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pictoEClass, Picto.class, "Picto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transictionEClass, Transiction.class, "Transiction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waitTimeEClass, WaitTime.class, "WaitTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prizeEClass, Prize.class, "Prize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(socialStoryEClass, SocialStory.class, "SocialStory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soothingObjectEClass, SoothingObject.class, "SoothingObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reaminingObjectEClass, ReaminingObject.class, "ReaminingObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationBookEClass, CommunicationBook.class, "CommunicationBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emotionsPictoEClass, EmotionsPicto.class, "EmotionsPicto", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmotionsPicto_Description(), ecorePackage.getEString(), "description", null, 0, 1, EmotionsPicto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmotionsPicto_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, EmotionsPicto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmotionsPicto_Size(), ecorePackage.getEIntegerObject(), "size", null, 0, 1, EmotionsPicto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emotionChoiceEClass, EmotionChoice.class, "EmotionChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emotionEClass, Emotion.class, "Emotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveFeedbackEClass, PositiveFeedback.class, "PositiveFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeFeedbackEClass, NegativeFeedback.class, "NegativeFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalLinkEClass, NormalLink.class, "NormalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalLink_Origin(), this.getPicto(), null, "origin", null, 1, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalLink_Target(), this.getPicto(), null, "target", null, 1, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redLinkEClass, RedLink.class, "RedLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedLink_Origin(), this.getEmotionChoice(), null, "origin", null, 1, 1, RedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedLink_Target(), this.getEmotion(), null, "target", null, 1, 1, RedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedLink_NpFeedback(), this.getFeedback(), null, "npFeedback", null, 1, 1, RedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greenLinkEClass, GreenLink.class, "GreenLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreenLink_Origin(), this.getEmotionChoice(), null, "origin", null, 1, 1, GreenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreenLink_Target(), this.getEmotion(), null, "target", null, 1, 1, GreenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreenLink_NpFeedback(), this.getFeedback(), null, "npFeedback", null, 1, 1, GreenLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.NONE);
		addEEnumLiteral(orderEEnum, Order.FIRST);
		addEEnumLiteral(orderEEnum, Order.SECOND);
		addEEnumLiteral(orderEEnum, Order.THIRD);
		addEEnumLiteral(orderEEnum, Order.FOURTH);
		addEEnumLiteral(orderEEnum, Order.FIFTH);
		addEEnumLiteral(orderEEnum, Order.SIXTH);
		addEEnumLiteral(orderEEnum, Order.SEVENTH);
		addEEnumLiteral(orderEEnum, Order.EIGHTH);
		addEEnumLiteral(orderEEnum, Order.NINTH);
		addEEnumLiteral(orderEEnum, Order.TENTH);
		addEEnumLiteral(orderEEnum, Order.ELEVENTH);
		addEEnumLiteral(orderEEnum, Order.TWELFTH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (teawDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (emotionsEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Emotions",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.small.path", "images/emotions_arasaac32.png"
		   });
		addAnnotation
		  (planningEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Planning",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.small.path", "images/planning_arasaac32.png"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.PersonFigure",
			   "tool.name", "Person",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/person_arasaac128.png",
			   "tool.small.path", "images/person_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "128,128"
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.ActionFigure",
			   "tool.name", "Action",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/action_arasaac128.png",
			   "tool.small.path", "images/action_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "true",
			   "size", "128,128"
		   });
		addAnnotation
		  (placeEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.PlaceFigure",
			   "tool.name", "Place",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/place_arasaac128.png",
			   "tool.small.path", "images/place_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "128,128"
		   });
		addAnnotation
		  (waitTimeEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.TimeFigure",
			   "tool.name", "Time management",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/time_arasaac64.png",
			   "tool.small.path", "images/time_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (prizeEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.PrizeFigure",
			   "tool.name", "Award",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/prize_arasaac64.png",
			   "tool.small.path", "images/prize_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (socialStoryEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.StoryFigure",
			   "tool.name", "Social story",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/story_arasaac64.png",
			   "tool.small.path", "images/story_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (soothingObjectEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.ObjectFigure",
			   "tool.name", "Entertainment/Calming activity",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/object_arasaac64.png",
			   "tool.small.path", "images/object_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (reaminingObjectEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.RemainingFigure",
			   "tool.name", "Remaining time",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/remaining_arasaac64.png",
			   "tool.small.path", "images/remaining_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (communicationBookEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.NotebookFigure",
			   "tool.name", "AAC Notebook",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/notebook_arasaac64.png",
			   "tool.small.path", "images/notebook_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (emotionChoiceEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.EmotionChoiceFigure",
			   "tool.name", "Target emotion",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/emochoice_arasaac128.png",
			   "tool.small.path", "images/emochoice_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "128,128"
		   });
		addAnnotation
		  (emotionEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.EmotionFigure",
			   "tool.name", "Response option",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/emotion_arasaac128.png",
			   "tool.small.path", "images/emotion_arasaac32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "128,128"
		   });
		addAnnotation
		  (positiveFeedbackEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.PosFeedbackFigure",
			   "tool.name", "Positive feedback",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/positiveFeedback64.png",
			   "tool.small.path", "images/positiveFeedback32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
		addAnnotation
		  (negativeFeedbackEClass,
		   source,
		   new String[] {
			   "figure", "org.chico.uclm.teaw.figures.NegFeedbackFigure",
			   "tool.name", "Negative feedback",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.large.path", "images/negativeFeedback64.png",
			   "tool.small.path", "images/negativeFeedback32.png",
			   "label.placement", "none",
			   "resizable", "false",
			   "size", "64,64"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getEmotions_Emotions(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getPlanning_PlanningNodes(),
		   source,
		   new String[] {
			   "layout", "free",
			   "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (normalLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Sequence/order",
			   "style", "solid",
			   "width", "3",
			   "color", "82,82,82",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.small.path", "images/link32.png",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd",
			   "target.decoration", "filledclosedarrow"
		   });
		addAnnotation
		  (redLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Incorrect solution",
			   "style", "solid",
			   "width", "2",
			   "color", "233,34,43",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.small.path", "images/wrong32.png",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (greenLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Correct solution",
			   "style", "solid",
			   "width", "2",
			   "color", "0,217,60",
			   "tool.small.bundle", "org.chico.uclm.teaw.figures",
			   "tool.small.path", "images/ok32.png",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
	}

} //TeawPackageImpl
