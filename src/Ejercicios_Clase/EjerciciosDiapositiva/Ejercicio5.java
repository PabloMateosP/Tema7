package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.Console;

public class Ejercicio5 {
    public static void main(String[] args) {

        Console c= System.console();

        if (c == null) {
            System.err.println("No hay consola.");
        } else {
            System.out.println("Introduzca su nombre: ");
            String nombre = c.readLine();
            System.out.println("Hola "+nombre);
            System.out.println("Introduzca su password: ");
            String password = String.valueOf(c.readPassword());
            System.out.println("Su Password es: "+password);
        }
    }
}
