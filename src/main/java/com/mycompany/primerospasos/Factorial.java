package com.mycompany.primerospasos;
import javax.swing.JOptionPane;

public class Factorial {
    /*EL FACTORIAL DE UN NÚMERO ES MULTIPLICAR ESE NUMERO POR CADA UNO DE SUS NUMEROS INFERIORES, POR EJEMPLO:
    EL FACTORIAL DE 5 ES = 5x4x3x2x1.
    */
    public static void main(String args[]) {

        long resultado = 1L;//utilizamos un Long ya que el factorial de 20, un INT lo desborda (da números negativos.
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));//JOptionPane devuelve un String, por eso hay que pasarlo a entero.
        
        for (int i=numero; i>0; i--){

            resultado= resultado*i;
        }
        System.out.println("El factorial de "+numero+" es "+resultado+".");
    }
}
