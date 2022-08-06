package com.mycompany.primerospasos;

public class manipulaCadenas2 {

    public static void main(String args[]) {
        String frase="Hoy es un estupendo día para aprender a programar en Java.";
        String frase_resumen=frase.substring(29, 57) + " y también para irnos a la playa a tomar el sol.";
        String frase_resumen2=frase.substring(0, 28) + " irnos a la playa a tomar el sol y "+frase.substring(29, 58);
        System.out.println(frase_resumen);
        System.out.println(frase_resumen2);
    }
}
