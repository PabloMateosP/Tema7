package Ejercicios_Clase.Practica;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class MetodoLeerXML {
    public static void metodoLeerXML() {
        // Cargamos el fichero xml de los alumnos que vamos a leer
        //La forma de leer este fichero lo haremos introduciendo por scanner la ruta del archivo en el ordenador

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la clase:  ");
        String clase = sc1.nextLine();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, por favor introduzca la ruta del archivo a leer: ");
        String ruta = sc.nextLine();

        System.out.println("-----------");
        System.out.println(clase);
        System.out.println("-----------");

        File file = new File(ruta);

        try {
            // Parseamos el fichero al Document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file); //Deseralizar el documento xml y pasarlo a un documento DOM

            // Accedemos a todos los nodos con el tag "nombre"
            NodeList nombre = document.getElementsByTagName("nombre");
            NodeList intervenciones = document.getElementsByTagName("intervenciones");

            // Recorremos todos esos nodos
            for (int i = 0; i < nombre.getLength(); i++) {
                Node nodeName = nombre.item(i);
                Node nodeIntervenciones = intervenciones.item(i);
                // Filtramos todos los que son nodos de tipo elemento
                if (nodeName.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementnombre = (Element) nodeName;
                    System.out.println("Nombre del alumno: " + elementnombre.getTextContent());
                    if (nodeIntervenciones.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementintervenciones = (Element) nodeIntervenciones;
                        System.out.println("Número de Intervenciones: " + elementintervenciones.getTextContent());
                    }
                }
                System.out.println("-----------");
            }
        } catch(Exception e) { //No es buena práctica lanzar Exception, ya que no va a dar la información perteneciente a la verdadera excepción que es.
            e.printStackTrace();
        }
    }
}