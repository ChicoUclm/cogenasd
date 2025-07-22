/*
* 
*/
package teaw.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import teaw.Action;
import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.Emotions;
import teaw.EmotionsNode;
import teaw.GreenLink;
import teaw.Node;
import teaw.NormalLink;
import teaw.Person;
import teaw.Picto;
import teaw.Place;
import teaw.Planning;
import teaw.PlanningNode;
import teaw.RedLink;
import teaw.TEAWDiagram;
import teaw.TeawPackage;
import teaw.diagram.edit.parts.ActionEditPart;
import teaw.diagram.edit.parts.CommunicationBookEditPart;
import teaw.diagram.edit.parts.EmotionChoiceEditPart;
import teaw.diagram.edit.parts.EmotionEditPart;
import teaw.diagram.edit.parts.EmotionsEditPart;
import teaw.diagram.edit.parts.EmotionsEmotionsEmotionsCompartmentEditPart;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.NegativeFeedbackEditPart;
import teaw.diagram.edit.parts.NormalLinkEditPart;
import teaw.diagram.edit.parts.PersonEditPart;
import teaw.diagram.edit.parts.PlaceEditPart;
import teaw.diagram.edit.parts.PlanningEditPart;
import teaw.diagram.edit.parts.PlanningPlanningPlanningNodesCompartmentEditPart;
import teaw.diagram.edit.parts.PositiveFeedbackEditPart;
import teaw.diagram.edit.parts.PrizeEditPart;
import teaw.diagram.edit.parts.ReaminingObjectEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.edit.parts.SocialStoryEditPart;
import teaw.diagram.edit.parts.SoothingObjectEditPart;
import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.WaitTimeEditPart;
import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class TeawDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<TeawNodeDescriptor> getSemanticChildren(View view) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return getTEAWDiagram_1000SemanticChildren(view);
		case EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID:
			return getEmotionsEmotionsEmotionsCompartment_7001SemanticChildren(view);
		case PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID:
			return getPlanningPlanningPlanningNodesCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawNodeDescriptor> getTEAWDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TEAWDiagram modelElement = (TEAWDiagram) view.getElement();
		LinkedList<TeawNodeDescriptor> result = new LinkedList<TeawNodeDescriptor>();
		for (Iterator<?> it = modelElement.getItsNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = TeawVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EmotionsEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlanningEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TeawNodeDescriptor> getEmotionsEmotionsEmotionsCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Emotions modelElement = (Emotions) containerView.getElement();
		LinkedList<TeawNodeDescriptor> result = new LinkedList<TeawNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmotions().iterator(); it.hasNext();) {
			EmotionsNode childElement = (EmotionsNode) it.next();
			int visualID = TeawVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EmotionChoiceEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EmotionEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PositiveFeedbackEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NegativeFeedbackEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TeawNodeDescriptor> getPlanningPlanningPlanningNodesCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Planning modelElement = (Planning) containerView.getElement();
		LinkedList<TeawNodeDescriptor> result = new LinkedList<TeawNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPlanningNodes().iterator(); it.hasNext();) {
			PlanningNode childElement = (PlanningNode) it.next();
			int visualID = TeawVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActionEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WaitTimeEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PrizeEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SocialStoryEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoothingObjectEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReaminingObjectEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommunicationBookEditPart.VISUAL_ID) {
				result.add(new TeawNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getContainedLinks(View view) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case TEAWDiagramEditPart.VISUAL_ID:
			return getTEAWDiagram_1000ContainedLinks(view);
		case EmotionsEditPart.VISUAL_ID:
			return getEmotions_2001ContainedLinks(view);
		case PlanningEditPart.VISUAL_ID:
			return getPlanning_2002ContainedLinks(view);
		case EmotionChoiceEditPart.VISUAL_ID:
			return getEmotionChoice_3001ContainedLinks(view);
		case EmotionEditPart.VISUAL_ID:
			return getEmotion_3002ContainedLinks(view);
		case PositiveFeedbackEditPart.VISUAL_ID:
			return getPositiveFeedback_3011ContainedLinks(view);
		case NegativeFeedbackEditPart.VISUAL_ID:
			return getNegativeFeedback_3012ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_3003ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3004ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3005ContainedLinks(view);
		case WaitTimeEditPart.VISUAL_ID:
			return getWaitTime_3006ContainedLinks(view);
		case PrizeEditPart.VISUAL_ID:
			return getPrize_3007ContainedLinks(view);
		case SocialStoryEditPart.VISUAL_ID:
			return getSocialStory_3008ContainedLinks(view);
		case SoothingObjectEditPart.VISUAL_ID:
			return getSoothingObject_3009ContainedLinks(view);
		case ReaminingObjectEditPart.VISUAL_ID:
			return getReaminingObject_3013ContainedLinks(view);
		case CommunicationBookEditPart.VISUAL_ID:
			return getCommunicationBook_3010ContainedLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001ContainedLinks(view);
		case RedLinkEditPart.VISUAL_ID:
			return getRedLink_4002ContainedLinks(view);
		case GreenLinkEditPart.VISUAL_ID:
			return getGreenLink_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getIncomingLinks(View view) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case EmotionsEditPart.VISUAL_ID:
			return getEmotions_2001IncomingLinks(view);
		case PlanningEditPart.VISUAL_ID:
			return getPlanning_2002IncomingLinks(view);
		case EmotionChoiceEditPart.VISUAL_ID:
			return getEmotionChoice_3001IncomingLinks(view);
		case EmotionEditPart.VISUAL_ID:
			return getEmotion_3002IncomingLinks(view);
		case PositiveFeedbackEditPart.VISUAL_ID:
			return getPositiveFeedback_3011IncomingLinks(view);
		case NegativeFeedbackEditPart.VISUAL_ID:
			return getNegativeFeedback_3012IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_3003IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3004IncomingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3005IncomingLinks(view);
		case WaitTimeEditPart.VISUAL_ID:
			return getWaitTime_3006IncomingLinks(view);
		case PrizeEditPart.VISUAL_ID:
			return getPrize_3007IncomingLinks(view);
		case SocialStoryEditPart.VISUAL_ID:
			return getSocialStory_3008IncomingLinks(view);
		case SoothingObjectEditPart.VISUAL_ID:
			return getSoothingObject_3009IncomingLinks(view);
		case ReaminingObjectEditPart.VISUAL_ID:
			return getReaminingObject_3013IncomingLinks(view);
		case CommunicationBookEditPart.VISUAL_ID:
			return getCommunicationBook_3010IncomingLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001IncomingLinks(view);
		case RedLinkEditPart.VISUAL_ID:
			return getRedLink_4002IncomingLinks(view);
		case GreenLinkEditPart.VISUAL_ID:
			return getGreenLink_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getOutgoingLinks(View view) {
		switch (TeawVisualIDRegistry.getVisualID(view)) {
		case EmotionsEditPart.VISUAL_ID:
			return getEmotions_2001OutgoingLinks(view);
		case PlanningEditPart.VISUAL_ID:
			return getPlanning_2002OutgoingLinks(view);
		case EmotionChoiceEditPart.VISUAL_ID:
			return getEmotionChoice_3001OutgoingLinks(view);
		case EmotionEditPart.VISUAL_ID:
			return getEmotion_3002OutgoingLinks(view);
		case PositiveFeedbackEditPart.VISUAL_ID:
			return getPositiveFeedback_3011OutgoingLinks(view);
		case NegativeFeedbackEditPart.VISUAL_ID:
			return getNegativeFeedback_3012OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_3003OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3004OutgoingLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_3005OutgoingLinks(view);
		case WaitTimeEditPart.VISUAL_ID:
			return getWaitTime_3006OutgoingLinks(view);
		case PrizeEditPart.VISUAL_ID:
			return getPrize_3007OutgoingLinks(view);
		case SocialStoryEditPart.VISUAL_ID:
			return getSocialStory_3008OutgoingLinks(view);
		case SoothingObjectEditPart.VISUAL_ID:
			return getSoothingObject_3009OutgoingLinks(view);
		case ReaminingObjectEditPart.VISUAL_ID:
			return getReaminingObject_3013OutgoingLinks(view);
		case CommunicationBookEditPart.VISUAL_ID:
			return getCommunicationBook_3010OutgoingLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001OutgoingLinks(view);
		case RedLinkEditPart.VISUAL_ID:
			return getRedLink_4002OutgoingLinks(view);
		case GreenLinkEditPart.VISUAL_ID:
			return getGreenLink_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getTEAWDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotions_2001ContainedLinks(View view) {
		Emotions modelElement = (Emotions) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RedLink_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_GreenLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlanning_2002ContainedLinks(View view) {
		Planning modelElement = (Planning) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NormalLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotionChoice_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotion_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getPositiveFeedback_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getNegativeFeedback_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPerson_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getAction_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlace_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getWaitTime_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPrize_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSocialStory_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSoothingObject_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getReaminingObject_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getCommunicationBook_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getNormalLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getRedLink_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getGreenLink_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotions_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlanning_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotionChoice_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotion_3002IncomingLinks(View view) {
		Emotion modelElement = (Emotion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RedLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_GreenLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getPositiveFeedback_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getNegativeFeedback_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPerson_3003IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getAction_3004IncomingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlace_3005IncomingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getWaitTime_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPrize_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSocialStory_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSoothingObject_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getReaminingObject_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getCommunicationBook_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getNormalLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getRedLink_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getGreenLink_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotions_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlanning_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotionChoice_3001OutgoingLinks(View view) {
		EmotionChoice modelElement = (EmotionChoice) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RedLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_GreenLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getEmotion_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getPositiveFeedback_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getNegativeFeedback_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPerson_3003OutgoingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getAction_3004OutgoingLinks(View view) {
		Action modelElement = (Action) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPlace_3005OutgoingLinks(View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getWaitTime_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getPrize_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSocialStory_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getSoothingObject_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TeawLinkDescriptor> getReaminingObject_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getCommunicationBook_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getNormalLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getRedLink_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TeawLinkDescriptor> getGreenLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getContainedTypeModelFacetLinks_NormalLink_4001(Planning container) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		for (Iterator<?> links = container.getNormalLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) linkObject;
			if (NormalLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Picto dst = link.getTarget();
			Picto src = link.getOrigin();
			result.add(new TeawLinkDescriptor(src, dst, link, TeawElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getContainedTypeModelFacetLinks_RedLink_4002(Emotions container) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		for (Iterator<?> links = container.getRedLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RedLink) {
				continue;
			}
			RedLink link = (RedLink) linkObject;
			if (RedLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Emotion dst = link.getTarget();
			EmotionChoice src = link.getOrigin();
			result.add(
					new TeawLinkDescriptor(src, dst, link, TeawElementTypes.RedLink_4002, RedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getContainedTypeModelFacetLinks_GreenLink_4003(Emotions container) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		GreenLink link = container.getGreenLink();
		if (GreenLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Emotion dst = link.getTarget();
		EmotionChoice src = link.getOrigin();
		result.add(
				new TeawLinkDescriptor(src, dst, link, TeawElementTypes.GreenLink_4003, GreenLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TeawLinkDescriptor> getIncomingTypeModelFacetLinks_NormalLink_4001(Picto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TeawPackage.eINSTANCE.getNormalLink_Target()
					|| false == setting.getEObject() instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) setting.getEObject();
			if (NormalLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Picto src = link.getOrigin();
			result.add(new TeawLinkDescriptor(src, target, link, TeawElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TeawLinkDescriptor> getIncomingTypeModelFacetLinks_RedLink_4002(Emotion target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TeawPackage.eINSTANCE.getRedLink_Target()
					|| false == setting.getEObject() instanceof RedLink) {
				continue;
			}
			RedLink link = (RedLink) setting.getEObject();
			if (RedLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			EmotionChoice src = link.getOrigin();
			result.add(new TeawLinkDescriptor(src, target, link, TeawElementTypes.RedLink_4002,
					RedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TeawLinkDescriptor> getIncomingTypeModelFacetLinks_GreenLink_4003(Emotion target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TeawPackage.eINSTANCE.getGreenLink_Target()
					|| false == setting.getEObject() instanceof GreenLink) {
				continue;
			}
			GreenLink link = (GreenLink) setting.getEObject();
			if (GreenLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			EmotionChoice src = link.getOrigin();
			result.add(new TeawLinkDescriptor(src, target, link, TeawElementTypes.GreenLink_4003,
					GreenLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getOutgoingTypeModelFacetLinks_NormalLink_4001(Picto source) {
		Planning container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Planning) {
				container = (Planning) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		for (Iterator<?> links = container.getNormalLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) linkObject;
			if (NormalLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Picto dst = link.getTarget();
			Picto src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new TeawLinkDescriptor(src, dst, link, TeawElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getOutgoingTypeModelFacetLinks_RedLink_4002(EmotionChoice source) {
		Emotions container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Emotions) {
				container = (Emotions) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		for (Iterator<?> links = container.getRedLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RedLink) {
				continue;
			}
			RedLink link = (RedLink) linkObject;
			if (RedLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Emotion dst = link.getTarget();
			EmotionChoice src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(
					new TeawLinkDescriptor(src, dst, link, TeawElementTypes.RedLink_4002, RedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TeawLinkDescriptor> getOutgoingTypeModelFacetLinks_GreenLink_4003(EmotionChoice source) {
		Emotions container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Emotions) {
				container = (Emotions) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TeawLinkDescriptor> result = new LinkedList<TeawLinkDescriptor>();
		GreenLink link = container.getGreenLink();
		if (GreenLinkEditPart.VISUAL_ID != TeawVisualIDRegistry.getLinkWithClassVisualID(link)) {
			return result;
		}
		Emotion dst = link.getTarget();
		EmotionChoice src = link.getOrigin();
		if (src != source) {
			return result;
		}
		result.add(
				new TeawLinkDescriptor(src, dst, link, TeawElementTypes.GreenLink_4003, GreenLinkEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<TeawNodeDescriptor> getSemanticChildren(View view) {
			return TeawDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TeawLinkDescriptor> getContainedLinks(View view) {
			return TeawDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TeawLinkDescriptor> getIncomingLinks(View view) {
			return TeawDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TeawLinkDescriptor> getOutgoingLinks(View view) {
			return TeawDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
