package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;


public class TreeChild{
	private String name;

	private TreeChild child;
 
	public TreeChild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setChild(TreeChild child){
		child = this.child;
	}
	public TreeChild getChild(){
		return child;
	}

	public String toString() {
		return getName();
	}
	
//	public TreeParent addChild(ArrayList<TreeChild> child) {
//		return null;
//		 
//	}

	public void setName(String name) {
		this.name = name;
	}
}
