import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        for(x=1;x<=5;x++)
        {
            for(y=5;y>=x;y--)
            {
                if (y%2==0)
                {
                    System.out.print("B");
                }
                else
                {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
    }
}