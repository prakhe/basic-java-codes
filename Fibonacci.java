/*Write a program to display Fibonacci series till 10 numbers*/
import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=0,y=1,z,i;
		System.out.print(x+","+y+",");
		for(i=1;i<=10;i++)
		{
			z=x+y;
			System.out.print(z+",");
			x=y;
			y=z;
		}
	}
}