package Ejercicios_Clase.Ejercicio7_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Crear una persona famosa
        Direccion direccion = new Direccion("17 Calle Zurbarán, Prado Del Rey");
        Persona padre = new Persona("Lola Flores", null, null);
        Persona personaFamosa = new Persona("Rosario Flores", padre, direccion);

        // Serializar el objeto Persona
        try {
            FileOutputStream fileOut = new FileOutputStream("persona.bin");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(personaFamosa);
            objectOut.close();
            fileOut.close();
            System.out.println("El objeto Persona se ha serializado correctamente en el archivo persona.bin");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
