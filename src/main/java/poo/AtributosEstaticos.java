package poo;

public class AtributosEstaticos {

    public static void main(String args[]) {
        System.out.println(Jugador.contador);
        Jugador uno = new Jugador ("Ronnie");
        System.out.println(Jugador.contador);
    }
}

class Jugador{
    public static int contador = 0;
    private String nombre = null;
    
    public Jugador(String param){
        nombre = param;
        contador++;
    }
}