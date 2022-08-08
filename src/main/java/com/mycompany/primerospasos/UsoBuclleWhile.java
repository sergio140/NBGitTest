package com.mycompany.primerospasos;
import javax.swing.*;

public class UsoBuclleWhile {

    public static void main(String args[]) {
        String clave = "Juan";
        String pass = "";
        
        while (clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña...");
            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta...");
            }            
        }
         System.out.println("Contraseña correcta, acceso permitido...");      
    }
}
