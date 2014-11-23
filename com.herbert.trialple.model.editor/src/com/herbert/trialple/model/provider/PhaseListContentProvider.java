package com.herbert.trialple.model.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import com.herbert.trialple.model.xmlElement.TreeParent;


public class PhaseListContentProvider implements ITreeContentProvider {

	/*
	 * Constructor
	 */
	public PhaseListContentProvider() {
		super();
 
	}

	/**
	 * Returns the child elements of the given parent element.
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 * @param the
	 *            parent element
	 * @return an array of child elements
	 */

	@Override
	public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof TreeParent) {
				return ((TreeParent) parentElement).getChildren();
			}
			return new Object[0];
	}

	/**
	 * Returns the parent for the given element, or null indicating that the
	 * parent can't be computed. In this case the tree-structured viewer can't
	 * expand a given node correctly if requested.
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 * @param the
	 *            element
	 * @return the parent element, or null if it has none or if the parent
	 *         cannot be computed
	 */
	public Object getParent(Object element) {
		if (element instanceof TreeParent) {
			return ((TreeParent) element).getParent();
		}
		return null; 
	}

	/**
	 * Returns whether the given element has children.
	 * 
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 * @param the
	 *            element
	 * @return true if the given element has children, and false if it has no
	 *         children
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof TreeParent) {
			return ((TreeParent) element).hasChildren();
		} else {
			return false;
		}
	}

	/**
	 * Returns the elements to display in the viewer when its input is set to
	 * the given element. These elements can then be presented as nodes on a
	 * TreeViewer. The result is not modified by the viewer.
	 * 
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 * @param the
	 *            input element
	 * @return the array of elements to display in the viewer
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof TreeParent) {
			return getChildren(inputElement);
		} else {
			return null;
		}
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public void dispose() {

	}
	
	
}
