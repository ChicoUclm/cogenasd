/**
 */
package teaw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see teaw.TeawFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface TeawPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "teaw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "teaw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "teaw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TeawPackage eINSTANCE = teaw.impl.TeawPackageImpl.init();

	/**
	 * The meta object id for the '{@link teaw.impl.TEAWDiagramImpl <em>TEAW Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.TEAWDiagramImpl
	 * @see teaw.impl.TeawPackageImpl#getTEAWDiagram()
	 * @generated
	 */
	int TEAW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Its Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAW_DIAGRAM__ITS_NODES = 0;

	/**
	 * The number of structural features of the '<em>TEAW Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAW_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link teaw.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.NodeImpl
	 * @see teaw.impl.TeawPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link teaw.impl.EmotionsNodeImpl <em>Emotions Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.EmotionsNodeImpl
	 * @see teaw.impl.TeawPackageImpl#getEmotionsNode()
	 * @generated
	 */
	int EMOTIONS_NODE = 3;

	/**
	 * The meta object id for the '{@link teaw.impl.EmotionsImpl <em>Emotions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.EmotionsImpl
	 * @see teaw.impl.TeawPackageImpl#getEmotions()
	 * @generated
	 */
	int EMOTIONS = 4;

	/**
	 * The meta object id for the '{@link teaw.impl.PlanningNodeImpl <em>Planning Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PlanningNodeImpl
	 * @see teaw.impl.TeawPackageImpl#getPlanningNode()
	 * @generated
	 */
	int PLANNING_NODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_NODE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_NODE__IMAGE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_NODE__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_NODE__SIZE = 3;

	/**
	 * The number of structural features of the '<em>Planning Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Emotions Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_NODE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emotions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS__EMOTIONS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Red Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS__RED_LINKS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Green Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS__GREEN_LINK = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Emotions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link teaw.impl.PlanningImpl <em>Planning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PlanningImpl
	 * @see teaw.impl.TeawPackageImpl#getPlanning()
	 * @generated
	 */
	int PLANNING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Planning Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__PLANNING_NODES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Normal Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__NORMAL_LINKS = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link teaw.impl.PictoImpl <em>Picto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PictoImpl
	 * @see teaw.impl.TeawPackageImpl#getPicto()
	 * @generated
	 */
	int PICTO = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTO__DESCRIPTION = PLANNING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTO__IMAGE_PATH = PLANNING_NODE__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTO__ORDER = PLANNING_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTO__SIZE = PLANNING_NODE__SIZE;

	/**
	 * The number of structural features of the '<em>Picto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTO_FEATURE_COUNT = PLANNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PersonImpl
	 * @see teaw.impl.TeawPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = PICTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMAGE_PATH = PICTO__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORDER = PICTO__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SIZE = PICTO__SIZE;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PICTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.ActionImpl
	 * @see teaw.impl.TeawPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = PICTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IMAGE_PATH = PICTO__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ORDER = PICTO__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SIZE = PICTO__SIZE;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PICTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PlaceImpl
	 * @see teaw.impl.TeawPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__DESCRIPTION = PICTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IMAGE_PATH = PICTO__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ORDER = PICTO__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SIZE = PICTO__SIZE;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PICTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.TransictionImpl <em>Transiction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.TransictionImpl
	 * @see teaw.impl.TeawPackageImpl#getTransiction()
	 * @generated
	 */
	int TRANSICTION = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICTION__DESCRIPTION = PLANNING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICTION__IMAGE_PATH = PLANNING_NODE__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICTION__ORDER = PLANNING_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICTION__SIZE = PLANNING_NODE__SIZE;

	/**
	 * The number of structural features of the '<em>Transiction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICTION_FEATURE_COUNT = PLANNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.WaitTimeImpl <em>Wait Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.WaitTimeImpl
	 * @see teaw.impl.TeawPackageImpl#getWaitTime()
	 * @generated
	 */
	int WAIT_TIME = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TIME__DESCRIPTION = TRANSICTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TIME__IMAGE_PATH = TRANSICTION__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TIME__ORDER = TRANSICTION__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TIME__SIZE = TRANSICTION__SIZE;

	/**
	 * The number of structural features of the '<em>Wait Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TIME_FEATURE_COUNT = TRANSICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.PrizeImpl <em>Prize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PrizeImpl
	 * @see teaw.impl.TeawPackageImpl#getPrize()
	 * @generated
	 */
	int PRIZE = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIZE__DESCRIPTION = TRANSICTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIZE__IMAGE_PATH = TRANSICTION__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIZE__ORDER = TRANSICTION__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIZE__SIZE = TRANSICTION__SIZE;

	/**
	 * The number of structural features of the '<em>Prize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIZE_FEATURE_COUNT = TRANSICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.SocialStoryImpl <em>Social Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.SocialStoryImpl
	 * @see teaw.impl.TeawPackageImpl#getSocialStory()
	 * @generated
	 */
	int SOCIAL_STORY = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_STORY__DESCRIPTION = TRANSICTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_STORY__IMAGE_PATH = TRANSICTION__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_STORY__ORDER = TRANSICTION__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_STORY__SIZE = TRANSICTION__SIZE;

	/**
	 * The number of structural features of the '<em>Social Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_STORY_FEATURE_COUNT = TRANSICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.SoothingObjectImpl <em>Soothing Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.SoothingObjectImpl
	 * @see teaw.impl.TeawPackageImpl#getSoothingObject()
	 * @generated
	 */
	int SOOTHING_OBJECT = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOOTHING_OBJECT__DESCRIPTION = TRANSICTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOOTHING_OBJECT__IMAGE_PATH = TRANSICTION__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOOTHING_OBJECT__ORDER = TRANSICTION__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOOTHING_OBJECT__SIZE = TRANSICTION__SIZE;

	/**
	 * The number of structural features of the '<em>Soothing Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOOTHING_OBJECT_FEATURE_COUNT = TRANSICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.ReaminingObjectImpl <em>Reamining Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.ReaminingObjectImpl
	 * @see teaw.impl.TeawPackageImpl#getReaminingObject()
	 * @generated
	 */
	int REAMINING_OBJECT = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAMINING_OBJECT__DESCRIPTION = TRANSICTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAMINING_OBJECT__IMAGE_PATH = TRANSICTION__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAMINING_OBJECT__ORDER = TRANSICTION__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAMINING_OBJECT__SIZE = TRANSICTION__SIZE;

	/**
	 * The number of structural features of the '<em>Reamining Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAMINING_OBJECT_FEATURE_COUNT = TRANSICTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.EmotionChoiceImpl <em>Emotion Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.EmotionChoiceImpl
	 * @see teaw.impl.TeawPackageImpl#getEmotionChoice()
	 * @generated
	 */
	int EMOTION_CHOICE = 19;

	/**
	 * The meta object id for the '{@link teaw.impl.EmotionImpl <em>Emotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.EmotionImpl
	 * @see teaw.impl.TeawPackageImpl#getEmotion()
	 * @generated
	 */
	int EMOTION = 20;

	/**
	 * The meta object id for the '{@link teaw.impl.PositiveFeedbackImpl <em>Positive Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.PositiveFeedbackImpl
	 * @see teaw.impl.TeawPackageImpl#getPositiveFeedback()
	 * @generated
	 */
	int POSITIVE_FEEDBACK = 21;

	/**
	 * The meta object id for the '{@link teaw.impl.NegativeFeedbackImpl <em>Negative Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.NegativeFeedbackImpl
	 * @see teaw.impl.TeawPackageImpl#getNegativeFeedback()
	 * @generated
	 */
	int NEGATIVE_FEEDBACK = 22;

	/**
	 * The meta object id for the '{@link teaw.impl.CommunicationBookImpl <em>Communication Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.CommunicationBookImpl
	 * @see teaw.impl.TeawPackageImpl#getCommunicationBook()
	 * @generated
	 */
	int COMMUNICATION_BOOK = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BOOK__DESCRIPTION = PLANNING_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BOOK__IMAGE_PATH = PLANNING_NODE__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BOOK__ORDER = PLANNING_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BOOK__SIZE = PLANNING_NODE__SIZE;

	/**
	 * The number of structural features of the '<em>Communication Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_BOOK_FEATURE_COUNT = PLANNING_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.EmotionsPictoImpl <em>Emotions Picto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.EmotionsPictoImpl
	 * @see teaw.impl.TeawPackageImpl#getEmotionsPicto()
	 * @generated
	 */
	int EMOTIONS_PICTO = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_PICTO__DESCRIPTION = EMOTIONS_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_PICTO__IMAGE_PATH = EMOTIONS_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_PICTO__SIZE = EMOTIONS_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emotions Picto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTIONS_PICTO_FEATURE_COUNT = EMOTIONS_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link teaw.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.FeedbackImpl
	 * @see teaw.impl.TeawPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 18;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = EMOTIONS_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_CHOICE__DESCRIPTION = EMOTIONS_PICTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_CHOICE__IMAGE_PATH = EMOTIONS_PICTO__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_CHOICE__SIZE = EMOTIONS_PICTO__SIZE;

	/**
	 * The number of structural features of the '<em>Emotion Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_CHOICE_FEATURE_COUNT = EMOTIONS_PICTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__DESCRIPTION = EMOTIONS_PICTO__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__IMAGE_PATH = EMOTIONS_PICTO__IMAGE_PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION__SIZE = EMOTIONS_PICTO__SIZE;

	/**
	 * The number of structural features of the '<em>Emotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMOTION_FEATURE_COUNT = EMOTIONS_PICTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Positive Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negative Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_FEEDBACK_FEATURE_COUNT = FEEDBACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link teaw.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.LinkImpl
	 * @see teaw.impl.TeawPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 23;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link teaw.impl.NormalLinkImpl <em>Normal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.NormalLinkImpl
	 * @see teaw.impl.TeawPackageImpl#getNormalLink()
	 * @generated
	 */
	int NORMAL_LINK = 24;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link teaw.impl.RedLinkImpl <em>Red Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.RedLinkImpl
	 * @see teaw.impl.TeawPackageImpl#getRedLink()
	 * @generated
	 */
	int RED_LINK = 25;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Np Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINK__NP_FEEDBACK = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Red Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link teaw.impl.GreenLinkImpl <em>Green Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.impl.GreenLinkImpl
	 * @see teaw.impl.TeawPackageImpl#getGreenLink()
	 * @generated
	 */
	int GREEN_LINK = 26;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Np Feedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_LINK__NP_FEEDBACK = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Green Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link teaw.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see teaw.Order
	 * @see teaw.impl.TeawPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 27;


	/**
	 * Returns the meta object for class '{@link teaw.TEAWDiagram <em>TEAW Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEAW Diagram</em>'.
	 * @see teaw.TEAWDiagram
	 * @generated
	 */
	EClass getTEAWDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link teaw.TEAWDiagram#getItsNodes <em>Its Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Nodes</em>'.
	 * @see teaw.TEAWDiagram#getItsNodes()
	 * @see #getTEAWDiagram()
	 * @generated
	 */
	EReference getTEAWDiagram_ItsNodes();

	/**
	 * Returns the meta object for class '{@link teaw.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see teaw.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link teaw.EmotionsNode <em>Emotions Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotions Node</em>'.
	 * @see teaw.EmotionsNode
	 * @generated
	 */
	EClass getEmotionsNode();

	/**
	 * Returns the meta object for class '{@link teaw.Emotions <em>Emotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotions</em>'.
	 * @see teaw.Emotions
	 * @generated
	 */
	EClass getEmotions();

	/**
	 * Returns the meta object for the attribute '{@link teaw.Emotions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see teaw.Emotions#getName()
	 * @see #getEmotions()
	 * @generated
	 */
	EAttribute getEmotions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link teaw.Emotions#getEmotions <em>Emotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emotions</em>'.
	 * @see teaw.Emotions#getEmotions()
	 * @see #getEmotions()
	 * @generated
	 */
	EReference getEmotions_Emotions();

	/**
	 * Returns the meta object for the containment reference list '{@link teaw.Emotions#getRedLinks <em>Red Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Red Links</em>'.
	 * @see teaw.Emotions#getRedLinks()
	 * @see #getEmotions()
	 * @generated
	 */
	EReference getEmotions_RedLinks();

	/**
	 * Returns the meta object for the containment reference '{@link teaw.Emotions#getGreenLink <em>Green Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Green Link</em>'.
	 * @see teaw.Emotions#getGreenLink()
	 * @see #getEmotions()
	 * @generated
	 */
	EReference getEmotions_GreenLink();

	/**
	 * Returns the meta object for class '{@link teaw.PlanningNode <em>Planning Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning Node</em>'.
	 * @see teaw.PlanningNode
	 * @generated
	 */
	EClass getPlanningNode();

	/**
	 * Returns the meta object for the attribute '{@link teaw.PlanningNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see teaw.PlanningNode#getDescription()
	 * @see #getPlanningNode()
	 * @generated
	 */
	EAttribute getPlanningNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link teaw.PlanningNode#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see teaw.PlanningNode#getImagePath()
	 * @see #getPlanningNode()
	 * @generated
	 */
	EAttribute getPlanningNode_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link teaw.PlanningNode#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see teaw.PlanningNode#getOrder()
	 * @see #getPlanningNode()
	 * @generated
	 */
	EAttribute getPlanningNode_Order();

	/**
	 * Returns the meta object for the attribute '{@link teaw.PlanningNode#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see teaw.PlanningNode#getSize()
	 * @see #getPlanningNode()
	 * @generated
	 */
	EAttribute getPlanningNode_Size();

	/**
	 * Returns the meta object for class '{@link teaw.Planning <em>Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning</em>'.
	 * @see teaw.Planning
	 * @generated
	 */
	EClass getPlanning();

	/**
	 * Returns the meta object for the attribute '{@link teaw.Planning#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see teaw.Planning#getName()
	 * @see #getPlanning()
	 * @generated
	 */
	EAttribute getPlanning_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link teaw.Planning#getPlanningNodes <em>Planning Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planning Nodes</em>'.
	 * @see teaw.Planning#getPlanningNodes()
	 * @see #getPlanning()
	 * @generated
	 */
	EReference getPlanning_PlanningNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link teaw.Planning#getNormalLinks <em>Normal Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Normal Links</em>'.
	 * @see teaw.Planning#getNormalLinks()
	 * @see #getPlanning()
	 * @generated
	 */
	EReference getPlanning_NormalLinks();

	/**
	 * Returns the meta object for class '{@link teaw.Picto <em>Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picto</em>'.
	 * @see teaw.Picto
	 * @generated
	 */
	EClass getPicto();

	/**
	 * Returns the meta object for class '{@link teaw.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see teaw.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link teaw.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see teaw.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link teaw.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see teaw.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for class '{@link teaw.Transiction <em>Transiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transiction</em>'.
	 * @see teaw.Transiction
	 * @generated
	 */
	EClass getTransiction();

	/**
	 * Returns the meta object for class '{@link teaw.WaitTime <em>Wait Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Time</em>'.
	 * @see teaw.WaitTime
	 * @generated
	 */
	EClass getWaitTime();

	/**
	 * Returns the meta object for class '{@link teaw.Prize <em>Prize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prize</em>'.
	 * @see teaw.Prize
	 * @generated
	 */
	EClass getPrize();

	/**
	 * Returns the meta object for class '{@link teaw.SocialStory <em>Social Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Story</em>'.
	 * @see teaw.SocialStory
	 * @generated
	 */
	EClass getSocialStory();

	/**
	 * Returns the meta object for class '{@link teaw.SoothingObject <em>Soothing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soothing Object</em>'.
	 * @see teaw.SoothingObject
	 * @generated
	 */
	EClass getSoothingObject();

	/**
	 * Returns the meta object for class '{@link teaw.ReaminingObject <em>Reamining Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reamining Object</em>'.
	 * @see teaw.ReaminingObject
	 * @generated
	 */
	EClass getReaminingObject();

	/**
	 * Returns the meta object for class '{@link teaw.EmotionChoice <em>Emotion Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion Choice</em>'.
	 * @see teaw.EmotionChoice
	 * @generated
	 */
	EClass getEmotionChoice();

	/**
	 * Returns the meta object for class '{@link teaw.Emotion <em>Emotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotion</em>'.
	 * @see teaw.Emotion
	 * @generated
	 */
	EClass getEmotion();

	/**
	 * Returns the meta object for class '{@link teaw.PositiveFeedback <em>Positive Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Feedback</em>'.
	 * @see teaw.PositiveFeedback
	 * @generated
	 */
	EClass getPositiveFeedback();

	/**
	 * Returns the meta object for class '{@link teaw.NegativeFeedback <em>Negative Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Feedback</em>'.
	 * @see teaw.NegativeFeedback
	 * @generated
	 */
	EClass getNegativeFeedback();

	/**
	 * Returns the meta object for class '{@link teaw.CommunicationBook <em>Communication Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Book</em>'.
	 * @see teaw.CommunicationBook
	 * @generated
	 */
	EClass getCommunicationBook();

	/**
	 * Returns the meta object for class '{@link teaw.EmotionsPicto <em>Emotions Picto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emotions Picto</em>'.
	 * @see teaw.EmotionsPicto
	 * @generated
	 */
	EClass getEmotionsPicto();

	/**
	 * Returns the meta object for the attribute '{@link teaw.EmotionsPicto#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see teaw.EmotionsPicto#getDescription()
	 * @see #getEmotionsPicto()
	 * @generated
	 */
	EAttribute getEmotionsPicto_Description();

	/**
	 * Returns the meta object for the attribute '{@link teaw.EmotionsPicto#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see teaw.EmotionsPicto#getImagePath()
	 * @see #getEmotionsPicto()
	 * @generated
	 */
	EAttribute getEmotionsPicto_ImagePath();

	/**
	 * Returns the meta object for the attribute '{@link teaw.EmotionsPicto#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see teaw.EmotionsPicto#getSize()
	 * @see #getEmotionsPicto()
	 * @generated
	 */
	EAttribute getEmotionsPicto_Size();

	/**
	 * Returns the meta object for class '{@link teaw.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see teaw.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for class '{@link teaw.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see teaw.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link teaw.NormalLink <em>Normal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Link</em>'.
	 * @see teaw.NormalLink
	 * @generated
	 */
	EClass getNormalLink();

	/**
	 * Returns the meta object for the reference '{@link teaw.NormalLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see teaw.NormalLink#getOrigin()
	 * @see #getNormalLink()
	 * @generated
	 */
	EReference getNormalLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link teaw.NormalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see teaw.NormalLink#getTarget()
	 * @see #getNormalLink()
	 * @generated
	 */
	EReference getNormalLink_Target();

	/**
	 * Returns the meta object for class '{@link teaw.RedLink <em>Red Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red Link</em>'.
	 * @see teaw.RedLink
	 * @generated
	 */
	EClass getRedLink();

	/**
	 * Returns the meta object for the reference '{@link teaw.RedLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see teaw.RedLink#getOrigin()
	 * @see #getRedLink()
	 * @generated
	 */
	EReference getRedLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link teaw.RedLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see teaw.RedLink#getTarget()
	 * @see #getRedLink()
	 * @generated
	 */
	EReference getRedLink_Target();

	/**
	 * Returns the meta object for the reference '{@link teaw.RedLink#getNpFeedback <em>Np Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Np Feedback</em>'.
	 * @see teaw.RedLink#getNpFeedback()
	 * @see #getRedLink()
	 * @generated
	 */
	EReference getRedLink_NpFeedback();

	/**
	 * Returns the meta object for class '{@link teaw.GreenLink <em>Green Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Green Link</em>'.
	 * @see teaw.GreenLink
	 * @generated
	 */
	EClass getGreenLink();

	/**
	 * Returns the meta object for the reference '{@link teaw.GreenLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see teaw.GreenLink#getOrigin()
	 * @see #getGreenLink()
	 * @generated
	 */
	EReference getGreenLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link teaw.GreenLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see teaw.GreenLink#getTarget()
	 * @see #getGreenLink()
	 * @generated
	 */
	EReference getGreenLink_Target();

	/**
	 * Returns the meta object for the reference '{@link teaw.GreenLink#getNpFeedback <em>Np Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Np Feedback</em>'.
	 * @see teaw.GreenLink#getNpFeedback()
	 * @see #getGreenLink()
	 * @generated
	 */
	EReference getGreenLink_NpFeedback();

	/**
	 * Returns the meta object for enum '{@link teaw.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see teaw.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TeawFactory getTeawFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link teaw.impl.TEAWDiagramImpl <em>TEAW Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.TEAWDiagramImpl
		 * @see teaw.impl.TeawPackageImpl#getTEAWDiagram()
		 * @generated
		 */
		EClass TEAW_DIAGRAM = eINSTANCE.getTEAWDiagram();

		/**
		 * The meta object literal for the '<em><b>Its Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAW_DIAGRAM__ITS_NODES = eINSTANCE.getTEAWDiagram_ItsNodes();

		/**
		 * The meta object literal for the '{@link teaw.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.NodeImpl
		 * @see teaw.impl.TeawPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link teaw.impl.EmotionsNodeImpl <em>Emotions Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.EmotionsNodeImpl
		 * @see teaw.impl.TeawPackageImpl#getEmotionsNode()
		 * @generated
		 */
		EClass EMOTIONS_NODE = eINSTANCE.getEmotionsNode();

		/**
		 * The meta object literal for the '{@link teaw.impl.EmotionsImpl <em>Emotions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.EmotionsImpl
		 * @see teaw.impl.TeawPackageImpl#getEmotions()
		 * @generated
		 */
		EClass EMOTIONS = eINSTANCE.getEmotions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTIONS__NAME = eINSTANCE.getEmotions_Name();

		/**
		 * The meta object literal for the '<em><b>Emotions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTIONS__EMOTIONS = eINSTANCE.getEmotions_Emotions();

		/**
		 * The meta object literal for the '<em><b>Red Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTIONS__RED_LINKS = eINSTANCE.getEmotions_RedLinks();

		/**
		 * The meta object literal for the '<em><b>Green Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMOTIONS__GREEN_LINK = eINSTANCE.getEmotions_GreenLink();

		/**
		 * The meta object literal for the '{@link teaw.impl.PlanningNodeImpl <em>Planning Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PlanningNodeImpl
		 * @see teaw.impl.TeawPackageImpl#getPlanningNode()
		 * @generated
		 */
		EClass PLANNING_NODE = eINSTANCE.getPlanningNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_NODE__DESCRIPTION = eINSTANCE.getPlanningNode_Description();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_NODE__IMAGE_PATH = eINSTANCE.getPlanningNode_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_NODE__ORDER = eINSTANCE.getPlanningNode_Order();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING_NODE__SIZE = eINSTANCE.getPlanningNode_Size();

		/**
		 * The meta object literal for the '{@link teaw.impl.PlanningImpl <em>Planning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PlanningImpl
		 * @see teaw.impl.TeawPackageImpl#getPlanning()
		 * @generated
		 */
		EClass PLANNING = eINSTANCE.getPlanning();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNING__NAME = eINSTANCE.getPlanning_Name();

		/**
		 * The meta object literal for the '<em><b>Planning Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNING__PLANNING_NODES = eINSTANCE.getPlanning_PlanningNodes();

		/**
		 * The meta object literal for the '<em><b>Normal Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNING__NORMAL_LINKS = eINSTANCE.getPlanning_NormalLinks();

		/**
		 * The meta object literal for the '{@link teaw.impl.PictoImpl <em>Picto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PictoImpl
		 * @see teaw.impl.TeawPackageImpl#getPicto()
		 * @generated
		 */
		EClass PICTO = eINSTANCE.getPicto();

		/**
		 * The meta object literal for the '{@link teaw.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PersonImpl
		 * @see teaw.impl.TeawPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link teaw.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.ActionImpl
		 * @see teaw.impl.TeawPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link teaw.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PlaceImpl
		 * @see teaw.impl.TeawPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '{@link teaw.impl.TransictionImpl <em>Transiction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.TransictionImpl
		 * @see teaw.impl.TeawPackageImpl#getTransiction()
		 * @generated
		 */
		EClass TRANSICTION = eINSTANCE.getTransiction();

		/**
		 * The meta object literal for the '{@link teaw.impl.WaitTimeImpl <em>Wait Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.WaitTimeImpl
		 * @see teaw.impl.TeawPackageImpl#getWaitTime()
		 * @generated
		 */
		EClass WAIT_TIME = eINSTANCE.getWaitTime();

		/**
		 * The meta object literal for the '{@link teaw.impl.PrizeImpl <em>Prize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PrizeImpl
		 * @see teaw.impl.TeawPackageImpl#getPrize()
		 * @generated
		 */
		EClass PRIZE = eINSTANCE.getPrize();

		/**
		 * The meta object literal for the '{@link teaw.impl.SocialStoryImpl <em>Social Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.SocialStoryImpl
		 * @see teaw.impl.TeawPackageImpl#getSocialStory()
		 * @generated
		 */
		EClass SOCIAL_STORY = eINSTANCE.getSocialStory();

		/**
		 * The meta object literal for the '{@link teaw.impl.SoothingObjectImpl <em>Soothing Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.SoothingObjectImpl
		 * @see teaw.impl.TeawPackageImpl#getSoothingObject()
		 * @generated
		 */
		EClass SOOTHING_OBJECT = eINSTANCE.getSoothingObject();

		/**
		 * The meta object literal for the '{@link teaw.impl.ReaminingObjectImpl <em>Reamining Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.ReaminingObjectImpl
		 * @see teaw.impl.TeawPackageImpl#getReaminingObject()
		 * @generated
		 */
		EClass REAMINING_OBJECT = eINSTANCE.getReaminingObject();

		/**
		 * The meta object literal for the '{@link teaw.impl.EmotionChoiceImpl <em>Emotion Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.EmotionChoiceImpl
		 * @see teaw.impl.TeawPackageImpl#getEmotionChoice()
		 * @generated
		 */
		EClass EMOTION_CHOICE = eINSTANCE.getEmotionChoice();

		/**
		 * The meta object literal for the '{@link teaw.impl.EmotionImpl <em>Emotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.EmotionImpl
		 * @see teaw.impl.TeawPackageImpl#getEmotion()
		 * @generated
		 */
		EClass EMOTION = eINSTANCE.getEmotion();

		/**
		 * The meta object literal for the '{@link teaw.impl.PositiveFeedbackImpl <em>Positive Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.PositiveFeedbackImpl
		 * @see teaw.impl.TeawPackageImpl#getPositiveFeedback()
		 * @generated
		 */
		EClass POSITIVE_FEEDBACK = eINSTANCE.getPositiveFeedback();

		/**
		 * The meta object literal for the '{@link teaw.impl.NegativeFeedbackImpl <em>Negative Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.NegativeFeedbackImpl
		 * @see teaw.impl.TeawPackageImpl#getNegativeFeedback()
		 * @generated
		 */
		EClass NEGATIVE_FEEDBACK = eINSTANCE.getNegativeFeedback();

		/**
		 * The meta object literal for the '{@link teaw.impl.CommunicationBookImpl <em>Communication Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.CommunicationBookImpl
		 * @see teaw.impl.TeawPackageImpl#getCommunicationBook()
		 * @generated
		 */
		EClass COMMUNICATION_BOOK = eINSTANCE.getCommunicationBook();

		/**
		 * The meta object literal for the '{@link teaw.impl.EmotionsPictoImpl <em>Emotions Picto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.EmotionsPictoImpl
		 * @see teaw.impl.TeawPackageImpl#getEmotionsPicto()
		 * @generated
		 */
		EClass EMOTIONS_PICTO = eINSTANCE.getEmotionsPicto();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTIONS_PICTO__DESCRIPTION = eINSTANCE.getEmotionsPicto_Description();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTIONS_PICTO__IMAGE_PATH = eINSTANCE.getEmotionsPicto_ImagePath();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMOTIONS_PICTO__SIZE = eINSTANCE.getEmotionsPicto_Size();

		/**
		 * The meta object literal for the '{@link teaw.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.FeedbackImpl
		 * @see teaw.impl.TeawPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '{@link teaw.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.LinkImpl
		 * @see teaw.impl.TeawPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link teaw.impl.NormalLinkImpl <em>Normal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.NormalLinkImpl
		 * @see teaw.impl.TeawPackageImpl#getNormalLink()
		 * @generated
		 */
		EClass NORMAL_LINK = eINSTANCE.getNormalLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_LINK__ORIGIN = eINSTANCE.getNormalLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_LINK__TARGET = eINSTANCE.getNormalLink_Target();

		/**
		 * The meta object literal for the '{@link teaw.impl.RedLinkImpl <em>Red Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.RedLinkImpl
		 * @see teaw.impl.TeawPackageImpl#getRedLink()
		 * @generated
		 */
		EClass RED_LINK = eINSTANCE.getRedLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_LINK__ORIGIN = eINSTANCE.getRedLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_LINK__TARGET = eINSTANCE.getRedLink_Target();

		/**
		 * The meta object literal for the '<em><b>Np Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED_LINK__NP_FEEDBACK = eINSTANCE.getRedLink_NpFeedback();

		/**
		 * The meta object literal for the '{@link teaw.impl.GreenLinkImpl <em>Green Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.impl.GreenLinkImpl
		 * @see teaw.impl.TeawPackageImpl#getGreenLink()
		 * @generated
		 */
		EClass GREEN_LINK = eINSTANCE.getGreenLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREEN_LINK__ORIGIN = eINSTANCE.getGreenLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREEN_LINK__TARGET = eINSTANCE.getGreenLink_Target();

		/**
		 * The meta object literal for the '<em><b>Np Feedback</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREEN_LINK__NP_FEEDBACK = eINSTANCE.getGreenLink_NpFeedback();

		/**
		 * The meta object literal for the '{@link teaw.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see teaw.Order
		 * @see teaw.impl.TeawPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

	}

} //TeawPackage
