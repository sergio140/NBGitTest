package poo;

public class PruebaAnimales {

    public static void main(String args[]) {
        //Mamifero felix = new Mamifero("Gato","Blanco");
        Gato felix = new Gato();
        System.out.println("Vamos a instanciar al Gato...");
        felix.caminar();
        felix.nadar();
        
        Loro pepe = new Loro();
        System.out.println("\nVamos a instanciar al Loro...");
        pepe.caminar();
        pepe.volar();
        
        Avestruz pepa = new Avestruz();
        System.out.println("\nVamos a instanciar a la Avestruz...");
        pepa.caminar();
        
        Murcielago murci = new Murcielago ();
        System.out.println("\nVamos a instanciar al Murciélago...");
        murci.caminar();
        murci.volar();
        
        Tigre pinon = new Tigre();
        System.out.println("\nVamos a instanciar al Tigre...");
        pinon.caminar();
        pinon.nadar();
        
    }
}
/*SUPERCLASES*/
class Mamifero{
    String especie, color;  
    
    public void caminar() {
        System.out.println("Los mamiferos caminan.");
    }
}

class Aves{
   
    public void caminar() {
        System.out.println("Las aves caminan.");
    }
}
/*FIN SUPERCLASES*/

class Felino extends Mamifero implements PuedeCaminar, PuedeNadar{
    @Override
    public void nadar() {
        System.out.println("Los Felinos pueden nadar!");
    } 
}

class Gato extends Felino{
}

class Loro extends Aves implements PuedeCaminar, PuedeVolar{

    @Override
    public void volar() {
        System.out.println("Los loros pueden volar!");
    }

/* YA NO ES NECESARIO, AL HACER LA SEGUNDA PARTE DEL EJERCICIO HEREDA DE AVES, QUE YA TIENE ESTE METODO.
    @Override
    public void caminar() {
        System.out.println("El loro camina!");
    }
*/    
}

class Avestruz extends Aves{
    
}

class Murcielago extends Mamifero implements PuedeVolar{

    @Override
    public void volar() {
        System.out.println("Los Murciélagos vuelan!");
    }
}

class Tigre extends Felino{
    
}