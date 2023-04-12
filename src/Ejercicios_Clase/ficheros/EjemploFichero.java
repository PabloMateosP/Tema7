package Ejercicios_Clase.ficheros;

import java.io.*;
import java.sql.SQLOutput;

public class EjemploFichero {
    public static void main(String[] args) {

        //Creación de carpeta
        File directorio = new File("C:\\Users\\1DAW_2223_09\\Desktop\\PabloCarpetaJava");
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }

        //Crear fichero
        File fichero = new File("C:\\Users\\1DAW_2223_09\\Desktop\\PabloCarpetaJava\\fichero.txt");
        try {
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado el fichero");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        try {
            //Abrir fichero en modo escritura y añadir texto al final
            FileWriter fw = new FileWriter(fichero);
            fw.write(" Pablo");
            fw.close();

            //Abrir fichero en modo binario, escritura y añadiendo al final
            FileOutputStream fos = new FileOutputStream(fichero, true);
            fos.write(" Pablop" .getBytes());
            fos.close();

            //Abrir fichero en modo lectura
            FileReader fr = new FileReader(fichero);
            int i;
            while ((i = fr.read())!= 1){
                System.out.println((char) i);
            }

        }
        catch (IOException IO) {
            System.out.println(IO.getMessage());
        }
    }
}
