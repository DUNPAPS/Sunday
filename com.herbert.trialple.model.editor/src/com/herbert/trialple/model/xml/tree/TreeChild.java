package com.herbert.trialple.model.xml.tree;

public class TreeChild {
	private String name;
	private TreeParent parent;

	/**
	 * 
	 * @param name
	 */
 
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
