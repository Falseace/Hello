import java.util.ArrayList;
/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator
{
    private int biteStrength;
    private int length;
    public Alligator()
    {
        biteStrength=3700;
        length=10;
    }

    public Alligator(int x,int y)
    {
        biteStrength=x;
        length=y;
    }

    public void setBiteStrength(int x)
    {
        biteStrength=x;
    }

    public void addLength(int x)
    {
        length+=x;
    }

    public String toString()
    {
        return"Length: " + length + " Bite Strength: " + biteStrength+"\n";
    }

    public static void main(String[]args)
    {
        ArrayList<Alligator> liezard=new ArrayList<Alligator>();

        
        for(int i=0;i<5;i++)
        {
            liezard.add(new Alligator());
        }
        liezard.add(new Alligator(9000,15));
        liezard.add(1,new Alligator(9000,15));
        System.out.println("Terminated: "+liezard.remove(3));
        System.out.println(liezard);
    }
}
