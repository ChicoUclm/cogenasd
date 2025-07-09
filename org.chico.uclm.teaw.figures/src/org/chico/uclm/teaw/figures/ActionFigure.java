package org.chico.uclm.teaw.figures;

import java.io.File;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;

public class ActionFigure extends ImageFigure {
	static Image unspecified = null;

	  public ActionFigure() {
	      if (unspecified == null) {
	    	  unspecified = ImageDescriptor.createFromURL(
	               FileLocator.find(
	                       Platform.getBundle(Activator.PLUGIN_ID),
	                       new Path("images/action_arasaac128.png"), 
	                       new HashMap())).createImage();
	      }
	  }

	  public static Image createImage(String imagePath) {
	      try {
//	          IFile res = (IFile)ResourcesPlugin.getWorkspace().getRoot().
	    	  //          findMember(new Path(imagePath));
	    	  File file = new File(imagePath);
	          ImageData data = ImageDescriptor.createFromURL(file.toURI().toURL()).createImage().getImageData();
	          ImageData scaledData = data.scaledTo(128, 128);
	          
	          Image originalImage = new Image(null, scaledData);
	          Image borderImage = new Image(null, originalImage.getBounds().width + 10, originalImage.getBounds().height + 10);
	          GC gc = new GC(borderImage);
	          gc.setLineWidth(6);
	          gc.setForeground(new Color(null, new RGB(255, 235, 59)));
	          gc.drawRectangle(0, 0, borderImage.getBounds().width - 1, borderImage.getBounds().height - 1);
	          gc.drawImage(originalImage, 5, 5);
	          gc.dispose();
	          
	          return borderImage;
	      }
	      catch (Exception ex) {
	          return unspecified;
	      }
	  }

	  public void setImagePath(String imagePath) {
	      try {
	          if (getImage() != null && getImage() != unspecified) {
	              getImage().dispose();
	          }

	          this.setImage(createImage(imagePath));
	      }
	      catch (Exception ex) {
	          ex.printStackTrace();
	      }
	  }
}