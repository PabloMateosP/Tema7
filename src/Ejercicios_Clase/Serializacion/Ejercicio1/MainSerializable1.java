package Ejercicios_Clase.Serializacion.Ejercicio1;

import java.io.*;

public class MainSerializable1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjetoSerializable1 os1 = new ObjetoSerializable1();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\objeto1.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Serializar el objeto
        oos.writeObject(os1);

        //Cerramos el flujo para que se escriba en el fichero
        oos.close();

        //Leer fichero al objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\objeto1.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Desearizar el contenido del fichero (byte)
        ObjetoSerializable1 osSalida = (ObjetoSerializable1)ois.readObject();

        System.out.println("Atributo 1: " + osSalida.nombre);
    }
}
