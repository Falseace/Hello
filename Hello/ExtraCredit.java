import java.util.Scanner;
/**
 * This is for Extra Credit
 * 
 * Garrett Benson
 * @very September 30, 2015
 */
public class ExtraCredit
{
    public static void FortuneTeller(String age,String name,String haircolor)
    {
        System.out.println("Your age is " + age);
        System.out.println("Your name is " + name);
        System.out.println("And for the finally, your hair color is " + haircolor);
    }
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String age=scan.nextLine();
        System.out.println("Please enter your name: " );
        String name=scan.nextLine();
        System.out.println("Please enter your hair color: ");
        String haircolor=scan.nextLine();
        System.out.println("I am about to do magic");
        String magic=scan.nextLine();
        System.out.println("I will guess your age, name, and hair color");
        String guess=scan.nextLine();
        FortuneTeller(age,name,haircolor);
    }
}