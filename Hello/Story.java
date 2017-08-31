 import java.util.Scanner;
/**
 * This story
 * 
 * @author Garrett Benson 
 * @version (a version number or a date)
 */
public class Story
{
    public static void story(String place,String person,String creature,String action)
    {
        System.out.println("It was in a " + place + ", and it was dark.");
        System.out.println("The " + person + " had all of its stuff.");
        System.out.println("Suddenly, a " + creature + " attacked!");
        System.out.println("The " + person + " ran and " + action);
    }

    //public static void song(String animal,String noise)
    //{
      //  System.out.println("Old McDonald had a farm");
        //System.out.println("EIEIO");
        //System.out.println("And on his farm he had a " + animal);
        //System.out.println("EIEIO");
        //System.out.println("and a " + noise + " here");
        //System.out.println("and a " + noise + " there");
       // System.out.println("everywhere a " + noise);
      //  System.out.println("Old McDonald had a farm");
      //  System.out.println("EIEIO");
       // System.out.println("");
  //  }

    public static void Main(String[]args)
    {
         Scanner scan=new Scanner(System.in);
    System.out.println("Choose a place: ");
    String place=scan.nextLine();
     System.out.println("Choose a person: ");
     String person=scan.nextLine();
      System.out.println("Choose a creature: ");
      String creature=scan.nextLine();
       System.out.println("Choose a action: ");
       String action=scan.nextLine();
       story(place,person,creature,action);
       //         story("forest","hunter","bear","and got away.");
     //   story("haunted house","little girl","monster","was eaten.");
     //   story("neighborhood","boy","his friend","laughed.");
        //   song("cow","moo moo");
      //  song("horse","neigh neigh");
       // song("chicken","bach bach");
      //  song("dog","bark bark");
      //  song("whale","whhhhhhhhhhhhaaaaaaaaaaaaaaaaaalllllllllllllllleeeeeeeeeeeee");
      //  song("wolf","woof woof");
    }
}