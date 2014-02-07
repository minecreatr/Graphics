import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;


public class Display extends JFrame {


    private DrawArea dr;

    public Display(String name, Dimension size){
        super(name);
        dr = new DrawArea();
        this.setName(name);
        this.setVisible(true);
        this.setSize(size);
        this.setResizable(false);
        this.add(dr);
    }

    public DrawArea getDrawArea(){
        return dr;
    }
}
