package com.adv.java.xml.Hidden;

import com.adv.java.xml.XmlDemo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class XmlImpl implements XmlDemo{


    public void parseXml(File file) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        System.out.println("\ncom.adv.java.xlm is parsing xml document from iostream. ");
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            XPathFactory xpfactory = XPathFactory.newInstance();
            XPath path = xpfactory.newXPath();

            String rows = "/response/row/row";
            System.out.println("\ncom.adv.java.xml will print first ten rows of xml document.");
            NodeList nodeList = (NodeList) path.compile(rows).evaluate(
                    doc, XPathConstants.NODESET);

            for (int i = 0; i < 10; i++){
                Node nNode = nodeList.item(i);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element el = (Element) nNode;
                    if(el.getElementsByTagName("locations").getLength() > 0){
                        System.out.println("Row ID: " + el.getAttribute("_id"));
                        System.out.println("Title: " + el.getElementsByTagName("title").item(0).getTextContent());
                        System.out.println("Release Year: " + el.getElementsByTagName("release_year").item(0).getTextContent());
                        System.out.println("Location: " + el.getElementsByTagName("locations").item(0).getTextContent() +"\n");
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
    }
}

