package com.damato;

import java.io.File;

public class ejemplo1 {

    private static String nombre = "file";
    private String extension="txt";

    private String ruta="./src/main/resources/";




    public static void main(String[] args) {

        ejemplo1 e = new ejemplo1();


        File archivo = new File(e.getRuta()+getNombre()+"."+e.getExtension());

        System.out.println("buscando el archivo: "+ archivo.getAbsolutePath());

        if(archivo.exists()) System.out.println("El archivo existe en la ruta: "+ archivo.getParent()+", con el nombre: "+archivo.getName());

        else System.out.println("El archivo no existe ");




    }


    public String getRuta() {
        return ruta;
    }

    public String getExtension() {
        return extension;
    }

    public static String getNombre() {
        return nombre;
    }
}
