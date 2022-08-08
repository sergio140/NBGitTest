package com.mycompany.primerospasos;
import javax.swing.*;

public class Entrada_Numeros {

    public static void main(String args[]) {
        double x=10000.0;
        System.out.printf("%1.2f",x/3);//solo muestra dos decimales
        System.out.println("");
        
        String num1 = JOptionPane.showInputDialog("Introduce un número: ");
        
        double num2 = Double.parseDouble(num1);//convertimos el número a double.
        
        System.out.print("La raíz de "+num2+" es ");
        System.out.printf("%1.4f", Math.sqrt(num2));//devuelve la raíz con 2 decimales.
        System.out.println("");
    }
}
