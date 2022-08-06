package com.mycompany.primerospasos;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String args[]) {
        int aleatorio = (int)(Math.random()*100);
        
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int intentos = 0;
        
        //while (numero != aleatorio){   ***PROBLEMA SI EL RANDOM == 0, EL PROGRAMA NO SE EJECUTA, PARA QUE SE EJECUTE AL MENOS UNA VEZ -> DO ... WHILE. ***
        do{
            intentos ++;
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            if (numero > aleatorio){
                System.out.print("\nEl numero introducido es mayor. ");
            }else if (numero < aleatorio){
                System.out.print("\nEl numero introducido es menor. ");
            }
        //}
        }while (numero != aleatorio);
        System.out.println("Bingo! Has acertado. El número era el "+numero+". Lo has conseguido en "+intentos+" intentos.");
    }
}
