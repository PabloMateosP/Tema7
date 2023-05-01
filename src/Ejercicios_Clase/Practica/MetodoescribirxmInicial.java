package Ejercicios_Clase.Practica;

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
import java.util.Scanner;

public class MetodoescribirxmInicial {
    public MetodoescribirxmInicial() throws ParserConfigurationException, TransformerException {
        // Creamos el documento vacío para añadirle a continuación los nodos
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        //Creamos un scanner con la ruta del archivo que crearemos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba la ruta donde se creará el archivo:");
        String ruta  = sc.nextLine();

        //Creamos un scanner con el nombre del archivo a crear
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo a crear: ");
        String nombreArchivo = sc2.nextLine();

        // Creamos el nodo Raíz
        String nodoRaiz = "daw1";

        // Creamos el nodo raíz <alumnos></alumnos>
        Element alumnos= document.createElement(nodoRaiz);
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(alumnos);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> <alumno></alumno>
        Element alumno = document.createElement("alumno");
        alumnos.appendChild(alumno);
        Element alumno2 = document.createElement("alumno");
        alumnos.appendChild(alumno2);
        Element alumno3 = document.createElement("alumno");
        alumnos.appendChild(alumno3);
        Element alumno4 = document.createElement("alumno");
        alumnos.appendChild(alumno4);
        Element alumno5 = document.createElement("alumno");
        alumnos.appendChild(alumno5);
        Element alumno6 = document.createElement("alumno");
        alumnos.appendChild(alumno6);
        Element alumno7 = document.createElement("alumno");
        alumnos.appendChild(alumno7);
        Element alumno8 = document.createElement("alumno");
        alumnos.appendChild(alumno8);
        Element alumno9 = document.createElement("alumno");
        alumnos.appendChild(alumno9);
        Element alumno10 = document.createElement("alumno");
        alumnos.appendChild(alumno10);
        Element alumno11 = document.createElement("alumno");
        alumnos.appendChild(alumno11);
        Element alumno12 = document.createElement("alumno");
        alumnos.appendChild(alumno12);
        Element alumno13 = document.createElement("alumno");
        alumnos.appendChild(alumno13);
        Element alumno14 = document.createElement("alumno");
        alumnos.appendChild(alumno14);
        Element alumno15 = document.createElement("alumno");
        alumnos.appendChild(alumno15);
        Element alumno16 = document.createElement("alumno");
        alumnos.appendChild(alumno16);
        Element alumno17 = document.createElement("alumno");
        alumnos.appendChild(alumno17);

        String nombre = "nombre";
        String intervenciones = "intervenciones";

        //-----------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre1 = "Víctor";
        String nintervenciones1 = "0";

        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre1_ = document.createElement(nombre);
        alumno.appendChild(nombre1_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_1 = document.createTextNode(nombre1);
        nombre1_.appendChild(nombre_1);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones1 = document.createElement(intervenciones);
        alumno.appendChild(intervenciones1);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_1 = document.createTextNode(nintervenciones1);
        // y lo colgamos del nodo anterior
        intervenciones1.appendChild(intervenciones_1);

        //------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre2 = "John";
        String nintervenciones2 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre2_ = document.createElement(nombre);
        alumno2.appendChild(nombre2_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_2 = document.createTextNode(nombre2);
        nombre2_.appendChild(nombre_2);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones2 = document.createElement(intervenciones);
        alumno2.appendChild(intervenciones2);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_2 = document.createTextNode(nintervenciones2);
        // y lo colgamos del nodo anterior
        intervenciones2.appendChild(intervenciones_2);

        //-------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre3 = "Jorge";
        String nintervenciones3 = "1";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre3_ = document.createElement(nombre);
        alumno3.appendChild(nombre3_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_3 = document.createTextNode(nombre3);
        // y lo colgamos del nodo anterior --> <nombre>Fran Reyes Lopez</nombre>
        nombre3_.appendChild(nombre_3);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones3 = document.createElement(intervenciones);
        alumno3.appendChild(intervenciones3);
        Text intervenciones_3 = document.createTextNode(nintervenciones3);
        // y lo colgamos del nodo anterior
        intervenciones3.appendChild(intervenciones_3);

        //---------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre4 = "Julián";
        String nintervenciones4 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre4_ = document.createElement(nombre);
        alumno4.appendChild(nombre4_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_4 = document.createTextNode(nombre4);
        nombre4_.appendChild(nombre_4);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones4 = document.createElement(intervenciones);
        alumno4.appendChild(intervenciones4);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_4= document.createTextNode(nintervenciones4);
        // y lo colgamos del nodo anterior
        intervenciones4.appendChild(intervenciones_4);

        //------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre5 = "Diego";
        String nintervenciones5 = "1";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre5_ = document.createElement(nombre);
        alumno5.appendChild(nombre5_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_5 = document.createTextNode(nombre5);
        nombre5_.appendChild(nombre_5);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones5 = document.createElement(intervenciones);
        alumno5.appendChild(intervenciones5);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_5 = document.createTextNode(nintervenciones5);
        // y lo colgamos del nodo anterior
        intervenciones5.appendChild(intervenciones_5);

        //-------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre6 = "David";
        String nintervenciones6 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre6_ = document.createElement(nombre);
        alumno6.appendChild(nombre6_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_6 = document.createTextNode(nombre6);
        nombre6_.appendChild(nombre_6);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones6 = document.createElement(intervenciones);
        alumno6.appendChild(intervenciones6);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_6 = document.createTextNode(nintervenciones6);
        // y lo colgamos del nodo anterior
        intervenciones6.appendChild(intervenciones_6);

        //--------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre7 = "Juanma Herrera";
        String nintervenciones7 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre7_ = document.createElement(nombre);
        alumno7.appendChild(nombre7_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_7 = document.createTextNode(nombre7);
        nombre7_.appendChild(nombre_7);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones7 = document.createElement(intervenciones);
        alumno7.appendChild(intervenciones7);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_7 = document.createTextNode(nintervenciones7);
        // y lo colgamos del nodo anterior
        intervenciones7.appendChild(intervenciones_7);

        //------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre8 = "Jonathan";
        String nintervenciones8 = "1";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre8_ = document.createElement(nombre);
        alumno8.appendChild(nombre8_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_8 = document.createTextNode(nombre8);
        nombre8_.appendChild(nombre_8);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones8 = document.createElement(intervenciones);
        alumno8.appendChild(intervenciones8);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_8 = document.createTextNode(nintervenciones8);
        // y lo colgamos del nodo anterior
        intervenciones8.appendChild(intervenciones_8);

        //-------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre9 = "Pablo";
        String nintervenciones9 = "1";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre9_ = document.createElement(nombre);
        alumno9.appendChild(nombre9_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_9 = document.createTextNode(nombre9);
        nombre9_.appendChild(nombre_9);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones9 = document.createElement(intervenciones);
        alumno9.appendChild(intervenciones9);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_9 = document.createTextNode(nintervenciones9);
        // y lo colgamos del nodo anterior
        intervenciones9.appendChild(intervenciones_9);

        //---------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre10 = "Juan María";
        String nintervenciones10 = "1";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre10_ = document.createElement(nombre);
        alumno10.appendChild(nombre10_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_10 = document.createTextNode(nombre10);
        nombre10_.appendChild(nombre_10);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones10 = document.createElement(intervenciones);
        alumno10.appendChild(intervenciones1);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_10 = document.createTextNode(nintervenciones10);
        // y lo colgamos del nodo anterior
        intervenciones10.appendChild(intervenciones_10);

        //------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre11 = "Adrián";
        String nintervenciones11 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre11_ = document.createElement(nombre);
        alumno11.appendChild(nombre11_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_11 = document.createTextNode(nombre11);
        nombre11_.appendChild(nombre_11);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones11 = document.createElement(intervenciones);
        alumno11.appendChild(intervenciones11);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_11 = document.createTextNode(nintervenciones11);
        // y lo colgamos del nodo anterior
        intervenciones11.appendChild(intervenciones_11);

        //-------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre12 = "Juan Jesús";
        String nintervenciones12 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre12_ = document.createElement(nombre);
        alumno12.appendChild(nombre12_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_12 = document.createTextNode(nombre12);
        nombre12_.appendChild(nombre_12);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones12 = document.createElement(intervenciones);
        alumno12.appendChild(intervenciones12);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_12 = document.createTextNode(nintervenciones12);
        // y lo colgamos del nodo anterior
        intervenciones12.appendChild(intervenciones_12);

        //---------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre13 = "Pepe";
        String nintervenciones13 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre13_ = document.createElement(nombre);
        alumno13.appendChild(nombre13_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_13 = document.createTextNode(nombre13);
        nombre13_.appendChild(nombre_13);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones13 = document.createElement(intervenciones);
        alumno13.appendChild(intervenciones13);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_13 = document.createTextNode(nintervenciones13);
        // y lo colgamos del nodo anterior
        intervenciones13.appendChild(intervenciones_13);

        //------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre14 = "Dani";
        String nintervenciones14 = "2";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre14_ = document.createElement(nombre);
        alumno14.appendChild(nombre14_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_14 = document.createTextNode(nombre14);
        nombre14_.appendChild(nombre_14);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones14 = document.createElement(intervenciones);
        alumno14.appendChild(intervenciones14);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_14 = document.createTextNode(nintervenciones14);
        // y lo colgamos del nodo anterior
        intervenciones14.appendChild(intervenciones_14);

        //-------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre15 = "Juanma Saborido";
        String nintervenciones15 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre15_ = document.createElement(nombre);
        alumno15.appendChild(nombre15_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_15 = document.createTextNode(nombre15);
        nombre15_.appendChild(nombre_15);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones15 = document.createElement(intervenciones);
        alumno15.appendChild(intervenciones15);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_15 = document.createTextNode(nintervenciones15);
        // y lo colgamos del nodo anterior
        intervenciones15.appendChild(intervenciones_15);

        //---------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre16 = "Antonio";
        String nintervenciones16 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre16_ = document.createElement(nombre);
        alumno16.appendChild(nombre16_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_16 = document.createTextNode(nombre16);
        nombre16_.appendChild(nombre_16);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones16 = document.createElement(intervenciones);
        alumno16.appendChild(intervenciones16);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_16 = document.createTextNode(nintervenciones16);
        // y lo colgamos del nodo anterior
        intervenciones16.appendChild(intervenciones_16);

        //---------------------------------------------------------------------------

        //Declaramos el nombre del alumno y el número de intervenciones de este
        String nombre17 = "Jossie";
        String nintervenciones17 = "0";


        //Creamos un nodo hijo de contacto que será <nombre></nombre>
        Element nombre17_ = document.createElement(nombre);
        alumno17.appendChild(nombre17_);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text nombre_17 = document.createTextNode(nombre17);
        nombre17_.appendChild(nombre_17);

        //Creamos un nodo hijo de contacto que será <direccion></direccion>
        Element intervenciones17 = document.createElement(intervenciones);
        alumno17.appendChild(intervenciones17);
        // Creamos un nodo de texto que será el valor del elemento anterior nombre
        Text intervenciones_17 = document.createTextNode(nintervenciones17);
        // y lo colgamos del nodo anterior
        intervenciones17.appendChild(intervenciones_17);

        //---------------------------------------------------------------------------

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        //He tenido que usar la ruta absoluta, ya que mediante la ruta del documento no me lo encontraba y me daba error por ruta inespecífica
        StreamResult result = new StreamResult(new File(ruta + "/" + nombreArchivo + ".xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}