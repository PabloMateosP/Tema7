package Ejercicios_Clase.Practica;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class MainPractica {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        System.out.println("BIENVENIDO !! \nUsted va a entrar en el programa creado por el grupo INT JUAN. \nEste programa tiene la función de elegir un alumno entre los que posean una menor cantidad de intervenciones para la corrección de tareas en clase, \nteniendo la posibilidad el profesor de exportar estos datos a un archivo xml");

        //MetodoescribirxmInicial.metodoescribirxmInicial();

        MetodoLeerXML.metodoLeerXML();

        //MetodoAleatorio.metodoAleatorio();
        
    }
}
