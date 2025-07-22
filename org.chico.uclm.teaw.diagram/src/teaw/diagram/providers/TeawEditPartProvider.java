/*
 * 
 */
package teaw.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import teaw.diagram.edit.parts.TEAWDiagramEditPart;
import teaw.diagram.edit.parts.TeawEditPartFactory;
import teaw.diagram.part.TeawVisualIDRegistry;

/**
 * @generated
 */
public class TeawEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public TeawEditPartProvider() {
		super(new TeawEditPartFactory(), TeawVisualIDRegistry.TYPED_INSTANCE, TEAWDiagramEditPart.MODEL_ID);
	}

}
