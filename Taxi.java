import java.util.*;
public class Taxi
{
	Scanner sc=new Scanner(System.in);
	double com,amt,discount,dis,tax,totalamt;
	int choice;
	String name,phone;
	Taxi()
	{
		amt=0.0d;
		totalamt=0.0d;
		dis=0.0d;
		com=0.0d;
		choice=0;
		name=" ";
		phone=" ";
	}
	public void accept()
	{
		System.out.println("WELCOME TO XCELLENT CABS PVT LTD");
		System.out.println("NO TAXES APPLICABLE TO YOU");
		System.out.println("ENTER YOUR NAME,AND DISTANCE=");
		name=sc.nextLine();
		dis=sc.nextDouble();
	}
	public void mobno()
	{
		System.out.println("Enter your Phone number: ");
        phone = sc.next();
        String regex = "\\d{10}";
        boolean result = phone.matches(regex);
        if(result) 
        {
         System.out.println("Given phone number is valid");
      	} 
      	else 
      	{
         System.out.println("Given phone number is not valid");
      	 System.exit(0);
      	}

	}
	public void compute()
	{
		System.out.println("Enter 1. for SEDAN 2. for SUV and 3. for basic car=");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("WELCOME TO SEDAN TAXI SECTION");

			if(dis<=10)
			{
				amt=dis*20;
				com=(20*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>10 && dis<=20)
			{
				amt=((dis-10)*20)+100;
				com=(20*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>20 && dis<=30)
			{
				amt=((dis-10)*20)+((dis-20)*10)+75;
				com=(20*amt)/100;
				totalamt=amt+com;
			}
			else
			{
				amt=((dis-10)*20)+((dis-20)*10)+75;
				com=(20*amt)/100;
				totalamt=amt+com;
			}
		}
			else if(choice==2)
			{
				
			System.out.println("WELCOME TO SUV TAXI SECTION");

			if(dis<=10)
			{
				amt=dis*25;
				com=(25*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>10 && dis<=20)
			{
				amt=((dis-10)*25)+200;
				com=(25*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>20 && dis<=30)
			{
				amt=((dis-10)*25)+((dis-20)*15)+150;
				com=(25*amt)/100;
				totalamt=amt+com;
			}
			else
			{
				amt=((dis-10)*20)+((dis-20)*15)+((dis-20)*10)+100;
				com=(25*amt)/100;
				totalamt=amt+com;
			}
		}
			else if(choice==3)
			{
				
			System.out.println("WELCOME TO BASIC TAXI SECTION");

			if(dis<=10)
			{
				amt=dis*15;
				com=(15*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>10 && dis<=20)
			{
				amt=((dis-10)*15)+75;
				com=(15*amt)/100;
				totalamt=amt+com;
			}
			else if(dis>20 && dis<=30)
			{
				amt=((dis-10)*15)+((dis-20)*10)+50;
				com=(15*amt)/100;
				totalamt=amt+com;
			}
			else
			{
				amt=((dis-10)*15)+((dis-20)*10)+((dis-20)*5)+25;
				com=(15*amt)/100;
				totalamt=amt+com;
			}

		}
}
		public void display()
		{
			System.out.println("Your name="+name);
			System.out.println("Your phone number="+phone);
			System.out.println("Your distance="+dis);
			System.out.println("Your amount="+amt);
			System.out.println("Driver's additional commission="+com);
			System.out.println("Your total amount"+totalamt);

		}
		public static void main(String args[])
		{
			Taxi obj=new Taxi();
			obj.accept();
			obj.mobno();
			obj.compute();
			obj.display();
		}
	
}