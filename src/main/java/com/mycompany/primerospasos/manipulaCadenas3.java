package com.mycompany.primerospasos;

public class manipulaCadenas3 {

    public static void main(String args[]) {
        String alumno1, alumno2;
        alumno1="Sergio";
        alumno2="sergio";
        
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
