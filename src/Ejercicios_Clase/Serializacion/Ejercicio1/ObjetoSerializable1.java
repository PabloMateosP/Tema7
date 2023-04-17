package Ejercicios_Clase.Serializacion.Ejercicio1;

import java.io.Serializable;

public class ObjetoSerializable1 implements Serializable {
    private static long serialVersionUID = 1L;
    String nombre;

    public ObjetoSerializable1(String nombre){
        this.nombre = nombre;
    }
    public ObjetoSerializable1(){
        this.nombre = "Diego el Cigala";
    }
}
