package com.herbert.trialple.model.outline;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.LocatorImpl;

import Trialple.Phase;

import com.herbert.trialple.model.document.PhaselistDocument;
import com.herbert.trialple.model.handler.PhaseListDefaultHandler;
import com.herbert.trialple.model.provider.PhaseListContentProvider;
import com.herbert.trialple.model.provider.PhaseListLabelProvider;
import com.herbert.trialple.model.provider.XMLParser;
import com.herbert.trialple.model.xml.tree.TreeChild;
import com.herbert.trialple.model.xml.tree.TreeParent;

public class OutlineView extends ContentOutlinePage implements
		IContentOutlinePage, IAdaptable {
	// private final static String CONTENT_FILE =
	// "C:/Users/D063076/git/Sunday/com.herbert.trialple.model.editor/printout.xml";
	private final static String CONTENT_FILE = "C:/Users/IBM_ADMIN/git/Sunday/com.herbert.trialple.model.editor/current_phaselist.xml";
	// private final static String CONTENT_FILE =
	// "C:/Users/c5215637/git/Sunday/com.herbert.trialple.model.editor/printout.xml";
	private static String builder;
	private TreeViewer tree;
	private Document doc;
	private PhaseListDefaultHandler phaseListDefaultHandler;
	private FilteredTree fTree;
	private Text text;
	private TreeParent root;
	
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
			// connecting actions in the outline to the GUI
			TreeParent element = (TreeParent) ((IStructuredSelection) selection)
					.getFirstElement();
			String nodeName = element.toString();

		}
	}

	/**
	 * Parses the document
	 * 
	 * @param element
	 */
	private void parseDocument(String nodeName) {
		Document newDocument = null;
		ArrayList<Phase> phlist = new ArrayList<Phase>();

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
		getSite().registerContextMenu("Please add ID to your outline", menuMgr,
				this.tree);
	}

	@Override
	public void createControl(Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		parent.setLayout(layout);
		Color c = new Color(46, 100, 20);
		// text = new Text(parent, SWT.READ_ONLY | SWT.SINGLE | SWT.BORDER);

		/*
		 * Create a "label" to display information in. I'm using a text field
		 * instead of a lable so you can copy-paste out of it.
		 */
		text = new Text(parent, SWT.READ_ONLY | SWT.SINGLE | SWT.BORDER);
		// layout the text field above the treeviewer
		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		text.setLayoutData(layoutData);

		PatternFilter patFilter = new PatternFilter();
		fTree = new FilteredTree(parent, SWT.MULTI | SWT.V_SCROLL, patFilter,
				false);

		tree = fTree.getViewer();
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
		if (fTree == null) {
			return null;
		}
		// return this.tree.getControl();
		return fTree;
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
		fTree.getFilterControl().setFocus();
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

	/**
	 * 
	 * @return
	 */
	public TreeParent getInitialInput() {
		 root = new TreeParent("");
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setIgnoringComments(true);
			String xmlString = readFile(getContentFile());
			doc = factory.newDocumentBuilder().parse(
					new InputSource(new StringReader(xmlString)));
			NodeList nodelist = doc.getChildNodes();

			root = addSubTree(root, nodelist.item(0), null);
			root.shift();
			//fillList(root);
			/*-- From STANDARD to modules*/
			//refactorTreeParent(root);
			
			return root;
			
			
		} catch (Exception e) {
			System.out.print("Problem parsing the file.");
			e.printStackTrace();
		}

		return null;
	}

	private static final Set<String> WHITELIST = new HashSet<String>(
			Arrays.asList(new String[] { "UnitDefinition",
					"unit", "modules",  "submoduledefs",
					"submodule", "phase", "module", "submoduleref",
					"unitdefinitions" }));
	/**
	 * 
	 */
	private static final Set<String> NAMEABLE = new HashSet<String>(
			Arrays.asList(new String[] { "modules", "submodule",
					"submoduledefs" }));

	// private final static String[] ignorable = new String[] { "description",
	// "password", "args", "action", "postevent", "revokemodule",
	// "precedences", "options", "usage", "defs" };

	// private static boolean contains(String[] finder, String toFind) {
	// return Arrays.asList(finder).contains(toFind);
	// }
