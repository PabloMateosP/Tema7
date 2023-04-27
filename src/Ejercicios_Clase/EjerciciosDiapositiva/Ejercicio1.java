package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        //Enlace para los scanner java
        //https://ifgeekthen.nttdata.com/es/que-es-y-como-usar-la-clase-scanner-en-java
        // Pedir al usuario que introduzca 4 caracteres por teclado
        System.out.println("Introduzca cuatro caractéres: ");
        //int c1 = System.in.read();
        //int c2 = System.in.read();
        //int c3 = System.in.read();
        int c4 = System.in.read();

        // 1. Imprimir el primero con el write

        //System.out.write(c1);
        //System.out.flush();
        //Para imprimir Mediante el write hay que meter los parámetros por enteros ya que funciona por bytes, para imprimir este habría que usar un flush para
        //volcarlo por consola.

        // 2. Imprimir el segundo con print

        //System.out.print(c2);
        //El print no necesita un flush propio, es decir este ya lo hace internamente, por otra parte, imprimiría el byte de la letra puesta
        //Si queremos imprimir su representación en caracter Unicode, lo convertimos a char mediante un casting
        //System.out.print((char)c2);

        // 3. Imprimir el tercero con println

        //System.out.println((char)c3);
        //Imprimiría la letra al tener el casting hecho pero con un salto de línea.

        // 4. Imprimir el cuarto con printf

        System.out.printf("%c", c4);
        //Imprimimos el carácter con el formato que le demos en este caso al poner "%c" le damos el formato ASCII correspondiente con ese caracter

        // Dado que el write trabaja con bytes, si quisieramos pasarle un String habría que convertir a array de bytes
        //System.out.write("Hola".getBytes());

        // Lo anterior por pasos:
        //String outputStream = "Hola";
        //byte[] byteOutputStream = outputStream.getBytes();
        //System.out.write(byteOutputStream);
        //System.out.flush();
    }
}
