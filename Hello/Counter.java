
/**
 * Write a description of class Counter here.
 * 
 * @author (Garrett) 
 * @version (2/21/2017)
 */
public class Counter
{
    private int count;
    private static int numOfCounters=0;
    public final int ID_NUM =numOfCounters;
    public Counter()
    {
        count=0;
        numOfCounters++;
    }
    
    public static int getNumOfCounters()
    {
        return numOfCounters;
    }

    public void increment()
    {
        count++;
    }

    public void decrement()
    {
        count--;
    }

    public void reset()
    {
        count=0;
    }

    public int getCount()
    {
        return count;
    }
    
    public String toString()
    {
        String output="There are " + numOfCounters+" counters created.";
        output +="The counter number is: "+ ID_NUM + ". count is " + count;
        return output;
    }

    public static void main(String[]args)
    {
        System.out.println(numOfCounters);
        Counter one = new Counter();
        Counter one2 = new Counter();
        Counter one3 = new Counter();
        Counter one4 = new Counter();
        System.out.println(Counter.numOfCounters);
        Counter.numOfCounters += 10;
        System.out.println(Counter.numOfCounters);
        Counter.numOfCounters=22;
        System.out.println(Counter.numOfCounters);
    }
}