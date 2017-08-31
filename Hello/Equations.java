import java.util.Random;
/**
 * This class contains many different methods that calculate different equations
 * 
 * @author Garrett Benson
 * @version September 16, 2015
 */
public class Equations
{
    //-------------------------------------- advanced equation ---------------------------------------------
    public static void advancedproblem(double apples,double bananas,double coconuts,double strawberries)
    {
        double advancedproblem=apples+bananas*coconuts/strawberries;
        System.out.println("apples + bananas * coconuts / strawberries = " + advancedproblem);
    }

    public static void videogames(double game,double fun,double time,double awesomeness)
    {
        double videogames=game*fun/time*awesomeness;
        System.out.println("On an scale of one to ten, video games are " + videogames);
    }
    //--------------------------------------- story problems -----------------------------------------------
    public static void flooring(double length, double width)
    {
        double area=length * width;
        System.out.println("The area is: " + area);
    }

    public static void mpg(double miles,double gallons)
    {
        double mpg=miles/gallons;
        System.out.println("The mpg is: " + mpg);
    }

    public static void paycheck(double hours,double pay)
    {
        double paycheck=hours*pay;
        System.out.println("The paycheck is: " + paycheck);
    }

    public static double calcTip(double check,double percent)
    {
        double tip=check*percent;
        return tip;
    }
    //---------------------------------------remainder-----------------------------------------------------
    public static int remainder(int k, int l)
    {
        return k%l;
    }
    //---------------------------------------basic equations-----------------------------------------------
    public static void adding(int x, int y)
    {
        System.out.println(x + " + " + y + " = " + (x+y));
    }

    public static void subtrating(int x, int y)
    {
        System.out.println(x + " - " + y + " = " + (x-y));
    }

    public static void dividing(int x,int y)
    {
        System.out.println(x + " / " + y + " = " + (x/y));
    }

    public static void multiply(int x,int y)
    {
        System.out.println(x + " * " + y + " = " + (x*y));
    }

    public static double getProfit(int count, double itemPrice, double cost)
    {
        double total=count*itemPrice-cost*count;
        return total;
    }

    public static double getSalesPrice(double thePrice,double salesPercent)
    {
        double discount=thePrice*salesPercent;
        double newPrice=thePrice-discount;
        return newPrice;
    }

    public static void main(String[]args)
    {
        Random gen=new Random();
        int a=gen.nextInt(10)+1;
        int b=gen.nextInt(10)+1;
        int c=gen.nextInt(10)+1;
        int d=gen.nextInt(10)+1;
        int e=gen.nextInt(10)+1;
        int f=gen.nextInt(10)+1;
        int g=gen.nextInt(10)+1;
        int h=gen.nextInt(10)+1;
        int i=gen.nextInt(10)+30;
        int j=gen.nextInt(10)+7;
        adding(a,b);
        subtrating(c,d);
        dividing(e,f);
        multiply(g,h);
        paycheck(i,j);
        paycheck(e,d);
        paycheck(c,f);
        mpg(a,b);
        mpg(h,g);
        mpg(i,a);
        flooring(a,b);
        flooring(g,h);
        flooring(d,j);
        advancedproblem(a,b,c,d);
        videogames(a,b,c,d);
        double payment=calcTip(100,.2);
        System.out.println("Your tip is " + payment);
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
        int remainder1=remainder(20,30);
        System.out.println("Remainder is " + remainder1);
    }

}
