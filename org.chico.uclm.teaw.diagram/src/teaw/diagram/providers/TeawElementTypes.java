/*
 * 
 */
package teaw.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import teaw.TeawPackage;
import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.CommunicationBookEditPart;
import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.edit.parts.EmotionsEditPart;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.NegativeFeedbackEditPart;
import teaw.diagram.edit.parts.NormalLinkEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.edit.parts.PlanningEditPart;
import teaw.diagram.edit.parts.PositiveFeedbackEditPart;
import teaw.diagram.edit.parts.PrizeEditPart;
import teaw.diagram.edit.parts.ReaminingObjectEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.edit.parts.SocialStoryEditPart;
import teaw.diagram.edit.parts.SoothingObjectEditPart;
import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.WaitTimeEditPart;
import teaw.diagram.part.TeawDiagramEditorPlugin;

/**
 * @generated
 */
public class TeawElementTypes {

	/**
	* @generated
	*/
	private TeawElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			TeawDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType TEAWDiagram_1000 = getElementType("org.chico.uclm.teaw.diagram.TEAWDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Emotions_2001 = getElementType("org.chico.uclm.teaw.diagram.Emotions_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Planning_2002 = getElementType("org.chico.uclm.teaw.diagram.Planning_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EmotionChoice_3001 = getElementType(
			"org.chico.uclm.teaw.diagram.EmotionChoice_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Emotion_3002 = getElementType("org.chico.uclm.teaw.diagram.Emotion_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PositiveFeedback_3011 = getElementType(
			"org.chico.uclm.teaw.diagram.PositiveFeedback_3011"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType NegativeFeedback_3012 = getElementType(
			"org.chico.uclm.teaw.diagram.NegativeFeedback_3012"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Person_3003 = getElementType("org.chico.uclm.teaw.diagram.Person_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Action_3004 = getElementType("org.chico.uclm.teaw.diagram.Action_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Place_3005 = getElementType("org.chico.uclm.teaw.diagram.Place_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WaitTime_3006 = getElementType("org.chico.uclm.teaw.diagram.WaitTime_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Prize_3007 = getElementType("org.chico.uclm.teaw.diagram.Prize_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SocialStory_3008 = getElementType("org.chico.uclm.teaw.diagram.SocialStory_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SoothingObject_3009 = getElementType(
			"org.chico.uclm.teaw.diagram.SoothingObject_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReaminingObject_3013 = getElementType(
			"org.chico.uclm.teaw.diagram.ReaminingObject_3013"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CommunicationBook_3010 = getElementType(
			"org.chico.uclm.teaw.diagram.CommunicationBook_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NormalLink_4001 = getElementType("org.chico.uclm.teaw.diagram.NormalLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RedLink_4002 = getElementType("org.chico.uclm.teaw.diagram.RedLink_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GreenLink_4003 = getElementType("org.chico.uclm.teaw.diagram.GreenLink_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(TEAWDiagram_1000, TeawPackage.eINSTANCE.getTEAWDiagram());

			elements.put(Emotions_2001, TeawPackage.eINSTANCE.getEmotions());

			elements.put(Planning_2002, TeawPackage.eINSTANCE.getPlanning());

			elements.put(EmotionChoice_3001, TeawPackage.eINSTANCE.getEmotionChoice());

			elements.put(Emotion_3002, TeawPackage.eINSTANCE.getEmotion());

			elements.put(PositiveFeedback_3011, TeawPackage.eINSTANCE.getPositiveFeedback());

			elements.put(NegativeFeedback_3012, TeawPackage.eINSTANCE.getNegativeFeedback());

			elements.put(Person_3003, TeawPackage.eINSTANCE.getPerson());

			elements.put(Action_3004, TeawPackage.eINSTANCE.getAction());

			elements.put(Place_3005, TeawPackage.eINSTANCE.getPlace());

			elements.put(WaitTime_3006, TeawPackage.eINSTANCE.getWaitTime());

			elements.put(Prize_3007, TeawPackage.eINSTANCE.getPrize());

			elements.put(SocialStory_3008, TeawPackage.eINSTANCE.getSocialStory());

			elements.put(SoothingObject_3009, TeawPackage.eINSTANCE.getSoothingObject());

			elements.put(ReaminingObject_3013, TeawPackage.eINSTANCE.getReaminingObject());

			elements.put(CommunicationBook_3010, TeawPackage.eINSTANCE.getCommunicationBook());

			elements.put(NormalLink_4001, TeawPackage.eINSTANCE.getNormalLink());

			elements.put(RedLink_4002, TeawPackage.eINSTANCE.getRedLink());

			elements.put(GreenLink_4003, TeawPackage.eINSTANCE.getGreenLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(TEAWDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Emotions_2001);
			KNOWN_ELEMENT_TYPES.add(Planning_2002);
			KNOWN_ELEMENT_TYPES.add(EmotionChoice_3001);
			KNOWN_ELEMENT_TYPES.add(Emotion_3002);
			KNOWN_ELEMENT_TYPES.add(PositiveFeedback_3011);
			KNOWN_ELEMENT_TYPES.add(NegativeFeedback_3012);
			KNOWN_ELEMENT_TYPES.add(Person_3003);
			KNOWN_ELEMENT_TYPES.add(Action_3004);
			KNOWN_ELEMENT_TYPES.add(Place_3005);
			KNOWN_ELEMENT_TYPES.add(WaitTime_3006);
			KNOWN_ELEMENT_TYPES.add(Prize_3007);
			KNOWN_ELEMENT_TYPES.add(SocialStory_3008);
			KNOWN_ELEMENT_TYPES.add(SoothingObject_3009);
			KNOWN_ELEMENT_TYPES.add(ReaminingObject_3013);
			KNOWN_ELEMENT_TYPES.add(CommunicationBook_3010);
			KNOWN_ELEMENT_TYPES.add(NormalLink_4001);
			KNOWN_ELEMENT_TYPES.add(RedLink_4002);
			KNOWN_ELEMENT_TYPES.add(GreenLink_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return TEAWDiagram_1000;
		case EmotionsEditPart.VISUAL_ID:
			return Emotions_2001;
		case PlanningEditPart.VISUAL_ID:
			return Planning_2002;
		case EmotionChoiceEditPart.VISUAL_ID:
			return EmotionChoice_3001;
		case EmotionEditPart.VISUAL_ID:
			return Emotion_3002;
		case PositiveFeedbackEditPart.VISUAL_ID:
			return PositiveFeedback_3011;
		case NegativeFeedbackEditPart.VISUAL_ID:
			return NegativeFeedback_3012;
		case PersonEditPart.VISUAL_ID:
			return Person_3003;
		case ActionEditPart.VISUAL_ID:
			return Action_3004;
		case PlaceEditPart.VISUAL_ID:
			return Place_3005;
		case WaitTimeEditPart.VISUAL_ID:
			return WaitTime_3006;
		case PrizeEditPart.VISUAL_ID:
			return Prize_3007;
		case SocialStoryEditPart.VISUAL_ID:
			return SocialStory_3008;
		case SoothingObjectEditPart.VISUAL_ID:
			return SoothingObject_3009;
		case ReaminingObjectEditPart.VISUAL_ID:
			return ReaminingObject_3013;
		case CommunicationBookEditPart.VISUAL_ID:
			return CommunicationBook_3010;
		case NormalLinkEditPart.VISUAL_ID:
			return NormalLink_4001;
		case RedLinkEditPart.VISUAL_ID:
			return RedLink_4002;
		case GreenLinkEditPart.VISUAL_ID:
			return GreenLink_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return teaw.diagram.providers.TeawElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return teaw.diagram.providers.TeawElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return teaw.diagram.providers.TeawElementTypes.getElement(elementTypeAdapter);
		}
	};

}
