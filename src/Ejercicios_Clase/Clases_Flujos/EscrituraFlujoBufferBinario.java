package Ejercicios_Clase.Clases_Flujos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraFlujoBufferBinario {
    public static void main(String[] args) throws FileNotFoundException {
    try {
        FileOutputStream fileOutputStream = new FileOutputStream("EscrituraFlujoBinario");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write((byte) 'H');
        bufferedOutputStream.write((byte) 'A');
        bufferedOutputStream.write((byte) 'L');
        bufferedOutputStream.write((byte) 'L');
        bufferedOutputStream.write((byte) 'O');
        bufferedOutputStream.close();
        fileOutputStream.close();

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    }
}
