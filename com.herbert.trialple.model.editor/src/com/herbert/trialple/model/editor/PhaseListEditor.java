package com.herbert.trialple.model.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.herbert.trialple.model.outline.OutlineView;

public class PhaseListEditor extends MultiPageEditorPart {

	public static final String ID = "com.herbert.trialple.model.editor.test"; //$NON-NLS-1$

	public PhaseListEditor() {
	}

	@Override
	protected void createPages() {
		createPage0();
		createPage1();

	}
	@Override
	protected void setActivePage(int pageIndex) {
		// TODO Auto-generated method stub
		super.setActivePage(0);
	}
	
	/**
	 * Elementt Details Editor
	 */
	private void createPage0() {
		ElementDetialsEditor elementDetialsEditor = new ElementDetialsEditor(
				getContainer(), SWT.NONE);

		int index = addPage(elementDetialsEditor);
		setPageText(index, "Element Details");
	}

	/**
	 * VariantsEditor
	 */
	private void createPage1() {
		VariantsEditor variantsEditor = new VariantsEditor(
				getContainer(), SWT.NONE);

		int index = addPage(variantsEditor);
		setPageText(index, "Variants");
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			OutlineView ov = new OutlineView();
			return ov;
		}

		return null;
	}

}
