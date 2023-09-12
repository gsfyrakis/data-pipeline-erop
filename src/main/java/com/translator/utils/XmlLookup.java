package com.translator.utils;

import java.io.File;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlLookup {

    private File lookUpFile;
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder dBuilder;
    private Document doc;
    private URL url;



    public XmlLookup() {
        try {
            //this.lookUpFile = ("./src/lookup.xml");
            //this.url = XmlLookup.class.getClassLoader().get
            this.dbFactory = DocumentBuilderFactory.newInstance();
            this.dBuilder = dbFactory.newDocumentBuilder();
            //this.doc = dBuilder.parse(lookUpFile);
            this.doc = dBuilder.parse(XmlLookup.class.getClassLoader().getResourceAsStream("lookup.xml"));

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        } catch (Exception e) {
            System.err.println("lookup.xml file was not found: " + e.toString());
        }

    }

    public String getEventMatchField(String s) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("EventMatchField");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //eElement.get
                return eElement.getElementsByTagName(s).item(0).getTextContent();
            }

        }
        return "event match field not found";
    }

    public String getTimePartialKey(String s) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("TimePartialKey");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //eElement.get
                return eElement.getElementsByTagName(s).item(0).getTextContent();
            }

        }
        return "event match field not found";
    }

    public String getOutcomeGet(String s) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("OutcomeManipulationGet");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //eElement.get
                return eElement.getElementsByTagName(s).item(0).getTextContent();
            }

        }
        return "event match field not found";
    }


    public String getRopManipulationSet(String s) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("RopManipulation");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //eElement.get
                return eElement.getElementsByTagName(s).item(0).getTextContent();
            }

        }
        return "event match field not found";
    }

    public String getOutcomeSet(String s) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("OutcomeManipulationSet");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                //eElement.get
                return eElement.getElementsByTagName(s).item(0).getTextContent();
            }

        }
        return "event match field not found";
    }
}
