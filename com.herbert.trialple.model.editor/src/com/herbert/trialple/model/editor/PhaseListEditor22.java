package com.herbert.trialple.model.editor;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.herbert.trialple.model.outline.OutlineView;

public class PhaseListEditor22 extends MultiPageEditorPart implements
		IResourceChangeListener {
	public PhaseListEditor22() {
	}

	@Override
	protected void createPages() {
		createPage0();
		createPage1();

	}

	@Override
	protected void setActivePage(int pageIndex) {
		super.setActivePage(0);
	}

	/**
	 * Elementt Details Editor
	 */
	private void createPage0() {
		ElementDetialsEditor elementDetialsEditor = new ElementDetialsEditor(
				getContainer(), SWT.NONE);

		int index = addPage(elementDetialsEditor);
		setPageText(index, " Element Details ");
	}

	/**
	 * OptionsPageEditor
	 */
	private void createPage1() {
		VariantsEditor optionsFilterEditor = new VariantsEditor(
				getContainer(), SWT.NONE);

		int index = addPage(optionsFilterEditor);
		setPageText(index, " Options Filter Editor ");
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
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		if (adapter.equals(ContentOutlinePage.class)) {
			OutlineView ov = new OutlineView();
			return ov;
		}

		return null;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unused")
	@Override
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		Object adapter = getActiveEditor().getAdapter(IContentOutlinePage.class);
	}
}
