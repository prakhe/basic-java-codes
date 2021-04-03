/*Write a class with a name Employee to find gross pay of an employee using function overloding.
The method to calculate is given as follows:
Dearness allowance=25% of Basic pay
House rent allowance=15% of Basic pay
Provident fund=8.33% of Basic pay
Net pay=Basic pay+Dearness allowance+House rent allowance
Gross pay=Net pay-Provident fund
ALSO DISPLAY INCOME TAX 									*/
import java.util.*;
public class Employee
{
	Scanner sc=new Scanner(System.in);
	double da,hra,pf,np,gp,bp,it;
	String name,company,phone;
	Employee()
	{
		da=0.0d;
		hra=0.0d;
		pf=0.0d;
		np=0.0d;
		gp=0.0d;
		bp=0.0d;
		name=" ";
		company=" ";
		it=0.0d;
		phone=" ";
	}
	public void input()
	{
		System.out.println("WELCOME TO TAX CALCULATOR");
		System.out.println("ENTER YOUR NAME,COMPANY NAME AND BASIC PAY(YEARLY)=");
		name=sc.nextLine();
		company=sc.nextLine();
		bp=sc.nextDouble();
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
	public void tax()
	{
		System.out.println("INCOME TAX CALCULATED ACCORDING TO 2021-2022 INDIAN GOVERNMENT NORMS");
		System.out.println("Enter 1.For option 1 and 2.For option 2=");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:{
						if(bp<=250000)
						{
							System.out.println("INCOME TAX IS NOT APPLICABLE TO YOU");
							it=0;
						}
						else if(bp>250000 && bp<=500000)
						{
							it=(5*bp)/100;
						}

						else if(bp>500000 && bp<=1000000)
						{
							it=((20*bp)/100);
						}
						else
						{
							it=((30*bp)/100);
						}
					}
					break;
			case 2:{

			}
	}
	}
	
	public void pay()
	{
		da=(25*bp)/100;
		hra=(15*bp)/100;
		pf=(8.33*bp)/100;
		np=bp+da+hra;
		gp=np-pf;
	}
	public void display()
	{
		System.out.println("Your name="+name);
		System.out.println("Your company name="+company);
		System.out.println("Your phone number="+phone);
		System.out.println("Your basic pay="+bp);
		System.out.println("Your dearness allowance="+da);
		System.out.println("Your house rent allowance="+hra);
		System.out.println("Your net pay="+np);
		System.out.println("Your income tax="+it);
		System.out.println("Your provident fund="+pf);
		System.out.println("Your gross pay="+gp);
	} 
	public static void main(String args[])
	{
		Employee obj=new Employee();
		obj.input();
		obj.mobno();
		obj.tax();
		obj.pay();
		obj.display();
	}
} 