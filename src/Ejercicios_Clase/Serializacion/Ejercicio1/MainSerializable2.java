package Ejercicios_Clase.Serializacion.Ejercicio1;

import java.io.*;

public class MainSerializable2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjetoSerializable1 os1 = new ObjetoSerializable1();

        //Leer fichero al objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\famoso.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Desearizar el contenido del fichero (byte)
        ObjetoSerializable1 osSalida = (ObjetoSerializable1)ois.readObject();

        System.out.println("Nombre: " + osSalida.nombre);
    }
}
