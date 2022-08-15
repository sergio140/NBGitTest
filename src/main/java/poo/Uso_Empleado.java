/*******************************************************************
        EJEMPLO DE TODO EL CODIGO EN UN MISMO FICHERO FUENTE.
*******************************************************************/
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

    public static void main(String args[]) {
/* 
        Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);//5 parametros, igual que el constructor
        Empleado empleado2 = new Empleado("Antonio Pérez", 40000, 2001, 13, 25);
        Empleado empleado3 = new Empleado("Elena Martinez", 105000, 1995, 1, 17);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);    

        System.out.println("Nombre: "+empleado1.dameNombre()+". Sueldo: "+empleado1.dameSueldo()+". Fecha Alta: "+empleado1.dameFechaContrato());
        System.out.println("Nombre: "+empleado2.dameNombre()+". Sueldo: "+empleado2.dameSueldo()+". Fecha Alta: "+empleado2.dameFechaContrato());
        System.out.println("Nombre: "+empleado3.dameNombre()+". Sueldo: "+empleado3.dameSueldo()+". Fecha Alta: "+empleado3.dameFechaContrato());
*/   

        Empleado misEmpleados[] = new Empleado[4]; //array de la clase Empleado.

        misEmpleados[0] = new Empleado ("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado ("Antonio Pérez", 40000, 2001, 13, 25);
        misEmpleados[2] = new Empleado ("Elena Martinez", 105000, 1995, 1, 17);
        misEmpleados[3] = new Empleado ("Paco Jara");

        for (int i=0; i<misEmpleados.length;i++){
            misEmpleados[i].subeSueldo(5);
            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+". Sueldo: "+misEmpleados[i].dameSueldo()+". Fecha Alta: "+misEmpleados[i].dameFechaContrato());
        }
      
        /************************CON BUCLE FOREACH****************************/
 /*       System.out.println("---------------------------------------------\n\n");
        for(Empleado e: misEmpleados){
           e.subeSueldo(5);
           System.out.println("Nombre: "+e.dameNombre()+". Sueldo: "+e.dameSueldo()+". Fecha Alta: "+e.dameFechaContrato());
        }
*/    
 
 
    
    }
}    
class Empleado{
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    /************** SOBRECARGA DE CONSTRUCTORES -> DIFERENTES ESTADOS INICIALES **************/
    public Empleado(String nom, double sue, int anyo, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anyo,mes-1,dia);//Enero = mes 0, por eso se le resta 1.
        altaContrato = calendario.getTime(); 
    }
    
    public Empleado(String nombre){
        this(nombre, 30000, 2000, 01, 01);//llama al otro constructor, el numero de parámetros tiene que coincidir con los del otro constructor.
        
    }
    
    /************** METODOS GETTER **************/
    
    public String dameNombre(){
        return nombre;   
    }
    
    public double dameSueldo(){
        return sueldo;   
    }
    public Date dameFechaContrato(){
        return altaContrato;   
    }
    
    /************** METODOS SETTER **************/
    
    public void subeSueldo(double porcentaje){
        double aumento =sueldo * (porcentaje/100);
        sueldo += aumento;
    }
}

class Jefatura extends Empleado{ //Hereda de Empleado.
    private double incentivo;
    
    //CONSTRUCTOR
    public Jefatura(String nom, double sue, int anyo, int mes, int dia){
        super(nom, sue, anyo, mes, dia);//llamada al constructor de 5 parámetros
    }

    /************** METODOS GETTER **************/
    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo();//Con super, estamos diciendo que llame a dameSueldo de la clase padre, de la clase Empleado.
        return sueldoJefe + incentivo;
    }
    
    /************** METODOS SETTER **************/
    public void estableceIncentivo(double inc){
        incentivo = inc;
    }
    
}
