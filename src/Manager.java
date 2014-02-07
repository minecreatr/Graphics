import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Manager {

    public void newFrame(){
        Dimension d = new Dimension(1000, 1000);
        final Display dis = new Display("Cheese", d);
        //Image image = Toolkit.getDefaultToolkit().getImage("cheese.png");
        //Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), "Cheese");
        //dis.setCursor(cursor);
        dis.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point newval = new Point(e.getX(),e.getY());
                Point oldval = dis.getDrawArea().getOldPoints();
                if (newval.distance(oldval)<=25){
                    dis.getDrawArea().setCoords(e.getX(), e.getY());
                    dis.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });




    }


}
