import java.util.*;
public class Least
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,min;
        int a[]=new int[10];
        System.out.println("Enter 10 numbers=");
        for (i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=0;i<10;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("MINIMUM="+min);
    }
}