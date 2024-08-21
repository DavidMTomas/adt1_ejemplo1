package com.damato.AulaEnLaNubeTema8;

import java.io.*;

public class Paquetes {
    // https://aulaenlanube.com/zona-programacion/java/curso-java-acceso-datos-ficheros/curso-java-nio-io-ficheros/
    
//    Paquete java.io -- entrada/salida original de java basaba en flujos
    // Flujos: sequencias unidireccionales de bytes. Pueden ser de entrada InputStream o de salida OutputStream
    // son bloqueantes
//    Paquete java.nio -- introducido como alternativa escalabla basada en canales
    // Canales: Son biidireccionales. Los buffers son objetos que almecenan temporalmente la informacion, provocando una mayor eficiencia
    // no son bloqueantes, un hilo puede contnuar con otras tareas
    // selectores multiples conexiones simultaneas
    public static void main(String[] args) {

        File ruta=new File("src/main/resources");
        File archivo = new File(ruta,"archivo.txt");

        if(archivo.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Nombre: "+archivo.getName());
            System.out.println("Longitud: "+archivo.length());
            System.out.println("Ruta: "+archivo.getAbsolutePath());
            System.out.println("Ejecuta: "+archivo.canExecute());
        }
        else System.out.println("El archivo no existe");




        System.out.println("Directorio "+ruta.exists());
        System.out.println("Directorio "+ruta);

        File nuevoArchivo= new File(ruta,"nuevoArchivo.txt");

        try {
            if(nuevoArchivo.createNewFile()) System.out.println("Archivo ocreado");
            else System.out.println("archivo no crreado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            PrintWriter pw
= new PrintWriter(nuevoArchivo);

            pw.write("texto añadido al archivo");

            pw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fi = new FileInputStream(nuevoArchivo);
            int texto;

            while((texto=fi.read()) !=-1){
                System.out.print(Character.toChars(texto));
            }

            fi.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


File prova= new File("ohla");

        try (InputStream is = new FileInputStream(prova)) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
