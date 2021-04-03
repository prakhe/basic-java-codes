import java.util.*;
public class RailwayTicket
{
	String name;
	String coach;
	String phone;
	int amt;
	int increment;
	int totalamt;
	double amount,gst;
    Scanner sc=new Scanner(System.in);
    RailwayTicket()
    {
		name=" ";
		coach=" ";
		phone=" ";
		amt=0;
		totalamt=0;
		amount=0.0d;
		gst=0.0d;
    }	
	 public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO INDIAN RAILWAYS");
		System.out.println("Enter your name,coach(in words like-First,Second,Third,Sleeper) and basic amount=");
		name=sc.nextLine();
		coach=sc.next();
	    amt=sc.nextInt();
		
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
    public void update()
    {
		if(coach=="First")
		{
		
		increment=700;
		
		}
		else if(coach=="Second")
		{
			increment=500;
		}
		else if(coach=="Third")
		{
			increment=250;
		}
		else if(coach=="Sleeper")
		{
			increment=0;
		}
		
		totalamt=amt+increment;

	}
	public void tax()
  	{
    	System.out.println("GST need to be added according to new taxing regulations by Ministry of Finance");
    	gst=(5*totalamt)/100;
    	amount=totalamt+gst; 
  	}
	public void display()
	{
		
		
		System.out.println("Name="+name);
		System.out.println("Coach="+coach);
      	System.out.println("Mobile number="+phone);
      	System.out.println("Amount="+amt);
		  System.out.println("YOUR TAXABLE AMOUNT="+gst);
      	System.out.println("Total amount="+amount);
      	System.out.println("THANK YOU,VISIT AGAIN!!!");
	}
	
	public static void main(String args[])
	{
      RailwayTicket obj=new RailwayTicket();
      obj.accept();
	  obj.mobno();
      obj.update();
	  obj.tax();
      obj.display();
	}

}