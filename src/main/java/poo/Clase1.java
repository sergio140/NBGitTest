/******************************************************************************
 *                      MODIFICADORES DE ACCESO
******************************************************************************/
package poo;

public class Clase1 {
    protected int miVar=5; //MODIFICADOR POR DEFECTO (NI PUBLIC, NI PRIVATE...) SI FUESE PRIVATE, NO ACCESIBLE DESDE FUERA DE ESTA CLASE.
    int miVar2= 7;//MODIFICADOR POR DEFECTO (NI PUBLIC, NI PRIVATE...)
    
    /*MÉTODO GETTER*/
    String miMetodo(){  //SIN MODIFICADOR, TIENE MODIFICADOR POR DEFECTO (NI PUBLIC, NI PRIVATE...)
        return "El valor de miVar2: "+miVar2;
    }
}
