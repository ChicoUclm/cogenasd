/*
* 
*/
package teaw.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import teaw.TEAWDiagram;
import teaw.TeawPackage;
import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.CommunicationBookEditPart;
import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.edit.parts.EmotionsEditPart;
import teaw.diagram.edit.parts.EmotionsEmotionsEmotionsCompartmentEditPart;
import teaw.diagram.edit.parts.EmotionsNameEditPart;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.NegativeFeedbackEditPart;
import teaw.diagram.edit.parts.NormalLinkEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.edit.parts.PlanningEditPart;
import teaw.diagram.edit.parts.PlanningNameEditPart;
import teaw.diagram.edit.parts.PlanningPlanningPlanningNodesCompartmentEditPart;
import teaw.diagram.edit.parts.PositiveFeedbackEditPart;
import teaw.diagram.edit.parts.PrizeEditPart;
import teaw.diagram.edit.parts.ReaminingObjectEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.edit.parts.SocialStoryEditPart;
import teaw.diagram.edit.parts.SoothingObjectEditPart;
import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.WaitTimeEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TeawVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.uclm.teaw.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TEAWDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return TEAWDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return teaw.diagram.part.TeawVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TeawDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TeawPackage.eINSTANCE.getTEAWDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((TEAWDiagram) domainElement)) {
			return TEAWDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = teaw.diagram.part.TeawVisualIDRegistry.getModelID(containerView);
		if (!TEAWDiagramEditPart.MODEL_ID.equals(containerModelID) && !"teaw".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TEAWDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = teaw.diagram.part.TeawVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TEAWDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TEAWDiagramEditPart.VISUAL_ID:
			if (TeawPackage.eINSTANCE.getEmotions().isSuperTypeOf(domainElement.eClass())) {
				return EmotionsEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getPlanning().isSuperTypeOf(domainElement.eClass())) {
				return PlanningEditPart.VISUAL_ID;
			}
			break;
		case EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID:
			if (TeawPackage.eINSTANCE.getEmotionChoice().isSuperTypeOf(domainElement.eClass())) {
				return EmotionChoiceEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getEmotion().isSuperTypeOf(domainElement.eClass())) {
				return EmotionEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getPositiveFeedback().isSuperTypeOf(domainElement.eClass())) {
				return PositiveFeedbackEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getNegativeFeedback().isSuperTypeOf(domainElement.eClass())) {
				return NegativeFeedbackEditPart.VISUAL_ID;
			}
			break;
		case PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID:
			if (TeawPackage.eINSTANCE.getPerson().isSuperTypeOf(domainElement.eClass())) {
				return PersonEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getAction().isSuperTypeOf(domainElement.eClass())) {
				return ActionEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getPlace().isSuperTypeOf(domainElement.eClass())) {
				return PlaceEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getWaitTime().isSuperTypeOf(domainElement.eClass())) {
				return WaitTimeEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getPrize().isSuperTypeOf(domainElement.eClass())) {
				return PrizeEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getSocialStory().isSuperTypeOf(domainElement.eClass())) {
				return SocialStoryEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getSoothingObject().isSuperTypeOf(domainElement.eClass())) {
				return SoothingObjectEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getReaminingObject().isSuperTypeOf(domainElement.eClass())) {
				return ReaminingObjectEditPart.VISUAL_ID;
			}
			if (TeawPackage.eINSTANCE.getCommunicationBook().isSuperTypeOf(domainElement.eClass())) {
				return CommunicationBookEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = teaw.diagram.part.TeawVisualIDRegistry.getModelID(containerView);
		if (!TEAWDiagramEditPart.MODEL_ID.equals(containerModelID) && !"teaw".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TEAWDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = teaw.diagram.part.TeawVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TEAWDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TEAWDiagramEditPart.VISUAL_ID:
			if (EmotionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmotionsEditPart.VISUAL_ID:
			if (EmotionsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanningEditPart.VISUAL_ID:
			if (PlanningNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID:
			if (EmotionChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmotionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PositiveFeedbackEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NegativeFeedbackEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID:
			if (PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WaitTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrizeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SocialStoryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SoothingObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReaminingObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommunicationBookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TeawPackage.eINSTANCE.getNormalLink().isSuperTypeOf(domainElement.eClass())) {
			return NormalLinkEditPart.VISUAL_ID;
		}
		if (TeawPackage.eINSTANCE.getRedLink().isSuperTypeOf(domainElement.eClass())) {
			return RedLinkEditPart.VISUAL_ID;
		}
		if (TeawPackage.eINSTANCE.getGreenLink().isSuperTypeOf(domainElement.eClass())) {
			return GreenLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(TEAWDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID:
		case PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return false;
		case EmotionChoiceEditPart.VISUAL_ID:
		case EmotionEditPart.VISUAL_ID:
		case PersonEditPart.VISUAL_ID:
		case ActionEditPart.VISUAL_ID:
		case PlaceEditPart.VISUAL_ID:
		case WaitTimeEditPart.VISUAL_ID:
		case PrizeEditPart.VISUAL_ID:
		case SocialStoryEditPart.VISUAL_ID:
		case SoothingObjectEditPart.VISUAL_ID:
		case CommunicationBookEditPart.VISUAL_ID:
		case PositiveFeedbackEditPart.VISUAL_ID:
		case NegativeFeedbackEditPart.VISUAL_ID:
		case ReaminingObjectEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return teaw.diagram.part.TeawVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return teaw.diagram.part.TeawVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return teaw.diagram.part.TeawVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return teaw.diagram.part.TeawVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return teaw.diagram.part.TeawVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return teaw.diagram.part.TeawVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
