
/**
 * Write a description of class Methods here.
 * 
 * @author Garrett Benson 
 * @version (a version number or a date)
 */
public class Methods
{
    public static void aboutMe()
    {
        System.out.println("My name is Garrett Benson");
        System.out.println("I like to play video games");
        System.out.println("I am on the Cross Country team");
        System.out.println("My favorite color is green");
        System.out.println("I play soccer often");
    }


    public static void asciiArt()
    {
        System.out.println("         __      __");
        System.out.println("         / \\ ___/ \\");
        System.out.println("   ,----(     ..   )");
        System.out.println("  /     \\__     __/");
        System.out.println(" /|         (\\  |(");
        System.out.println("^  \\   / \\  /\\ |");
        System.out.println("   |___|  |__|-/\"");
    }

    public static void farm() 
    {
        String animal="cow";
        String noise="moo moo";

        System.out.println("Old McDonald had a farm");
        System.out.println("EIEIO");
        System.out.println("And on his farm he had a " + animal);
        System.out.println("EIEIO");
        System.out.println("and a " + noise + " here");
        System.out.println("and a " + noise + " there");
        System.out.println("everywhere a " + noise);
        System.out.println("Old McDonald had a farm");
        System.out.println("EIEIO");

    }

    public static void main(String []args)
    {
        aboutMe();
        asciiArt();
        farm();
    }
}
