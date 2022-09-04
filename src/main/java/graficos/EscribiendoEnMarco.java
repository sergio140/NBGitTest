/*Video 59*/
package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String args[]) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que cuando cerremos, pare la ejecución
        
        
    }
}

/*LA VENTANA*/
class MarcoConTexto extends JFrame{
    /*Constructor*/
    public MarcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(600,300);
        setTitle("Primer Texto");
        
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

/*LA CAPA PARA ESCRIBIR SOBRE LA VENTANA*/
class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g); //Obligatorio, llamar al metodo del padre primero.
        g.drawString("Estamos aprendiendo SWING!", 0, 20);
    }
}