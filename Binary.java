/*Write a program in java to input 10 numbers and perform Binary search*/
import java.util.*;//program starts
public class Binary//class starts
{
	public static void main(String args[])//main method
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];//declaring an array
		System.out.println("Enter array in ascending order=");
		for (int i=0;i<10;i++)
		{//taking array input through for loop
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number to be searched=");
		int num=sc.nextInt();//taking searching number input
		int mid,high=9,low=0,count=0;//high means frequency of array,low is 0 and mid is middle most frequency of array
		while(low<=high)
		{
			mid=(high+low)/2;
			if(num>a[mid])
				low=mid+1;
			else if (num<a[mid])
				high=mid-1;
			else
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Number Found ");
		}
		else
		{
			System.out.println("Number Not Found");
		}
	}
}

	