package Ejercicios_Clase.Practica;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;

public class MetodoAleatorio2 {
    public static void main(String[] args) {
        try {
            // Obtener el archivo XML
            File xmlFile = new File("Practica7.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            Element raiz = doc.getDocumentElement();
            NodeList listaAlumnos = raiz.getElementsByTagName("alumno");

            // Pedir al usuario que seleccione el alumno
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el nombre del alumno:");
            String nombreAlumno = scanner.nextLine();

            // Buscar el nodo "alumno" correspondiente
            Node nodoAlumno = null;
            for (int i = 0; i < listaAlumnos.getLength(); i++) {
                Node nodo = listaAlumnos.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;
                    if (elemento.getElementsByTagName("nombre").item(0).getTextContent().equals(nombreAlumno)) {
                        nodoAlumno = nodo;
                        break;
                    }
                }
            }

            // Si no se encuentra el alumno, mostrar un mensaje de error
            if (nodoAlumno == null) {
                System.out.println("No se ha encontrado el alumno " + nombreAlumno);
                return;
            }

            // Pedir al usuario que introduzca las nuevas intervenciones (sumar, restar, dejarla igual)
            System.out.println("Introduce el nuevo número de intervenciones:");
            String nuevasIntervenciones = scanner.nextLine();

            // Modificar el nodo "intervenciones"
            Element elementoIntervenciones = (Element) ((Element) nodoAlumno).getElementsByTagName("intervenciones").item(0);
            elementoIntervenciones.setTextContent(nuevasIntervenciones);

            // Escribir los cambios en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);

            System.out.println("Las intervenciones del alumno " + nombreAlumno + " han sido modificadas.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}