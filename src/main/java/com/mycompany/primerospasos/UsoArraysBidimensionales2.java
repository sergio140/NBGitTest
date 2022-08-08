package com.mycompany.primerospasos;

public class UsoArraysBidimensionales2 {

    public static void main(String args[]) {
        double acumulado;
        double interes =0.10;
        
        double saldo[][]= new double [6][5];
        
        for (int i=0;i<6;i++){
            saldo[i][0]=10000;
            acumulado = 10000;
            //System.out.println(saldo[i][0]+" ");
            for (int j=1;j<5;j++){
                acumulado = acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
                //System.out.print(saldo[i][j]+" ");
            }
            interes = interes + 0.01;
            //System.out.println("");
        }
        
        
        for (int z=0; z<6;z++){
            for (int y=0;y<5;y++){
                System.out.printf("%1.2f", saldo[z][y]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
