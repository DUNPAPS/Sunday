package com.herbert.trialple.model.provider;

import java.util.Iterator;

import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.herbert.trialple.model.xml.tree.TreeChild;
import com.herbert.trialple.model.xml.tree.TreeParent;
import com.sap.adt.ecatt.editor.internal.icons.IconLoader;

/**
 * The PhaseListLabelProvider
 * 
 * @author D063076
 *
 */
public class PhaseListLabelProvider extends LabelProvider implements
		ITableLabelProvider, ITableFontProvider, IColorProvider {
	FontRegistry registry = new FontRegistry();

	/**
	 * @see ILabelProvider#getImage(Object) takes a TreeChild object and returns
	 *      its Image
	 */
	public Image getImage(Object element) {
		IconLoader xmlPlugin = new IconLoader();
		if (((TreeParent) element).getName().toString().equals("modules")) {
			return xmlPlugin.getDefault().getImageRegistry()
					.get(IconLoader.ICON_ELEMENT);
		}
		
		//if(((TreeChild)element).getName().toString().equals("submoduleref")){
    	  
	Iterator<String> iterator = TreeParent.SUBMODES.iterator();
			while (iterator.hasNext()) {
			String val = iterator.next().toString();
			//if (!val.equals("")) {
			if (((TreeParent) element).getName().equalsIgnoreCase(val)&&!((TreeParent) element).getName().equalsIgnoreCase("submoduledefs") ) {
			 
						
				//return xmlPlugin.getDefault().getImageRegistry()
					//			.get(IconLoader.ICON_SUBMODULEREF);
					//}
				}
			//}
	    //}
		//}
			//}
		}
			//}
			return null;
			
		
	}

	/**
	 * @see ILabelProvider#getText(Object)
	 */
	public String getText(Object element) {
		if (element instanceof TreeParent) {
			return ((TreeParent) element).getName().toString();
		
		}
		
		else if(element instanceof TreeChild){
			if(((TreeChild) element).getName()== null){
				return ".."; // When the element name is empty no label is returned for display
			}else{
				return ((TreeChild) element).getChild().getName().toString();
			}
				
			}
		
		return null;
	}
	@Override
	public Color getForeground(Object element) {
		if (((TreeParent) element).getName().toString().equals("modules")) {
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW);
		}if(((TreeParent) element).getName().contentEquals("SUBMOD_MIG_CONFIG")){
			return Display.getDefault().getSystemColor(SWT.COLOR_LINK_FOREGROUND);
		}

		return null;
	}

	@Override
	public Color getBackground(Object element) {
		if(((TreeParent)element).getName().toString().equals("modules")){
			return Display.getCurrent().getSystemColor(SWT.COLOR_LIST_SELECTION_TEXT);
		}
		return null;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Font getFont(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
