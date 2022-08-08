package com.mycompany.primerospasos;
import javax.swing.JOptionPane;

public class UsoArrays2 {

    public static void main(String args[]) {

       //String paises[]= new String [8];
       //paises[0]="España";
       //paises[1]="México";
       
        //String paises[]={"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};

        /*for (int i=0; i<paises.length;i++){
            System.out.println("El País "+ (i+1)+ " es "+paises[i]+".");
        }*/
        
        String paises[]= new String [8];
        
        for (int j=0;j<paises.length;j++){
            paises[j]=JOptionPane.showInputDialog("Introduce el país "+(j+1));
        }
        
        
        int i=0;
        for (String elemento:paises){
            i++;
            System.out.println("El País "+ i+ " es "+elemento+".");
        }
    }
}
