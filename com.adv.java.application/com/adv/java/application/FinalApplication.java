package com.adv.java.application;

import com.adv.java.iostream.IoStreamDemo;
import com.adv.java.network.NetworkDemo;
import com.adv.java.xml.XmlDemo;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;


public class FinalApplication {

 public static void main(String[] args) throws IOException {
  System.out.println("\nThis program connects to the San Francisco Government Data Set API\nfor film locations in San Francisco.");
  System.out.println("\n1. It first calls the network module to connect to its url.");
  System.out.println("2. The iostream module reads the web data and writes it to file.xml");
  System.out.println("3. Lastly, the xml module parses and prints the first 10 lines of the output");

  File file = new File("file.xml");
  String url = "https://data.sfgov.org/api/views/yitu-d5am/rows.xml?accessType=DOWNLOAD";

  //create module instances
  NetworkDemo networkDemo = NetworkDemo.newInstance();

  IoStreamDemo ioStreamDemo = IoStreamDemo.newInstance();

  ioStreamDemo.readWebData(networkDemo.connectUrl(url));

  XmlDemo xmlDemo = XmlDemo.newInstance();

  try {
   xmlDemo.parseXml(file);
  } catch (ParserConfigurationException e) {
   e.printStackTrace();
  } catch (SAXException e) {
   e.printStackTrace();
  } catch (XPathExpressionException e) {
   e.printStackTrace();
  }

  System.out.println("All Done!");


 }

}
