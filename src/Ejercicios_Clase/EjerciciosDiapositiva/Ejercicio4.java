package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Porfavor introduzca su nombre:  ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("introduzca su edad: ");
        Scanner scc = new Scanner(System.in);
        int edad = scc.nextInt();

        System.out.println("hola " + nombre + " de edad " + edad);
    }
}
