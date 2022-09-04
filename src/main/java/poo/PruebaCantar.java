/******************************************************************************
 * ESTE ARCHIVO VA CON LA INTERFAZ PUEDECANTAR
******************************************************************************/

package poo;

public class PruebaCantar {

    public static void main(String args[]) {
        Persona pavaroti = new Persona();
        //System.out.print("Con todos ustedes! PAVAROTI: ");
        //pavaroti.cantar();
        hacerCantar(pavaroti);
        Canario piolin = new Canario();
        hacerCantar(piolin);
        Gallo claudio = new Gallo();
        hacerCantar(claudio);
        
    }
    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }
}

class Persona implements PuedeCantar{

    @Override
    public void cantar() {
        System.out.println("do re mi fa sol la si");
    }
}

class Canario implements PuedeCantar{

    @Override
    public void cantar() {
        System.out.println("pio pio pio");
    }
}

class Gallo implements PuedeCantar{

    @Override
    public void cantar() {
        System.out.println("ki ki ri ki");
    }

}