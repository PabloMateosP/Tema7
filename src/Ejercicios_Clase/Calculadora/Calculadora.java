package Ejercicios_Clase.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Hola, elija la operación");
        System.out.println("Pulse + para suma");
        System.out.println("Pulse - para restar");
        System.out.println("Pulse * para multiplicar");
        System.out.println("Pulse / para dividir");

        Scanner scannerCalculadora = new Scanner(System.in);
        String a = scannerCalculadora.next();


        if (a.equals("+")) {
            System.out.println("Introduzca dos números para el cálculo");
            Scanner scannerSuma = new Scanner(System.in);
            CalculadoraCompleta.suma(0,0);
        }
        if (a.equals("-")) {

        }
        if (a.equals("*")) {

        }
        if (a.equals("/")) {

        }
    }
}
