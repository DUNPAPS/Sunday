package com.herbert.trialple.model.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
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
		btnSearch.setText("Load File");
		btnSearch.addSelectionListener(new SelectionListener() {
 
			public void widgetDefaultSelected(SelectionEvent e) {
			}
 
			public void widgetSelected(SelectionEvent e) {
				FileDialog dlg = new FileDialog(btnSearch.getShell(),  SWT.OPEN  );
				dlg.setText("Open");
				String path = dlg.open();
				if (path == null) return;
				text.setText(path);
			}
		});
		
		Label lblFilePath = new Label(container, SWT.NONE);
		lblFilePath.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblFilePath.setBounds(10, 107, 96, 27);
		lblFilePath.setText("File Path");
	}
	protected void browseForDir(Text text) {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.OPEN);
		dialog.setFilterPath(getDirPath(text));
		String path = dialog.open();
		text.setText(path != null ? path : "");
	}
	private String getDirPath(Text text) {
		String textString = text != null ? text.getText().trim() : "";
		Path path = new Path(textString);
		return path.toOSString();
	}
	public String getPath() {
		String path = text.getText().toString();
		return path;
	
	}
	public String getText() {
		return text.getText();
 
	}
}
