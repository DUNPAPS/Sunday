package com.herbert.trialple.model.xml.tree;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.Position;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resources.LoadResources;

import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.Module;
import Trialple.ModuleList;
import Trialple.Phase;
import Trialple.Phaselist;

public class ModuleTree extends TreeChild {
	private ArrayList<TreeChild> children;
	private Position position;
	private Module module;
	private ModuleTree parent;
	private ModuleTree modulesRoot;
	private ModuleTree roadMapRoot;
	private ModuleTree subModuleDefsRoot;
	private ModuleTree phaseDefsRoot;

	public ModuleTree(String name) {
		super(name);
		children = new ArrayList<TreeChild>();
	}

	public ModuleTree addChild(TreeChild child) {
		children.add(child);
		setParent(this);
		return this;
	}

	public void removeChild(TreeChild child) {
		children.remove(child);
		setParent(null);
	}

	public TreeChild[] getChildren() {
		return (TreeChild[]) children.toArray(new TreeChild[children.size()]);
	}

	public boolean hasChildren() {
		return children.size() > 0;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public void setParent(ModuleTree parent) {
		this.parent = parent;
	}

	public ModuleTree getParent() {
		return parent;
	}

	public ModuleTree getRoot() {
		ModuleTree mainRoot = new ModuleTree("");
		roadMapRoot = new ModuleTree("RoadMap");
		modulesRoot = new ModuleTree("Modules");
		subModuleDefsRoot = new ModuleTree("SubModuleDefs");
		phaseDefsRoot = new ModuleTree("PhaseDefs");
		mainRoot.addChild(roadMapRoot);
		mainRoot.addChild(modulesRoot);
		mainRoot.addChild(subModuleDefsRoot);
		mainRoot.addChild(phaseDefsRoot);

		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		ExecutionControl executionControl = rootObject.getExecutionControl();
		EList<ModuleList> modules = executionControl.getModules();
		ModuleList moduleList = modules.get(0);
		EList<Module> module3 = moduleList.getModule();

		for (Module mod : module3) {

			String name = mod.getName();
			ModuleTree treeParent = new ModuleTree(name);
			treeParent.setModule(mod);

			Phaselist plist = mod.getPhaselist();
			if (plist != null) {

				EList<Phase> phases = plist.getPhase();
				if (phases.size() > 0) {
					for (Phase phase : phases) {
						String phasename = phase.getName();
						PhaseTree phaseTree = new PhaseTree(phasename);
						phaseTree.setPhase(phase);
						treeParent.addChild(phaseTree);
					}
				}
			}

			modulesRoot.addChild(treeParent);
		}
		return mainRoot;

	}
}
