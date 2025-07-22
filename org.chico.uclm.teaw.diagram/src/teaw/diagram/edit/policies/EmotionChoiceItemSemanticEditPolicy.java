/*
* 
*/
package teaw.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import teaw.diagram.edit.commands.GreenLinkCreateCommand;
import teaw.diagram.edit.commands.GreenLinkReorientCommand;
import teaw.diagram.edit.commands.RedLinkCreateCommand;
import teaw.diagram.edit.commands.RedLinkReorientCommand;
import teaw.diagram.edit.parts.GreenLinkEditPart;
import teaw.diagram.edit.parts.RedLinkEditPart;
import teaw.diagram.part.TeawVisualIDRegistry;
import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class EmotionChoiceItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EmotionChoiceItemSemanticEditPolicy() {
		super(TeawElementTypes.EmotionChoice_3001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TeawVisualIDRegistry.getVisualID(outgoingLink) == RedLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TeawVisualIDRegistry.getVisualID(outgoingLink) == GreenLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TeawElementTypes.RedLink_4002 == req.getElementType()) {
			return getGEFWrapper(new RedLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TeawElementTypes.GreenLink_4003 == req.getElementType()) {
			return getGEFWrapper(new GreenLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TeawElementTypes.RedLink_4002 == req.getElementType()) {
			return null;
		}
		if (TeawElementTypes.GreenLink_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RedLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new RedLinkReorientCommand(req));
		case GreenLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new GreenLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
