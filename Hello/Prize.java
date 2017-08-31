import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Prize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prize
{
    public static void Prizes()
    {

        String prize="";
        System.out.println("This is the Prize game!");
        System.out.println("You have a chance to win some great prizes if you play, type GO to move on");
        Scanner scan=new Scanner(System.in);

        int counter=0;
        while(counter<11)
        {
            String answer=scan.nextLine();
            if(answer.equalsIgnoreCase("GO"))
            {
                Random gen=new Random();
                int x=gen.nextInt(100)+1;
                if(x<=1)
                {
                    System.out.println("You Just WON!  You get a car, a Xbox 1, a PS4, a Desktop, and 10,000 to spend on gas and games!");
                    prize=prize+"car "+"Xbox 1 "+"PS4 "+"Desktop "+"10,000$";
                }
                else if(x>60)
                {
                    System.out.println("You won a stale piece of licorice!");
                    prize=prize+" Stale licorice";
                }
                else if(x<8&&x>1)
                {
                    System.out.println("You won a penny congrats!");
                    prize=prize+" penny";
                }
                else if(x<16&&x>7)
                {
                    System.out.println("You won the Container that the licorice belongs in!");
                    prize=prize+" container";
                }
                else if(x<24&&x>15)
                {
                    System.out.println("You just won the Crate that the containers of licorice belong in!");
                    prize=prize+" Crate";
                }
                else if(x<32&&x>23)
                {
                    System.out.println("You just won something that is green and suspicious looking");
                    prize=prize+" green suspicious stuff";
                }
                else if(x<40&&x>31)
                {
                    System.out.println("You just won an ancient pair of car keys!");
                    prize=prize+" old car keyes";
                }
                else if(x<48&&x>39)
                {
                    System.out.println("You just won cord to something, that is somewhere, but is unknown!");
                    prize=prize+" cord";
                }
                else if(x<55&&x>47)
                {
                    System.out.println("You just won a glove! Its for your left hand!");
                    prize=prize+" glove for left hand";
                }
                else if(x<61&&x>54)
                {
                    System.out.println("You just won bullet! Good luck getting a gun for it");
                    prize=prize+" bullet";
                }
            }
            counter=counter+1;
        }
        System.out.println("You have won "+prize);
    }  

    public static void gameThing()    
    {
        int score=20;
        while(score<50&&score>0)
        {
            Random gen=new Random();
            int dice1=gen.nextInt(6)+1;
            int dice2=gen.nextInt(6)+1;
            int roll=dice1+dice2;
            System.out.println("The first die rolled: " + dice1);
            System.out.println("The second die rolled: " + dice2);
            if(roll==5)
            {
                score=score+10;
                System.out.println("Score + 10");
            }
            else if(roll<=7)
            {
                score=score+3;
                System.out.println("Score + 3");
            }
            else if(roll==10)
            {
                System.out.println("This is the Death Blow, - 30");
                score=score-30;
            }
            else
            {
                System.out.println("Score - 2");
                score=score-2;
            }
        }
        System.out.println("Your Score is " + score);
        if(score<=0)
            System.out.println("You Lose");
        if(score>=50)
            System.out.println("You Win");
    }

    public static void numberGuess()
    {
        Random gen=new Random();
        Scanner scan=new Scanner(System.in);
        int guess=0;
        int num=gen.nextInt(100)+1;
        System.out.println("Guess a number between 1 and 100");
        do{
            guess=scan.nextInt();
            if(guess<num)
                System.out.println("Your guess is too low!");
            if(guess>num)
                System.out.println("Your guess is too High!");
        }while(guess != num);
        System.out.println("You Won!");
    }

    public static void magic8ball()
    {
        Random gen=new Random();
        Scanner scan=new Scanner(System.in);
        String question="";
        System.out.println("Welcome to the Magic Eight ball");
        System.out.println("Ask it any yes or no questions");
        while(!question.equalsIgnoreCase("quit"))
        {
            int x=gen.nextInt(10)+1;
            question=scan.nextLine();
            switch(x)
            {
                case 1:
                System.out.println("Yes");
                break;

                case 2:
                System.out.println("No");
                break;

                case 3:
                System.out.println("Maybe");
                break;

                case 4:
                System.out.println("If you Believe in Yourself");
                break;

                case 5:
                System.out.println("It's possible");
                break;

                case 6:
                System.out.println("...");
                break;

                case 7:
                System.out.println("Not probable");
                break;

                case 8:
                System.out.println("No, No, and No, with another nope");
                break;

                case 9:
                System.out.println("Yes!  Yes! Yes!");
                break;

                default:
                System.out.println("I don't have faith in it");
                break;

            }
        }
    }

    public static void password()
    {
        Scanner scan=new Scanner(System.in);
        String guess="";
        int num=0;
        System.out.println("Enter the Password");
        do{
            num=num+1;
            if(num==4)
                System.out.println("First hint, the password is a Person is from one of the Far Cry's");
            if(num==7)
                System.out.println("The password is the name of Far Cry 4's playable Character");
            if(num==9)
                System.out.println("The name sounds like two letters");
            guess=scan.next();
        }while(!guess.equalsIgnoreCase("AJAY")&&(num<10));
        if(num==10)
        {
            System.out.println("You Lose");
            System.out.println("Ajay is the password");
        }
        if(num!=10)
            System.out.println("Your Win");
    }

    public static void Main(String[]args)
    {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pick Your Game, Prizes, or Dice");
        System.out.println("Type password for guess the password, or number for Number Guess");
        System.out.println("Type Eight for the magic Eightball");
        System.out.println("If you do not want to play, type quit");
        String Chose=scan.nextLine();
        if(Chose.equalsIgnoreCase("password"))
            password();
        if(Chose.equalsIgnoreCase("number"))
            numberGuess();
        if(Chose.equalsIgnoreCase("Prizes"))
            Prizes();
        if(Chose.equalsIgnoreCase("Dice"))
            gameThing();
        if(Chose.equalsIgnoreCase("Eight"))
            magic8ball();
        if(Chose.equalsIgnoreCase("quit"))
        {
            System.out.println("Goodbye");
        }

    }
}

        