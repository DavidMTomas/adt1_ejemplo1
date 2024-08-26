package com.damato.AulaEnLaNubeTema8.Practicas;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        palabraBuscaddaEn("el","nombre(1).txt");



    }

    private static void palabraBuscaddaEn(String parametro, String file) {

        File archivo = new File("src/main/resources/Ejercicios2/"+file);

        if(!archivo.isFile()) {
            System.out.println("El archivo no a sido encontrado");
        }else{


            try (FileReader fr = new FileReader(archivo)) {

                BufferedReader bf = new BufferedReader(fr);

                String linea;
                String[] palabras;
                Long contador= 0L;

              while((linea=bf.readLine()) !=null ){
                  palabras=linea.split("\\s"); // 1 espacio o mas de 1
                 // if(Arrays.stream(palabras).anyMatch(p -> p.equals(parametro)));
                  contador += Arrays.stream(palabras).filter(p->p.equals(parametro)).count();
              }
                System.out.println("El total de palabras encontradas por: "+parametro+" es: "+contador);

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
