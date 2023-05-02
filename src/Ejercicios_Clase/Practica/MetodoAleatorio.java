package Ejercicios_Clase.Practica;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MetodoAleatorio {
    public static void metodoAleatorio() {
        Scanner scc = new Scanner(System.in);
        System.out.println("Escriba la ruta del archivo");
        String ruta = scc.nextLine();

        try {
            // Cargar el archivo XML y parseamos este
            File archivoXml = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivoXml);
            doc.getDocumentElement().normalize();

            // Obtener la lista de nodos "alumno"
            NodeList listaAlumnos = doc.getElementsByTagName("alumno");

            // Arrays para almacenar los nombres e intervenciones de los alumnos
            String[] nombres = new String[listaAlumnos.getLength()];
            String[] intervenciones = new String[listaAlumnos.getLength()];

            // Recorrer la lista de nodos "alumno" y almacenar los nombres e intervenciones en los arrays
            for (int i = 0; i < listaAlumnos.getLength(); i++) {
                Node nodoAlumno = listaAlumnos.item(i);
                if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoAlumno = (Element) nodoAlumno;
                    nombres[i] = elementoAlumno.getElementsByTagName("nombre").item(0).getTextContent();
                    intervenciones[i] = elementoAlumno.getElementsByTagName("intervenciones").item(0).getTextContent();
                }
            }

            // Encontrar la menor cantidad de intervenciones
            int minInterv = Integer.MAX_VALUE;
            for (int i = 0; i < intervenciones.length; i++) {
                if (intervenciones[i] != null) {
                    int interv = Integer.parseInt(intervenciones[i]);
                    if (interv < minInterv) {
                        minInterv = interv;
                    }
                }
            }

            // Crear una lista de índices de los alumnos con la menor cantidad de intervenciones
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < intervenciones.length; i++) {
                if (intervenciones[i] != null && Integer.parseInt(intervenciones[i]) == minInterv) {
                    indices.add(i);
                }
            }

            // Elegir aleatoriamente un índice de la lista de índices
            Random random = new Random();
            int randomIndex = indices.get(random.nextInt(indices.size()));

            // Obtener el nombre del alumno correspondiente al índice elegido
            String alumnoElegido = nombres[randomIndex];
            System.out.println("El alumno elegido es: " + alumnoElegido);

            //En este caso definimos si lo que ha hecho el alumno ha sido correcto o no y le damos la opción al profesor de cambiar las intervenciones del alumno
            Scanner punto = new Scanner(System.in);
            System.out.println("¿Ha sido correcta la corrección del alumno? \n-En caso de que haya sido correcto pulse s \n-En caso de que haya sido incorrecto pulse n \n-En caso de que no quiera cambiar sus intervenciones pulse o");
            String puntuation = punto.nextLine();

            if (puntuation.equals("s")) {
                // Cargar el archivo XML
                File archivo2Xml = new File(ruta);
                DocumentBuilderFactory db2Factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dB2uilder = db2Factory.newDocumentBuilder();
                Document doc2 = dB2uilder.parse(archivoXml);

                // Encontrar el nodo "alumno" correspondiente al alumno elegido
                NodeList lista2Alumnos = doc2.getElementsByTagName("alumno");
                Element elementoAlumnoElegido = null;
                for (int i = 0; i < lista2Alumnos.getLength(); i++) {
                    Node nodoAlumno = lista2Alumnos.item(i);
                    if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoAlumno = (Element) nodoAlumno;
                        String nombreAlumno = elementoAlumno.getElementsByTagName("nombre").item(0).getTextContent();
                        if (nombreAlumno.equals(alumnoElegido)) {
                            elementoAlumnoElegido = elementoAlumno;
                            break;
                        }
                    }
                }
                if (elementoAlumnoElegido == null) {
                    System.out.println("Error: no se encontró el nodo correspondiente al alumno elegido.");
                    return;
                }

                // Agregamos un punto de participación adicional para el alumno elegido
                String intervencionesAnteriores = elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).getTextContent();
                int participaciones = Integer.parseInt(intervencionesAnteriores) + 1;
                elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).setTextContent(Integer.toString(participaciones));
                //En este caso supuestamente debería de añadir el punto aunque no consigo encontrar el porqué de que no lo introduzca como tal


                // Finalmente, guardamos el documento XML actualizado en el archivo correspondiente
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(ruta));
                transformer.transform(source, result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}