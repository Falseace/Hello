
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    private String color;
    private String name;
    private int speed;
    private boolean isHungry;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        color="black";
        name="Odin";
        speed=15;
        isHungry=true;

    }

    public Dog(String c, String n)
    {
        color=c;
        name=n;
        speed=15;
        isHungry=true;
    }

    public String toString()
    {
        String output="A "+ color+" dog named " + name;
        output +="\nIt has a speed of " +speed + " and it is " + isHungry +" that it is hungry.";
        return output;
    }
    //setter
    public void setName(String n)
    {
        name=n;
    }
    //setter
    public void setColor(String c)
    {
        color=c;
    }
    //getters
    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public static void main(String[]args)
    {
        Dog Odin=new Dog();
        //Dog log=new Dog("White","Thor");
        //Dog dog3=log;
        System.out.println(Odin);
       // System.out.println(log);
        //System.out.println(dog3);
        Odin.setName("Loki");
       System.out.println(Odin.getName());
       Odin.setColor("Green");
       System.out.println(Odin);
    }
}
