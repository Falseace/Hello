
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    public String suit;
    public int suitValue;
    public String rank;
    public int rankValue;
    public boolean isShowing;
     public Card(String x,String y, int z, int a)
    {
        suit=x;
        rank=y;
        suitValue=z;
        rankValue=a;
    }
    public String toString()
    {
        return (rank+ " of " + suit);
    }
}
