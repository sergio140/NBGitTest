package poo;
import javax.swing.JOptionPane;

public class Uso_Vehiculo {

    public static void main(String args[]) {
/*
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
*/        
        System.out.println("****************************************************************************");
        Coche miCoche1 = new Coche();
        miCoche1.establece_color("Azul");
        
        Furgoneta miFurgo1 = new Furgoneta(580, 7);
        miFurgo1.establece_color("Blanco");//Heredado de coche!
        miFurgo1.configura_asientos("Sí");//Heredado de coche!
        miFurgo1.configura_climatizador("Sí");//Heredado de coche!
        System.out.println(miCoche1.dime_datos_generales()+" "+miCoche1.dime_color());
        System.out.println(miFurgo1.dime_datos_generales()+" "+miFurgo1.dimeDatosFurgoneta());//UTILIZA MÉTODOS HEREDADOS (DIME DATOS GENERALES), Y PROPIOS (DIME DATOS FURGONETA)
        
    }
}
