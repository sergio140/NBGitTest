package com.mycompany.primerospasos;
import javax.swing.*;

public class entradaEjemplo2 {

    public static void main(String args[]) {
        
        /*
        METODOS ESTÁTICOS = no hay que crear objeto, no tendremos que instanciar, por ejemplo math.sqrt, math.round...
        METODOS NO ESTÁTICOS = hay que intanciarlos, por ejemplo: Scanner entrada= new Scanner...
        */
        
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre...");
        String edad = JOptionPane.showInputDialog("Introduce tu edad...");//showInputDialog devuelve siempre un String, hay que pasarlo a número.
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola "+ nombre_usuario+", el año que viene tendrás "+(edad_usuario+1)+" años");
    }
}
