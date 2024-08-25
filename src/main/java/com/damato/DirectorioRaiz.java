package com.damato;

import java.io.File;

public class DirectorioRaiz {


    public static void main(String[] args) {

        File[] discos = File.listRoots();

        for (int i = 0; i < discos.length; i++) {
            System.out.println("Discos de: "+ discos[i].getAbsolutePath());
            for (File f: discos[i].listFiles()){
                if(f.isFile()) System.out.println("archivo: "+f.getName());
                if(f.isDirectory()) System.out.println("carpeta: "+f.getName());
            }

            System.out.println("____________________________");
        }


    }
}
