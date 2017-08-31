import java.util.Scanner;
/**
 * Write a description of class Practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExceptionPractice
{
    public static void catchingUserErrors()
    {
        Scanner input=new Scanner(System.in);
        boolean done = false;
        int x=0;
        do{
            try{
                System.out.print("Enter an integer:  ");
                x = input.nextInt();
                done=true;
                System.out.println("Awesome! Your number is: " + x);
            }catch(java.util.InputMismatchException e)   {
                System.out.println("Not an integer.");
                input.nextLine();
            }
        }while(!done);
    }
}
