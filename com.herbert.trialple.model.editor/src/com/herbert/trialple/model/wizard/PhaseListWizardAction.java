package com.herbert.trialple.model.wizard;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class PhaseListWizardAction implements IObjectActionDelegate {
	private ISelection selection;

	private IWorkbenchPart part;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.part = targetPart;
	}

	public void run(IAction action) {
		PhaseListWizard wizard = new PhaseListWizard();
		wizard.init(part.getSite().getWorkbenchWindow().getWorkbench(),
				(IStructuredSelection) selection);

		WizardDialog dialog = new WizardDialog(part.getSite()
				.getWorkbenchWindow().getWorkbench().getActiveWorkbenchWindow()
				.getShell(), wizard);
		dialog.create();
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
