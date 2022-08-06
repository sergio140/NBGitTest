package com.mycompany.primerospasos;

import java.util.Scanner;

public class entradaEjemplo1 {

    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);
        String nombre;
        
        System.out.println("Introduce tu nombre... ");
        nombre = entrada.nextLine();
        System.out.println("Introduce tu edad... ");     
        int edad = entrada.nextInt();
        System.out.println("Hola "+ nombre+", el año que viene tendrás "+ (edad+1)+" años.");
        
    }
}
