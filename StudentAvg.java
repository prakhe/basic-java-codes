/*Define a class student with following variables:
String name,int eng,int hn,int mts,double total,double avg
Member methods:
void accept()-to input marks in english,hindi and maths
void compute()-to calcualte total marks and average of 3 subjects
void display()-to display all details						*/
import java.util.*;
public class StudentAvg
{
	Scanner sc=new Scanner(System.in);
	String name;
	int eng,hn,mts;
	double total,avg,avg1;
	StudentAvg()
	{
		name=" ";
		eng=0;
		hn=0;
		mts=0;
		total=0.0d;
		avg=0.0d;
		avg1=0.0d;
	}
	public void accept()
	{
		System.out.println("Enter your name,marks in english,hindi and maths=");
		name=sc.nextLine();
		eng=sc.nextInt();
		hn=sc.nextInt();
		mts=sc.nextInt();
	}
	public void compute()
	{
		total=(eng+hn+mts);
		avg=total/3;
		avg1=Math.round(avg);
	}
	public void display()
	{
		System.out.println("Your name="+name);
		System.out.println("Your english marks="+eng);
		System.out.println("Your hindi marks="+hn);
		System.out.println("Your maths marks="+mts);
		System.out.println("Your total marks="+total);
		System.out.println("Your average="+avg1);
	}
	public static void main(String args[])
	{
		StudentAvg obj=new StudentAvg();
		obj.accept();
		obj.compute();
		obj.display();
	}
}