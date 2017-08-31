import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Anagram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anagram
{
    private String[] word={"blake","jake","sean","what","woodchippers","supercalifragilisticexpialadocious","no","on"};
    private char[] scrambled;
    private String answer;
    private String response;
    public Anagram()
    {
        selectNewWord();
        scrambleWord();
        displayAnagram();
    }

    public void scrambleWord()
    {
        Random gen=new Random();
        for(int i=0;i<scrambled.length;i++)
        {
            int num=gen.nextInt(scrambled.length);
            char temp=scrambled[i];
            scrambled[i]=scrambled[num];
            scrambled[num]=temp;
        }
    }

    public void displayAnagram()
    {
        for(int i=0;i<scrambled.length;i++)
        {
            System.out.print(scrambled[i]);
        }
        System.out.println("\n");
    }

    public void userInput()
    {
        Scanner scan=new Scanner(System.in);
        response=scan.next();
    }

    public void selectNewWord()
    {
        Random gen=new Random();
        int num=gen.nextInt(word.length);
        answer=word[num];
        scrambled=answer.toCharArray();
    }

    public static void again()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Congrats you won!");
        System.out.println("Do you want to play again?");
        String anwer=scan.nextLine();
        if(anwer.equals("yes"))
            thane();
        else
            return;
    }

    public static void thane()
    {

        Anagram thing=new Anagram();
        do{
            thing.userInput();
            if(!thing.response.equals(thing.answer))
            {
                System.out.println("Sorry, but that is not correct");
            }
        }while(!thing.response.equals(thing.answer));
      //  again();
    }
    
    public static void main(String[]args)
    {
        thane();
    }

}
