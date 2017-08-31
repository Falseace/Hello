import java.awt.Color;
import javax.swing.JFrame;
/**
 * Write a description of class Drawing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drawing
{
    /**
     * Constructor for objects of class Drawing
     */
    public Drawing()
    {
        JFrame win = new JFrame("My Drawing");
        win.setBounds(1000,1000,900,600);//x,y,w,h
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Rectangle box=new Rectangle(100,50,200,200);
        box.setBackground(Color.green);
        
        
        Oval circle=new Oval(110,57,200,200);
        circle.setBackground(Color.cyan);
        win.add(circle,0);
        win.add(box,0);
        
        Triangle nonagon=new Triangle(120,63,200,200);
        nonagon.setBackground(Color.magenta);
        win.add(nonagon,0);
        win.setVisible(true);
    }
}
