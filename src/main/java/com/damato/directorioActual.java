package com.damato;

import java.io.File;

public class directorioActual {
    public static void main(String[] args) {
        String dir=".";
        //Directorio Actual
        File f = new File(dir);
        String [] archivos =  f.list();

        System.out.println("Ficheros en el directorio actual: "+archivos.length);

        for (File actual: f.listFiles()){
            System.out.println(actual.toString() +(actual.isFile()?" -file":" -directory"));
        }


        for (int i = 0; i <archivos.length ; i++) {
            File f2= new File(f,archivos[i]);
            System.out.printf("Nombre: %s, es fichero?: %b, es directorio?: %b\n %n", // %s string , %b bolean, $d dighit %n salto de linea %f decimal
                    archivos[i],f2.isFile(),f2.isDirectory());
        }

        for (File actual: f.listFiles()){
            System.out.println("Nombre "+actual.getName()+ ", es fichero? "+actual.isFile()+ ", es directorio? "+ actual.isDirectory());
        }


        System.out.printf("%s","Hola");
        System.out.printf("%d",9);
        System.out.printf("%f",9.25);
    }
}
