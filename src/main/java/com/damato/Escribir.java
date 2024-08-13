package com.damato;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Escribir {
    static String archivo = "./src/main/resources/file.txt";

    public static void main(String[] args) {

        try {
        FileWriter fw = new FileWriter(archivo,true);
            for (int i = 0; i < 5; i++) {
                fw.write(Integer.toString(i));
                System.out.println(i);
            }

    fw.close();
            System.out.println();
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            pw.println("\nfrase que se escribe en el archivo");
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
