/*Write a menu druven program to perform the following-
1.To print the series:0,3,8,15,24,......till n terms
2.To find sum of the following:1/2+3/4+5/6+7/8+............+19/20				*/
import java.util.*;
public class Case
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 1.FOR SERIES AND 2.FOR SUM=");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:{
				System.out.println("ENTER A LIMIT=");
				int n=sc.nextInt();
				int i,x;
				for(i=1;i<=n;i++)
				{
					x=(i*i)-1;
					System.out.print(x+",");
				}
		 		}
		 		break;
		 	case 2:{
		 		int i,sum=0;
		 		for(i=1;i<=19;i++)
		 		{
		 			sum=sum+i/(i+1);
		 		}
		 		System.out.println("SUM="+sum);
		 		}
		 		break;
		 	default:System.out.println("INVALID CHOICE");	
		}
	}
}