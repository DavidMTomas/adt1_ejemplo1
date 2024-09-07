package com.damato.AulaEnLaNubeTema8.Serializable;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupo implements Serializable {
    String nombre;
    ArrayList<Alumno> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }


    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void mostrarAlumnos() {
        System.out.println("Grupo:" + nombre);
        for (Alumno actual : alumnos) {
            System.out.println(" Alumno: " + actual.getNombre() + "de: " + actual.getEdad());
        }
    }
}
