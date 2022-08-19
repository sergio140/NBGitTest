/******************************************************************************
 *                              ENUMERADOS
******************************************************************************/
package com.mycompany.primerospasos;
import java.util.Scanner;

public class UsoTallas {

//    enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};//SIN COMILLAS, FUERA DE LA CLASE PRINCIPAL
    
    enum Talla{ 
        MINI("S"), MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        
        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura(){
            return abreviatura;
        }
        
        private String abreviatura;
    };

    
    public static void main(String args[]) {
/*        Talla s=Talla.MINI;
        Talla m=Talla.MEDIANO;
        Talla l=Talla.GRANDE;
        Talla xl=Talla.MUY_GRANDE;
*/        

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la talla: MINI, MEDIANO, GRANDE, MUY_GRANDE: ");
        String entradaDatos = entrada.next().toUpperCase();
        
        Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
        System.out.println("Talla = "+laTalla);
        System.out.println("Abreviatura = "+laTalla.dameAbreviatura());
        

    }
}
