/*Write a program to initialise the seven wonders of the World along with their locations in two 
different arrays.Search for a name of the country input by user.If found,display the name of the
country along with its wonder 					*/
import java.util.*;
public class Wonders
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String x[]={"CHICHEN ITZA","CHRIST THE REDEEMER","TAJMAHAL","GREAT WALL OF CHINA","MACHU PICCHA","PETRA","COLOSSUEM"};
		String y[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
		String s;
		int i,count=0,index;
		System.out.println("ENTER NAME TO BE SEARCHED=");
		s=sc.next();
		for (i=0;i<7;i++)
		{
			if(s.equalsIgnoreCase(y[i]))
			{
				count=1;
			}
		}
		if(count==1)
		{
			System.out.println(y[i]+"-"+x[i]);
		}
		else
		{
			System.out.println("SORRY NOT FOUND");
		}
	}
} 