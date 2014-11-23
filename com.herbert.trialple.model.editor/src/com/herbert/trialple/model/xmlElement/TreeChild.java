package com.herbert.trialple.model.xmlElement;


public class TreeChild {
	private String name;
	private TreeParent parent;

	public TreeChild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setParent(TreeParent parent) {
		this.parent = parent;
	}

	public TreeParent getParent() {
		return parent;
	}

	public String toString() {
		return getName();
	}

}
