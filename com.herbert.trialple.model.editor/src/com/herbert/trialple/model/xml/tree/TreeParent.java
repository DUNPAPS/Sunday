package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

import org.eclipse.jface.text.Position;

public class TreeParent extends TreeChild {
	@SuppressWarnings("rawtypes")
	private ArrayList children;
	private Position position;
	public static final ArrayList<String> SUBMODES = new ArrayList<String>();
	@SuppressWarnings("rawtypes")
	public TreeParent(String name) {
		super(name);
		children = new ArrayList();
	}

	@SuppressWarnings("unchecked")
	public TreeParent addChild(TreeChild child) {
		children.add(child);
		child.setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) {
		children.remove(child);
		child.setParent(null);
	}

	@SuppressWarnings("unchecked")
	public TreeParent[] getChildren() {
		return (TreeParent[]) children.toArray(new TreeParent[children.size()]);
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

}
