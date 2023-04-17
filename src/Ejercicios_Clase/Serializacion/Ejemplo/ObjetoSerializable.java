package Ejercicios_Clase.Serializacion.Ejemplo;

import java.io.Serializable;

public class ObjetoSerializable implements Serializable {
    private static long serialVersionUID = 1L;
    int atributo1;
    static int atributo2;
    transient int atributo3;
    //El tipo transient hace que no se deserialice

    public ObjetoSerializable(int atributo1, int atributo2, int atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    public ObjetoSerializable(){
        this.atributo1 = 7;
        this.atributo2 = 7;
        this.atributo3 = 7;
    }

}
