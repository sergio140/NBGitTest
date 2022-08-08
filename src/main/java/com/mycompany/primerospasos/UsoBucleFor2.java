package com.mycompany.primerospasos;
import javax.swing.JOptionPane;

public class UsoBucleFor2 {

    public static void main(String args[]) {
        String email = JOptionPane.showInputDialog("Introduce un email:");
        int arroba = 0;
        boolean punto = false;
        
       for (int i=0; i<email.length();i++){
           
           if (email.charAt(i) == '@'){
               arroba++;   
           }
           
           if(email.charAt(i) == '.'){
               punto = true;
           }
       }
       
       if (arroba == 1 && punto == true){
           System.out.println("El email es correcto.");
       }else
           System.out.println("El email es incorrecto.");
    }
}
