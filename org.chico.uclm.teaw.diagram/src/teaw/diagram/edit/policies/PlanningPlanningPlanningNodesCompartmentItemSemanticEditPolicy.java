/*
* 
*/
package teaw.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import teaw.diagram.edit.commands.ActionCreateCommand;
import teaw.diagram.edit.commands.CommunicationBookCreateCommand;
import teaw.diagram.edit.commands.PersonCreateCommand;
import teaw.diagram.edit.commands.PlaceCreateCommand;
import teaw.diagram.edit.commands.PrizeCreateCommand;
import teaw.diagram.edit.commands.ReaminingObjectCreateCommand;
import teaw.diagram.edit.commands.SocialStoryCreateCommand;
import teaw.diagram.edit.commands.SoothingObjectCreateCommand;
import teaw.diagram.edit.commands.WaitTimeCreateCommand;
import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class PlanningPlanningPlanningNodesCompartmentItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PlanningPlanningPlanningNodesCompartmentItemSemanticEditPolicy() {
		super(TeawElementTypes.Planning_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TeawElementTypes.Person_3003 == req.getElementType()) {
			return getGEFWrapper(new PersonCreateCommand(req));
		}
		if (TeawElementTypes.Action_3004 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		if (TeawElementTypes.Place_3005 == req.getElementType()) {
			return getGEFWrapper(new PlaceCreateCommand(req));
		}
		if (TeawElementTypes.WaitTime_3006 == req.getElementType()) {
			return getGEFWrapper(new WaitTimeCreateCommand(req));
		}
		if (TeawElementTypes.Prize_3007 == req.getElementType()) {
			return getGEFWrapper(new PrizeCreateCommand(req));
		}
		if (TeawElementTypes.SocialStory_3008 == req.getElementType()) {
			return getGEFWrapper(new SocialStoryCreateCommand(req));
		}
		if (TeawElementTypes.SoothingObject_3009 == req.getElementType()) {
			return getGEFWrapper(new SoothingObjectCreateCommand(req));
		}
		if (TeawElementTypes.ReaminingObject_3013 == req.getElementType()) {
			return getGEFWrapper(new ReaminingObjectCreateCommand(req));
		}
		if (TeawElementTypes.CommunicationBook_3010 == req.getElementType()) {
			return getGEFWrapper(new CommunicationBookCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
