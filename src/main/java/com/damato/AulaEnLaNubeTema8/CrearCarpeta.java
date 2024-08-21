package com.damato.AulaEnLaNubeTema8;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;


public class CrearCarpeta {
    public static void main(String[] args) {
        String ruta= "src/main/resources/";
        String nombreCarpeta ="carpetaEjercicio";

        File ejercicioCarpeta= new File(ruta,nombreCarpeta);

        if(ejercicioCarpeta.mkdir()) System.out.println("Carpeta creadaen "+ejercicioCarpeta.getAbsolutePath());
        else System.out.println("La carpeta ya existe en "+ ejercicioCarpeta.getAbsolutePath());



        try {
            System.out.println("cuantos archivos quieres crear");
            int numero= new Scanner(System.in).nextInt();

            for (int i=0;i<numero;i++){
                String nombre= String.valueOf(i);
                File archivo= new File(ejercicioCarpeta,nombre+".txt");
                FileOutputStream fos = new FileOutputStream(archivo);
                fos.write(("Soy el texto del archvio "+archivo.getName()).getBytes());
                fos.close();
            }

        } catch (Exception e) {
            throw new RuntimeException("Error entrad no valida");
        }



    }
}
