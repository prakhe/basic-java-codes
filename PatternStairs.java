import java.util.*;
public class PatternStairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        for(x=1;x<=5;x++)
        {
            for(y=1;y<=x;y++)
            {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}