
/**
 * Write a description of class Lizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard
{
    private String color;
    private boolean tail;
    private String name;
    public Lizard()
    {
        color="Green";
        tail=true;
        name="Dagon";
    }

    public Lizard(String c,boolean t,String n)
    {
        color=c;
        tail=t;
        name=n;
    }

    public String toString()
    {
        String output = name + " the lizard is a beautiful shade of " + color + " and ";
        if(tail)
            output += " and it has its tail.";
        else
            output += " and it has lost its tail.";

        return output;
    }

    public boolean loseTail()
    {
        tail=false;
        return tail;
    }

    public boolean growTail()
    {
        tail=true;
        return tail;
    }

    public void setColor(String c)
    {
        color=c;
    }

    public String getColor()
    {
        return color;
    }

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }

    public static void main(String[]args)
    {
        Lizard liz=new Lizard();
        System.out.println(liz);
        Lizard linnie=new Lizard("Blue",false,"Liz");
        System.out.println(linnie);
        System.out.println(linnie.getName());
        System.out.println(liz.getColor());
        liz.setColor("Purple");
        liz.loseTail();
        System.out.println(liz);
        linnie.setName("Lonnie");
        linnie.growTail();
        System.out.println(linnie);
    }
}
