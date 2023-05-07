package Ejercicios_Clase.Practica;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Scanner;

public class MainPractica {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        System.out.println("BIENVENIDO !! \nUsted va a entrar en el programa creado por el grupo INT JUAN. \nEste programa tiene la función de elegir un alumno entre los que posean una menor cantidad de intervenciones para la corrección de tareas en clase, \nteniendo la posibilidad el profesor de exportar estos datos a un archivo xml");

        System.out.println("\nMétodos: \n Pulse 1 para crear un archivo xml: \n Pulse 2 para leer un archivo xml: \n Pulse 3 para acceder al método aleatorio: ");

        //Creamos un scanner para leer la opción que quiere usar el usuario
        Scanner sc = new Scanner(System.in);
        String metodo = sc.nextLine();

        if (metodo.equals("1")){
            System.out.println(" ");
            MetodoescribirxmInicial.metodoescribirxmInicial();
        } else if (metodo.equals("2")) {
            System.out.println(" ");
            MetodoLeerXML.metodoLeerXML();
        } else if (metodo.equals("3")) {
            System.out.println(" ");
            MetodoAleatorio.metodoAleatorio();
        } else  {
            System.out.println("\nUsted salió del programa ");
        }
    }
}
