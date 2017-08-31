import java.util.Random;
/**
 * Write a description of class Phone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phone
{
    public static void phoneNumber()
    {
        Random gen=new Random();
        int[]num=new int[10];
        int round=0;
        
        do{
            round++;
            System.out.println("Round "+round);
            for( int i =0; i<num.length; i++)
            {
                if(num[0]==8)
                    num[0]=8;
                else
                    num[0]=gen.nextInt(10);
                    if(num[1]==0)
                    num[1]=0;
                else
                    num[1]=gen.nextInt(10);
                    if(num[2]==1)
                    num[2]=1;
                else
                    num[2]=gen.nextInt(10);
                    if(num[3]==5)
                    num[3]=5;
                else
                    num[3]=gen.nextInt(10);
                    if(num[4]==7)
                    num[4]=7;
                else
                    num[4]=gen.nextInt(10);
                    if(num[5]==3)
                    num[5]=3;
                else
                    num[5]=gen.nextInt(10);
                    if(num[6]==8)
                    num[6]=8;
                else
                    num[6]=gen.nextInt(10);
                    if(num[7]==9)
                    num[7]=9;
                else
                    num[7]=gen.nextInt(10);
                    if(num[8]==0)
                    num[8]=0;
                else
                    num[8]=gen.nextInt(10);
                    if(num[9]==4)
                    num[9]=4;
                else
                    num[9]=gen.nextInt(10);
            }
            for(int i =0; i<num.length; i++)
            {
                System.out.print(num[i]);
            }
            System.out.println("\n");
        }while((num[0]!=8)||(num[1]!=0)||(num[2]!=1)||(num[3]!=5)||(num[4]!=7)||(num[5]!=3)||(num[6]!=8)||(num[7]!=9)||(num[8]!=0)||(num[9]!=4));
    }
}
