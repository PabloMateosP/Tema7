package Ejemplos;

import java.io.IOException;
import java.util.Scanner;

public class HolaMundo {
    //Entrando en run edit configurations y añadiendo una nueva configuración podemos hacer que ese args cero nos dé algo
    public static void main(String[] args) throws IOException {

        //TODO: Pedir al usuario que introduzca 3 caracteres por teclado
        // Vamos a imprimirlos concatenados
        // 1. con el write
        // 2. Con el print
        // 3. Con el println

        System.out.print("Escriba un nombre: ");
        Scanner scannerInPut = new Scanner(System.in);
        String nombre = scannerInPut.nextLine();
        System.out.println("Hola " + nombre);

        System.out.print("Introduzca 3 caracteres: ");
        int c1 = System.in.read();
        int c2 = System.in.read();
        int c3 = System.in.read();

        System.out.write(c1);
        System.out.write(c2);
        System.out.write(c3);
        System.out.flush();
        System.out.println();

        //Usando el print
        System.out.print((char)c1 + "" +  (char)c2 + "" + (char)c3);
        //Tenemos que usar las comillas para decirle que son caractéres

        //Con un scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca los tres carácteres necesarios");
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);
        System.out.print("" + a + b + c);
    }

}