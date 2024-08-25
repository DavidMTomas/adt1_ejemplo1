package com.damato.AulaEnLaNubeTema8.Practicas;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero= 0 ;


        while (true){
            System.out.println("Cuantos archivos desea crear ?");

            try {
                numero = entrada.nextInt();
                entrada.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Valor no valido, valor entre 1 y 9");
                entrada.nextLine();
            }

            if(numero < 10 && numero > 0){
                break;
            }

        }


        System.out.println("En que carpeta desea crear los archivos");
        String nombre = entrada.nextLine();
        String ruta= "./src/main/resources/";

        File carpeta = new File(ruta+nombre);

        System.out.println(carpeta.mkdir()? "La carpeta fue creada en la ruta "+carpeta.getAbsolutePath():
        "la carpeta ya existe");

        System.out.println((numero==1?" Se creara 1 archvio ": "Se crearan "+ numero +" archivos")+" en la siguiente ubicacion "+carpeta.getAbsolutePath() );


        for (int i = 0; i <numero ; i++) {
            File n = new File(carpeta+"/nombre("+(i+1)+").txt");

            try (FileWriter fw = new FileWriter(n,true)) {
                fw.write("Este es el fichero "+n.getName()+"\n");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
