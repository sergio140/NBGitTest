package com.mycompany.primerospasos;

public class CalculosConMath {

    public static void main(String args[]) {
        double i=4;
        double raiz = Math.sqrt(i);
        System.out.println(raiz);
        
        double num1= 5.85;
        int resultado = (int)Math.round(num1);//(int) <- refundición.
        System.out.println(resultado);
        
        double base=5;
        double exponente=3;
        int resultado2 = (int)Math.pow(base, exponente);
        System.out.println("El resultado de "+base+ " elevado a "+exponente+ " es: " +resultado2); //(int) <- Refundición
    }
}
