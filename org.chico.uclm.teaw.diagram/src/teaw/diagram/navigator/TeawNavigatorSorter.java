/*
* 
*/
package teaw.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import teaw.diagram.part.TeawVisualIDRegistry;

/**
 * @generated
 */
public class TeawNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof TeawNavigatorItem) {
			TeawNavigatorItem item = (TeawNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TeawVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
