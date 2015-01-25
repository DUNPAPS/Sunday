package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;


public class TreeChild implements IAdaptable{
	private String name;
	private TreeParent parent;
	private TreeChild child;
	private Object data;
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

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getData(){
		return data;
	}
	protected void setData(Object data){
		this.data = data;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
