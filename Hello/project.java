import java.util.Random;

import java.util.Scanner;

/**

 * Write a description of class FinalProject here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class project

{

    public static void main(String[]args)

    {

        System.out.println("Do you want to play");

        Scanner scan=new Scanner(System.in);

        String answer=scan.next();

        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Well, that sucks, it is still being developed, but here's a try");
            for(int count=0;count<3; count++)
            {
                System.out.println("Please choose a character: Mage, Warrior, or Archer");
                answer=scan.next();
                if(count==2)
                {
                    System.out.println("Because you seem to be unable to pick a character,");
                    System.out.println("You are a peasant without a weapon or abilities, congrats");
                    int life=100;
                    double power = .1;
                    double power1=.1;
                    double power2=.1;
                    double power3=.1;
                    game(life, power, power1, power2, power3);
                }
                else if(answer.equalsIgnoreCase("Garrett"))
                {
                    int life = 500;
                    double power = 2.5;
                    double power1=2;
                    double power2=2;
                    double power3=2;
                    //count=count+2;
                    game(life, power, power1, power2, power3);
                    return;
                }
                
                else if(answer.equalsIgnoreCase("Griffin"))
                {
                    int life = 1000;
                    double power = 0;
                    double power1= 0;
                    double power2=0;
                    double power3=0;
                    game(life, power, power1, power2, power3);
                    return;
                }

                else if(answer.equalsIgnoreCase("Mage"))
                {
                    int life = 60;
                    double power =.4;
                    double power1=.6;
                    double power2=1.3;
                    double power3=1.6;
                    //count=count+2;
                    game(life, power, power1, power2, power3);
                    return;
                }

                else if(answer.equalsIgnoreCase("Warrior"))
                {
                    int life = 200;
                    double power = 1.3;
                    double power1=1;
                    double power2=1;
                    double power3=.6;
                    //count=count+2;
                    game(life, power, power1, power2, power3);
                    return;
                }

                else if(answer.equalsIgnoreCase("Archer"))
                {
                    int life=80;
                    double power=.7;
                    double power1=1.6;
                    double power2=.8;
                    double power3=.7;
                    //count=count+2;
                    game(life, power, power1, power2, power3);
                    return;
                }
                else
                {
                    System.out.println("Not a valid Character, please try again.");
                    count=count+1;
                }

            }
        }

        else

            System.out.println("I hate you too");

    }

    public static void dragon()
    {
        System.out.println("           (  )   /\\   _                 (     ");
        System.out.println("    \\ |  (  \\ ( \\.(               )                      _____");
        System.out.println("  \\  \\ \\  `  `   ) \\             (  ___                 / _   \\");
        System.out.println(" (_`    \\+   . x  ( .\\            \\/   \\____-----------/ (o)   \\_");
        System.out.println("- .-               \\+  ;          (  O                           \\____");
        System.out.println("                          )        \\_____________  `              \\  /");
        System.out.println("(__                +- .( -'.- <. - _  VVVVVVV VV V\\                 \\/");
        System.out.println("(_____            ._._: <_ - <- _  (--  _AAAAAAA__A_/                  |");
        System.out.println("  .    /./.+-  . .- /  +--  - .     \\______________//_              \\_______");
        System.out.println("  (__ ' /x  / x _/ (                                  \\___'          \\     /");
        System.out.println(" , x / ( '  . / .  /                                      |           \\   /");
        System.out.println("    /  /  _/ /    +                                      /              \\/");
        System.out.println("   '  (__/                                             /                  \\");
    }

    public static void game(int life, double power, double power1, double power2, double power3)

    {

        System.out.println("You are being attacked by a dragon!");
        int draglife=10000;
        String answer="";
        String answers="";
        Scanner scan=new Scanner(System.in);
        Random generator=new Random();
        Random gen=new Random();
        Random gener=new Random();
        Random generat=new Random();
        Random generato=new Random();
        int duck=0;
        String magical="";
        int shield=0;
        int griffin=0;
        int sleep=0;
        double sword;
        double bow;
        double block;
        double magic;
        int numm;
        do
        {
            System.out.println("Choose your attack: sword, bow, shield or magic");
            sword=gen.nextInt(100)*power;
            bow=gener.nextInt(100)*power1;
            block=generat.nextInt(100)*power2;
            magic=generato.nextInt(100)*power3;
            numm=generator.nextInt(100)+1;
            answer=scan.nextLine();
            switch (answer.toLowerCase())
            {
                case "quit":
                System.out.println("Goodbye!");
                return;
                case "sword":
                {
                    if(sword>=99)

                    {

                        draglife=draglife-5000;

                        System.out.println("Critical hit!");

                    }

                    else if(sword<=0)

                    {

                        System.out.println("Your sword did nothing to it strong hide scales.nooooooob");

                    }

                    else if(sword<99&&sword>50)

                    {

                        draglife=draglife-500;

                        System.out.println("You made it bleed");

                    }

                    else

                    {

                        draglife=draglife-100;

                        System.out.println("It has little affect");

                    }
                    break;
                }

                case "bow":

                Scanner scany=new Scanner(System.in);
                System.out.println("Where do you shoot?  The Head, the tail, or the chip in its hide?");
                System.out.println("If you want to shoot at the chip, type chip");
                answers=scany.nextLine();
                if(answers.equalsIgnoreCase("head"))
                {
                    if(bow<=50)
                        System.out.println("The arrow broke, and had no effect");
                    else if(bow<99)
                    {
                        System.out.println("Your arrow hit it in a soft spot!");
                        draglife=draglife-1000;
                    }
                    else
                    {
                        System.out.println("Your hit the Dragon in the eye!");
                        draglife=draglife-8000;
                    }
                }
                if(answers.equalsIgnoreCase("tail"))
                {
                    if(bow>=50)
                    {
                        System.out.println("You scratched the tail... barely doing anything");
                        draglife=draglife-100;
                    }
                    else
                        System.out.println("You missed, why would you aim for the tail anyway?");
                }
                if(answers.equalsIgnoreCase("chip"))
                {
                    if(bow>94)
                    {
                        System.out.println("You killed it!  That chip was conveniently right above its heart!");
                        draglife=draglife-draglife;
                    }
                    else
                    {
                        System.out.println("The arrow broke on the scaly hide, only leaving a trace of damage.");
                        draglife=draglife-200;
                    }
                }
                break;

                case "shield":
                if(block<50)
                {
                    System.out.println("Your block failed!");
                }   
                else
                {
                    shield=shield+1;
                    System.out.println("Block Success!");
                }

                break;
                case "magic":
                System.out.println("What type of magic: Fire, lightning, or mystery");
                Scanner scann=new Scanner(System.in);
                magical=scann.nextLine();
                if(magical.equalsIgnoreCase("Lightning"))
                {
                    if(magic<=40)
                    {
                        System.out.println("You shot a lightning bolt");
                        draglife=draglife-200;
                    }
                    else if(magic<95)
                    {
                        System.out.println("You shocked the dragon with electricity!");
                        System.out.println("And felt like the emperor from star wars");
                        draglife=draglife-500;
                    }
                    else
                    {
                        System.out.println("You surround the dragon in a storm cloud and watch lights flash");
                        draglife=draglife-2000;
                    }
                }
                if(magical.equalsIgnoreCase("fire"))
                {
                    if(magic<50)
                    {
                        System.out.println("You threw a fireball, it probably did more damage from impact then it did from the fire.");
                        draglife=draglife-100;
                    }
                    else if(magic<=99)
                    {
                        System.out.println("You rained fire on its back.");
                        draglife=draglife-300;
                    }
                    else
                    {
                        System.out.println("Lucky shot down the throat!  The dragon screams with pain!");
                        draglife=draglife-7000;
                    }
                }
                if(magical.equalsIgnoreCase("mystery"))
                {
                    if(magic<33)
                    {
                        System.out.println("You are lost and confused");
                    }
                    else if(magic<66)
                    {
                        System.out.println("A duck appears in front of you");
                        duck=duck+1;
                    }
                    else if(magic<100)
                    {
                        System.out.println("A boulder comes crashing down on the dragon, leaving it dazed.");
                        sleep=sleep+1;
                        draglife=draglife-500;
                    }
                    else
                    {   
                        System.out.println("You wounds heal and you feel stronger");
                        life=life+150;
                    }
                }
                break;
                case "duck":
                if(duck>0)
                {
                    draglife=draglife-draglife;
                }
                else if(griffin==1)
                {
                    griffin=griffin+1;
                    System.out.println("Stop");
                }
                else if(griffin==2)
                {
                    System.out.println("Nothing is going to change");
                    griffin=griffin+1;
                }
                else if(griffin==3)
                {
                    System.out.println("Griffin, I know thats you");
                    griffin=griffin+1;
                }
                else if(griffin==4)
                {
                    System.out.println("Your are persistent, but so is the dragon");
                    life=life-life;
                    System.out.println("The Dragon ate you");
                    System.out.println("Game Over");
                    return;
                }
                else
                {
                    System.out.println("Your an idiot");
                    griffin=griffin+1;
                }
                break;

                default:
                System.out.println("You're an idiot");
            }
            if((shield==0)&&(sleep==0)&&(draglife>0))
            {

                if(numm<=20)

                {

                    life=life-5;

                    System.out.println("The Dragon swiped at you and cut your leg!");

                } 

                else if(numm>=96)

                {

                    life=life-100;
                    if (life <= 0)
                        System.out.println("You just got eateded");
                    else
                        System.out.println("He ate your arm!");

                }

                else if(numm>75)

                {

                    life=life-99;

                    System.out.println("The Dragon Burned you and now you are barely more than a simmering husk");
                    dragon();
                }
                else
                {
                    life=life-20;
                    System.out.println("The Dragon spit a fireball at you");
                    dragon();
                }
            }
            shield=shield-shield;
            sleep=sleep-sleep;
            System.out.println("Your health is " + life);
            System.out.println("Dragons health is " + draglife);
        }while((life>0)&&(draglife>0)&&(!answer.equalsIgnoreCase("quit")));
        if(life<=0)
            System.out.println("You are Dead, and you suck at killing dragons.");
        if(draglife<=0)
            win();
    }

    public static void win()
    {
        System.out.println("You just completed the impossible, you are a very lucky lad.");
        System.out.println("Goodbye");
    }

}