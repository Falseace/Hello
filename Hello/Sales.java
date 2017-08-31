
/**
 * This was homework
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sales
{
    public static double getProfit(int count, double itemPrice, double cost)
    {
        double total=count*itemPrice-cost*count;
        return total;
    }

    public static void Main(String[]args)
    {
        double variable=getProfit(30,20,10);
        double variable2=getProfit(50,47.25,7.1);
        double variable3=getProfit(20,37,36.5);
        double discountPrice=getSalesPrice(20.5,.20);
        double discountPrice2=getSalesPrice(700,.40);
        double discountPrice3=getSalesPrice(2000,.19);
         System.out.println("The over all income is " + variable);
        System.out.println("The over all income is " + variable2);
        System.out.println("The over all income is " + variable3);
        System.out.println("The discount price is " + discountPrice);
        System.out.println("The discount price is " + discountPrice2);
        System.out.println("The discount price is " + discountPrice3);
    }
    public static double getSalesPrice(double thePrice,double salesPercent)
    {
        double discount=thePrice*salesPercent;
        double newPrice=thePrice-discount;
        return newPrice;
    }
}

