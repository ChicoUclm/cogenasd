/*
 * 
 */
package teaw.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import teaw.NormalLink;
import teaw.Picto;
import teaw.Planning;
import teaw.diagram.edit.policies.TeawBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class NormalLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public NormalLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof NormalLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Picto && newEnd instanceof Picto)) {
			return false;
		}
		Picto target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Planning)) {
			return false;
		}
		Planning container = (Planning) getLink().eContainer();
		return TeawBaseItemSemanticEditPolicy.getLinkConstraints().canExistNormalLink_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Picto && newEnd instanceof Picto)) {
			return false;
		}
		Picto source = getLink().getOrigin();
		if (!(getLink().eContainer() instanceof Planning)) {
			return false;
		}
		Planning container = (Planning) getLink().eContainer();
		return TeawBaseItemSemanticEditPolicy.getLinkConstraints().canExistNormalLink_4001(container, getLink(), source,
				getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setOrigin(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected NormalLink getLink() {
		return (NormalLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Picto getOldSource() {
		return (Picto) oldEnd;
	}

	/**
	* @generated
	*/
	protected Picto getNewSource() {
		return (Picto) newEnd;
	}

	/**
	* @generated
	*/
	protected Picto getOldTarget() {
		return (Picto) oldEnd;
	}

	/**
	* @generated
	*/
	protected Picto getNewTarget() {
		return (Picto) newEnd;
	}
}
