import java.util.Random;
/**
 * Write a description of class ArrayPractice here.
 * 
 * @author (Garrett Benson) 
 * @version (March 23)
 */
public class ArrayPractice
{
    public static void highSchool()
    {
        char[] school=new char[11];
        school[0]='M';
        school[1]='u';
        school[2]='r';
        school[3]='r';
        school[4]='a';
        school[5]='y';
        school[6]=' ';
        school[7]='H';
        school[8]='i';
        school[9]='g';
        school[10]='h';
        System.out.println(school);
    }

    public static void studentNumber()
    {
        Random gen=new Random();
        int[]num=new int[5];

        int round=0;
        do{
            round++;
            System.out.println("Round "+round); 
            for(int i =0; i<num.length; i++)
            {
                num[i]=gen.nextInt(10);
            }
            for(int i = 0; i<num.length; i++)
            {
                System.out.print(num[i]);

            }
            System.out.println("\n");
        }while((num[0]!=2)||(num[1]!=3)||(num[2]!=2)||(num[3]!=2)||(num[4]!=4));
    }

    public static void studentScores()
    {
        Random gen=new Random();
        double[] score=new double[10];
        for(int i =0; i<score.length; i++)
        {
            score[i]=((int)(gen.nextDouble()*10000.00))/100.00;
        }
        for(int i=0; i<score.length; i++)
        {
            System.out.print(score[i]);
            System.out.println("\n");
        }
        double min=score[0];
        for(int i=0; i<score.length; i++)
        {
            if(score[i]<min)
                min=score[i];
        }
        double max=score[0];
        for(int i=0; i<score.length; i++)
        {

            if(score[i]>max)
                max=score[i];
        }
        double sum=0;
        for(int i=0; i<score.length; i++)
        {
            sum+=score[i];
        }
        double avg=0;
        avg=sum/10;
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(avg);
    }


    public static void main(String[]args)
    {
        highSchool();
        studentNumber();
        studentScores();
    }
}
