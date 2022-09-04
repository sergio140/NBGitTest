package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class PruebaTemporizador {

    public static void main(String args[]) {
        
        DameLaHora oyente = new DameLaHora();
        //ActionListener oyente = new DameLaHora(); //Así tambien funciona.
        
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa OK para detener");
        
        System.exit(0);
        
    }
}

class DameLaHora implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 segundos: "+ahora+".");
        Toolkit.getDefaultToolkit().beep();
    }
}