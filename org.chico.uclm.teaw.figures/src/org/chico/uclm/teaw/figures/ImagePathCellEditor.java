package org.chico.uclm.teaw.figures;

import java.io.File;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;

public class ImagePathCellEditor extends DialogCellEditor {

	public ImagePathCellEditor(Composite parent) {
	      super(parent);
	  }

	  protected Object openDialogBox(Control cellEditorWindow) {

		  String[] filterExtensions = {"*.*","*.png","*.gif", "*.jpg", "*.jpeg"};
		  String absolutePath = "";
		  
		  FileDialog fileSelector = new FileDialog(cellEditorWindow.getShell(), SWT.OPEN);
	      fileSelector.setText("Please select an image");
	      fileSelector.setFilterExtensions(filterExtensions);
	            
	      String selectedFilePath = fileSelector.open();
	      if (selectedFilePath != null) {
	          File file = new File(selectedFilePath);
	          absolutePath = file.getAbsolutePath();
	      }

	      return absolutePath.replace("\\", "/");
	  }
}
