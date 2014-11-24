 package com.herbert.trialple.model.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

import Trialple.DocumentRoot;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;

public class VariantsEditor extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text text_name;
	private Text text_srcid;
	private Text text_version;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public VariantsEditor(Composite parent, int style) {
		super(parent, style);
		
		
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(null);
		
		Group grpExecutioncontrol = new Group(this, SWT.NONE);
		grpExecutioncontrol.setText("ExecutionControl");
		grpExecutioncontrol.setBounds(10, 0, 1103, 567);
		toolkit.adapt(grpExecutioncontrol);
		toolkit.paintBordersFor(grpExecutioncontrol);
		
		text_name = new Text(grpExecutioncontrol, SWT.BORDER | SWT.CENTER);
		text_name.setBounds(444, 185, 365, 40);
		toolkit.adapt(text_name, true, true);
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		text_name.setText(rootObject.getExecutionControl().getName());
		
		text_srcid = new Text(grpExecutioncontrol, SWT.BORDER);
		text_srcid.setBounds(444, 272, 365, 40);
		toolkit.adapt(text_srcid, true, true);
		
		text_version = new Text(grpExecutioncontrol, SWT.BORDER);
		text_version.setBounds(444, 355, 365, 40);
		toolkit.adapt(text_version, true, true);
		
		Label label_name = new Label(grpExecutioncontrol, SWT.NONE);
		label_name.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		label_name.setAlignment(SWT.CENTER);
		label_name.setBounds(295, 185, 97, 47);
		toolkit.adapt(label_name, true, true);
		label_name.setText("Name");
		
		Label label_srcid = new Label(grpExecutioncontrol, SWT.NONE);
		label_srcid.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		label_srcid.setText("SrcID");
		label_srcid.setAlignment(SWT.CENTER);
		label_srcid.setBounds(295, 272, 97, 47);
		toolkit.adapt(label_srcid, true, true);
		
		Label lblVersion = new Label(grpExecutioncontrol, SWT.NONE);
		lblVersion.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblVersion.setText("Version");
		lblVersion.setAlignment(SWT.CENTER);
		lblVersion.setBounds(295, 355, 97, 47);
		toolkit.adapt(lblVersion, true, true);
		
 
}

		
		
 
}
