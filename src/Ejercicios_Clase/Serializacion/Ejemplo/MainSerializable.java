package Ejercicios_Clase.Serializacion.Ejemplo;

import java.io.*;

public class MainSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjetoSerializable os1 = new ObjetoSerializable();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\objeto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Serializar el objeto
        oos.writeObject(os1);

        //Cerramos el flujo para que se escriba en el fichero
        oos.close();

        //Leer fichero al objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\pablo\\OneDrive\\Escritorio\\GRADO Y ESTUDIOS POSTERIORES\\GRADO SUPERIOR DE DESARROLLO DE APLICACIONES WEB\\PROGRAMACIÓN\\objeto.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Desearizar el contenido del fichero (byte)
        ObjetoSerializable osSalida = (ObjetoSerializable)ois.readObject();

        System.out.println("Atributo 1: " + osSalida.atributo1);
        System.out.println("Atributo 2: " + osSalida.atributo2);
        System.out.println("Atributo 3: " + osSalida.atributo3);
    }
}
