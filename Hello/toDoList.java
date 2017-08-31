import java.util.ArrayList;
/**
 * Write a description of class Dolist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toDoList
{
    public static void main(String[]args)
    {
        ArrayList<String> myList=new ArrayList<String>();
        myList.add("Brush teeth");
        myList.add("shop");
        myList.add("Murder Blake");
        myList.add("party");
        System.out.println(myList);
        System.out.println();
        myList.add(0,"exercise");
        myList.add(1,"sleep");
        
        if(!myList.isEmpty())
        {
            System.out.println(myList.remove(2));
            myList.remove("shop");
        }
        System.out.println(myList);
        
        //size, indexOf, contains, get item in position 1
        
        System.out.println(myList.size());
        System.out.println(myList.indexOf("party"));
        System.out.println(myList.contains("Murder Blake"));
        System.out.println(myList.get(1));
    }
}
