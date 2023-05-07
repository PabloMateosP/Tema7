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
            System.out.println("\nEl alumno elegido es: " + alumnoElegido);

            //En este caso definimos si lo que ha hecho el alumno ha sido correcto o no y le damos la opción al profesor de cambiar las intervenciones del alumno
            Scanner punto = new Scanner(System.in);
            System.out.println("\n¿Ha sido correcta la corrección del alumno? \n-En caso de que haya sido correcto pulse s \n-En caso de que haya sido incorrecto pulse n \n-En caso de que no quiera cambiar sus intervenciones pulse o");
            String puntuation = punto.nextLine();

            if (puntuation.equals("s")) {
                // Encontrar el nodo "alumno" correspondiente al alumno elegido
                Element elementoAlumnoElegido = null;
                for (int i = 0; i < listaAlumnos.getLength(); i++) {
                    Node nodoAlumno = listaAlumnos.item(i);
                    if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoAlumno = (Element) nodoAlumno;
                        String nombreAlumno = elementoAlumno.getElementsByTagName("nombre").item(0).getTextContent();
                        if (nombreAlumno.equals(alumnoElegido)) {
                            elementoAlumnoElegido = elementoAlumno;
                            break;
                        }
                    }
                }
                // Para el caso en que no se encuentre al alumno nos dará un error
                if (elementoAlumnoElegido == null) {
                    System.out.println("Error: no se encontró el nodo correspondiente al alumno elegido.");
                    return;
                }
                // Agregamos un punto de participación adicional para el alumno elegido
                String intervencionesAnteriores = elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).getTextContent();
                int participaciones = Integer.parseInt(intervencionesAnteriores) + 1;
                elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).setTextContent(Integer.toString(participaciones));


                System.out.println("Le ha sido añadida una intervención al alumno");

                // Finalmente, guardamos el documento XML actualizado en el archivo correspondiente
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(ruta));
                transformer.transform(source, result);

            } else if (puntuation.equals("n")) {
                // Encontrar el nodo "alumno" correspondiente al alumno elegido
                Element elementoAlumnoElegido = null;
                for (int i = 0; i < listaAlumnos.getLength(); i++) {
                    Node nodoAlumno = listaAlumnos.item(i);
                    if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoAlumno = (Element) nodoAlumno;
                        String nombreAlumno = elementoAlumno.getElementsByTagName("nombre").item(0).getTextContent();
                        if (nombreAlumno.equals(alumnoElegido)) {
                            elementoAlumnoElegido = elementoAlumno;
                            break;
                        }
                    }
                }
                // Para el caso en que no se encuentre al alumno nos dará un error
                if (elementoAlumnoElegido == null) {
                    System.out.println("Error: no se encontró el nodo correspondiente al alumno elegido.");
                    return;
                }
                // Agregamos un punto de participación adicional para el alumno elegido
                String intervencionesAnteriores = elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).getTextContent();
                int participaciones = Integer.parseInt(intervencionesAnteriores) - 1;
                elementoAlumnoElegido.getElementsByTagName("intervenciones").item(0).setTextContent(Integer.toString(participaciones));
                //En este caso supuestamente debería de añadir el punto aunque no consigo encontrar el porqué de que no lo introduzca como tal

                System.out.println("Le ha sido restada una intervención al alumno");

                // Finalmente, guardamos el documento XML actualizado en el archivo correspondiente
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(ruta));
                transformer.transform(source, result);

            } else if (puntuation.equals("o")) {
                System.out.println("Se deja la nota igual");
            } else{
                System.out.println("Usted no ha elegido una opción reconocida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}