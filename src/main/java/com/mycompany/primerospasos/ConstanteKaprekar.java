package com.mycompany.primerospasos;
import java.util.*;

public class ConstanteKaprekar {

    public static void main(String args[]) {
        Scanner digito = new Scanner (System.in);
        int arrAsc[]= new int[4];
        int arrDesc[]= new int[4];
        int kaprekar=6174;
        int numerosRepetidos, numeroMin, numeroMax,resultado;
        
        System.out.print("Vamos a Jugar con la constante de Kaprekar, para ello tienes que introducir un numero de 4 digitos, estos 4 digitos no pueden ser los 4 iguales (1111, 2222...)\n");
        for (int i =0; i<4;i++){
            System.out.print("Introduce el "+(i+1)+"º digito:");
            arrAsc[i]=digito.nextInt();
        }
        
        numerosRepetidos = compruebaNumeros(arrAsc);
        
        if (numerosRepetidos <= 2){
            int [] nuevoArray = new int[arrAsc.length];
            nuevoArray = arrAsc;
            
            for (int i=0;i<8;i++){
                
                arrAsc = arrayIntAsc(nuevoArray);
                arrDesc = arrayIntDesc(arrAsc);

                numeroMin=devuelveInt(arrAsc);
                numeroMax=devuelveInt(arrDesc);
                //System.out.println("Iteración ["+(i+1)+"] - El número ascendente es: "+numeroMin+ ", y el número descendente es: "+numeroMax+".");
                resultado=resta(numeroMax, numeroMin);
                //System.out.println("Iteración ["+(i+1)+"] - El número desultado de restar "+numeroMax+ " - "+numeroMin+" es: "+resultado+".");
                if (resultado==kaprekar){
                    System.out.println("Iteración ["+(i+1)+"] - El número "+resultado+" coincide con Kaprekar ("+kaprekar+").");
                    break;
                }else{
                    System.out.println("Iteración ["+(i+1)+"] - El número "+resultado+" NO coincide con Kaprekar ("+kaprekar+").");
                    nuevoArray = intToArray(resultado);
                }
            }
        }
    }
    
    
    //FUNCIONES:
    static int compruebaNumeros(int [] arrAsc){
        int numerosRepetidos=0;
        for (int i =0; i<4;i++){
            if (i==0){
                numerosRepetidos=0;
            }else if(arrAsc[i]==arrAsc[i-1]){
                numerosRepetidos++;
            }
        }
        System.out.println("***********************************************");
        if (numerosRepetidos > 2){
            System.out.println("El numero introducido es INCORRECTO");
        }else{
            System.out.println("El numero introducido es CORRECTO");
        }
        System.out.println("***********************************************");
        return numerosRepetidos;
    } 
    
    //Devuelve entero juntado (deshace el array)
    static int devuelveInt(int[] arrayInt){
        String strInt="";
        for (int num : arrayInt) {
            strInt=strInt+Integer.toString(num);
        }
        int numero=Integer.parseInt(strInt);
        //System.out.println("El número entero de 4 dígitos es: "+numero);
        return numero;
    }
      
   // Array descendente
    static int[] arrayIntDesc(int[] arr1){
        int sizeArray=arr1.length;
        int[] arrDesc=new int[sizeArray];
        for (int i = arr1.length - 1; i >= 0; i--) {
            arrDesc[sizeArray-1-i]=arr1[i];
        }
        return arrDesc;
    }
    
    // Array ascendente
    static int[] arrayIntAsc(int[] arr1){
        Arrays.sort(arr1);
        return arr1;
    }
    
    // Número a Array
    static int[] intToArray(int num){
        String sNum=Integer.toString(num);
        int lNum=sNum.length();
        int[] arrayInt=new int[lNum];
        for (int i=0;i<lNum;i++){
            arrayInt[i]=Integer.parseInt(sNum.substring(i,i+1));
        }
        return arrayInt;
    }
    
        static int resta(int numeroMax, int numeroMin){
            int resultado;
            resultado = numeroMax-numeroMin;
            return resultado;
    }
}