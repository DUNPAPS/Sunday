 
package com.herbert.trialple.model.provider;

import java.io.File;




import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;




import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;


/**
 * Performs DTD validation on supplied XML document
 * @author D057271 
 */
public class XMLParser {

	public static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";

	private ErrorHandler errorHandler;

	private ContentHandler contentHandler;

	public void setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}

	public void setContentHandler(ContentHandler contentHandler) {
		this.contentHandler = contentHandler;
	}

	public static void main(String[] args) {
		try {
			XMLParser parser = new XMLParser();
			parser.doParse(new File(args[0]));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	/**
	 * Does DTD-based validation on File
	 */
	public void doParse(File xmlFilePath) throws RuntimeException {

		InputSource inputSource = null;
		try {
			inputSource = new InputSource(new FileReader(xmlFilePath));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		doParse(inputSource);

	}

	/**
	 * Does DTD-based validation on text
	 */
	public void doParse(String xmlText) throws RuntimeException {

		InputSource inputSource = new InputSource(new StringReader(xmlText));
		doParse(inputSource);

	}

	/**
	 * Does DTD-based validation on inputSource
	 */
	public void doParse(InputSource inputSource) throws RuntimeException {

		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			spf.setNamespaceAware(true);
			SAXParser saxParser = spf.newSAXParser();
			XMLReader reader = saxParser.getXMLReader();
			reader.setErrorHandler(errorHandler);
			reader.setContentHandler(contentHandler);
			reader.parse(inputSource);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
