package com.herbert.trialple.model.editor;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
// The element details editor for modules
public class ElementDetialsEditor extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	
	

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ElementDetialsEditor(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(null);
		
		text = new Text(this, SWT.BORDER);
		text.setBounds(130, 62, 278, 32);
		toolkit.adapt(text, true, true);
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setBounds(130, 115, 278, 32);
		toolkit.adapt(text_1, true, true);
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.setBounds(130, 168, 278, 32);
		toolkit.adapt(text_2, true, true);
		
		text_3 = new Text(this, SWT.BORDER);
		text_3.setBounds(130, 225, 278, 32);
		toolkit.adapt(text_3, true, true);

	}
}
