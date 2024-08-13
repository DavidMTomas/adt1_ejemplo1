package com.damato;

import java.io.File;

public class Directorios {
    public static void main(String[] args) {

        File directorio= File.listRoots()[0];
        String directorioRaiz= directorio.toString();
        File[] paths = File.listRoots();
        File direcc = new File("C:/");

        //imprimimos directorio raiz
        System.out.println("=================================="); // C , ya que es 0
        System.out.println("Directorio raiz "+directorioRaiz);

        // imprimimos unidades de disco
        System.out.println("=================================="); // C y D list roots
        System.out.println("unidades de disco:");
        for (File f : paths){
            System.out.println("\t"+f.toString());
        }

        // imprmimos archivos y carpetas
        System.out.println("=================================="); // lista archivos y carpetas de c File
        System.out.println("Los archivos y carpetas que contiene "+direcc);
        for (File f: direcc.listFiles()){
            System.out.println("\t"+f+(f.isFile()?" -fichero":"- directorio"));
        }


        System.out.println("==================================================");// lista archivos y carpetas String
        System.out.println("Los nombres de los archivos y/o carpetas que contiene " +
                direcc);
        for (String f : direcc.list()) {
            System.out.println("\t" + f);
        }
    }
}
