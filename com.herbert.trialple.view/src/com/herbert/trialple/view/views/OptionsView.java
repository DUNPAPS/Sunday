package com.herbert.trialple.view.views;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.herbert.trialple.model.provider.PhaseListContentProvider;
import com.herbert.trialple.model.provider.PhaseListLabelProvider;
import com.herbert.trialple.model.xml.tree.TreeChild;
import com.herbert.trialple.model.xml.tree.ModuleTree;

public class OptionsView extends ViewPart {
	private final static String CONTENT_FILE = "C:/Users/D063076/git/Sunday/com.herbert.trialple.model.editor/current_phaselist.xml";
	private Label label;
	private static String builder;
	protected TreeViewer optionsViewer;
	protected Text text;
	protected Document doc;
	protected PhaseListLabelProvider labelProvider;
	protected TreeMap<String, String> opMap;  
	Map<String, List<String>> hm = new HashMap<String, List<String>>();
	List<ModuleTree> roots = new ArrayList<ModuleTree>();
	

	/**
	 * The cons
	 */

	public OptionsView() {
		super();
	}

	/**
	 * @see IWorkbenchPart#createPartControl(Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 2;
		parent.setLayout(layout);
		label = new Label(parent, 0);
		label.setText("Options");
		text = new Text(parent, SWT.READ_ONLY | SWT.SINGLE | SWT.BORDER);
		// layout the text field above the treeviewer
		GridData layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		text.setLayoutData(layoutData);

		optionsViewer = new TreeViewer(parent);
		optionsViewer.setContentProvider(new PhaseListContentProvider());
		labelProvider = new PhaseListLabelProvider();
		optionsViewer.setLabelProvider(labelProvider);
		optionsViewer.setUseHashlookup(true);

		layoutData = new GridData();
		layoutData.grabExcessHorizontalSpace = true;
		layoutData.grabExcessVerticalSpace = true;
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.verticalAlignment = GridData.FILL;
		optionsViewer.getControl().setLayoutData(layoutData);
		optionsViewer.setInput(getInitialInput());

		// optionsViewer.expandAll();
	}

	@Override
	public void setFocus() {
		// text.setFocus();

	}
	public ModuleTree getInitialInput() {
		ModuleTree root = new ModuleTree("options");
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			
			factory.setIgnoringComments(true);
			String xmlString = readFile(getContentFile());
			doc = factory.newDocumentBuilder().parse(
					new InputSource(new StringReader(xmlString)));
			NodeList nodelist = doc.getChildNodes();
			root= addSubTree(root, nodelist.item(0), "options", null);
			 			
			return root;

		} catch (Exception e) 
		{
			System.out.print("Problem parsing the file.");
			e.printStackTrace();
		}
		return null;
	}
	private static final Set<String> WHITELIST = new HashSet<String>(
			Arrays.asList(new String[] { "option" , "or", "and", "not" }));

	private static final Set<String> NAMEABLE = new HashSet<String>(
			Arrays.asList(new String[] {  "or", "and", "not" }));

	private ModuleTree addSubTree(ModuleTree root, Node node, String name,String value) {
		
		
		if (NAMEABLE.contains(node.getNodeName())) 
		{
			name = node.getNodeName(); 
		}
		
		ModuleTree child = new ModuleTree(name);
		
		if (WHITELIST.contains(node.getNodeName())) 
		{
			root.addChild(child);

		} else {
			child = root;
			}  

		if (node.hasChildNodes()) 
		{
			NodeList childList = node.getChildNodes();
			int length = childList.getLength();
			for (int j = 0; j < length; j++) 
			{
				if (childList.item(j).getNodeType() == Node.ELEMENT_NODE) 
				{
					Element childEl = (Element) childList.item(j);
					
					if (childEl.hasAttributes()) 
					{
						if(childEl.getNodeName().equals("option"))
						{
						NamedNodeMap attrs = childEl.getAttributes();
						Node attN = attrs.getNamedItem("name");
						Node attV = attrs.getNamedItem("value");
						opMap = new TreeMap<String, String>();
 						if (attN != null && attV !=null) 
 							{
 							name = attN.getNodeValue();
 							value = attV.getNodeValue();
 							opMap.put(name, value);
 							Set<String> keys = opMap.keySet();
 							for(String key:keys){
 								
 							 //System.out.println(key+ "  : "+     opMap.get(name));
 							}
 							
 							}
						
						}
					}
					addSubTree(child, childList.item(j), name, value);
				 
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
	public static String readFile(String file) throws IOException 
	{
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		while ((line = reader.readLine()) != null) 
		{
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		builder = stringBuilder.toString();
		return stringBuilder.toString();
	}

	public static String getContentFile() 
	{
		return CONTENT_FILE;
	}

	public ModuleTree getRoot(String k) 
	{
		for (ModuleTree p : roots) 
		{
			if (p.getName().equals(k)) 
			{
				return p;
			}
		}

		return null;
	}
}
