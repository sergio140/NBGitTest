package poo;

public class Ejercicio1 {

    public static void main (String args[]) {
        ArrayReales item = new ArrayReales();
        item.asignar();
        item.imprime();
        System.out.println("El número más bajo es: "+item.minimo()+", el más alto: "+item.maximo()+" y el sumatorio: "+item.sumatorio());
    }
}
class ArrayReales implements Ejercicio1Interfaz{
    double [] elemento = new double[4];
    double min, max, sumatorio;
    
    public void asignar(){
        for(int i=0; i<elemento.length;i++){
            elemento[i]=Math.random();
        }
    }
    
    @Override
    public double minimo() {
        min = elemento[0];
        for(int i=0; i<elemento.length;i++){
            if (elemento[i]<min){
                min = elemento[i];
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        max = elemento[0];
        for(int i=0; i<elemento.length;i++){
            if (elemento[i]>max){
                max = elemento[i];
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        sumatorio = 0;
        for(int i=0; i<elemento.length;i++){
            sumatorio += elemento[i];
        }
        return sumatorio;
    }
    public String imprime() {
        for(int i=0; i<elemento.length;i++){
            System.out.println("["+i+"]: "+elemento[i]);
        }
        return "";
    }
}
