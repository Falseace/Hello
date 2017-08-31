import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class World here.
 * 
 * @author (Garrett Benson) 
 * @version (May 1, 2017)
 */
public class World
{
    public static void makeBananaSplits()
    {
        ArrayList<BananaSplit> iceCream=new ArrayList<BananaSplit>();
        iceCream.add(new BananaSplit());
        iceCream.add(new BananaSplit());
        iceCream.add(new BananaSplit());
        iceCream.add(new BananaSplit());

        System.out.println(iceCream);
    }

    public static void makeBananaHandlers()
    {
        ArrayList<BananaHandler> ake=new ArrayList<BananaHandler>();
        Random gen=new Random();
        for(int i=0;i<5;i++)
        {
            ake.add(new BananaHandler());
        }
        ake.add(new BananaHandler("Slayer",10));
        ake.add(new BananaHandler("System"));
        ake.add(new BananaHandler("of"));
        ake.add(new BananaHandler("a Down"));
        System.out.println("BananaHandler " + ake.remove(4)+ " is dead");
        System.out.println(ake);
        ake.get(4).changeWeapon(gen.nextInt(100)+1);
        ake.get(4).bananaTree(gen.nextInt(5));
        do{
            
           for(int i=0;i<ake.size();i++)
            {
                try{
                ake.get(i).loseHealth(ake.get(i+1).attack());
            }catch(IndexOutOfBoundsException exception) {
                ake.get(i).loseHealth(ake.get(0).attack());
            }
            ake.get(gen.nextInt(ake.size())).bananaTree(gen.nextInt(2));
                if(ake.get(i).getDead())
                {
                    ake.remove(i);
                }
            }
            System.out.println(ake);
        }while(ake.size()!=1);
        System.out.println(ake.get(0));
    }
    public static void main(String[]args)
    {
        //makeBananaSplits();
        makeBananaHandlers();
    }
}
