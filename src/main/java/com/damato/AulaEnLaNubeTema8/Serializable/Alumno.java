package com.damato.AulaEnLaNubeTema8.Serializable;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
