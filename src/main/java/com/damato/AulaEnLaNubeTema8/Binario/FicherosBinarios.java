package com.damato.AulaEnLaNubeTema8.Binario;

import java.io.*;

public class FicherosBinarios {
    private static Boolean aprobado = true;
    private static String nombre = "PRG";
    private static  int conv = 1;

    private static double note = 8.3;


    public static Boolean getAprobado() {
        return aprobado;
    }

    public static double getNote() {
        return note;
    }

    public int getConv() {
        return conv;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        crearDirectorio();
        // escribir a fichero primitivo
        escribirFichero();

        leerFichero();

        leerFichero2();




    }

    private static void leerFichero2() {

        try {
            FileInputStream fis = new FileInputStream("src/main/resources/ejemplosBinario/ejemplo.dat");

            System.out.println("Lectura con File input Stream");
            int dato;


            while ((dato=fis.read())!=-1) System.out.print(dato+" ");




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void leerFichero() {
        try (DataInputStream in = new DataInputStream(new FileInputStream("src/main/resources/ejemplosBinario/ejemplo.dat"))) {

            Object[] metodos={in.readBoolean(),in.readUTF(),in.readDouble(), in.readInt()};

            for (Object actual: metodos){
                System.out.println("Valor leido "+ actual);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void escribirFichero() {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("src/main/resources/ejemplosBinario/ejemplo.dat"))) {

            out.writeBoolean(getAprobado());
            out.writeUTF(getNombre());
            out.writeDouble(getNote());
            out.writeInt(conv);


            System.out.println("archivo escrito con un totoala de "+ out.size()+" bytes");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo"+e);
        }



    }

    private static void crearDirectorio() {
        File directorio = new File("src/main/resources/ejemplosBinario");
        System.out.println(directorio.mkdir() ? " directorio creado en la ruta  " + directorio.getAbsolutePath() : " error al crear el directorio, tal vez ya existe");

    }

}
