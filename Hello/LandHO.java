import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * Write a description of class LandHO here.
 * 8/25/17
 * @author (Garrett Benson)
 * Landscape
 */
public class LandHO
{
    public static void main(String[]args)
    {
        JFrame win=new JFrame("Landscape");
        win.setBounds(0,0,750,750);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame
        Rectangle frame=new Rectangle(0,0,500,500);
        frame.setBackground(Color.black);
        win.add(frame,0);
        //background
        Rectangle background=new Rectangle(10,10,480,480);
        background.setBackground(Color.blue);
        win.add(background,0);
        //sun
        Oval sun=new Oval(400,-10,50,50);
        sun.setBackground(Color.decode("#edd20b"));
        background.add(sun,0);
        //mountain
        Triangle mountain=new Triangle(200,150,-100,500,600,500);
        mountain.setBackground(Color.decode("#415633"));
        background.add(mountain,0);
        //trunk
        Rectangle trunk=new Rectangle(350,440,30,50);
        trunk.setBackground(Color.decode("#684c1f"));
        background.add(trunk,0);
        //leave tree thing
        //sun label
        JLabel label1=new JLabel("Sun");
        label1.setBounds(410,10,30,30);
        background.add(label1,0);
        //tree label
        JLabel label2=new JLabel("Tree");
        label2.setBounds(350,400,30,30);
        background.add(label2,0);
        
        JLabel label3=new JLabel("Mountain");
        label2.setBounds(300,300,30,30);
        background.add(label3,0);
        
        win.setVisible(true);
    }
}
