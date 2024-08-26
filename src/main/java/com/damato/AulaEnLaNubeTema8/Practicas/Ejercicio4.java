package com.damato.AulaEnLaNubeTema8.Practicas;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio4 {

    public static void main(String[] args) {

        try {
            eliminarPalabra("Este", "nombre(1).txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private static void eliminarPalabra(String parametro, String nombreArchivo) throws FileNotFoundException {

        File archivo = new File("src/main/resources/Ejercicios2/"+nombreArchivo);
        String nuevoTexto="";

        try (Scanner sc = new Scanner(archivo)) {
            String linea;
            String[] palabras;


            while(sc.hasNextLine()){
                linea=sc.nextLine();
                palabras=linea.split(" ");
                nuevoTexto += Arrays.stream(palabras).filter(p-> !p.equals(parametro)).collect(Collectors.joining(" "))+"\n";

            }


            System.out.println("Terminada lectura de archivo");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        System.out.println("Inicio nuevo archivo");

    int indicePunto=nombreArchivo.toString().lastIndexOf(".");

        String archivoNombre=nombreArchivo.substring(0,indicePunto);

        String nuevoNombre=archivoNombre+"_2.txt";

        File archivoNuevo = new File("src/main/resources/Ejercicios2/"+nuevoNombre);


        PrintWriter pr = new PrintWriter(archivoNuevo);


        pr.print(nuevoTexto);

        pr.close();
        System.out.println("Texto insertado en archivo: "+archivoNuevo.getAbsolutePath());


    }
}
