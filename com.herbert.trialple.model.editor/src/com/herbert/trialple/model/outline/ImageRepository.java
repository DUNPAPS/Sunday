package com.herbert.trialple.model.outline;

import java.net.URL;


import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;



public class ImageRepository {

	@SuppressWarnings("rawtypes")
	private static HashMap cache = new HashMap();

	public final static String SOURCEPATH_DECORATION = "sample_decorator.gif";

	public static final ImageDescriptor getImageDescriptor(String icon) {
		URL url = com.herbert.trialple.model.activator.Activator.getDefault().getBundle()
				.getEntry("/icons/" + icon);
		return ImageDescriptor.createFromURL(url);
	}

	@SuppressWarnings({ "unchecked"})
	public static final Image getImage(String icon) {
		Image image = (Image) cache.get(icon);
		if (image == null) {
			image = getImageDescriptor(icon).createImage();
			cache.put(icon, image);
		}
		return image;
	}
}