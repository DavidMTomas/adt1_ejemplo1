package com.damato.AulaEnLaNubeTema8.Serializable;

import java.io.*;

public class EjemploSerializable {

    private static Grupo dam;


    public static void main(String[] args) {


        crearGrupoYAlumnos();
        System.out.println("Alumnos creados");

        escribirArchivoBinario();

        System.out.println("Alumnos escritos");


        Grupo leido = leerArchivoBinario();
        System.out.println("Alumnos leidos");

        leido.mostrarAlumnos();


    }

    private static void escribirArchivoBinario() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/alumnosBinario.dat"))) {
            oos.writeObject(dam);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Grupo leerArchivoBinario() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/alumnosBinario.dat"))) {
            Grupo leido = (Grupo) ois.readObject();
            return leido;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private static void crearGrupoYAlumnos() {
        Alumno uno = new Alumno("Pepe", 24);
        Alumno dos = new Alumno("Luis", 34);
        Alumno tres = new Alumno("Jose", 45);
        dam = new Grupo("DAM");
        dam.agregarAlumno(uno);
        dam.agregarAlumno(dos);
        dam.agregarAlumno(tres);

    }


}
