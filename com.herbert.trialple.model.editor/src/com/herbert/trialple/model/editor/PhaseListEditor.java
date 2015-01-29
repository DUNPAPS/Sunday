package com.herbert.trialple.model.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.herbert.trialple.model.outline.OutlineView;

public class PhaseListEditor extends FormEditor {


	public PhaseListEditor() {
		super();
	}

	void createPage0() {
		ElementDetails elementDetails = new ElementDetails(this, "ID",
				" Element Details ");
		try {
			addPage(0, elementDetails);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		setPageText(0, " Phaselist Editor ");
	}
	@Override
	public void setActivePage(int pageIndex) {
		super.setActivePage(pageIndex);
	}

	@Override
	protected void pageChange(final int newPageIndex) {
		super.pageChange(newPageIndex);
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	protected void addPages() {
		createPage0();
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

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			OutlineView ov = new OutlineView();
			return ov;
		}

		return null;
	}

}
