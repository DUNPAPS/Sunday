package com.herbert.trialple.model.parser;
//package com.herbert.trialple.model.parser;
//
//import java.io.File;
//import java.io.IOException;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//
//import org.xml.sax.SAXException;
//import org.xml.sax.helpers.DefaultHandler;
//
//import com.herbert.trialple.model.handler.PhaseListDefaultHandler;
//
//public class Parser {
//
//	public Parser() {
//
//	}
//
//	public void doParse() {
//		DefaultHandler handler = new PhaseListDefaultHandler();
//		SAXParser saxParser;
//		try {
//			saxParser = SAXParserFactory.newInstance().newSAXParser();
//			saxParser.parse(new File("C:/Users/D063076/Desktop/address.xml"), handler);
//		} catch (ParserConfigurationException pe) {
//			pe.printStackTrace();
//		} catch (SAXException se) {
//			se.printStackTrace();
//		} catch (IOException ie) {
//			ie.printStackTrace();
//		}
//	}
//
//	public static void main(String[] argv) {
//
//		Parser parser = new Parser();
//
//		parser.doParse();
//		System.out.println("this parser");
//
//	}
//
//}
