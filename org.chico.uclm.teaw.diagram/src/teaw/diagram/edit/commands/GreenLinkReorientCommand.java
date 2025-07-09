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

import teaw.Emotion;
import teaw.EmotionChoice;
import teaw.Emotions;
import teaw.GreenLink;
import teaw.diagram.edit.policies.TeawBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GreenLinkReorientCommand extends EditElementCommand {

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
	public GreenLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof GreenLink) {
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
		if (!(oldEnd instanceof EmotionChoice && newEnd instanceof EmotionChoice)) {
			return false;
		}
		Emotion target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Emotions)) {
			return false;
		}
		Emotions container = (Emotions) getLink().eContainer();
		return TeawBaseItemSemanticEditPolicy.getLinkConstraints().canExistGreenLink_4003(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Emotion && newEnd instanceof Emotion)) {
			return false;
		}
		EmotionChoice source = getLink().getOrigin();
		if (!(getLink().eContainer() instanceof Emotions)) {
			return false;
		}
		Emotions container = (Emotions) getLink().eContainer();
		return TeawBaseItemSemanticEditPolicy.getLinkConstraints().canExistGreenLink_4003(container, getLink(), source,
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
	protected GreenLink getLink() {
		return (GreenLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected EmotionChoice getOldSource() {
		return (EmotionChoice) oldEnd;
	}

	/**
	* @generated
	*/
	protected EmotionChoice getNewSource() {
		return (EmotionChoice) newEnd;
	}

	/**
	* @generated
	*/
	protected Emotion getOldTarget() {
		return (Emotion) oldEnd;
	}

	/**
	* @generated
	*/
	protected Emotion getNewTarget() {
		return (Emotion) newEnd;
	}
}
