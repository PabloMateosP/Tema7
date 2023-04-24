package Ejercicios_Clase.EjerciciosDiapositiva.Ejercicio11;

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

public class Ejercicio11 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        // Cargamos fichero que vamos a leer
        File file = new File("C:\\Users\\pablo\\Desktop\\Tema7\\src\\Ejercicios_Clase\\EjerciciosDiapositiva\\Ejercicio11\\ContactosDaniel.xml");
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
            System.out.println("----------");

            // Accedemos a todos los nodos con el tag "estudiante" --> En la práctica 7 podemos sacar las participaciones de esta forma
            NodeList nombre = document.getElementsByTagName("nombre");
            NodeList apellidos = document.getElementsByTagName("apellidos");
            NodeList direccion = document.getElementsByTagName("direccion");

            //Con el: estudiantes.GetChildNodes para sacar el hijo de estudiante

            // Recorremos todos esos nodos
            for (int i = 0; i < nombre.getLength(); i++) {
                Node nodeContacto = nombre.item(i);
                Node nodeContactoap = apellidos.item(i);
                Node nodeContactodic = direccion.item(i);
                // Filtramos todos los que son nodos de tipo elemento
                if (nodeContacto.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementContacto = (Element) nodeContacto;
                    System.out.println("Nombre del contacto: " + elementContacto.getTextContent());
                    if (nodeContactoap.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementContacto1 = (Element) nodeContactoap;
                        System.out.println("Apellido del contacto: " + elementContacto1.getTextContent());
                        if (nodeContactodic.getNodeType() == Node.ELEMENT_NODE) {
                            Element elementContacto2 = (Element) nodeContactodic;
                            System.out.println("Dirección del contacto: " + elementContacto2.getTextContent());
                        }
                    }
                }
                System.out.println("-----------");
            }
        } catch(Exception e) { //No es buena práctica lanzar Exception, ya que no va a dar la información perteneciente a la verdadera excepción que es.
            e.printStackTrace();
        }
    }
}
