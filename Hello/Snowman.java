import java.awt.Color;
import javax.swing.JFrame;
/**
/**
 * Write a description of class Snowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowman
{
    public static void main(String[]args)
    {
        JFrame win = new JFrame("Snowman!");
        win.setBounds(500,500,500,500);//x,y,w,h
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //background
        Rectangle background=new Rectangle(0,0,500,500);
        background.setBackground(Color.black);
        win.add(background,0);
        //middle of snowman
        Oval body=new Oval(305,330,60,60);
        body.setBackground(Color.white);
        win.add(body,0);
        //circular part of scarf
        Oval scarf=new Oval(310,330,50,18);
        scarf.setBackground(Color.green);
        win.add(scarf,0);
        //triangular part of scarf
        Triangle scerf=new Triangle(345,340,347,360,355,355);
        scerf.setBackground(Color.green);
        win.add(scerf,0);
        //the head
        Oval head=new Oval(310,285,50,50);
        head.setBackground(Color.white);
        win.add(head,0);
        //the bottom of the snowman
        Oval bottom=new Oval(300,380,70,70);
        bottom.setBackground(Color.white);
        win.add(bottom,0);
        //bottom part of the hat
        Rectangle hat=new Rectangle(310,281,50,5);
        hat.setBackground(Color.green);
        win.add(hat,0);
        //top part of the hat
        Rectangle top=new Rectangle(315,265,40,20);
        top.setBackground(Color.green);
        win.add(top,0);
        //left eye
        Oval eye1=new Oval(15,15,5,5);
        eye1.setBackground(Color.black);
        head.add(eye1,0);
        //right eye
        Oval eye2=new Oval(30,15,5,5);
        eye2.setBackground(Color.black);
        head.add(eye2,0);
        //the nose
        Triangle nose=new Triangle(330,310,350,320,340,310);
        nose.setBackground(Color.orange);
        win.add(nose,0);
        //left arm part 1
        Line left1=new Line(285,340,305,360);
        left1.setBackground(Color.orange);
        win.add(left1,0);
        //left arm part 2
        Line left2=new Line(285,340,295,310);
        left2.setBackground(Color.orange);
        win.add(left2,0);
        //right arm part 1
        Line right1=new Line(365,360,380,360);
        right1.setBackground(Color.orange);
        win.add(right1,0);
        //right arm part 2
        Line right2=new Line(380,360,385,385);
        right2.setBackground(Color.orange);
        win.add(right2,0);
        
       
        Rectangle floor=new Rectangle(0,445,500,50);
        floor.setBackground(Color.white);
        win.add(floor,0);
        win.setVisible(true);
    }
}
