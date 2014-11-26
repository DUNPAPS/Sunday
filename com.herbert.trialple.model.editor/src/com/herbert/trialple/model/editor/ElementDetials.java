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
import Trialple.Precedences;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resources.LoadResources;

import org.eclipse.swt.widgets.List;

/**
 * 
 * @author D063076
 * 
 */
public class ElementDetials extends FormPage {
	private Text text_name;
	private Text text_description;
	private Text text_postevent;
	private Text text_revokeModule;
	private Text text_password;

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
		form.setText(" Phase List Element Details ");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody()
				.setLayout(new FillLayout(SWT.HORIZONTAL));

		Group grpModules = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpModules
				.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpModules.setText("Module");
		managedForm.getToolkit().adapt(grpModules);
		managedForm.getToolkit().paintBordersFor(grpModules);

		text_name = new Text(grpModules, SWT.BORDER);
		text_name.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text_name.setBounds(173, 46, 390, 30);
		managedForm.getToolkit().adapt(text_name, true, true);
		
		/*Create the objects from resource*/
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		ExecutionControl executionControl = rootObject.getExecutionControl();
		EList<Modules> modules = executionControl.getModules();
		Modules modules2 = modules.get(0); // the first modules list object
		EList<Module> module = modules2.getModule(); //List of modules
		Module module2 = module.get(2); //module number 3 [0,1,2,...]
		text_name.setText(module2.getName());

		text_description = new Text(grpModules, SWT.BORDER);
		text_description.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text_description.setBounds(173, 95, 390, 30);
		managedForm.getToolkit().adapt(text_description, true, true);
		text_description.setText(module2.getDescription());
		
		Label lblName = new Label(grpModules, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblName.setBounds(101, 49, 57, 27);
		managedForm.getToolkit().adapt(lblName, true, true);
		lblName.setText("Name");
		
		Label lblDescription = new Label(grpModules, SWT.NONE);
		lblDescription.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblDescription.setBounds(55, 98, 109, 30);
		managedForm.getToolkit().adapt(lblDescription, true, true);
		lblDescription.setText("Description");
		
		Label lblPostevent = new Label(grpModules, SWT.NONE);
		lblPostevent.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblPostevent.setBounds(72, 149, 86, 30);
		managedForm.getToolkit().adapt(lblPostevent, true, true);
		lblPostevent.setText("Postevent");
		
		Label lblRevokeModule = new Label(grpModules, SWT.NONE);
		lblRevokeModule.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblRevokeModule.setBounds(20, 190, 147, 30);
		managedForm.getToolkit().adapt(lblRevokeModule, true, true);
		lblRevokeModule.setText("Revoke Module");
		
		Label lblPassword = new Label(grpModules, SWT.NONE);
		lblPassword.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblPassword.setBounds(72, 241, 86, 30);
		managedForm.getToolkit().adapt(lblPassword, true, true);
		lblPassword.setText("Password");
		
		text_postevent = new Text(grpModules, SWT.BORDER);
		text_postevent.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text_postevent.setBounds(173, 151, 390, 30);
		managedForm.getToolkit().adapt(text_postevent, true, true);
		text_postevent.setText(module2.getPostevent());
		
		text_revokeModule = new Text(grpModules, SWT.BORDER);
		text_revokeModule.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text_revokeModule.setBounds(173, 194, 390, 30);
		managedForm.getToolkit().adapt(text_revokeModule, true, true);
		text_revokeModule.setText(module2.getRevokemodule());
		
		text_password = new Text(grpModules, SWT.BORDER);
		text_password.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		text_password.setBounds(173, 243, 299, 30);
		managedForm.getToolkit().adapt(text_password, true, true);
		text_password.setText(module2.getPassword());
		
		Label lblOptions = new Label(grpModules, SWT.NONE);
		lblOptions.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblOptions.setBounds(81, 333, 77, 30);
		managedForm.getToolkit().adapt(lblOptions, true, true);
		lblOptions.setText("Options");
		
		Label lblPrecedences = new Label(grpModules, SWT.NONE);
		lblPrecedences.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblPrecedences.setBounds(43, 413, 121, 30);
		managedForm.getToolkit().adapt(lblPrecedences, true, true);
		lblPrecedences.setText("Precedences");
		
		List list_Options = new List(grpModules, SWT.BORDER);
		list_Options.setBounds(173, 316, 390, 68);
		managedForm.getToolkit().adapt(list_Options, true, true);
		
		
		List list_Precedences = new List(grpModules, SWT.BORDER);
		list_Precedences.setBounds(173, 403, 390, 62);
		managedForm.getToolkit().adapt(list_Precedences, true, true);
		EList<Precedences> precList = module2.getPrecedences();
		Precedences prec1 = precList.get(0);
		EList<String> pre = prec1.getPrecedence();
		String [] value2 = {pre.get(0).toString(),pre.get(1).toString(),pre.get(2).toString(),pre.get(3).toString()};
		list_Precedences.setItems(value2); 
		
		
	}
}
