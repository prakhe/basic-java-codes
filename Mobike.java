/*Define a  class called mobike with the following description: Instance variables/data members: 
int bno -to store the bike's number 
int phno-to store the phone number of the customer 
String name - to store the name of the customer. 
int days- to store the number of days the bike is taken on rent. 
int charge -to calculate and store the rental charge. 
Member methods: 
voidinput() -to input and store the detail of the Customer. 
void compute() - to compute the rental charge. 
The rent for a mobike is charged on the following basis 
                 	 First five days					500 per day. 
                     Next five days                     400 per day.   
                     Rest of the days   				200 per day
                     void display ()- to display the details in the following format: 
                     Bike No.  Phone No.  Name   No. of days Charge      */

import java.util.*;
public class Mobike
{
	int bno,days,charge;
	long phno;
	String name;
	Mobike()
	{
		bno=0;
		phno=0l;
		days=0;
		charge=0;
		name="";
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name,bike number,phone number,days=");
		name=sc.next();
		bno=sc.nextInt();
		phno=sc.nextLong();
		days=sc.nextInt();
	}
	public void compute()
	{
		if(days<=5)
		{
			charge=days*500;

		}
		if(days>5)
		{
			charge=5*500+(days-5)*400;
		}
		if(days>10)
		{
			charge=5*500+5*400+(days-10)*200;
		}
	}
	public void display()
	{
		System.out.println("Bike No.\tPhone No.\tName\tNo. of days");
		System.out.println(bno+"\t"+phno+"\t"+name+"\t"+days);
		System.out.println("Your charge="+charge);
		System.out.println("THANK YOU,VISIT AGAIN!!!!!!!!");n
		
	}
	public static void main(String args[])
	{
		Mobike obj=new Mobike();
		obj.input();
		obj.compute();
		obj.display();
	}


	}

                    