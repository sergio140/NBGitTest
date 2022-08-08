package poo;
import javax.swing.JOptionPane;

public class Uso_Coche {

    public static void main(String args[]) {

        Coche miCoche = new Coche();//Instanciar una clase. Ejemplar de clase. "Clase + nombre = new + constructor"
        
        System.out.println(miCoche.dime_datos_generales());
        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color:"));
        System.out.println(miCoche.dime_color());
        
        miCoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.dime_asientos());

        miCoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?"));
        System.out.println(miCoche.dime_climatizador());
        
        System.out.println(miCoche.dime_peso_coche());
        System.out.println("El precio del coche será de "+miCoche.precio_coche()+"€.");
    }
}
