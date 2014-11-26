package com.herbert.trialple.model.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import com.herbert.trialple.model.outline.OutlineView;

public class PhaseListEditor extends FormEditor {

	public static final int ElementDetials = 0;
	public static final int PhaseDetails_Page = 1;
	public static final int Variants_PAGE = 2;

	public PhaseListEditor() {
	}

	void createPage0() {
		ElementDetials elementDetials = new ElementDetials(this, "ID",
				" Element Detials ");
		try {
			addPage(ElementDetials, elementDetials);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		setPageText(ElementDetials, " Element Detials ");
	}

	void createPage1() {
		PhaseDetails phaseDetails = new PhaseDetails(this, "ID", " Phase Details ");
		try {
			addPage(PhaseDetails_Page, phaseDetails);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		setPageText(PhaseDetails_Page, " Phase Details ");
	}
	
	void createPage2() {
		Variants variants = new Variants(this, "ID", " Variants ");
		try {
			addPage(Variants_PAGE, variants);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		setPageText(Variants_PAGE, " Variants ");
	}

	@Override
	public void setActivePage(int pageIndex) {
		super.setActivePage(Variants_PAGE);
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
		createPage1();
		createPage2();
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
