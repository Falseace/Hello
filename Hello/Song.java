import java.util.Scanner;
/**
 * Write a description of class McDonald here.
 * Its a song
 * @author Garrett 
 * @version (a version number or a date)
 */
public class Song
{
public static void song(String animal,String noise)
{
        System.out.println("Old McDonald had a farm");
        System.out.println("EIEIO");
        System.out.println("And on his farm he had a " + animal);
        System.out.println("EIEIO");
        System.out.println("and a " + noise + " here");
        System.out.println("and a " + noise + " there");
        System.out.println("everywhere a " + noise);
        System.out.println("Old McDonald had a farm");
        System.out.println("EIEIO");
        System.out.println("");
}
public static void main(String[]args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Choose an animal: ");
    String animal=scan.nextLine();
    
    
    
    
    
    System.out.println("Choose an animal sound: ");
    String noise=scan.nextLine();
    song(animal,noise);
    
//     song("cow","moo moo");
//     song("horse","neigh neigh");
//     song("chicken","bach bach");
//     song("dog","bark bark");
//     song("whale","whhhhhhhhhhhhaaaaaaaaaaaaaaaaaalllllllllllllllleeeeeeeeeeeee");
//     song("wolf","woof woof");
}

   
}


    