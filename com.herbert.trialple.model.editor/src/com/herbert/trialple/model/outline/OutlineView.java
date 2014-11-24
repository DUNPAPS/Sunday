package com.herbert.trialple.model.outline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.herbert.trialple.model.provider.PhaseListContentProvider;
import com.herbert.trialple.model.provider.PhaseListLabelProvider;
import com.herbert.trialple.model.xmlElement.TreeParent;

public class OutlineView extends ContentOutlinePage implements
		IContentOutlinePage {
	private final static String CONTENT_FILE = "C:/Users/D063076/Desktop/new_trial_phl .xml";
	private TreeViewer tree;
	private Document doc;

	/**
	 * @wbp.parser.entryPoint
	 */
	public OutlineView() {
		super();
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		tree = new TreeViewer(parent, 0);
		tree.setContentProvider(new PhaseListContentProvider());
		tree.setLabelProvider(new PhaseListLabelProvider());
		tree.setInput(getInitialInput());
		tree.refresh();
		this.tree.addSelectionChangedListener(this);
		this.getSite().setSelectionProvider(this.tree);

	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public Control getControl() {
		return this.tree.getControl();
	}

	@Override
	public void setActionBars(IActionBars actionBars) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		if (this.tree.getControl().isDisposed()) {
			this.tree.refresh();
		}

	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		this.tree.addSelectionChangedListener(listener);

	}

	@Override
	public ISelection getSelection() {
		if (this.tree == null) {
			return StructuredSelection.EMPTY;
		}
		return this.tree.getSelection();
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		this.tree.removeSelectionChangedListener(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		if (this.tree != null) {
			this.tree.setSelection(selection);
		}
	}

	public TreeParent getInitialInput() {
		TreeParent root = new TreeParent("");
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    factory.setIgnoringComments(true);
			String xmlString = readFile(getContentFile());
			doc = factory.newDocumentBuilder()
					.parse(new InputSource(new StringReader(xmlString)));
			
			NodeList nodelist = doc.getChildNodes();
			addSubTree(root, nodelist.item(0));

		} catch (Exception e) {
			// TODO: handle exception
		}
		return root;
	}

	/**
	 * 
	 * @param root
	 * @param node
	 */
	private void addSubTree(TreeParent root, Node node) {
		TreeParent child = new TreeParent(node.getNodeName());
		root.addChild(child);
		NodeList childList = node.getChildNodes();
		int length = childList.getLength();
		for (int i = 0; i < length; i++) {
			if (childList.item(i).getNodeType() != Node.TEXT_NODE) {
				addSubTree(child, childList.item(i));
			}
		}
	}

	@SuppressWarnings("resource")
	public static String readFile(String file) throws IOException {
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}

		return stringBuilder.toString();
	}

	public static String getContentFile() {
		return CONTENT_FILE;
	}
	
}