/**
 * Dealing with the roadmap modules
 * @param root
 */
//	private void refactorTreeParent(TreeParent root) {
//		TreeChild[] modl = root.getChildren();
//		for(TreeChild tree:modl)
//			if (tree.getName().equals("STANDARD")) {
//				TreeChild[] stChildren = ((TreeParent) tree).getChildren();
//				for(TreeChild sChild: stChildren){
//					if(sChild.getName().equals("Extraction")){
//						TreeChild[] mods = (TreeChild[]) ((TreeParent) sChild).getChildren();
//						for(TreeChild mod:mods){
//							if(mod.getName().equals("PREP_EXTRACT")){
//							
//							NodeList docmods = doc.getElementsByTagName("module");
//							for(int s=0; s<docmods.getLength(); s++){
//								Element element = (Element) docmods.item(s);
//								String nm = element.getAttribute("name"); 
//								
//								if(mod.getName().equals(nm)){
//									
//									//System.out.println("these elements of the node: "+ element.getNodeName() + " " + element.getNodeValue());
//									}
//								}
//							}
//						}
//						
//					}
//				}
//			}
//
//	}
	/**
	 * 
	 * @param root
	 * @param node
	 */
	private TreeParent addSubTree(TreeParent root, Node node, String name) {
		if (NAMEABLE.contains(node.getNodeName())) {
			name = node.getNodeName();
		}
		TreeParent child = new TreeParent(name);
	
		//fillList(root);
		if (WHITELIST.contains(node.getNodeName()))
			root.addChild(child);
		else
			child = root;
			
		if (node.hasChildNodes()) {
			NodeList childList = node.getChildNodes(); //All children of root and child.
			int length = childList.getLength();
			for (int i = 0; i < length; i++) {

				if (childList.item(i).getNodeType() == Node.ELEMENT_NODE) { //No text
					Element childEl = (Element) childList.item(i);
					
					if (childEl.hasAttributes()) {
						NamedNodeMap attrs = childEl.getAttributes();
						Node attN = attrs.getNamedItem("name"); // elements with

						if ((attN != null)) {
							name = attN.getNodeValue();
						}
						if (childEl.getNodeName().equals("submoduleref")) {
							NamedNodeMap s_attrs = childEl.getAttributes();
							Node s_attN = s_attrs.getNamedItem("name");
							name = s_attN.getNodeValue();
							TreeParent.SUBMODES.add(name);
							
						}
						

					}
				
					addSubTree(child, childList.item(i), name);  //All the children are added here

					
				 
					if (childEl.getNodeName().equals("unitmodule")) {
						
//						NamedNodeMap u_names = childEl.getAttributes();
//						Node unitNode = u_names.getNamedItem("name");
//						name = unitNode.getNodeValue();
						
						//TreeParent unit = new TreeParent(name);
						//root.removeChild(unit);
						
						//System.out.println("this should be removed:  "+unit);
						
						
						NodeList modl = doc.getElementsByTagName("module");
						if (modl.getLength() > 0) {
							for (int m = 0; m < modl.getLength(); m++) {
								Element el =  (Element) modl.item(m);
								String nm = el.getAttribute("name"); // modules
								
								if (name.equals(nm)) {
																
								addSubTree(child, modl.item(m), nm); //Add the modules to unit modules
								   
									}

								}
							}
						
						
						}
					
				   }
			}
		}
		
		
		return child;
	}

	/**
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
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

	/**
	 * 
	 * @return
	 */
	public static String getContentFile() {
		return CONTENT_FILE;
	}

	@Override
	public Object getAdapter(Class adapter) {

		return null;
	}
	
	
//	if (childEl.getNodeName().equals("submoduleref")) {
//		NamedNodeMap s_attrs = childEl.getAttributes();
//		Node s_attN = s_attrs.getNamedItem("name");
//		name = s_attN.getNodeValue();
//		TreeParent.SUBMODES.add(name);
//		//System.out.println(name);
//
//	}
// 
}
