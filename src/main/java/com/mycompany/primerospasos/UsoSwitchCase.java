package com.mycompany.primerospasos;

import java.util.Scanner;
import javax.swing.*;

public class UsoSwitchCase {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in); //Método dinámico
        
        System.out.println("Elige una opción: \n1: Cuadrado.\n2: Rectángulo.\n3: Triángulo.\n4: Círculo.");
        int figura = entrada.nextInt();
        
        switch (figura){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:")); //método estático.
                System.out.println("El área del Cuadrado es: "+Math.pow(lado, 2));
            break;
            
            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del Rectángulo es: " + (base*altura));
            break;
                
            case 3:
                int baseT=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int alturaT=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del Triángulo es: " + ((baseT*alturaT)/2));
            break;
                
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
                System.out.print("El área del Círculo es: ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
            break;
            
            default:
                    System.out.println("La opción elegida no es correcta.");
        }
        
        
        System.out.println("");
        
    }
}
