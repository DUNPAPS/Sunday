package com.herbert.trialple.model.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.herbert.trialple.model.xmlElement.TreeChild;
import com.sap.adt.ecatt.editor.internal.icons.IconLoader;

public class PhaseListLabelProvider extends LabelProvider {

	public Image getImage(Object element) {
		if (element instanceof TreeChild) {
			IconLoader xmlPlugin = new IconLoader();
			return xmlPlugin.getDefault().getImageRegistry()
					.get(IconLoader.ICON_ELEMENT);
		} else {
			return null;
		}
	}

	public String getText(Object element) {
		if (element instanceof TreeChild) {
			return element.toString();
		} else {
			return null;
		}
	}

}
