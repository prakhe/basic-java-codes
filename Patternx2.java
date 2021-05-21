import java.util.*;
public class Patternx2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        for(x=1;x<=6;x++)
        {
            for(y=1;y<=x;y++)
            {
                if (y%2==0)
                {
                    System.out.print("!");
                }
                else
                {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}