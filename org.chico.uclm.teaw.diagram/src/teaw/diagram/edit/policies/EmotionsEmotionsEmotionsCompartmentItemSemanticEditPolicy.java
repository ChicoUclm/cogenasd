/*
* 
*/
package teaw.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import teaw.diagram.edit.commands.EmotionChoiceCreateCommand;
import teaw.diagram.edit.commands.EmotionCreateCommand;
import teaw.diagram.edit.commands.NegativeFeedbackCreateCommand;
import teaw.diagram.edit.commands.PositiveFeedbackCreateCommand;
import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class EmotionsEmotionsEmotionsCompartmentItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EmotionsEmotionsEmotionsCompartmentItemSemanticEditPolicy() {
		super(TeawElementTypes.Emotions_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TeawElementTypes.EmotionChoice_3001 == req.getElementType()) {
			return getGEFWrapper(new EmotionChoiceCreateCommand(req));
		}
		if (TeawElementTypes.Emotion_3002 == req.getElementType()) {
			return getGEFWrapper(new EmotionCreateCommand(req));
		}
		if (TeawElementTypes.PositiveFeedback_3011 == req.getElementType()) {
			return getGEFWrapper(new PositiveFeedbackCreateCommand(req));
		}
		if (TeawElementTypes.NegativeFeedback_3012 == req.getElementType()) {
			return getGEFWrapper(new NegativeFeedbackCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
