package com.mycompany.primerospasos;

public class UsoArraysBidimensionales {

    public static void main(String args[]) {

        //int matrix[][]=new int [4][5];
        int matrix [][]= {
            {10,15,18,19,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {85,2,7,40,27}
        };
        
        
/*        for (int i=0;i<4;i++){
            for (int j=0; j<5;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
*/    
        for(int fila[]:matrix){
            for(int z:fila){
                System.out.print(z+" ");
            }
            System.out.println("");
        }    

    }
}
