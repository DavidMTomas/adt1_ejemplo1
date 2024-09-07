package com.damato.AulaEnLaNubeTema8;

import java.io.*;
import java.util.Arrays;

public class proves {
    public static void main(String[] args) {

        String[] palabras = {"hola.txt","hola.dtd","Adios.txt"};

        Arrays.stream(palabras).filter(n -> n.contains(".txt")).forEach(n -> System.out.println(n));




        System.out.println("Listar documentos cuya extension es .txt");
        String ruta= "src/main/resources";
        File directorio = new File(ruta);

        if(directorio.isDirectory()){
            Arrays.stream(directorio.list()).filter(n -> n.contains(".txt")).forEach(n -> System.out.println(n));
        }


        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/main/resources/repaso.txt"));
            String busca = "Texto";

            String linea;
            int contador = 0;

            while ((linea=bf.readLine())!=null){
                String[] palabraslinea=linea.split("\\s+");

                 contador += (int) Arrays.stream(palabraslinea).filter(n -> n.equals(busca)).count();
            }


            if(contador==0) System.out.println("No hay palabras iguales a "+busca);
            else System.out.println(contador==1?"Hay 1 palabra ":"Hay "+contador+" palabras");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
