package com.herbert.trialple.model.handler;

import java.util.jar.Attributes;



import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PhaseListDefaultHandler extends DefaultHandler {
	static final String neueZeile = System.getProperty("line.separator");

	@SuppressWarnings("unused")
	private StringBuffer textBuffer = null;

	// SAX DefaultHandler Methoden

	public void startDocument() throws SAXException {
	}

	public void endDocument() throws SAXException {

	}

	// Starttag auslesen
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes attrs) throws SAXException {
		// System.out.println(qName);
	}

	// Schlusstags auslesen
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException {
	}

	public void characters(char[] buf, int offset, int len) throws SAXException {
	}

}