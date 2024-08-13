package com.damato;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer {

    public static void main(String[] args) {
        FileReader fr;

        {
            try {
                fr = new FileReader(Escribir.archivo);

                int caracter;

                while ((caracter = fr.read()) != -1) {
                    System.out.print(Character.toChars(caracter));
                }

                fr.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("Con bufered readeer \n");
        try {
        FileReader fr2 = new FileReader(Escribir.archivo);
        BufferedReader bf = new BufferedReader(fr2);
        String linea;

            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }

            bf.close();
            fr2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
