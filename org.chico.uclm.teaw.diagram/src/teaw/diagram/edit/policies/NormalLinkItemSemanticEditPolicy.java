/*
* 
*/
package teaw.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import teaw.diagram.providers.TeawElementTypes;

/**
 * @generated
 */
public class NormalLinkItemSemanticEditPolicy extends TeawBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NormalLinkItemSemanticEditPolicy() {
		super(TeawElementTypes.NormalLink_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
