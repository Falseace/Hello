import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Filepractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Filepractice
{
    public static void writeToFile()
    {
        try{
            Scanner scan=new Scanner(System.in);
            BufferedWriter writer=new BufferedWriter(new FileWriter("summerToDoList.txt",true));
            String input=null;
            do{
                System.out.println("Enter an item to add to the list(Type quit to exit)");
                input=scan.nextLine();
                if(!input.equals("quit"))
                    writer.write(input+"\r\n");
                ///writer.write("go to the library\r\n");
                //// writer.write("go visit family\r\n");
                //// writer.write("learn python\r\n");
                ////  writer.write("write javascript programss\r\n");
            }while(!input.equals("quit"));
            writer.close();
        }catch(IOException ex)
        {
            System.out.println("There was a problem writing to the file");
            ex.printStackTrace();
        }
    }

    public static void readFromFile()
    {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("summerToDoList.txt"));
            String line=null;
            do{
                line=reader.readLine();
                if(line != null)
                    System.out.println(line);
            }while(line!=null);
            reader.close();
        }catch(IOException ex){
            System.out.println("There was a problem reading this file");
            ex.printStackTrace();
        }
    }

    public static void printArray(ArrayList theList)
    {
        for(int i=0; i< theList.size(); i++)
            System.out.println(theList.get(i));
    }

    public static void main(String[]args)
    {
        writeToFile();
        ArrayList<String>theList=new ArrayList<String>();
        printArray(theList);
        fileToArray(theList);
        readFromFile();
    }

    public static void fileToArray(ArrayList theList)
    {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("summerToDoList.txt"));
            String line=null;
            do{
                line=reader.readLine();
                theList.add(line);
            }while(line != null);
            reader.close();
        }catch(IOException ex){
            System.out.println("There was a problem reading fromt eh file");
            ex.printStackTrace();
        }
    }

    public static void arrayToFile(ArrayList<String> theList)
    {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("summerToDoList.txt",true));
            for(int i=0; i<theList.size();i++)
            {
                writer.write(theList.get(i) + "\r\n");
            }
            writer.close();
        }catch(IOException ex){
            System.out.println("There was a problem writing to teh file");
            ex.printStackTrace();
        }
    }
}
