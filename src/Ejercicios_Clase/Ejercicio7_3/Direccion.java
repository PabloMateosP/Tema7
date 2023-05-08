package Ejercicios_Clase.Ejercicio7_3;

import java.io.Serializable;

class Direccion implements Serializable {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
