/*
 * 
 */
package teaw.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import teaw.diagram.part.TeawVisualIDRegistry;

/**
 * @generated
 */
public class TeawEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TeawVisualIDRegistry.getVisualID(view)) {

			case TEAWDiagramEditPart.VISUAL_ID:
				return new TEAWDiagramEditPart(view);

			case EmotionsEditPart.VISUAL_ID:
				return new EmotionsEditPart(view);

			case EmotionsNameEditPart.VISUAL_ID:
				return new EmotionsNameEditPart(view);

			case PlanningEditPart.VISUAL_ID:
				return new PlanningEditPart(view);

			case PlanningNameEditPart.VISUAL_ID:
				return new PlanningNameEditPart(view);

			case EmotionChoiceEditPart.VISUAL_ID:
				return new EmotionChoiceEditPart(view);

			case EmotionEditPart.VISUAL_ID:
				return new EmotionEditPart(view);

			case PositiveFeedbackEditPart.VISUAL_ID:
				return new PositiveFeedbackEditPart(view);

			case NegativeFeedbackEditPart.VISUAL_ID:
				return new NegativeFeedbackEditPart(view);

			case PersonEditPart.VISUAL_ID:
				return new PersonEditPart(view);

			case ActionEditPart.VISUAL_ID:
				return new ActionEditPart(view);

			case PlaceEditPart.VISUAL_ID:
				return new PlaceEditPart(view);

			case WaitTimeEditPart.VISUAL_ID:
				return new WaitTimeEditPart(view);

			case PrizeEditPart.VISUAL_ID:
				return new PrizeEditPart(view);

			case SocialStoryEditPart.VISUAL_ID:
				return new SocialStoryEditPart(view);

			case SoothingObjectEditPart.VISUAL_ID:
				return new SoothingObjectEditPart(view);

			case ReaminingObjectEditPart.VISUAL_ID:
				return new ReaminingObjectEditPart(view);

			case CommunicationBookEditPart.VISUAL_ID:
				return new CommunicationBookEditPart(view);

			case EmotionsEmotionsEmotionsCompartmentEditPart.VISUAL_ID:
				return new EmotionsEmotionsEmotionsCompartmentEditPart(view);

			case PlanningPlanningPlanningNodesCompartmentEditPart.VISUAL_ID:
				return new PlanningPlanningPlanningNodesCompartmentEditPart(view);

			case NormalLinkEditPart.VISUAL_ID:
				return new NormalLinkEditPart(view);

			case RedLinkEditPart.VISUAL_ID:
				return new RedLinkEditPart(view);

			case GreenLinkEditPart.VISUAL_ID:
				return new GreenLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
