package com.damato;

import java.io.File;

public class App {

    public static void main(String[] args) {
        String archivo = "file.txt";
        String actual = "App.java";

        String path = "./src/main/resources/";
        String path2 = "./src/main/java/com/damato/";
        File f1= new File(path+archivo);
        File f2 = new File(path2+actual);





        if(f1.exists()) {
            System.out.println("el archivo existe");
            System.out.println("name "+f1.getName());
            System.out.println("parent "+f1.getParent());
            System.out.println("length "+f1.length());
        }
        else System.out.println("El archivo no existe");

        System.out.println();

        if(f2.exists()) {
            System.out.println("el archivo existe");
            System.out.println("name "+f2.getName());
            System.out.println("parent "+f2.getParent());
            System.out.println("length "+f2.length());
        }
        else System.out.println("El archivo no existe");

    }


}