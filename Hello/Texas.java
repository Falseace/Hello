import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Texas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texas
{
    private static String winName="";
    private static int highCard=0;
    private static ArrayList<Player> players=new ArrayList<Player>();
    private static int visCard=2;
    private static  Deck deck=new Deck();
    private static String name;
    private static ArrayList<Card> board=new ArrayList<Card>();
    private static ArrayList<Card> hander=new ArrayList<Card>();
    private static int pairCheck;
    public static void main(String[]args)
    {
        Deck reck=new Deck();
        intro();
        players.add(new Player(name));
        computers();
        game();
    }

    public static void computers()
    {
        System.out.println("How many players would you like to verse?");
        System.out.println("We recommend 23 or less players, otherwise the game will get funky");
        int counter=0;
        boolean t=false;
        do{
            Scanner scan =new Scanner(System.in);
            try{
                int numm=scan.nextInt();
                if(counter>1)
                    System.out.println("YOU DID IT");
                for(int i=0;i<numm;i++)
                {
                    players.add(new Player());
                }
                t=true;
            }
            catch(Exception e)
            {
                System.out.println("Sorry, thats not a number");
                counter++;
            }
        }while(t!=true);

        System.out.println("There are "+players.size()+" players in this game");
    }

    public static void intro()
    {
        System.out.println("Welcome user to Modified Texas Holdem!");
        System.out.println("Please enter your user name:");
        Scanner scan =new Scanner(System.in);
        name=scan.nextLine();
        System.out.println("Your user name is " + name);
        System.out.println("As of right now, you have infinite money, so let's play!");
    }

    public static void setBoard()
    {
        board.add(deck.takeCard());
        board.add(deck.takeCard());
        board.add(deck.takeCard());
        board.add(deck.takeCard());
        board.add(deck.takeCard());
    }

    public static void visBoard()
    {
        for(int i=visCard;i<board.size();i++)
        {
            System.out.println(board.get(i));
        }
        System.out.println("\n");
        if(visCard==0)
            visCard=2;
        else
        {
            visCard--;
        }
    }

    public static int checkCards()
    {
        int x=0;
        x=pair();
        return x;
    }

    public static int pair()
    {
        int x=0;
        int pair=0;
        int three=0;
        int threeRank=0;
        int pairRank=0;
        int[] values={2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] suitvalues={1,2,3,4};
        int[] compare=new int[13];
        int[] comparison=new int[4];

        for(int i=0;i<values.length;i++)
        {
            for(int j=0;j<hander.size();j++)
            {

                if(values[i]==hander.get(j).rankValue)
                {
                    compare[i]++;
                }
            }
        }
        for(int r=0;r<suitvalues.length;r++)
        {
            for(int j=0;j<hander.size();j++)
            {
                if(suitvalues[r]==hander.get(j).suitValue)
                {
                    comparison[r]++;
                }
            }
        }

       // for(int i=0;i<compare.length;i++)
       // {
       //     System.out.println(compare[i]);
       // }
        for(int k=0;k<compare.length;k++)
        {
            if(compare[k]==4)
            {
                x+=500+k;
            }
            else if(compare[k]==3)
            {
                three++;
                threeRank=k;
            }
            else if(compare[k]==2)
            {
                pair++;
                if(pairRank<k)
                    pairRank=k;
            }
        }
        if((three==1)&&(pair==1))
        {
            x=250+threeRank+pairRank;
        }
        else if((three==1)&&(pair==0))
        {
            x+=50+threeRank;
        }
        else if(pair>=2)
        {
            x+=10+pairRank;
        }
        else if(pair==1)
        {
            x+=5+pairRank;
        }
        else{
            x=0;
        }
        return x;
    }

    public static void game()
    {
        int c=0;
        boolean b=false;
        int cc=0;

        do{
            if(c>0)
            {
                c++;
            }
            try{
                for(int i=c;i<players.size();i++)
                {
                    players.get(i).giveHand(deck);
                    c=i;
                }
                setBoard();
                b=true;

            }
            catch(Exception e)
            {
                System.out.println("Another deck was added!");
                deck.setDeck();
            }
        }while(b!=true);
        for(int i=0;i<players.size();i++)
        {
            if(i==0)
            {
                System.out.println(players.get(0));
                visBoard();
                System.out.println("Ready for next card to flip?");
                Scanner scan=new Scanner(System.in);
                scan.nextLine();
                visBoard();
                System.out.println(players.get(0));
                System.out.println("Ready for the final card to flip?");
                scan.nextLine();
                visBoard();
                System.out.println(players.get(0));

            }
            hander.add(players.get(i).checkHand(0));
            hander.add(players.get(i).checkHand(1));
            for(int h=0;h<board.size();h++)
            {
                hander.add(board.get(h));
            }
            int x=checkCards();
            players.get(i).addPoints(x);
            hander.clear();
            if(x>highCard)
            {
                highCard=x;
                winName=players.get(i).names;
            }
        }
        System.out.println(winName+" won with "+ highCard+" points!");
        board.clear();
        end();

    }

    public static void end()
    {
        System.out.println("Ready for the next Round?  Type quit to exit");
        Scanner scan=new Scanner(System.in);
        String answer=scan.nextLine();
        if(answer.equalsIgnoreCase("quit"))
            quits();
        else
        {
            for(int i=0;i<players.size();i++)
            {
                players.get(i).clHand();
            }
            game();
        }
    }

    public static void quits()
    {
        players.get(0).printPoints();
        System.out.println("Goodbye");
    }
}