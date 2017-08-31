import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class BananaHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BananaHandler
{
    private int health;
    private int weapon;
    private String wname;
    private String name;
    private int damage;
    private int accuracy;
    private boolean isDead;
    private static final int MAX_BANANAS=5;
    public static int round=0;
    //the constructor
    public BananaHandler()
    {
        health=100;
        weapon=4;
        pickWeapon();
        name="John";
    }

    public BananaHandler(String n)
    {
        health= 100;
        weapon=4;
        pickWeapon();
        name=n;
    }

    public BananaHandler(String n, int w)
    {
        health=100;
        weapon=w;
        pickWeapon();
        name=n;
    }
    //make it possible for BH to change it weapon, damage, accuracy
    public void chooseWeapon()
    {
        Random gen = new Random();
        weapon = gen.nextInt(100)+1;
        if(gen.nextInt(10)==9)
        {
            weapon = gen.nextInt(100)+1;
            if(weapon<20)
            {
                wname="BananaGun";
                damage=20;
                accuracy=20;
            }
            else if(weapon<40)
            {
                wname="BananaRang";
                damage=15;
                accuracy=70;
            }
            else if(weapon<60)
            {
                wname="BananaSplit";
                damage=50;
                accuracy=40;
            }
            else if(weapon<80)
            {
                wname="Banana";
                damage=10;
                accuracy=90;
            }
            else if(weapon<100)
            {
                wname="BananaSlice";
                damage=30;
                accuracy=90;
            }
            else if(weapon==100)
            {
                wname="BananaPhone";
                damage=10000;
                accuracy=100;
            }
        }
    }

    public void pickWeapon()
    {
        if(weapon<20)
        {
            wname="BananaGun";
            damage=20;
            accuracy=20;
        }
        else if(weapon<40)
        {
            wname="BananaRang";
            damage=15;
            accuracy=70;
        }
        else if(weapon<60)
        {
            wname="BananaSplit";
            damage=50;
            accuracy=40;
        }
        else if(weapon<80)
        {
            wname="Banana";
            damage=10;
            accuracy=90;
        }
        else if(weapon<100)
        {
            wname="BananaSlice";
            damage=30;
            accuracy=90;
        }
        else if(weapon==100)
        {
            wname="BananaPhone";
            damage=10000;
            accuracy=100;
        }
    }
    //makes it possible for BH to gain health
    public void bananaTree(int b)
    {
        health+=(b*10);

    }
    //allows the BH to lose health
    public void loseHealth(int d)
    {
        health-=d;
        System.out.println(name+" took "+d+" damage");
        if(health<=0)
        {

            isDead=true;
        }
    }
    
    public void changeWeapon(int x)
    {
        weapon=x;
        pickWeapon();
    }
    //allows the BH to attack
    public int attack()
    {
        int d;
        Random gen=new Random();
        if(gen.nextInt(100)+1<=accuracy)
        {
            d=damage;
        }else
        {
            System.out.println(name +" missed!");
            d=0;
        }
        chooseWeapon();
        return d;
    }
    //decides if BananaHandler is dead
    public boolean getDead()
    {
        return isDead;
    }
    //puts words on the screen
    public String toString()
    {
        String output= name + " has " +health+ " health and has the " + wname;
        return output;
    }
    //main method
    public static void main(String[]args)
    {
        Random gen=new Random();
        BananaHandler jake=new BananaHandler("Jake");
        BananaHandler sean=new BananaHandler("Sean");
        round=0;
        do{
            BananaHandler.round++;
            System.out.println("Round "+round);
            System.out.println(sean);
            System.out.println(jake);
            sean.bananaTree(gen.nextInt(MAX_BANANAS));
            sean.loseHealth(jake.attack());
            jake.bananaTree(gen.nextInt(MAX_BANANAS));
            jake.loseHealth(sean.attack());
            Scanner scan=new Scanner(System.in);
            String blah=scan.next();

            System.out.println("\n");
        }while(!jake.getDead()&&!sean.getDead());
        if(!jake.getDead())
            System.out.println("Sean is Dead\nJake won");
        else 
            System.out.println("Jake is Dead\nSean won");

    }
}