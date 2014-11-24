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

import Trialple.DocumentRoot;

import com.herbert.trialple.model.outline.OutlineView;
import com.herbert.trialple.model.resource.LoadResources;

public class VariantsEditor extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text text_Name;
	private Text text_Report;
	private Text textDescription;

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
		
		Group grpVariant = new Group(this, SWT.NONE);
		grpVariant.setText("ExecutionControl");
		grpVariant.setBounds(10, 10, 602, 280);
		toolkit.adapt(grpVariant);
		toolkit.paintBordersFor(grpVariant);
		
		Label lblName = new Label(grpVariant, SWT.NONE);
		lblName.setBounds(30, 52, 70, 20);
		toolkit.adapt(lblName, true, true);
		lblName.setText("Name");
		
		Label lblReport = new Label(grpVariant, SWT.NONE);
		lblReport.setBounds(30, 101, 110, 20);
		toolkit.adapt(lblReport, true, true);
		lblReport.setText("Srcid [Perforce]");
		
		Label lblDescription = new Label(grpVariant, SWT.NONE);
		lblDescription.setBounds(30, 146, 89, 20);
		toolkit.adapt(lblDescription, true, true);
		lblDescription.setText("Version");
		
		text_Name = new Text(grpVariant, SWT.BORDER);
		text_Name.setBounds(176, 52, 302, 26);
		toolkit.adapt(text_Name, true, true);
		
		LoadResources loadResources = new LoadResources();
		loadResources.loadResouces(OutlineView.getContentFile());
		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
		text_Name.setText(rootObject.getExecutionControl().getName());
		
		text_Report = new Text(grpVariant, SWT.BORDER);
		text_Report.setBounds(176, 101, 302, 26);
		toolkit.adapt(text_Report, true, true);
		text_Report.setText(rootObject.getExecutionControl().getSrcid());
		
		
		textDescription = new Text(grpVariant, SWT.BORDER);
		textDescription.setBounds(176, 146, 302, 26);
		toolkit.adapt(textDescription, true, true);
		textDescription.setText(rootObject.getExecutionControl().getVersion());

		

		
		/*this is replicated*/
//		Group grpVariant = new Group(this, SWT.NONE);
//		grpVariant.setText("Variant");
//		grpVariant.setBounds(10, 10, 552, 389);
//		toolkit.adapt(grpVariant);
//		toolkit.paintBordersFor(grpVariant);
//		
//		Label lblName = new Label(grpVariant, SWT.NONE);
//		lblName.setBounds(30, 52, 70, 20);
//		toolkit.adapt(lblName, true, true);
//		lblName.setText("Name");
//		
//		Label lblReport = new Label(grpVariant, SWT.NONE);
//		lblReport.setBounds(30, 101, 70, 20);
//		toolkit.adapt(lblReport, true, true);
//		lblReport.setText("Report");
//		
//		Label lblDescription = new Label(grpVariant, SWT.NONE);
//		lblDescription.setBounds(30, 146, 89, 20);
//		toolkit.adapt(lblDescription, true, true);
//		lblDescription.setText("Description");
//		
//		text_Name = new Text(grpVariant, SWT.BORDER);
//		text_Name.setBounds(139, 52, 291, 26);
//		toolkit.adapt(text_Name, true, true);
//		
//		LoadResources loadResources = new LoadResources();
//		loadResources.loadResouces(OutlineView.getContentFile());
//		
//		DocumentRoot rootObject = (DocumentRoot) loadResources.getRootObject();
//		text_Name.setText(rootObject.getExecutionControl().getName());
//		
//		text_Report = new Text(grpVariant, SWT.BORDER);
//		text_Report.setBounds(139, 101, 291, 26);
//		toolkit.adapt(text_Report, true, true);
//		
//		textDescription = new Text(grpVariant, SWT.BORDER);
//		textDescription.setBounds(139, 146, 291, 26);
//		toolkit.adapt(textDescription, true, true);


	}

}
