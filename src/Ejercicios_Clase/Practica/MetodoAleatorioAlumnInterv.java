package Ejercicios_Clase.Practica;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class MetodoAleatorioAlumnInterv {
    public static void main(String[] args) {

        aleatoriedad();

    }
    static void aleatoriedad (){
        //int i = (int) (Math.random() * 18);
        //System.out.println(a[i]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor introduzca la ruta del archivo para comenzar la elección");
        String ruta = sc.nextLine();

        File file = new File(ruta);

        String nombress = null;
        String interv = null;

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
                    Element elementNombre = (Element) nodeName;
                    //Guardamos los datos de los nombres así como las intervenciones en un tipo cadena
                    //Le añadimos una coma para separar los elementos y así que funcione el método split
                    nombress = elementNombre.getTextContent() + ",";
                    if (nodeIntervenciones.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementIntervenciones = (Element) nodeIntervenciones;
                        interv = elementIntervenciones.getTextContent() + ",";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //En esta parte pasamos todos los nombres e intervenciones en dos arrays diferentes
        String intervenciones [] = interv.split(",");
        String nombres [] = nombress.split(",");

        int i  = (int) Math.random() * nombres.length;
        System.out.println(nombres[i]);

    }
}