package com.mycompany.primerospasos;
import java.util.*;

public class VentasJavier {

    public static void main(String args[]) {
        String [] dias = {"Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        double [] importes = new double[6];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<dias.length;i++){
            System.out.print("Introduce el importe del "+dias[i]+": ");
            importes[i]=entrada.nextDouble();
        }
         
        int indiceMin=0, indiceMax=0;
        double valorMax=0, valorMin=0, media=0;
        boolean iguales=false;
                
        for (int j=0; j<dias.length; j++){
            if (j==0){
                indiceMin = j;
                indiceMax = j;
                valorMin=importes[j];
                valorMax=importes[j];
                media = importes[j];
            }else{
                if(importes[j]>valorMax){
                    valorMax= importes[j];
                    indiceMax = j;
                    media = media + importes[j];
                    iguales = false;
                }else if(importes[j]<valorMin){
                    valorMin= importes[j];
                    indiceMin = j;
                    media = media + importes[j];
                    iguales = false;
                }else if (importes[j]==valorMin && importes[j]==valorMax){
                    iguales = true;
                    media = media + importes[j];
                }else{
                    media = media + importes[j];
                }
            }
        }
        media = media/6;
        
        if (iguales==true){
            System.out.println("Todos los números introducidos son IGUALES ("+importes[indiceMax]+").");
        }else{
            if (importes[5]>media){
                System.out.println("Menor ventas: "+dias[indiceMin]+", mayor ventas: "+dias[indiceMax]+". Domingo SI superó la media ("+media+").");
            }else if (importes[5]<media){
                System.out.println("Menor ventas: "+dias[indiceMin]+", mayor ventas: "+dias[indiceMax]+". Domingo NO superó la media ("+media+").");
            }else{
                System.out.println("Menor ventas: "+dias[indiceMin]+", mayor ventas: "+dias[indiceMax]+". Domingo fue IGUAL a la media ("+media+").");
            }
        }
    }
}