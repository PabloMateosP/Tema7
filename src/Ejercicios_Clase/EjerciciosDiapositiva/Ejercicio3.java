package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        byte b[] = new byte[5];
        try{
            System.in.read(b);
        } catch (IOException ioe){
            System.out.println(ioe);
        }
        String s = new String(b);
        System.out.println(s);
    }
}
//Mediante este código leemos el array de bytes dado aunque con valores a 0 y a posterior capturamos la excepción
//Finalmente imprimimos la cadena s la cual tien el valor del array b el cual tiene valores nulos por lo que no imprimirá nada