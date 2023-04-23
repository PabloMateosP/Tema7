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

        // Creamos el nodo raíz <contactos></contactos>
        Element contactos= document.createElement("contactos");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(contactos);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> <contacto></contacto>
        Element contacto = document.createElement("contacto");
        contactos.appendChild(contacto);
        //Estos dos nuevos nodos contacto2 y 3 son pruebas para intentar conseguir la separación en cada nodo contacto correcto y que no aparezcan todos en un solo nodo
        Element contacto2 = document.createElement("contacto");
        contactos.appendChild(contacto2);
        Element contacto3 = document.createElement("contacto");
        contactos.appendChild(contacto3);

        //-----------------------------------------------------------------------

        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombreContacto = document.createElement("nombre");
        contacto.appendChild(nombreContacto);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text fran = document.createTextNode("Fran Reyes Lopez");
        // y lo colgamos del nodo anterior --> <nombre>Fran Reyes Lopez</nombre>
        nombreContacto.appendChild(fran);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element direccionContacto = document.createElement("direccion");
        contacto.appendChild(direccionContacto);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text direccionFran = document.createTextNode("Calle Zurbarán");
        // y lo colgamos del nodo anterior
        direccionContacto.appendChild(direccionFran);

        //Creamos un nodo hijo de contacto que será <telefono></telefono>
        Element numeroContacto = document.createElement("telefono");
        contacto.appendChild(numeroContacto);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text numeroFran = document.createTextNode("602043332");
        // y lo colgamos del nodo anterior --> <nombre>Fran Reyes Lopez</nombre>
        numeroContacto.appendChild(numeroFran);

        //------------------------------------------------------------------------

        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombreContacto2 = document.createElement("nombre");
        contacto2.appendChild(nombreContacto2);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text julian = document.createTextNode("Julian Moreno Franco");
        // y lo colgamos del nodo anterior --> <nombre>Fran Reyes Lopez</nombre>
        nombreContacto2.appendChild(julian);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element direccionContacto2 = document.createElement("direccion");
        contacto2.appendChild(direccionContacto2);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text direccionJulian = document.createTextNode("Calle Pintor Greco");
        // y lo colgamos del nodo anterior
        direccionContacto2.appendChild(direccionJulian);

        //Creamos un nodo hijo de contacto que será <telefono></telefono>
        Element numeroContacto2 = document.createElement("telefono");
        contacto2.appendChild(numeroContacto2);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text numeroJulian = document.createTextNode("622443332");
        // y lo colgamos del nodo anterior
        numeroContacto2.appendChild(numeroJulian);

        //-------------------------------------------------------------------------

        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombreContacto3 = document.createElement("nombre");
        contacto3.appendChild(nombreContacto3);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text juan = document.createTextNode("Juan Carlos Moreno");
        // y lo colgamos del nodo anterior
        nombreContacto3.appendChild(juan);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element direccionContacto3 = document.createElement("direccion");
        contacto3.appendChild(direccionContacto3);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text direccionJuan = document.createTextNode("Calle Pintor Velazquez");
        // y lo colgamos del nodo anterior
        direccionContacto3.appendChild(direccionJuan);

        //Creamos un nodo hijo de contacto que será <telefono></telefono>
        Element numeroContacto3 = document.createElement("telefono");
        contacto3.appendChild(numeroContacto3);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text numeroJuan = document.createTextNode("7224344332");
        // y lo colgamos del nodo anterior --> <nombre>Fran Reyes Lopez</nombre>
        numeroContacto3.appendChild(numeroJuan);

        //---------------------------------------------------------------------------

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        //He tenido que usar la ruta absoluta, ya que mediante la ruta del documento no me lo encontraba y me daba error por ruta inespecífica
        StreamResult result = new StreamResult(new File("C:\\Users\\pablo\\Desktop\\Tema7\\src\\Ejercicios_Clase\\EjerciciosDiapositiva\\Ejercicio11\\contactosDePablo.xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}
