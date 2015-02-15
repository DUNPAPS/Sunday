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
import com.herbert.trialple.model.xml.tree.ModuleTree;
import com.sap.adt.ecatt.editor.internal.icons.IconLoader;

/**
 * The PhaseListLabelProvider
 * 
 * @author D063076
 *
 */
public class PhaseListLabelProvider extends LabelProvider{
	FontRegistry registry = new FontRegistry();

	/**
	 * @see ILabelProvider#getImage(Object) takes a TreeChild object and returns
	 *      its Image
	 */
	public Image getImage(Object element) {
		IconLoader xmlPlugin = new IconLoader();
//		if ( element instanceof TreeChild) {
//			return xmlPlugin.getDefault().getImageRegistry()
//					.get(IconLoader.ICON_ELEMENT
//							);
//		}
		
			return null;
			
		
	}

	/**
	 * @see ILabelProvider#getText(Object)
	 */
	public String getText(Object element) {
		if (element instanceof TreeChild) {
			return ((TreeChild) element).getName();
		
		}
		 
		
		return null;
	}

	

}
