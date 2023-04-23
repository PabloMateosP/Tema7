package Ejercicios_Clase.EjerciciosDiapositiva;

import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            File carpeta = new File("C:\\Users\\1DAW_2223_09");
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            File fichero1 = new File("C:\\Users\\1DAW_2223_09\\alumnos.txt");
            if (!fichero1.exists()) {
                fichero1.createNewFile();
            }
            FileWriter escritura = new FileWriter(fichero1);
            BufferedWriter buffer = new BufferedWriter(escritura);
            buffer.write("Samuel \n");
            buffer.write("Panaero \n");
            buffer.write("Johnatan \n");
            buffer.write("Wanmilla \n");
            buffer.write("Juan Jesús \n");
            buffer.write("J.María \n");
            buffer.write("Adrián \n");
            buffer.write("Antonio \n");
            buffer.write("DanielAlfonso \n");
            buffer.write("Jossie \n");
            buffer.write("J.M. Saborido \n");
            buffer.write("Pablopido \n");
            buffer.write("Richy \n");
            buffer.write("Victor \n");
            buffer.write("Diego \n");
            buffer.write("David \n");
            buffer.write("Jorge \n");
            buffer.close();
            File fichero2 = new File("C:\\Users\\1DAW_2223_09\\alumnoscod.txt");
            fichero1.renameTo(fichero2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
