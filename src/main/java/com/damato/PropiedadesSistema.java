package com.damato;

public class PropiedadesSistema {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println("file"+ System.getProperty("file.separator"));
    }
}
