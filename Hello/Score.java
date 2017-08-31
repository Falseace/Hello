import java.util.Random;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score
{
    private int[]theScores;
    public Score()
    {
        Random gen=new Random();
        theScores=new int[10];
        for(int i=0; i<theScores.length;i++)
        {
            theScores[i]=gen.nextInt(100);
        }
    }

    public void displayScores()
    {
        for(int i=0;i<theScores.length;i++)
        {
            System.out.println(theScores[i]);
        }
        System.out.println("\n");
    }

    public int findMin()
    {
        int min=theScores[0];
        for(int i=0;i<theScores.length;i++)
        {
            if(theScores[i]<min)
                min=theScores[i];

        }
        return min;
    }

    public int getAverage()
    {
        int sum=0;
        for(int i=0;i<theScores.length;i++)
        {
            sum+=theScores[i];
        }
        int avg=0;
        avg=sum/theScores.length;
        return avg;
    }

    public int getScores(int i)
    {
        return theScores[i];
    }

    public boolean isScorein(int s)
    {
        boolean blah=false;
        for(int i=0;i<theScores.length;i++)
        {
            if(theScores[i]==s)
            blah=true;
            blah=false;
            
        }
        return blah;
    }

    public static void main(String[]args)
    {
        Score rigged=new Score();
        System.out.println(rigged);
        rigged.displayScores();
        System.out.println(rigged.findMin());
        System.out.println(rigged.getAverage());
        System.out.println(rigged.getScores(2));
        System.out.println(rigged.isScorein(33));
    }
}
