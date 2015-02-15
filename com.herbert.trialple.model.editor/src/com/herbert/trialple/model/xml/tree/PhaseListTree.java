package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;

public class PhaseListTree extends TreeChild {
	private ArrayList<TreeChild> children;
	private PhaseListTree parent;

	public PhaseListTree(String name) {
		super(name);
		children = new ArrayList<TreeChild>();
	}

	public PhaseListTree addChild(TreeChild child) {
		children.add(child);
		setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) {
		children.remove(child);
		setParent(null);
	}

	public TreeChild[] getChildren() {
		 return (TreeChild[]) children.toArray(new
		 TreeChild[children.size()]);
//		ArrayList<TreeChild> kids = new ArrayList<TreeChild>();
//
//		ModuleTree treeChild = new ModuleTree("TreeChild One");
//		ModuleTree treeChild2 = new ModuleTree("TreeChild Two");
//		ModuleTree treeChild3 = new ModuleTree("TreeChild Three");
//		kids.add(treeChild);
//		kids.add(treeChild2);
//		kids.add(treeChild3);
//
//		TreeChild[] array = kids.toArray(new TreeChild[kids.size()]);
//
//		System.out.println("size of array: "+array.length);
//		for (TreeChild treeChild4 : array) {
//
//			PhaseListTree phaseListTree2 = new PhaseListTree("paps");
////			phaseListTree2.addChild(treeChild4);
//
//			TreeChild[] paps = new TreeChild[] { treeChild,
//					new PhaseListTree("One"), new PhaseListTree("Two"),
//					new PhaseListTree("Three") };
//			return paps;
//		}
//		return null	;
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public void setParent(PhaseListTree parent) {
		this.parent = parent;
	}

	public PhaseListTree getParent() {
		return parent;
	}

	public PhaseListTree getRoot() {
		PhaseListTree root = new PhaseListTree("");
		PhaseListTree root2 = new PhaseListTree("Modules");
		root2.addChild(root);
		return root;
	}
}
