package Ejercicios_Clase.XML;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class EjemploLecturaXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document document = builder.parse("");

        Node root = document.getFirstChild();
        NodeList nodos = root.getChildNodes();
        for (int i = 0; i < nodos.getLength(); i++){
            Node node = nodos.item(i);
        }
    }

}
