import java.util.Random;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{      
    public static void main(String[]args)    
    {
        Random gen=new Random();
        int dice1=gen.nextInt(6)+1;
        int dice2=gen.nextInt(6)+1;
        int roll=dice1+dice2;
        System.out.println("The first die rolled: " + dice1);
        System.out.println("The second die rolled: " + dice2);
        int score=20;
        if(roll==5)
            score=score+10;
        else if(roll<=7)
            score=score+3;
        else if(roll==10)
        {
            System.out.println("This is the Death Blow");
            score=score-30;
        }
        else
            score=score-2;
        System.out.println("Your Score is " + score);
    }

}

   