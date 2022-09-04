/*Video 60*/
package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {

    public static void main(String args[]) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        setTitle("Prueba de Dibujos");
        setSize(400,400);
        setLocation(600,300);
        
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
    }
}

class LaminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //g.drawRect(10, 30, 200, 200);
        //g.drawLine(10, 300, 300, 300);
        //g.drawArc(10, 300, 200, 100, 120, 120);
        
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
                                                //100,100,200,150 También es valido
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);//Establecemos como el marco de la elipse el objeto rectángulo anterior
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100, 100, 300, 250));//Instanciar la linea dentro del método draw
        g2.draw(new Line2D.Double(10, 350, 250, 350));//Instanciar la linea dentro del método draw
        
        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();
        double radio = 125;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio,centroEnY+radio);
        g2.draw(circulo);
        
    }
}