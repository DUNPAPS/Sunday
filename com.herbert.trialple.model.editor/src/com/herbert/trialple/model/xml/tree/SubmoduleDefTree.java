package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;




public class SubmoduleDefTree extends TreeChild {
	private ArrayList<TreeChild> children;
	private SubmoduleDefTree submoduleDefTree;
	private SubmoduleDefTree root;
	private SubmoduleDefTree parent;

	public SubmoduleDefTree(String name) {
		super(name);
		children = new ArrayList<TreeChild>();
	}

	public SubmoduleDefTree addChild(TreeChild child) {
		children.add(child);
		setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) {
		children.remove(child);
		setParent(null);
	}

	public void setParent(SubmoduleDefTree parent) {
		this.parent = parent;
	}

	public SubmoduleDefTree getParent() {
		return parent;
	}

	public TreeChild[] getChildren() {
		return (TreeChild[]) children.toArray(new TreeChild[children.size()]);
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public SubmoduleDefTree geSubModuleDefTree() {
		return submoduleDefTree;
	}

	public void setSubModuleDefTree(SubmoduleDefTree submoduleDefTree) {
		this.submoduleDefTree = submoduleDefTree;
	}

	public SubmoduleDefTree getRoot() {
		return root;
	}
}