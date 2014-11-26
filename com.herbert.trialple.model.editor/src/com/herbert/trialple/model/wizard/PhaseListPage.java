package com.herbert.trialple.model.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class PhaseListPage extends WizardPage {
	private Text text;

	/**
	 * Create the wizard.
	 */
	public PhaseListPage() {
		super("wizardPage");
		setTitle("Phaselist Loader");
		setDescription("Loads PhaseList XML Files Only");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(null);
		
		text = new Text(container, SWT.BORDER | SWT.SEARCH);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		text.setBounds(10, 140, 408, 27);
		
		Button btnSearch = new Button(container, SWT.NONE);
		btnSearch.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSearch.setBounds(424, 140, 75, 27);
		btnSearch.setText("Search");
		
		Label lblFilePath = new Label(container, SWT.NONE);
		lblFilePath.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblFilePath.setBounds(10, 107, 96, 27);
		lblFilePath.setText("File Path");
	}

}
