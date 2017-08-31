
/**
 * Write a description of class BananaSplit here.
 * 
 * @author (Garrett Benson) 
 * @version (Feb 14, 2017)
 */
public class BananaSplit
{

    private String flavor;
    private int scoops;
    private String toppings;
    private boolean hasBananas;

    /**
     * Constructor for objects of class BananaSplit
     */
    public BananaSplit()
    {
        flavor="vanilla";
        scoops=3;
        toppings="";
        hasBananas=true;
    }

    public BananaSplit(String f, int s, String t, boolean b)
    {
        flavor=f;
        scoops=s;
        toppings=t;
        hasBananas=b;
    }

    public String toString()
    {
        String output= "This " + flavor+" banana split has " +scoops+ " scoops of ice cream.";
        output += "\nThe toppings are: " + toppings;
        if(hasBananas)
            output+= " and it has bananas.";
        else
            output += " but it is NOT a bananas split.";
        return output;

    }
    //setters
    public void setScoops(int s)
    {
        scoops=s;
    }

    public void setFlavor(String f)
    {
        flavor= f;
    }

    public void setBananas(boolean b)
    {
        hasBananas=b;
    }

    public void setToppings(String st)
    {
        toppings=st;
    }

    public void addToppings(String st)
    {
        toppings+=st;
    }
    //getters
    public String getFlavor()
    {
        return flavor;
    }

    public int getScoops()
    {
        return scoops;
    }

    public boolean getBananas()
    {
        return hasBananas;
    }

    public String getToppings()
    {
        return toppings;
    }

    public static void main(String[]args)
    {
        BananaSplit yours = new BananaSplit();
        System.out.println(yours);
        BananaSplit mine=new BananaSplit("Vanilla",3,"cherry syrup, Whip Cream, Nuts", true);
        System.out.println(mine);
        yours.setScoops(10);
        yours.setFlavor("Chocolate");
        yours.setBananas(true);
        System.out.println(yours);
        System.out.println(mine.getScoops());
        System.out.println(yours.getScoops());
        boolean banana = mine.getBananas();
        if(banana)
            System.out.println("it has bananas");
        else
            System.out.println("it does not have bananas");
        System.out.println(mine.getToppings());
    }

}

