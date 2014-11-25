package com.herbert.trialple.model.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.widgets.Group;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.Module;
import Trialple.Modules;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;

/**
 * 
 * @author D057271
 * 
 */
public class ElementDetials extends FormPage {
	private Text name;
	private Text description;

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public ElementDetials(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * 
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public ElementDetials(FormEditor editor, String id, String title) {
		super(editor, id, title);
		setActive(true);
	}

	public static String getParameterDefinitionPageId() {
		return "ID";
	}

	/**
	 * Create contents of the form.
	 * 
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText(" ElementDetials ");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody()
				.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpModules = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpModules
				.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		grpModules.setText("Modules");
		managedForm.getToolkit().adapt(grpModules);
		managedForm.getToolkit().paintBordersFor(grpModules);

		name = new Text(grpModules, SWT.BORDER);
		name.setBounds(232, 130, 226, 30);
		managedForm.getToolkit().adapt(name, true, true);

		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		ExecutionControl executionControl = rootObject.getExecutionControl();
		EList<Modules> modules = executionControl.getModules();
		Modules modules2 = modules.get(0); // the first module list object
		EList<Module> module = modules2.getModule();
		Module module2 = module.get(2);
		name.setText(module2.getName());

		description = new Text(grpModules, SWT.BORDER);
		description.setBounds(232, 187, 226, 30);
		managedForm.getToolkit().adapt(description, true, true);

		Label lblName = new Label(grpModules, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblName.setAlignment(SWT.CENTER);
		lblName.setBounds(141, 128, 55, 30);
		managedForm.getToolkit().adapt(lblName, true, true);
		lblName.setText("Name:");

		Label lblDescription = new Label(grpModules, SWT.NONE);
		lblDescription.setText("Description:");
		lblDescription.setFont(SWTResourceManager.getFont("Segoe UI", 12,
				SWT.NORMAL));
		lblDescription.setAlignment(SWT.CENTER);
		lblDescription.setBounds(99, 185, 97, 30);
		managedForm.getToolkit().adapt(lblDescription, true, true);

	}

}
