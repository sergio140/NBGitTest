package poo;

public class BloquesCodigoEstaticos {

    public static void main(String args[]) {
        BloqueStatic bs = new BloqueStatic();
    }
}

class BloqueStatic{
    static{
        System.out.println("Bloque Estático");
    }
    public BloqueStatic(){
        System.out.println("Constructor");
    }
}