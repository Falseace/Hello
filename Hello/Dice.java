import java.util.Random;
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    private int score;
    private int[]dices;
    public Dice()
    {
        Random gen=new Random();
        dices=new int[5];
        score=0;
        for(int i=0;i<dices.length;i++)
        {
            dices[i]=gen.nextInt(6)+1;
        }
    }

    public void displayDice()
    {
        for(int i=0; i<dices.length;i++)
        {
            System.out.println(dices[i]);
        }
        System.out.println("\n");
    }

    public int scores()
    {
        int[] nice=new int[7];

        for(int i=0;i<dices.length;i++)
        {
            int ehh=dices[i];
            nice[ehh]++;
        }
        for(int i=0;i<dices.length;i++)
        {
            if(nice[i]==5)
            {
                score+=50;
            }
            else if(nice[i]==4)
                score+=25;
            else if(nice[i]==3)
                score+=10;
        }
        return score;
    }

    public void displayScore()
    {
        System.out.println(score+"\n");

    }

    public boolean scoreCount()
    {
        boolean thing=false;
        if(score>=100)
            thing=true;
        return thing;
    }

    public int[] rollDice()
    {
        Random gen=new Random();
        for(int i=0;i<dices.length;i++)
        {
            dices[i]=gen.nextInt(6)+1;
        }
        return dices;
    }

    public static void main(String[]args)
    {
        Dice rice=new Dice();
        Dice lice=new Dice();
        do{
            rice.rollDice();
            lice.rollDice();
            rice.displayDice();
            lice.displayDice();
            rice.scores();
            lice.scores();
            rice.displayScore();
            lice.displayScore();
        }while((!rice.scoreCount())&&(!lice.scoreCount()));
        if(rice.scoreCount())
            System.out.println("Rice won");
        if(lice.scoreCount())
            System.out.println("Lice won");
    }
}

