package com.damato.AulaEnLaNubeTema8.Practicas;

import java.io.File;
import java.util.Arrays;

public class Ejercicio1 {



    public static void main(String[] args) {
        File carpeta = new File(".");
        String extension ="xml";


        listarArchivos(carpeta);

        listarArchivosStream(carpeta,extension);
        listarArchivos(carpeta,extension);


    }

    private static void listarArchivos(File carpeta, String extension) {
        System.out.println("Listado de la ruta: "+carpeta.getPath());
        if(carpeta.isDirectory() ){
            for (File actual: carpeta.listFiles()){
                if(actual.isFile()){
                    String[] separar = actual.getName().split("\\.");
                    if(separar[1].equals(extension)){
                        System.out.println(actual.getName());
                    }
                }
            }
        }
    }

    private static void listarArchivosStream(File carpeta, String extension) {
        System.out.println("Listado de la ruta: "+carpeta.getPath());
        if(carpeta.isDirectory() ){
            // Filtramos y procesamos los archivos en un stream
            Arrays.stream(carpeta.listFiles()) // Convierte el array de archivos en un stream
                    .filter(File::isFile) // Filtra solo los archivos (no carpetas)
                    .filter(actual -> {
                        String[] separar = actual.getName().split("\\."); // Divide el nombre del archivo por el punto
                        return separar[1].equals(extension); // Filtra por extensión
                    })
                    .forEach(actual -> System.out.println(actual.getName())); // Imprime los nombres de los archivos
        }
        }


    private static void listarArchivos(File carpeta) {
        System.out.println("Listado de la ruta: "+carpeta.getAbsolutePath());
        if(carpeta.isDirectory()){
            for (String actual: carpeta.list()){
                System.out.println(actual);
            }
        }
        System.out.println("______________________________________");
    }
}
