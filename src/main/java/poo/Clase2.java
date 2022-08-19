/******************************************************************************
 *                      MODIFICADORES DE ACCESO
******************************************************************************/

package poo;
import com.mycompany.primerospasos.Clase3;

public class Clase2 {
    public static void main(String args[]) {
        
        Clase1 miObj = new Clase1(); 
        //System.out.println(miObj.miMetodo());
        Clase3 miObj2 = new Clase3();
        System.out.println(miObj2.miVar);
    }
}
