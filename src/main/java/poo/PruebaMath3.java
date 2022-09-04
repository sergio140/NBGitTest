/******************************************************************************
 * ESTA CLASE VA CON LA INTERFAZ EXTREMOS
******************************************************************************/


package poo;

public class PruebaMath3 {

    public static void main(String args[]) {
        // Para emplear los métodos de la clase Math3 es necesario
        // crear una instancia de la clase Math3
        Math3 aux = new Math3();
        int [] n = new int[12];
        
        for (int i=0; i<n.length; i++) {
            n[i] = (int) (100*Math.random()+1);
            System.out.println("n["+i+"] = "+n[i]);
        }
        System.out.println("Minimo : " + aux.min(n));
        System.out.println("Maximo : " + aux.max(n));

    }
}

final class Math3 implements Extremos{
    
    @Override
    public int min(int[] a) {
        int menor = a[0];
        for (int i=0; i<a.length; i++) {
            if (menor>a[i]) { 
                menor=a[i]; 
            }
        }
        return menor;
    }

    @Override
    public int max(int[] a) {
        int mayor = a[0];
        for (int i=0; i<a.length; i++) {
            if (mayor<a[i]){ 
                mayor=a[i]; 
            }
        }
        return mayor;
    }

    @Override
    public double min(double[] a) {
        double menor = a[0];
        for (int i=0; i<a.length; i++) {
            if (menor>a[i]) { 
                menor=a[i]; 
            }
        }
        return menor;
    }

    @Override
    public double max(double[] a) {
        double mayor = a[0];
        for (int i=0; i<a.length; i++) {
            if (mayor<a[i]){ 
                mayor=a[i]; 
            }
        }
        return mayor;
    }
    
}