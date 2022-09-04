/******************************************************************************
 *CLASE INTERNA Y CLASE INTERNA LOCAL (UNA CLASE DENTRO DE OTRA, O DENTRO DE UNA INTERFAZ)
******************************************************************************/

package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

    public static void main(String args[]) {
        
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);
        
        JOptionPane.showMessageDialog(null,"Pulsa OK para terminar");
        System.exit(0);
        
    }
}

class Reloj{
//    private int intervalo;
//    private boolean sonido;
    
    //CONSTRUCTOR
//    public Reloj(int intervalo, boolean sonido){
//        this.intervalo = intervalo;
//        this.sonido = sonido;
//    }
    
    public void enMarcha(int intervalo, boolean sonido){
        class DameLaHora2 implements ActionListener{ //CLASE INTERNA LOCAL, puede acceder a los campos de la clase que la engloba.

            @Override
            public void actionPerformed(ActionEvent evento) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 segundos: "+ahora+".");
                if (sonido){
                    Toolkit.getDefaultToolkit().beep();
                }
            }    
        }
       
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start(); 
    }
    
    
}
