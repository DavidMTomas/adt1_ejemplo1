package com.damato.AulaEnLaNubeTema8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticaFile {

    private static String texto = "Texto que escribo en el archivo\n";

    public static void main(String[] args) {

        File archivo = new File("src/main/resources/praticaFile.txt");

        try {
            if (archivo.createNewFile()) {
              System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
            }

            try (OutputStream os = new FileOutputStream(archivo, true)) {
                os.write(texto.getBytes(StandardCharsets.UTF_8));
                System.out.println("Archivo escrito");
            }

            try (InputStream ios = new FileInputStream(archivo)) {

                int texto;
                System.out.println("Texto guardado en el fichero; "+archivo.getName()+"\n almacenado en la ruta "+archivo.getAbsolutePath());

                while ((texto=ios.read())!=-1){
                    System.out.print(Character.toChars(texto));
                }
                if(ios.read()==-1) System.out.println("No hay mas que leer");

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
