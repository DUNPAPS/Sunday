package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

import org.eclipse.jface.text.Position;

import Trialple.Phase;

public class PhaseTree extends TreeChild {
	private ArrayList<TreeChild> children;
	private Position position;
	private Phase model;
	private PhaseTree root;
	private PhaseTree parent;

	public PhaseTree(String name) {
		super(name);
		children = new ArrayList<TreeChild>();
	}

	public PhaseTree addChild(TreeChild child) {
		children.add(child);
		setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) {
		children.remove(child);
		setParent(null);
	}

	public void setParent(PhaseTree parent) {
		this.parent = parent;
	}

	public PhaseTree getParent() {
		return parent;
	}

	public TreeChild[] getChildren() {
		return (TreeChild[]) children.toArray(new TreeChild[children.size()]);
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

	public Phase getPhase() {
		return model;
	}

	public void setPhase(Phase model) {
		this.model = model;
	}

	public PhaseTree getRoot() {
		return root;
	}
}
