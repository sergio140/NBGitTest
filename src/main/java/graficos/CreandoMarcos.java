/******************************************************************************
 *                      MARCOS (VENTANAS)
******************************************************************************/

package graficos;
import java.awt.Frame;
import javax.swing.*;

public class CreandoMarcos {

    public static void main(String args[]) {
       miMarco marco1= new miMarco();
       
       marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que el programa finalice al cerrar la ventana
       
    }
}

class miMarco extends JFrame{

    
    public miMarco(){
        setVisible(true);
        //setSize(500,300);//Ancho, alto
        //setLocation(500,300);
        setBounds(800,200,550,250);//Los dos primeros son la posición, los dos siguientes el tamaño
        //setResizable(false);//Impedir que se redimensione. Botón maximizar inactivo
        //setExtendedState(Frame.MAXIMIZED_BOTH);//MAXIMIZADO
        setTitle("Mi ventana");
    }
}