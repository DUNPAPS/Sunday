package com.herbert.trialple.model.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

import Trialple.DocumentRoot;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;

public class Variants extends FormPage {
	private Text name;
	private Text src;
	private Text version;

	/**
	 * Create Attributes form page.
	 * 
	 * @param id
	 * @param title
	 */
	public Variants(String id, String title) {
		super(id, title);
	}

	/**
	 * Create Attributes form page.
	 * 
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public Variants(FormEditor editor, String id, String title) {
		super(editor, id, title);
		setActive(true);
	}

	/**
	 * Create Attributes form page.
	 * 
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText(" Variants ");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody()
				.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpExecutioncontrol = new Group(managedForm.getForm().getBody(),
				SWT.NONE);
		grpExecutioncontrol.setFont(SWTResourceManager.getFont("Segoe UI", 12,
				SWT.BOLD));
		grpExecutioncontrol.setText("ExecutionControl");
		managedForm.getToolkit().adapt(grpExecutioncontrol);
		managedForm.getToolkit().paintBordersFor(grpExecutioncontrol);

		name = new Text(grpExecutioncontrol, SWT.BORDER);
		name.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.CENTER));
		name.setBounds(211, 123, 232, 26);
		managedForm.getToolkit().adapt(name, true, true);
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		name.setText(rootObject.getExecutionControl().getName());

		src = new Text(grpExecutioncontrol, SWT.BORDER);
		src.setBounds(211, 171, 232, 26);
		managedForm.getToolkit().adapt(src, true, true);

		version = new Text(grpExecutioncontrol, SWT.BORDER);
		version.setBounds(211, 216, 232, 26);
		managedForm.getToolkit().adapt(version, true, true);

		Label lblName = new Label(grpExecutioncontrol, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(116, 123, 55, 26);
		managedForm.getToolkit().adapt(lblName, true, true);
		lblName.setText("Name:");

		Label lblSrc = new Label(grpExecutioncontrol, SWT.NONE);
		lblSrc.setText("Src ID:");
		lblSrc.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSrc.setAlignment(SWT.CENTER);
		lblSrc.setBounds(116, 171, 55, 26);
		managedForm.getToolkit().adapt(lblSrc, true, true);

		Label VersionName = new Label(grpExecutioncontrol, SWT.NONE);
		VersionName.setText("Version:");
		VersionName.setFont(SWTResourceManager.getFont("Segoe UI", 12,
				SWT.NORMAL));
		VersionName.setAlignment(SWT.CENTER);
		VersionName.setBounds(116, 216, 55, 26);
		managedForm.getToolkit().adapt(VersionName, true, true);

	}
}
