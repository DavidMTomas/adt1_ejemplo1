package com.damato.AulaEnLaNubeTema8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticaFile {

    private static String texto = "Texto que escribo en el archivo";

    public static void main(String[] args) {

        File archivo = new File("src/main/resources/praticaFile.txt");

        try {
            if (archivo.createNewFile()) {
              System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
            }

            try (OutputStream os = new FileOutputStream(archivo)) {
                os.write(texto.getBytes(StandardCharsets.UTF_8));
                System.out.println("Archivo escrito");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
