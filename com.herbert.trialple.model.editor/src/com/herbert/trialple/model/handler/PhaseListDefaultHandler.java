package com.herbert.trialple.model.handler;

import java.util.jar.Attributes;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.w3c.dom.Document;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PhaseListDefaultHandler extends DefaultHandler {
	private Locator locator;
	private IDocument idocument;
	private int lineNumber;
	protected final static String TAG_POSITIONS = "pleditor:";
	private Position position;
	private final StringBuilder textBuffer = new StringBuilder();

	public PhaseListDefaultHandler() {
		super();
	}

	public void setDocumentLocator(Locator locator) {
		this.locator = locator;
	}

	public void startElement(String namespace, String localname, String qName,
			Attributes attributes) throws SAXException {

		this.lineNumber = this.locator.getLineNumber() - 1;
		int startPosition = getOffsetFromLine(lineNumber);
		Position position = new Position(startPosition);
		setPosition(position);
	}

	public void endElement(String namespace, String localname, String qName)
			throws SAXException {

		int lineNumber = this.locator.getLineNumber();
		Position position = getPosition();
		int endPosition = getOffsetFromLine(lineNumber);
		int length = endPosition - position.getOffset();
		position.setLength(length);

	}

	public void endDocument() throws SAXException {
		super.endDocument();
	}

	public void setElement(String nodeName) {
	}

	private int getOffsetFromLine(int lineNumber) {
		int offset = 0;
		try {
			offset = idocument.getLineOffset(lineNumber);
		} catch (BadLocationException e) {
			try {
				offset = idocument.getLineOffset(lineNumber - 1);
			} catch (BadLocationException e1) {
			}
		}
		return offset;
	}

	@SuppressWarnings("unused")
	private void addPosition(Position position) {
		try {
			idocument.addPosition(position);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void characters(final char ch[], final int start, final int length)
			throws SAXException {
		textBuffer.append(ch, start, length);
	}

	public void setIDocument(IDocument document) {
		this.idocument = document;
	}

	public void setPositionCategory(String positionCategory) {
	}

	public IDocument getDocument() {
		return idocument;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setDocument(Document newDocument) {
	}

}