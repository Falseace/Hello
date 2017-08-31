import java.util.Random;

import java.util.Scanner;
/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("You may pick Rock, Paper, or Scissors");
        System.out.println("Rock crushes scissors, scissors cut paper, and paper surrounds rock");
        System.out.println("Are you ready to play?");
        String answer=scan.next();
        if(answer.equalsIgnoreCase("yes"))
            game();
        else
            System.out.println("Come back when you're ready!");
            
        }
    public static void game()
        {
            
            int num=0;
            int numm=0;
            int usernum=0;
            int comnum=0;
            Scanner scan=new Scanner(System.in);
            
         do{
            Random gen=new Random();
            System.out.println("Rock paper or scissors?");
            String user=scan.next();
            comnum=gen.nextInt(3)+1;
            if(user.equalsIgnoreCase("Scissors"))
                usernum=1;
            else if(user.equalsIgnoreCase("Paper"))
                usernum=2;
            else
                usernum=3;
            if((usernum==1)&&(comnum==2))
            {
                 System.out.println("Computer choose paper");
                   System.out.println("Scissors beat Paper!");
                   num=num+1;
                }
                else if((usernum==2)&&(comnum==3))
                {
                     System.out.println("Computer choose Rock");
                    System.out.println("Paper beats Rock!");
                    num=num+1;
                }
                else if((usernum==3)&&(comnum==1))
                {
                     System.out.println("Computer chooses Scissors");
                    System.out.println("Rock beats Scissors!");
                    num=num+1;
                }
                else if((usernum==3)&&(comnum==2))
                {
                     System.out.println("Computer chooses Paper");
                    System.out.println("Rock loses to paper");
                    numm=numm+1;
                }
                else if((usernum==2)&&(comnum==1))
                {
                     System.out.println("Computer chooses Scissors");
                    System.out.println("Paper loses to Scissors");
                    numm+=1;
                }
                else
                {
                     System.out.println("Computer chooses Rock");
                    System.out.println("Scissors loses to Rock");
                    numm+=1;
                }
                
                   
        } while((num<2)&&(numm<2));
        if(num==2)
        {
             System.out.println("You Won!");
             set();
            }
        if(numm==2)
        {
             System.out.println("You Lose");
             set();
            }
        }
        public static void set()
        {
            System.out.println("Do you want to play again?");
            Scanner scan=new Scanner(System.in);
            String answer=scan.next();
            if(answer.equalsIgnoreCase("Yes"))
                game();
            else
                System.out.println("Goodbye");
        }
}
