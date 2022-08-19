/*******************************************************************
        EJEMPLO DE TODO EL CODIGO EN UN MISMO FICHERO FUENTE.
*******************************************************************/
package poo;

import java.util.Arrays;
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
        Jefatura jefeRRHH = new Jefatura("Pepa Meroño",55000, 1990, 8, 20);
        
        jefeRRHH.estableceIncentivo(2570);
        
        Empleado misEmpleados[] = new Empleado[6]; //array de la clase Empleado.

        misEmpleados[0] = new Empleado ("Paco Gómez", 85000, 1995, 12, 17);
        misEmpleados[1] = new Empleado ("Antonio Pérez", 40000, 2001, 13, 25);
        misEmpleados[2] = new Empleado ("Elena Martinez", 105000, 1995, 1, 17);
        misEmpleados[3] = new Empleado ("Paco Jara");
        misEmpleados[4] = jefeRRHH;// POLIMORFISMO!! PRINCIPIO DE SUSTITUCIÓN.
        misEmpleados[5] = new Jefatura("Jose María", 95000, 1999,5,26); //POLIMORFISMO, Principio de Sustitución.

        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
        jefaFinanzas.estableceIncentivo(5000); //CASTING CORRECTO
        
        System.out.println(jefaFinanzas.tomarDecisiones("Barra libre para todos!"));
        
        System.out.println("El Jefe de Finanzas "+jefaFinanzas.dameNombre()+" tiene un bonus de "+jefaFinanzas.estableceBonus(500));
        System.out.println("El empleado "+misEmpleados[3].dameNombre()+" tiene un bonus de "+misEmpleados[3].estableceBonus(200));
//        Jefatura jefeCompras = (Jefatura) misEmpleados[1]; // ESTE CASTING ES INCORRECTO Y DA ERROR, UN EMPLEADO NO SE PUEDE CONVERTIR EN JEFE (HERENCIA, EL PADRE NO SE PUEDE CONVERTIR EN HIJO)
                
        for (int i=0; i<misEmpleados.length;i++){
            misEmpleados[i].subeSueldo(5);
//            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+". Sueldo: "+misEmpleados[i].dameSueldo()+". Fecha Alta: "+misEmpleados[i].dameFechaContrato());
        }
        
        Arrays.sort(misEmpleados);
        
        /************************CON BUCLE FOREACH****************************/
        System.out.println("---------------------------------------------");
        for(Empleado e: misEmpleados){
//           e.subeSueldo(5);
           System.out.println("Nombre: "+e.dameNombre()+". Sueldo: "+e.dameSueldo()+". Fecha Alta: "+e.dameFechaContrato());
        }
    }
}    
class Empleado implements Comparable, Trabajadores{
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int Id_siguiente=1;//Id_siguiente se ha puesto en CURSIVA para identificar que es estática, como es static, solo es accesible desde dentro de la clase.

    /************** SOBRECARGA DE CONSTRUCTORES -> DIFERENTES ESTADOS INICIALES **************/
    public Empleado(String nom, double sue, int anyo, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(anyo,mes-1,dia);//Enero = mes 0, por eso se le resta 1.
        altaContrato = calendario.getTime();
        Id = Id_siguiente;
        Id_siguiente++;
    }
    
    public Empleado(String nombre){
        this(nombre, 30000, 2000, 01, 01);//llama al otro constructor, el numero de parámetros tiene que coincidir con los del otro constructor.     
    }
    
    /************** METODOS GETTER **************/
    
    public String dameNombre(){
        return nombre + ". Id: "+Id;   
    }
    
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

    @Override
    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.Id < otroEmpleado.Id){
            return -1;
        }
        if (this.Id > otroEmpleado.Id){ 
            return 1;
        }
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double estableceBonus(double gratificacion) {
        return Trabajadores.bonusBase+gratificacion;
    }
}

final class Jefatura extends Empleado implements Jefes{ //Hereda de Empleado. SI PONEMOS FINAL AL PRINCIPIO, NADIE PODRÁ HEREDAR DE ELLA.
    private double incentivo;
    
    //CONSTRUCTOR
    public Jefatura(String nom, double sue, int anyo, int mes, int dia){
        super(nom, sue, anyo, mes, dia);//llamada al constructor de 5 parámetros del padre.
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

    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la dirección ha tomado la siguiente decisión: "+decision;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonusBase+ gratificacion + prima;
    }
    
}