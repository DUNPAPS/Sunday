package com.herbert.trialple.model.outline;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.LocatorImpl;

import com.herbert.trialple.model.document.PhaselistDocument;
import com.herbert.trialple.model.handler.PhaseListDefaultHandler;
import com.herbert.trialple.model.provider.PhaseListContentProvider;
import com.herbert.trialple.model.provider.PhaseListLabelProvider;
import com.herbert.trialple.model.provider.XMLParser;
import com.herbert.trialple.model.xmlElement.TreeParent;

public class OutlineView extends ContentOutlinePage implements
		IContentOutlinePage {
	//private final static String CONTENT_FILE = "C:/Users/dmuasya/git/Sunday/com.herbert.trialple.model.editor/printout.xml";
	private final static String CONTENT_FILE = "C:/Users/D063076/git/Sunday/com.herbert.trialple.model.editor/printout.xml";
	private static String builder;
	private TreeViewer tree;
	private Document doc;
	private PhaseListDefaultHandler phaseListDefaultHandler;

	public OutlineView() {
		super();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);

		/*
		 * find out which item in tree viewer is selected, and set highlight
		 * range accordingly
		 */
		IStructuredSelection selection = (IStructuredSelection) event
				.getSelection();
		if (selection.isEmpty()) {
		}

		else {
			TreeParent element = (TreeParent) ((IStructuredSelection) selection)
					.getFirstElement();
			String nodeName = element.toString();
			System.out.println(nodeName);

		}
	}

	/**
	 * Parses the document
	 * 
	 * @param element
	 */
	private void parseDocument(String nodeName) {
		Document newDocument = null;

		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder = docBuilderFactory.newDocumentBuilder();
			newDocument = docBuilder.newDocument();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		PhaselistDocument phaselistDocument = new PhaselistDocument(builder);
		XMLParser xmlParser = new XMLParser();
		phaseListDefaultHandler = new PhaseListDefaultHandler();
		phaseListDefaultHandler.setElement(nodeName);
		phaseListDefaultHandler.setIDocument(phaselistDocument);
		phaseListDefaultHandler.setDocument(newDocument);
		phaseListDefaultHandler.setDocumentLocator(new LocatorImpl());
		xmlParser.setContentHandler(phaseListDefaultHandler);
		xmlParser.doParse(builder);
	}

	/**
	 * Sets the context menu of the outline view
	 */
	private void hookContextMenu() {
		TreeMenuManager treeMenuManager = new TreeMenuManager();
		MenuManager menuMgr = new MenuManager("PopupMenu");
		treeMenuManager.SchemaTreeMenuManager(this.tree);
		treeMenuManager.menuAboutToShow(menuMgr);
		Menu menu = menuMgr.createContextMenu(this.tree.getControl());
		this.tree.getControl().setMenu(menu);
		getSite().registerContextMenu("Please add ID to your outline", menuMgr, this.tree);
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
		hookContextMenu();
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
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setIgnoringComments(true);
			String xmlString = readFile(getContentFile());
			doc = factory.newDocumentBuilder().parse(
					new InputSource(new StringReader(xmlString)));

			NodeList nodelist = doc.getChildNodes();
			addSubTree(root, nodelist.item(0));

		} catch (Exception e) {
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
		builder = stringBuilder.toString();
		return stringBuilder.toString();
	}

	public static String getContentFile() {
		return CONTENT_FILE;
	}

}
