package com.herbert.trialple.model.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class PhaseListWizard extends Wizard implements INewWizard {
	@SuppressWarnings("unused")
	private IStructuredSelection selection;

	public PhaseListWizard() {
		super();
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	public boolean performFinish() {

		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {

			}

		};
		return false;

	}

	public void addPages() {
		PhaseListPage t = new PhaseListPage();
		addPage(t);
	}
}
