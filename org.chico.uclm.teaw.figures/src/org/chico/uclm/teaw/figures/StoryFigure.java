package org.chico.uclm.teaw.figures;

import java.io.File;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;

public class StoryFigure extends ImageFigure {
	static Image unspecified = null;

	  public StoryFigure() {
	      if (unspecified == null) {
	    	  unspecified = ImageDescriptor.createFromURL(
	               FileLocator.find(
	                       Platform.getBundle(Activator.PLUGIN_ID),
	                       new Path("images/story_arasaac64.png"), 
	                       new HashMap())).createImage();
	      }
	  }

	  public static Image createImage(String imagePath) {
	      try {
//	          IFile res = (IFile)ResourcesPlugin.getWorkspace().getRoot().
	    	  //          findMember(new Path(imagePath));
	          File file = new File(imagePath);
	          ImageData data = ImageDescriptor.createFromURL(file.toURI().toURL()).createImage().getImageData();
	          ImageData scaledData = data.scaledTo(64, 64);
	          
	          return new Image(null, scaledData);
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
