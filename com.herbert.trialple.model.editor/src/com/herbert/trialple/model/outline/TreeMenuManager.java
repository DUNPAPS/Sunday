package com.herbert.trialple.model.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;

public class TreeMenuManager extends MenuManager implements IMenuListener {
	private ImageDescriptor copy = ImageRepository
			.getImageDescriptor("copy.gif");
	private ImageDescriptor collapseall = ImageRepository
			.getImageDescriptor("collapseall.gif");
	private ImageDescriptor expandall = ImageRepository
			.getImageDescriptor("expandall.gif");
	/** Stores reference to the tree viewer */
	private TreeViewer viewer = null;

	/** Defines a private class defining the "Expand All" action */
	private class ExpandAllAction extends Action {
		/** Constructs the "Expand All" action */
		ExpandAllAction() {
			setText("Expand All");
			this.setImageDescriptor(expandall);
			this.setEnabled(true);
		}

		/** Expands the currently selected node in the tree */
		public void run() {
			viewer.expandToLevel(
					((TreeSelection) viewer.getSelection()).getPaths()[0],
					TreeViewer.ALL_LEVELS);
		}
	}

	/** Defines a private class defining the "Collapse All" action */
	private class CollapseAllAction extends Action {
		/** Constructs the "Collapse All" action */
		CollapseAllAction() {
			setText("Collapse All");
			this.setImageDescriptor(collapseall);
			this.setEnabled(true);
		}

		/** Collapses the currently selected node in the tree */
		public void run() {
			viewer.collapseToLevel(
					((TreeSelection) viewer.getSelection()).getPaths()[0],
					TreeViewer.ALL_LEVELS);
			//Throws exceptions when inner levels are collapsed!
		}
	}

	/** Adds a child to the tree */
	private class addChild extends Action {
		/** constructor to add new child */
		addChild() {
			setText("Add Child");
			this.setEnabled(false);

		}

		/** Collapses the currently selected node in the tree */
		public void run() { /* do show */
		}
	}

	/** Defines a private class defining the "Show in Table" action */
	private class copy extends Action {
		/** Constructs the "Show in Table" action */
		copy() {
			setText("Copy");
			this.setImageDescriptor(copy);
			this.setEnabled(true);

		}

		/** Collapses the currently selected node in the tree */
		public void run() { /* do show */
		}
	}

	/** Constructs the Schema Menu Manager */
	public void SchemaTreeMenuManager(TreeViewer viewer) {
		this.viewer = viewer;
		setRemoveAllWhenShown(true);
		addMenuListener(this);
	}

	private class searchForTag extends Action {
		/** Constructs the "Show in Table" action */
		searchForTag() {
			setText("Search For Tag");
			this.setEnabled(true);

		}

		/** Collapses the currently selected node in the tree */
		public void run() { /* do show */
		}
	}

 
	private class searchForContent extends Action {
		/** Constructs the "Show in Table" action */
		searchForContent() {
			setText("Search For Content");
			this.setEnabled(true);

		}

		/** Collapses the currently selected node in the tree */
		public void run() { /* do show */
		}
	}

	/** Generate the context menu before being displayed */
	public void menuAboutToShow(IMenuManager menuManager) {
		menuManager.add(new addChild());
		menuManager.add(new Separator("Additions"));
		menuManager.add(new copy());
		menuManager.add(new searchForTag());
		menuManager.add(new searchForContent());
		menuManager.add(new Separator("Additions"));
		menuManager.add(new ExpandAllAction());
		menuManager.add(new CollapseAllAction());

	}

}
