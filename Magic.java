import java.util.*;
public class Magic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		int pro,div,diff,temp,sum=num;
		while(sum>9)
		{
			num=sum;
			sum=0;
			while(num>0)
			{
				div=num/10;
				pro=div*10;
				diff=num-pro;
				sum=sum+diff;
				num=div;
			}
		}
		if(sum==1)
		{
			System.out.println("MAGIC NUMBER");
		}
		else
		{
			System.out.println("NOT MAGIC NUMBER");
		}		
	}
}