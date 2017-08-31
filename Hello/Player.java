import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private int points;
    public String names;
    private ArrayList<Card> hand=new ArrayList<Card>();
    public Player()
    {
        points=0;
        names="Computer";
        ArrayList hand;
    }
    
    public Player(String x)
    {
        points=0;
        names=x;
    }
    
    public void giveHand(Deck deck)
    {
        hand.add(deck.takeCard());
        hand.add(deck.takeCard());
    }

    public Card checkHand(int x)
    {
        return hand.get(x);
    }
    
    public void clHand()
    {
        hand.clear();
    }
    
    public int addPoints(int x)
    {
        points+=x;
        return points;
    }
    
    public void printPoints()
    {
        System.out.println(names+" ended with "+points+" points");
    }
    
    public String toString()
    {
        return names+" has "+ hand;
    }
}