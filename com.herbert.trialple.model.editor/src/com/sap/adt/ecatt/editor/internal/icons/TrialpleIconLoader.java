package com.sap.adt.ecatt.editor.internal.icons;

import java.net.URL;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TrialpleIconLoader extends AbstractUIPlugin {

	public static final String ICON_ELEMENT = "element_obj.gif"; //$NON-NLS-1$

	// The shared instance.
	private static TrialpleIconLoader plugin;

	/**
	 * The constructor.
	 */
	public TrialpleIconLoader() {
		TrialpleIconLoader.plugin = this;
	}

	/**
	 * Returns the shared instance.
	 */
	public TrialpleIconLoader getDefault() {
		return plugin;
	}

	/*
	 * @see AbstractUIPlugin#initializeImageRegistry(ImageRegistry)
	 */
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(ICON_ELEMENT, getImageDescriptor(ICON_ELEMENT));
	}

	/**
	 * Returns an image descriptor for the image corresponding to the specified
	 * key (which is the name of the image file).
	 * 
	 * @param key
	 *            The key of the image
	 * @return The descriptor for the requested image, or <code>null</code> if
	 *         the image could not be found
	 */
	private ImageDescriptor getImageDescriptor(String key) {
		try {
			URL url = getBundle().getEntry("icons/" + key); //$NON-NLS-1$
			return ImageDescriptor.createFromURL(url);
		} catch (IllegalStateException e) {
			return null;
		}
	}

}
