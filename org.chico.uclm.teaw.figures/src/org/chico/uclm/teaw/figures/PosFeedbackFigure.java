package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class PosFeedbackFigure extends ImageFigure {
	
	public PosFeedbackFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, 
				"images/positiveFeedback64.png").createImage(), 0);
	}
}