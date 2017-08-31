import java.util.ArrayList;
import java.util.Random;
/**
 * This gives a program Cards
 * 
 * @author (Garrett Benson was h) 
 * @version (1.0)
 */
public class Deck
{

    public ArrayList<Card> deck=new ArrayList<Card>();
    public Deck()
    {
        setDeck();
    }

    public void setDeck()
    {
        String[] setSuit={"Hearts","Spades","Diamonds","Clubs"};
        String[] setRank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        for(int i=0;i<setSuit.length;i++)
        {
            for(int j=0;j<setRank.length;j++)
            {
                deck.add(new Card(setSuit[i],setRank[j],(i+1),(j+2)));
            }
        }
    }

    public Card takeCard()
    {

        Random gen=new Random();
        int num=gen.nextInt(deck.size());
        return deck.remove(num);

    }
    public static void main(String[]args)
    {
        Deck ish=new Deck();
        ish.setDeck();

        System.out.println(ish.deck);
        ish.takeCard();
        System.out.println(ish.deck);

        System.out.println(ish.deck.get(2));

    }

}