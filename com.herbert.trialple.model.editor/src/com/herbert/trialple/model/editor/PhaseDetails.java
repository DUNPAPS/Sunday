package com.herbert.trialple.model.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.SWTResourceManager;

import Trialple.Arguments;
import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.Module;
import Trialple.Modules;
import Trialple.Phase;
import Trialple.Phaselist;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;

public class PhaseDetails extends FormPage {
	private Text text_Name;
	private Text text_Arguments;
	private Text text_Action;
	private Text text_Usage;
	private Text text_Options;
	private Text text_Password;
	private Text text_Logfile;
	private Text text_ElgFile;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public PhaseDetails(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public PhaseDetails(FormEditor editor, String id, String title) {
		super(editor, id, title);
		setActive(true);
	}
	public static String getParameterDefinitionPageId() {
		return "ID";
	}
	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Phase List Element Details");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		
		Group grpPhase = new Group(managedForm.getForm().getBody(), SWT.NONE);
		grpPhase.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		grpPhase.setText("Phase");
		grpPhase.setBounds(10, 10, 774, 582);
		managedForm.getToolkit().adapt(grpPhase);
		managedForm.getToolkit().paintBordersFor(grpPhase);
		
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		ExecutionControl executionControl = rootObject.getExecutionControl();
		EList<Modules> modulesList = executionControl.getModules();
		Modules modules = modulesList.get(0); // the first list of modules list object
		EList<Module> moduleList = modules.getModule(); //List of modules
		Module module2 = moduleList.get(2); //module number 3 [0,1,2,...]
		Phaselist phaselist1 = module2.getPhaselist();
		EList<Phase> phasesList1 = phaselist1.getPhase();
		Phase phase4 = phasesList1.get(3);
		
		Label lblName = new Label(grpPhase, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblName.setBounds(62, 34, 85, 33);
		managedForm.getToolkit().adapt(lblName, true, true);
		lblName.setText("Name");
		
		text_Name = new Text(grpPhase, SWT.BORDER);
		text_Name.setBounds(168, 38, 333, 26);
		managedForm.getToolkit().adapt(text_Name, true, true);
		text_Name.setText(phase4.getName());
		
		Label lblArguments = new Label(grpPhase, SWT.NONE);
		lblArguments.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblArguments.setBounds(26, 409, 100, 33);
		managedForm.getToolkit().adapt(lblArguments, true, true);
		lblArguments.setText("Arguments");
		
		text_Arguments = new Text(grpPhase, SWT.BORDER);
		text_Arguments.setBounds(168, 413, 333, 76);
		managedForm.getToolkit().adapt(text_Arguments, true, true);
		Arguments argsList = phase4.getArgs(); 
		EList<String> arguments = argsList.getArg();
		System.out.println("these arguments "+ arguments);
		text_Arguments.setText(arguments.get(0)+ " \r\n"+arguments.get(1));
		
		Label lblAction = new Label(grpPhase, SWT.NONE);
		lblAction.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAction.setBounds(56, 242, 70, 30);
		managedForm.getToolkit().adapt(lblAction, true, true);
		lblAction.setText("Action");
		
		text_Action = new Text(grpPhase, SWT.BORDER);
		text_Action.setBounds(168, 246, 333, 26);
		managedForm.getToolkit().adapt(text_Action, true, true);
		text_Action.setText(phase4.getAction());
		
		Label lblUsage = new Label(grpPhase, SWT.NONE);
		lblUsage.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblUsage.setBounds(62, 290, 70, 30);
		managedForm.getToolkit().adapt(lblUsage, true, true);
		lblUsage.setText("Usage");
		
		text_Usage = new Text(grpPhase, SWT.BORDER);
		text_Usage.setBounds(168, 294, 333, 26);
		managedForm.getToolkit().adapt(text_Usage, true, true);
		EList<String> usageList = phase4.getUsage();
		//text_Usage.setText(usageList.get(0));
		
		Label lblOptions = new Label(grpPhase, SWT.NONE);
		lblOptions.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblOptions.setBounds(41, 342, 85, 33);
		managedForm.getToolkit().adapt(lblOptions, true, true);
		lblOptions.setText("Options");
		
		text_Options = new Text(grpPhase, SWT.BORDER);
		text_Options.setBounds(168, 326, 334, 81);
		managedForm.getToolkit().adapt(text_Options, true, true);
		
		Label lblPassword = new Label(grpPhase, SWT.NONE);
		lblPassword.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblPassword.setBounds(41, 179, 85, 30);
		managedForm.getToolkit().adapt(lblPassword, true, true);
		lblPassword.setText("Password");
		
		text_Password = new Text(grpPhase, SWT.BORDER);
		text_Password.setBounds(168, 183, 333, 26);
		managedForm.getToolkit().adapt(text_Password, true, true);
		text_Password.setText(phase4.getPassword());
		
		Label lblLogFile = new Label(grpPhase, SWT.NONE);
		lblLogFile.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblLogFile.setBounds(56, 73, 85, 30);
		managedForm.getToolkit().adapt(lblLogFile, true, true);
		lblLogFile.setText("Log file");
		
		text_Logfile = new Text(grpPhase, SWT.BORDER);
		text_Logfile.setBounds(168, 77, 333, 26);
		managedForm.getToolkit().adapt(text_Logfile, true, true);
		text_Logfile.setText(phase4.getLogfile());
		
		Label lblElgfile = new Label(grpPhase, SWT.NONE);
		lblElgfile.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblElgfile.setBounds(41, 128, 70, 33);
		managedForm.getToolkit().adapt(lblElgfile, true, true);
		lblElgfile.setText("ElgFile");
		
		text_ElgFile = new Text(grpPhase, SWT.BORDER);
		text_ElgFile.setBounds(168, 132, 333, 26);
		managedForm.getToolkit().adapt(text_ElgFile, true, true);
		if(!(phase4.getElgfile()==null)){
		text_ElgFile.setText(phase4.getElgfile());
			
		}
	}
}
