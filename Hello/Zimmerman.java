import java.util.Scanner;
/**
 * Write a description of class Zimmerman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zimmerman
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        String answer="";
        do{
            Zellers();
            System.out.println("Do you want to continue");
            answer=scan.nextLine();
        }while(answer.equalsIgnoreCase("YES"));
    }

    public static void Zellers()
    {
        Scanner scan=new Scanner(System.in);
        byte date=0;
        byte q=0;
        byte m=0;
        short answer2=0;
        System.out.println("Welcome user, I can tell you what day of the week it is,\nif you supply me a few truthful answers.");
        boolean done = false;
        do{
            try{
                System.out.println("First, what is the day of the month, like 31 or 17");
                q=scan.nextByte();
                done=true;
            }catch(java.util.InputMismatchException e)   {
                System.out.println("Not an valid number");
                scan.nextLine();
            }
        }while(!done);
        done=false;
        do{
            try{
                System.out.println("Next, what is the month?  Use numbers, January is 1, Febuary is 2, and so on...");
                m=scan.nextByte();
                done=true;
            }catch(java.util.InputMismatchException e) {
                System.out.println("Not an valid number");
                scan.nextLine();
            }
        }while(!done);
        done=false;
        do{
            try{

                System.out.println("What year are you in?");
                answer2=scan.nextShort();
                done=true;
            }catch(java.util.InputMismatchException e)    {
                System.out.println("Not an valid number");
                scan.nextLine();
            }
        }while(!done);
        getDay(q, m,answer2);

    }

    public static byte getDate(byte q, byte m, short answer2)
    {
        if((m==1)||(m==2))
        {
            m+=12;
            answer2--;
        }

        byte k=(byte)(answer2%100);
        byte j=(byte)(answer2/100);
        int date=(q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7;
        return (byte)date;
    }

    public static byte getDay(byte q, byte m, short answer2)
    {
        byte date=0;
        date=getDate(q, m, answer2);
        switch(date)
        {
            case 0:
            System.out.println("It is Saturday");
            break;
            case 1:
            System.out.println("It is Sunday");
            break;
            case 2:
            System.out.println("It is Monday");
            break;
            case 3:
            System.out.println("It is Tuesday");
            break;
            case 4:
            System.out.println("It is Wednesday");
            break;
            case 5:
            System.out.println("It is Thursday");
            break;
            case 6:
            System.out.println("It is Friday");
            break;
        }
        return date;

    }
}
