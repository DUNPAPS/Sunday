package com.herbert.trialple.model.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.statushandlers.StatusManager;

import Trialple.DocumentRoot;
import Trialple.TrialplePackage;
import Trialple.util.TrialpleResourceFactoryImpl;

public class PhaseListWizard extends Wizard implements INewWizard {
	@SuppressWarnings("unused")
	private IStructuredSelection selection;
	private PhaseListPage phaseListPage;
	private IWorkbench workbench;

	public PhaseListWizard() {
		super();
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
 
	public IFile getModelFile() {
		
		 Path path = new Path(phaseListPage.getPath());
		    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		return file;
	}
	public boolean performFinish() {

		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							 
							// Get the URI of the model file.
							final URI platformResourceURI = URI.createFileURI(phaseListPage.getText());
//							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							ResourceSet resourceSet = new ResourceSetImpl();
							resourceSet.getPackageRegistry().put(TrialplePackage.eNS_URI, TrialplePackage.eINSTANCE);
							/*Register the package for loading*/

							resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
							.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new TrialpleResourceFactoryImpl());
							
							
							Resource resource = resourceSet.getResource(platformResourceURI, true);
							
							
							EObject rootObject = getRootObject(resource);
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}

							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, "UTF-8");
							resource.save(options);
						}
						catch (Exception exception) {
							Status failStatus = new Status(IStatus.ERROR, "myPluginId", "Error Message", exception);
						    StatusManager.getManager().handle(failStatus, StatusManager.SHOW);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				Status failStatus = new Status(IStatus.ERROR, "myPluginId", "Error Message", exception);
			    StatusManager.getManager().handle(failStatus, StatusManager.SHOW);
			}

			return true;
		}
		catch (Exception exception) {
			Status failStatus = new Status(IStatus.ERROR, "myPluginId", "Error Message", exception);
		    StatusManager.getManager().handle(failStatus, StatusManager.SHOW);
			return false;
		}
	}
 


/**
 * The method loads returns the root object of the read XML file needed to populate the 
 * fields in the UI
 * @param resource
 * @return documentRoot
 */
protected static EObject getRootObject(Resource resource) {
	EList<EObject> contents = resource.getContents();
	if (contents.size() == 0) {
		return null;
	}
	EObject documentRoot = contents.get(0);
	if (documentRoot != null) {
		for (EObject element : documentRoot.eContents()) {
			if (element instanceof DocumentRoot) {
				return element;
			}
		}
	}
	
	if (documentRoot instanceof DocumentRoot) {
		return documentRoot;
	}
	
	return null;
}

 


	public void addPages() {
		phaseListPage= new PhaseListPage();
		addPage(phaseListPage);
	}
}
