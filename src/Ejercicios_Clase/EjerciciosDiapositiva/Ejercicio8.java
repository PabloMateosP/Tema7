package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\ficheroCreadoConJava.txt");
        try {
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado el fichero");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {

            FileWriter fw = new FileWriter(fichero);
            fw.write(" Pablo");
            fw.close();

        } catch (IOException IO){
            IO.printStackTrace();
        }
    }
}
