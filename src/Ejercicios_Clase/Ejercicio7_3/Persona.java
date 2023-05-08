package Ejercicios_Clase.Ejercicio7_3;

import java.io.Serializable;

class Persona implements Serializable {
    private String nombre;
    private Persona padre;
    private Direccion direccion;

    public Persona(String nombre, Persona padre, Direccion direccion) {
        this.nombre = nombre;
        this.padre = padre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getPadre() {
        return padre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}