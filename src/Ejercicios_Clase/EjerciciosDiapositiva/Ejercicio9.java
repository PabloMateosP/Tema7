package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\ficheroCreadoConJava2.txt");
        try {
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                fichero.delete();
                fichero.createNewFile();
                System.out.println("Fichero borrado y creado de nuevo");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //Abre el flujo de acceso aleatorio al fichero e introduce la cadena defg
        //mode es como abriremos el fichero en lectura o escritura
        try {
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

            raf.write("defg" .getBytes());
            System.out.println(raf.getFilePointer()); //Esto nos dice donde se encuentra el puntero

            //Añadir al final la cadena "hij"
            raf.write("hij" .getBytes());
            raf.seek(0); //Con el seek movemos el puntero que es donde va a leer o escribir
            System.out.println(raf.readLine());
            raf.seek(0);
            //Añadir al principio la cadena "abc"
            //Hacemos que se guarde en una variable temporal para no sobreescribir lo que se encuentre y después
            //escribimos lo de la variable al final
            String temp = raf.readLine();
            raf.write("abc" .getBytes());
            raf.write(temp.getBytes());
            raf.seek(0);
            System.out.println(raf.readLine());

        } catch (IOException Ae) {
            Ae.printStackTrace();
        }

        //Sustituir las vocales por "*"
//        try {
//            FileOutputStream fos = new FileOutputStream(fichero, true);
//            fos.write("*" .getBytes());
//            fos.close();
//        } catch (IOException aa) {
//            aa.printStackTrace();
//        }
    }
}
