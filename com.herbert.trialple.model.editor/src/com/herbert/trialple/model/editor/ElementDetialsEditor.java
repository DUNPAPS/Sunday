package com.herbert.trialple.model.editor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import Trialple.DocumentRoot;
import Trialple.ExecutionControl;
import Trialple.Module;
import Trialple.Modules;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;
public class ElementDetialsEditor extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Group grpModule;
	private Label lblName;
	private Text text_Name;
	private Label lblDescription;
	private Text text_Description;
	private Label lblOptions;
	private List list_Options;
	private Label lblPostevent;
	private Text text_Postevent;
	private Label lblRevokemodule;
	private Text text_Revokemodule;
	private Label lblPrecedences;
	private List list_Precedences;
	private Label lblPassword;
	private Text text_Password;
	
	
	

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ElementDetialsEditor(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(null);
		
		grpModule = new Group(this, SWT.NONE);
		grpModule.setText("Module");
		grpModule.setBounds(49, 40, 662, 527);
		toolkit.adapt(grpModule);
		toolkit.paintBordersFor(grpModule);
		
		lblName = new Label(grpModule, SWT.NONE);
		lblName.setBounds(10, 54, 70, 20);
		toolkit.adapt(lblName, true, true);
		lblName.setText("Name");
		
		text_Name = new Text(grpModule, SWT.BORDER);
		text_Name.setBounds(120, 51, 302, 26);
		toolkit.adapt(text_Name, true, true);
		
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		ExecutionControl executionControl = rootObject.getExecutionControl();
		EList<Modules> modules = executionControl.getModules();
		Modules modules2 = modules.get(0); // the first module list object
		EList<Module> module = modules2.getModule();
		Module module2 = module.get(2);
		text_Name.setText(module2.getName());
		
		lblDescription = new Label(grpModule, SWT.NONE);
		lblDescription.setBounds(10, 106, 90, 20);
		toolkit.adapt(lblDescription, true, true);
		lblDescription.setText("Description");
		
		text_Description = new Text(grpModule, SWT.BORDER);
		text_Description.setBounds(120, 103, 302, 26);
		toolkit.adapt(text_Description, true, true);
		
		lblOptions = new Label(grpModule, SWT.NONE);
		lblOptions.setBounds(10, 159, 70, 20);
		toolkit.adapt(lblOptions, true, true);
		lblOptions.setText("Options");
		
		list_Options = new List(grpModule, SWT.BORDER);
		list_Options.setBounds(120, 144, 302, 68);
		toolkit.adapt(list_Options, true, true);
		
		lblPostevent = new Label(grpModule, SWT.NONE);
		lblPostevent.setBounds(10, 238, 70, 20);
		toolkit.adapt(lblPostevent, true, true);
		lblPostevent.setText("Postevent");
		
		text_Postevent = new Text(grpModule, SWT.BORDER);
		text_Postevent.setBounds(120, 232, 302, 26);
		toolkit.adapt(text_Postevent, true, true);
		
		lblRevokemodule = new Label(grpModule, SWT.NONE);
		lblRevokemodule.setBounds(10, 273, 104, 20);
		toolkit.adapt(lblRevokemodule, true, true);
		lblRevokemodule.setText("Revokemodule");
		
		text_Revokemodule = new Text(grpModule, SWT.BORDER);
		text_Revokemodule.setBounds(120, 270, 302, 26);
		toolkit.adapt(text_Revokemodule, true, true);
		
		lblPrecedences = new Label(grpModule, SWT.NONE);
		lblPrecedences.setBounds(10, 344, 98, 20);
		toolkit.adapt(lblPrecedences, true, true);
		lblPrecedences.setText("Precedences");
		
		list_Precedences = new List(grpModule, SWT.BORDER);
		list_Precedences.setBounds(120, 325, 302, 68);
		toolkit.adapt(list_Precedences, true, true);
		
		lblPassword = new Label(grpModule, SWT.NONE);
		lblPassword.setBounds(10, 422, 70, 20);
		toolkit.adapt(lblPassword, true, true);
		lblPassword.setText("Password");
		
		text_Password = new Text(grpModule, SWT.BORDER);
		text_Password.setBounds(120, 419, 302, 26);
		toolkit.adapt(text_Password, true, true);
		
		Combo combo_ModuleType = new Combo(grpModule, SWT.NONE);
		combo_ModuleType.setBounds(470, 87, 136, 28);
		toolkit.adapt(combo_ModuleType);
		toolkit.paintBordersFor(combo_ModuleType);
		
		Label lblType = new Label(grpModule, SWT.NONE);
		lblType.setBounds(495, 54, 78, 20);
		toolkit.adapt(lblType, true, true);
		lblType.setText("Type");
		
		Button btnMandatory = new Button(grpModule, SWT.CHECK);
		btnMandatory.setBounds(470, 257, 111, 20);
		toolkit.adapt(btnMandatory, true, true);
		btnMandatory.setText("Mandatory");
		
		Button btnInterruptible = new Button(grpModule, SWT.CHECK);
		btnInterruptible.setBounds(470, 302, 111, 20);
		toolkit.adapt(btnInterruptible, true, true);
		btnInterruptible.setText("Interruptible");
		
		Button btnChecmode = new Button(grpModule, SWT.CHECK);
		btnChecmode.setBounds(470, 344, 111, 20);
		toolkit.adapt(btnChecmode, true, true);
		btnChecmode.setText("Checmode");

	}
}
