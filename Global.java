/*Global Transport Company charges for the parcels of its customers as per the following specifications given below:
Weight in KG
Charge per KG
Upto 10 Kgs			₹ 100 per Kg
Next 20 Kgs			₹ 80 per Kg
Above 30 Kgs		₹ 60 per Kg
A surcharge of 10 % is charged on the bill.
Write a Java program to input the name of the customer, weight of the parcel,phone number and address.
Print the name of the customer, weight of the parcel, total bill inclusive of surcharge */
import java.util.*;
public class Global
{
	Scanner sc=new Scanner(System.in);
	String name,address,phone;
	double weight,total_bill,surcharge,amt,total_amt,gst;
	Global()
	{
		name=" ";
		address=" ";
		phone=" ";
		weight=0.0d;
		total_bill=0.0d;
		surcharge=0.0d;
		amt=0.0d;
	}
	public void input()
	{
		System.out.println("WELCOME TO GLOBAL TRANSPORT COMPANY PVT.LTD");
		System.out.println("ENTER NAME,ADDRESS AND WEIGHT");
		name=sc.nextLine();
		address=sc.nextLine();
		weight=sc.nextDouble();
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
		if(weight<=10)
		{
			amt=100*weight;
			surcharge=(10*amt)/100;
			total_bill=amt+surcharge;
		}
		else if(weight>10 && weight<=30)
		{
			amt=(100*weight)+((weight-10)*80);
			surcharge=(10*amt)/100;
			total_bill=amt+surcharge;
		}
		else
		{
			amt=(100*weight)+(80*weight)+((weight-30)*60);
			surcharge=(10*amt)/100;
			total_bill=amt+surcharge;
		}
	}
	public void tax()
  {
    System.out.println("GST need to be added according to new taxing regulations by Ministry of Finance");
    gst=(18*total_bill)/100;
    total_amt=total_bill+gst; 
  }
	public void display()
	{
		System.out.println("Your name="+name);
		System.out.println("Your phone="+phone);
		System.out.println("Your Address="+address);
		System.out.println("Your Weight="+weight);
		System.out.println("Your Charge="+amt);
		System.out.println("Your Surcharge="+surcharge);
		System.out.println("Your total taxable amount="+gst);
		System.out.println("Your total amount="+total_amt);

	}
	public static void main(String args[])
	{
		Global obj=new Global();
		obj.input();
		obj.mobno();
		obj.compute();
		obj.tax();
		obj.display();
	}
}