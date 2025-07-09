/*
* 
*/
package teaw.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import teaw.diagram.edit.commands.EmotionsCreateCommand;
import teaw.diagram.edit.commands.PlanningCreateCommand;
import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class TEAWDiagramItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TEAWDiagramItemSemanticEditPolicy() {
		super(TeawElementTypes.TEAWDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TeawElementTypes.Emotions_2001 == req.getElementType()) {
			return getGEFWrapper(new EmotionsCreateCommand(req));
		}
		if (TeawElementTypes.Planning_2002 == req.getElementType()) {
			return getGEFWrapper(new PlanningCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
