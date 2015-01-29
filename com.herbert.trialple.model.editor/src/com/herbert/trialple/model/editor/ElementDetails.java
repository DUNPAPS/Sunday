package com.herbert.trialple.model.editor;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * 
 * @author D063076
 * 
 */
public class ElementDetails extends FormPage {

	/**
	 * Create the form page.
	 * 
	 * @param id
	 * @param title
	 */
	public ElementDetails(String id, String title) {
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
	public ElementDetails(FormEditor editor, String id, String title) {
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
		toolkit.decorateFormHeading(form.getForm());
		

		
		
	}
	
}
