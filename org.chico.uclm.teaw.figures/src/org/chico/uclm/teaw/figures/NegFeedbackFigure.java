package org.chico.uclm.teaw.figures;

import org.eclipse.draw2d.ImageFigure;

public class NegFeedbackFigure extends ImageFigure {
	
	public NegFeedbackFigure() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, 
				"images/negativeFeedback64.png").createImage(), 0);
	}
}