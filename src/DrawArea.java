import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class DrawArea extends JComponent{

    private int x;
    private int y;
    public int oldX;
    public int oldY;

    public DrawArea(){
        super();
        x = 500;
        y = 500;
        oldX = 500;
        oldY = 500;
    }



    public void setCoords(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point getOldPoints(){
        Point point = new Point(oldX, oldY);
        return point;
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(x-25, y-25, 50, 50);
        oldX = x;
        oldY = y;
    }

}
