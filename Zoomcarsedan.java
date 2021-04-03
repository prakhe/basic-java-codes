/*Define a  class called Zoomcar : 
The rent for a mobike is charged on the following basis 
                 	 First five days					2000 per day. 
                     Next five days                     1500 per day.   
                     Rest of the days   				1200 per day
                     void display ()- to display the details in the following format: 
                     Bike No.  Phone No.  Name   No. of days Charge      */

import java.util.*;
public class Zoomcarsedan
{
	Scanner sc=new Scanner(System.in);
	String name,carno,carname,carnum;
	int days,charge;
	double gst,amt;
	String phone;
	Zoomcarsedan()
	{
		name=" ";
		carno=" ";
		carname=" ";
		carnum=" ";
		days=0;
		charge=0;
		phone=" ";
		carnum=" ";
		gst=0.0d;
		amt=0.0d;
	}
	public void input()
	{
		System.out.println("Welcome to Zoomcars sedan section");
		System.out.println("Enter your name,car name and number of days=");
		name=sc.nextLine();
		carname=sc.nextLine();
		days=sc.nextInt();
	}
	
		public void mobno()
	{
		System.out.println("Enter your Phone number: ");
        phone = sc.next();
        int b=phone.length();
        if(b!=10)
      {
        System.out.println("INVALID phone NUMBER");
        System.exit(0);
      } 
      else
      {
          char first_char=phone.charAt(0);
          boolean x=Character.isDigit(first_char);
            if(x==false)
            {
              System.out.println("Invalid phone number");
              System.exit(0);
            }
            else
            {
              char second_char=phone.charAt(1);
              boolean y=Character.isDigit(second_char);
                if(y==false)
                {
                  System.out.println("Invalid phone number");
                  System.exit(0);
                  
                }
                else
                {
                  char third_char=phone.charAt(2);
                  boolean z=Character.isDigit(third_char);
                    if(z==false)
                    {
                      System.out.println("Invalid phone number");
                      System.exit(0);
                    }
                    else
                    {
                      char four_char=phone.charAt(3);
                      boolean p=Character.isDigit(four_char);
                      if(p==false)
                      {
                        System.out.println("Invalid phone number");
                        System.exit(0);
                      }
                      else
                      {
                        char five_char=phone.charAt(4);
                        boolean q=Character.isDigit(five_char);
                        if(q==false)
                        {
                          System.out.println("Invalid phone number");
                          System.exit(0);
                        }
                        else
                        {
                          char six_char=phone.charAt(5);
                          boolean r=Character.isDigit(six_char);
                          if(r==false)
                          {
                            System.out.println("Invalid phone number");
                            System.exit(0);
                          }
                          else
                          {
                            char seven_char=phone.charAt(6);
                            boolean s=Character.isDigit(seven_char);
                            if(s==false)
                            {
                              System.out.println("Invalid phone number");
                              System.exit(0);
                            }
                            else
                            {
                              char eight_char=phone.charAt(7);
                              boolean t=Character.isDigit(eight_char);
                              if(t==false)
                              {
                                System.out.println("Invalid phone number");
                                System.exit(0);
                              }
                              else
                              {
                                char nine_char=phone.charAt(8);
                                boolean u=Character.isDigit(nine_char);
                                if(u==false)
                                {
                                  System.out.println("Invalid phone number");
                                  System.exit(0);
                                }
                                else
                                {
                                  char ten_char=phone.charAt(9);
                                  boolean v=Character.isDigit(ten_char);
                                  if(v==false)
                                  {
                                    System.out.println("Invalid phone number");
                                    System.exit(0);
                                  }
                                  else
                                  {
                                    System.out.println("Valid phone number");                                 }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                }
            }

      }
        
	}
	public void checkno()
	{
    	Scanner sc=new Scanner (System.in);
		int a;
    	System.out.println("ENTER A VALID VEHICLE REGISTRATION NUMBER WITHOUT SPACES");
    	String carno=sc.nextLine();
    	a=carno.length();
	  	if(a!=10)
    	{
      	System.out.println("INVALID VEHICLE NUMBER");
      	System.exit(0);
    	} 
    	else
    	{
      		char first_char=carno.charAt(0);
      		boolean x=Character.isLetter(first_char);
      			if(x==false)
      			{
      				System.out.println("Invalid vehicle number");
      				System.exit(0);
      			}
      			else
      			{
      				char second_char=carno.charAt(1);
      				boolean y=Character.isLetter(second_char);
      					if(y==false)
      					{
      						System.out.println("Invalid vehicle number");
      						System.exit(0);
      						
      					}
      					else
      					{
      						char third_char=carno.charAt(2);
      						boolean z=Character.isDigit(third_char);
      							if(z==false)
      							{
      								System.out.println("Invalid vehicle number");
      								System.exit(0);
      							}
      							else
      							{
      								char four_char=carno.charAt(3);
      								boolean p=Character.isDigit(four_char);
      								if(p==false)
      								{
      									System.out.println("Invalid vehicle number");
      									System.exit(0);
      								}
      								else
      								{
      									char five_char=carno.charAt(4);
      									boolean q=Character.isLetter(five_char);
      									if(q==false)
      									{
      										System.out.println("Invalid vehicle number");
      										System.exit(0);
      									}
      									else
      									{
      										char six_char=carno.charAt(5);
      										boolean r=Character.isLetter(six_char);
      										if(r==false)
      										{
      											System.out.println("Invalid vehicle number");
      											System.exit(0);
      										}
      										else
      										{
      											char seven_char=carno.charAt(6);
      											boolean s=Character.isDigit(seven_char);
      											if(s==false)
      											{
      												System.out.println("Invalid vehicle number");
      												System.exit(0);
      											}
      											else
      											{
      												char eight_char=carno.charAt(7);
      												boolean t=Character.isDigit(eight_char);
      												if(t==false)
      												{
      													System.out.println("Invalid vehicle number");
      													System.exit(0);
      												}
      												else
      												{
      													char nine_char=carno.charAt(8);
      													boolean u=Character.isDigit(nine_char);
      													if(u==false)
      													{
      														System.out.println("Invalid vehicle number");
      														System.exit(0);
      													}
      													else
      													{
      														char ten_char=carno.charAt(9);
      														boolean v=Character.isDigit(ten_char);
      														if(v==false)
      														{
      															System.out.println("Invalid vehicle number");
      															System.exit(0);
      														}
      														else
      														{
      															System.out.println("Valid vehicle number");      														}
      													}
      												}
      											}
      										}
      									}
      								}
      							}
      					}
      			}

    	}
	}
	
	public void compute()
	{
		

		if(days<=5)
		{
			charge=days*2000;

		}
		else if(days>5 && days<=10)
		{
			charge=5*2000+(days-5)*1500;
		}
		else
		{
			charge=5*2000+5*1500+(days-10)*1200;
		}
	}
  public void tax()
  {
    System.out.println("GST need to be added according to new taxing regulations by Ministry of Finance");
    gst=(5*charge)/100;
    amt=charge+gst; 
  }
	
	public void display()
	{
		System.out.println("GST need to be added according to new taxing regulations by Ministry of Finance");
    gst=(5*charge)/100;
    amt=charge+gst;
    System.out.println("Name="+name);
		System.out.println("Car name="+carname);
		System.out.println("Mobile number="+phone);
		System.out.println("Number of days="+days);
		System.out.println("Your total charge="+charge);
		System.out.println("Total gst="+gst);
		System.out.println("Your total amount="+amt);
		System.out.println("THANK YOU,VISIT AGAIN!!!!");
	}
	public static void main(String args[])
	{
		Zoomcarsedan obj=new Zoomcarsedan();
		obj.input();
		obj.mobno();
		obj.checkno();
		obj.compute();
    obj.tax();
		obj.display();
	}
}
