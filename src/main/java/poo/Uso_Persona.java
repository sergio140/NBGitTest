package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String args[]) {
        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0]=new Empleado2("Luis Conde",50000, 2009,2,25);
        lasPersonas[1]=new Alumno("Antononio Machado","Informática");
        
        for(Persona p: lasPersonas){
            System.out.println("Nombre: "+p.dameNombre()+", Descripción: "+p.dameDescripcion());
        }
    }
}

abstract class Persona{
    private String nombre;
    
    /************** CONSTRUCTOR **************/
    public Persona(String nom){
        nombre = nom;
    }
    
    /************** METODOS GETTER **************/
    public String dameNombre(){
        return nombre;
    }
    /************** CLASE ABSTRACTA **************/
    public abstract String dameDescripcion(); //Sin llaves de apertura y cierre, solo se define, no se construye (lo construyen los hijos).
    //Si tienes un método abstracto, la clase tiene que ser abstracta.
}


class Empleado2 extends Persona{ //NO SE PUEDE LLAMAR EMPLEADO, YA QUE EN ESTE MISMO PAQUETE YA HAY UNA CLASE LLAMADA EMPLEADO.
    
//    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int Id_siguiente=1;//Id_siguiente se ha puesto en CURSIVA para identificar que es estática, como es static, solo es accesible desde dentro de la clase.

    /************** CONSTRUCTOR **************/
    public Empleado2(String nom, double sue, int anyo, int mes, int dia){
        
        super(nom);
   //     nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anyo,mes-1,dia);//Enero = mes 0, por eso se le resta 1.
        altaContrato = calendario.getTime();
        Id = Id_siguiente;
        Id_siguiente++;
    }
    
    public String dameDescripcion(){//Sobreescribimos el método abstracto de la clase padre Empleado2.
        return "Este empleado tiene un ID= "+Id+", con un sueldo = "+sueldo+".";
    }
    /************** METODOS GETTER **************/
    
//    public String dameNombre(){
//        return nombre + ". Id: "+Id;   
//    }
    
    public double dameSueldo(){ //SI LE PONEMOS PUBLIC FINAL dameSueldo, EL METODO dameSueldo DE JEFATURA DARÍA ERROR, NO PODRIA SOBREESCRIBIRSE.
        return sueldo;   
    }
    public Date dameFechaContrato(){
        return altaContrato;   
    }
    public static String dameIdSiguiente(){ //Los metodos estáticos no actuan sobre objetos, pertenecen a la clase, se utiliza como Empleados.dameIdSiguiente
        return "El Id siguiente será: "+Id_siguiente+".";//solo podremos acceder a variables static, no podríamos acceder a variables que no sean static.
    }
    
    /************** METODOS SETTER **************/
    
    public void subeSueldo(double porcentaje){
        double aumento =sueldo * (porcentaje/100);
        sueldo += aumento;
    }
}

class Alumno extends Persona{
    private String carrera;
    
    public Alumno(String nombre, String carrera){
       super(nombre);
       this.carrera = carrera; 
    }
    
    public String dameDescripcion(){//Sobreescribimos el método abstracto de la clase padre Empleado2.
        return "Este alumno está estudiando la carrera de: "+carrera+".";
    }
    
    
}