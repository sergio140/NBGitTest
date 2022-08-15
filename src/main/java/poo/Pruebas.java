/*******************************************************************
                     EJEMPLO DE CONSTANTES (FINAL)
*******************************************************************/
package poo;

public class Pruebas {

    public static void main(String args[]) {
        Empleados empleado1= new Empleados("Jose Antonio");
        Empleados empleado2= new Empleados("Manuel Jesús");
        Empleados empleado3= new Empleados("Emi Muries");
        Empleados empleado4= new Empleados("Fran Pérez");
        
        empleado1.cambiaSeccion("I+D");
        empleado2.cambiaSeccion("RRHH");
//       empleado1.cambiaNombre("Maria Antonia");              <--------- AL SER FINAL, NO SE PUEDE MODIFICAR.
        
        System.out.println(empleado1.devuelveDatos());
        System.out.println(empleado2.devuelveDatos());
        System.out.println(empleado3.devuelveDatos());
        System.out.println(empleado4.devuelveDatos());
        System.out.println(Empleados.dameIdSiguiente());// pertenecen a la clase Empleados, no al objeto (empleado1...)
    }
}

class Empleados{
    private final String nombre; //El nombre de un trabajador no debe ser cambiado == CONSTANTE
    private String seccion;
    private int Id;
    private static int Id_siguiente=1;//Id_siguiente se ha puesto en CURSIVA, para identificar que es estática, variable compartida por todos. Tiene que ser pública.
    
    public Empleados(String nom){
        
        nombre = nom;
        seccion = "Administración";
        Id = Id_siguiente;
        Id_siguiente++;
    }
    
    /************METODOS GETTER************/
    public String devuelveDatos(){
        return "El nombre es: "+nombre+", la sección es: "+seccion+" y el ID = "+Id+".";
    }
    
    public static String dameIdSiguiente(){ //Los metodos estáticos no actuan sobre objetos, pertenecen a la clase
        return "El Id siguiente será: "+Id_siguiente;
    }
    
    /************METODOS SETTER************/
    public void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    
 /*   public void cambiaNombre(String nombre){
        this.nombre=nombre;                     <--------- AL SER FINAL, NO SE PUEDE MODIFICAR.
    }
*/
}