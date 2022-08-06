package com.mycompany.primerospasos;
import javax.swing.*;

public class PesoIdeal {

    public static void main(String args[]) {

        String genero ="";
        int pesoIdeal=0;
        
        do{
            genero=JOptionPane.showInputDialog("Introduce tu género (H/M): ");
        }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm: "));
        if (genero.equalsIgnoreCase("H")){
           pesoIdeal = altura-110; 
        }else if(genero.equalsIgnoreCase("M")){
           pesoIdeal = altura-120;
        }
        System.out.println("Tu peso ideal es: "+pesoIdeal+" kilos.");
        
    }
}
