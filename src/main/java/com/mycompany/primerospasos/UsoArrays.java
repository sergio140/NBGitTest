package com.mycompany.primerospasos;

public class UsoArrays {

    public static void main(String args[]) {
 //       int [] mi_matriz = new int[5];
 //       int mi_matriz2[] = new int[5]; /*LAS 2 FORMAS SON VÁLIDAS*/
 /*       
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=-15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;
*/        
        int mi_matriz[]={5,38,-15,92,71,95,85,65,25,14,78};
        
        for (int i=0; i<mi_matriz.length;i++)
        System.out.println("El elemento " +(i+1)+" del array es el "+mi_matriz[i]+".");
    }
}
