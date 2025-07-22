/*
 * 
 */
package teaw.diagram.providers;

import teaw.diagram.part.TeawDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TeawDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			TeawDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
