package org.chico.uclm.teaw.figures;

import java.io.File;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Color;

public class PlaceFigure extends ImageFigure {
	static Image unspecified = null;

	  public PlaceFigure() {
	      if (unspecified == null) {
	    	  unspecified = ImageDescriptor.createFromURL(
	               FileLocator.find(
	                       Platform.getBundle(Activator.PLUGIN_ID),
	                       new Path("images/place_arasaac128.png"), 
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
	          gc.setForeground(new Color(null, new RGB(76, 175, 80)));
	          gc.drawRectangle(0, 0, borderImage.getBounds().width, borderImage.getBounds().height);
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
