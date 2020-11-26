package com.adv.java.xml;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;

public interface XmlDemo{
	static XmlDemo newInstance(){

		return new com.adv.java.xml.Hidden.XmlImpl();
	}
	void parseXml(File file) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException;
}
