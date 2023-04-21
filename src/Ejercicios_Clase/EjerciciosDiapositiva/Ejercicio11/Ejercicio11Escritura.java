package Ejercicios_Clase.EjerciciosDiapositiva.Ejercicio11;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Ejercicio11Escritura {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        // Creamos el documento vacío para añadirle a continuación los nodos
        // En este caso lo hago todo en una sola línea
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element contactos= document.createElement("contactos");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(contactos);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> <estudiante></estudiante>
        Element contacto = document.createElement("contacto");
        contactos.appendChild(contacto);

        Element nombreContacto = document.createElement("nombre");
        contacto.appendChild(nombreContacto);

        // Creamos un nodo de texto que será el valor del elemento anterior
        Text fran = document.createTextNode("Fran");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        estudianteFran.appendChild(fran);

        // Igual para el siguiente estudiante
        Element estudianteMenganito = document.createElement("estudiante");
        estudiantes.appendChild(estudianteMenganito);
        Text menganito = document.createTextNode("Menganito");
        estudianteMenganito.appendChild(menganito);

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("Ejercicios_Clase/XML/ejemplo.xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }

}
