package com.damato.AulaEnLaNubeTema8;

import java.io.*;
import java.util.Scanner;

public class Repaso {

    public static void main(String[] args) {


        File directorio = new File(".");
        String ruta = "src/main/resources/";
        File archivo = new File(ruta + "repaso.txt");
        String escritura = "Text que escribo en archivo.\n";


        try {

            crearArchivo(archivo);
            // verArchivos(directorio);
            escrituraFileWritter(archivo, escritura);
            lecturaArchivoFileReader(archivo);
            lecturaArchivoBufferReader(archivo);
            lecturaArchivoInptStreamReader(archivo);
            escrituraPrinWritter(archivo, 1, "Texto");
            lecturaScanner(archivo);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void lecturaScanner(File archivo) throws FileNotFoundException {
        System.out.println("----Lectura con Scanner----");
        try (Scanner sc = new Scanner(new FileReader(archivo))) {
            while (sc.hasNext()) {
                if(sc.hasNextInt()) System.out.println(sc.nextInt());
                else sc.next();
            }
            System.out.println("Terminada lectura Enteros en Scanner");
        }
    }

    private static void escrituraPrinWritter(File archivo, int i, String texto) throws IOException {
        System.out.println("----Escritura archivo ocn printWritter----");
        PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));

        pw.println(i);
        pw.print(" ");
        pw.print(texto);
        pw.close();

        System.out.println("Fin escritura archivo con printWritter");
    }

    private static void lecturaArchivoInptStreamReader(File archivo) throws IOException {
        System.out.println("----Lectura de archivo con InputStreamReader----");
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(archivo))) {
            int texto;
            while ((texto = isr.read()) != -1) {
                System.out.print((char)texto);
            }
            System.out.println("\nLectura completada de archivo " + archivo.getName());
        }
    }

    private static void lecturaArchivoBufferReader(File archivo) throws IOException {
        System.out.println("----Lectura de archivo con BufferReader----");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String texto;

            while ((texto = br.readLine()) != null) {
                System.out.println(texto);
            }
            System.out.println("\nLectura completada de archivo " + archivo.getName());
        }
    }

    private static void lecturaArchivoFileReader(File archivo) throws IOException {
        System.out.println("----Lectura de archivo con FileReader----");
        try (FileReader fr = new FileReader(archivo)) {
            int texto;
            while ((texto = fr.read()) != -1) {
                System.out.print((char) texto);
            }
            System.out.println("\nLectura completada de archivo " + archivo.getName());
        }
    }


    private static void escrituraFileWritter(File archivo, String escritura) throws IOException {
        System.out.println("----Escritura con FIleWritter----");
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(escritura);
        }
        System.out.println("Archivo escrito en: " + archivo.getName() + " con un longitud de: " + archivo.length());
    }

    private static void crearArchivo(File archivo) throws IOException {


        System.out.println(archivo.exists() ? " el archivo existe " : "El archivo no existe");
        System.out.println(archivo.createNewFile() ? " archivo creado" : " el archivo ya existe");

    }

    private static void verArchivos(File directorio) {
        if (!directorio.isDirectory()) {
            System.out.println(directorio.getName());
        } else {
            System.out.println("//////// " + directorio.getName() + " ////////////////");
            for (File actual : directorio.listFiles()) {
                if (actual.isDirectory()) verArchivos(actual);
                else System.out.println(actual.getName() + " length " + actual.length());
            }
        }


    }
}
