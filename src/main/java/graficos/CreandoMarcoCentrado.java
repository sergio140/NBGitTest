package graficos;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;


public class CreandoMarcoCentrado {

    public static void main(String args[]) {
        MarcoCentrado miMarco = new MarcoCentrado();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }  
}

class MarcoCentrado extends JFrame{
    
    //CONSTRUCTOR
    public MarcoCentrado(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanyoPantalla =  miPantalla.getScreenSize();
        int alturaPantalla = tamanyoPantalla.height;
        int anchoPantalla = tamanyoPantalla.width;     
        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Marco Centrado");
        Image miIcono = miPantalla.getImage("graficos/icono.gif");
        setIconImage(miIcono);
    }
}