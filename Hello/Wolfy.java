
/**
 * Write a description of class Wolfy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolfy
{
    // instance variables - replace the example below with your own
    private int cuteness;
    private boolean cute;
    private String name;
    private int strength;
    private String speed;

    public Wolfy()
    {
        cuteness=10000;
        cute=true;
        name="Wolf";
        strength=35;
        speed="Really fast";
        
    }
    
    public String toString()
    {
        String output=name + " the wolf is running "+speed+" towards you. \n You don't care though because its cuteness is " +cuteness+ " and " +cute+ " \nand then tackles you with " +strength+ " strength";
        return output;
    }
    public static void main(String[]args)
    {
        Wolfy wolf=new Wolfy();
        System.out.println(wolf);
    }

    
}
