package Ejercicios_Clase.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploLecturaXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        // Cargamos fichero que vamos a leer
        File file = new File("Ejercicios_Clase/XML/ejemplo.xml");
        //IMPORTANTE: Hay que poner la ruta de darlo al botón derecho encima del archivo y donde pone copy path
        // --> path from source root

        try {
            // Parseamos el fichero al Document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file); //Deseralizar el documento xml y pasarlo a un documento DOM

            // Accedemos al nodo raíz
            System.out.println("Elemento raiz: " + document.getDocumentElement().getNodeName());
            //Nos dará el nombre del nodo en un caso estudiante
            System.out.println("Tipo de node: " + document.getDocumentElement().getNodeType());
            //Nos dará de tipo 1, ya que es un elemento

            // Accedemos a todos los nodos con el tag "estudiante" --> En la práctica 7 podemos sacar las participaciones de esta forma
            NodeList estudiantes = document.getElementsByTagName("estudiante");

            //Con el:  estudiantes.GetChildNodes para sacar el hijo de estudiante

            // Recorremos todos esos nodos
            // Para la práctica 7 debemos de meter además de sacar el nombre del alumno sacar la participación de este.
            for (int i = 0; i < estudiantes.getLength(); i++) {
                Node nodeEstudiante = estudiantes.item(i);
                // Filtramos todos los que son nodos de tipo elemento
                if (nodeEstudiante.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementEstudiante = (Element) nodeEstudiante;
                    System.out.println("Nombre del estudiante: " + elementEstudiante.getTextContent());
                }
            }
        } catch(Exception e) { //No es buena práctica lanzar Exception, ya que no va a dar la información perteneciente a la verdadera excepción que es.
            e.printStackTrace();
        }

    }
}
