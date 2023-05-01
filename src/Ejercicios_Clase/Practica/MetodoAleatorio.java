package Ejercicios_Clase.Practica;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MetodoAleatorio {
    public static void main(String[] args) {
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
            System.out.println("El alumno elegido aleatoriamente es: " + alumnoElegido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

