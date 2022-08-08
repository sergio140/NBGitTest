package com.mycompany.primerospasos;

public class ManipulaCadenas1 {

    public static void main(String args[]) {
        String nombre = "Juan";
        //int ultima = nombre.length()-1;
        System.out.print("Mi nombre es "+nombre);
        System.out.println(" y tiene "+nombre.length()+" letras.");
        System.out.println("La primera letra es la "+nombre.charAt(0)+", y la última es la "+nombre.charAt(nombre.length()-1)+".");
    }
}
