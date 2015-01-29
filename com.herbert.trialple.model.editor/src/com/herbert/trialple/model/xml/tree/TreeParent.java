package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

import org.eclipse.jface.text.Position;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TreeParent extends TreeChild 
{
	@SuppressWarnings("rawtypes")
	private ArrayList<TreeChild> children;
	private Position position;
	public static final ArrayList<String> SUBMODES = new ArrayList<String>();

	@SuppressWarnings("rawtypes")
	public TreeParent(String name) 
	{
		super(name);
		children = new ArrayList<TreeChild>();
	}

	@SuppressWarnings("unchecked")
	public TreeParent addChild(TreeChild child) 
	{
		children.add(child);
		child.setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) 
	{
		children.remove(child);
		child.setParent(null);
	}

	@SuppressWarnings("unchecked")
	public TreeChild[] getChildren() 
	{
		return (TreeChild[])children.toArray(new TreeChild[children.size()]);
	}

	public boolean hasChildren()
	{
		return children.size() > 0;
	}

	public void setPosition(Position position) 
	{
		this.position = position;
	}

	public Position getPosition() 
	{
		return position;
	}
	public void setParent(TreeParent parent)
	{
		
	}

	/**
	 * shift the last section (UnitDefinition) to top of the tree
	 */
	@SuppressWarnings("unchecked")
	public void shift() 
	{
		children.add(children.remove(0));
	}
	public TreeParent addChild(ArrayList<TreeChild> child) 
	{
		return null;
	}
	
	private ArrayList<?> getElementByTagName(String name) 
	{
		return null;
	}

	
}
