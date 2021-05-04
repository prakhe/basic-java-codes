import java.util.*;
public class Stockexchange
{
    Scanner sc=new Scanner(System.in);
    String name,company;
    int age,shares;
    double totalamt,value1=715.40,value2=143.75,value3=1916.60,value4=3049.75,value5=351.50,value6=481.95,value7=129.00,value8=1402.90,value9=16546.60,value10=37.45;
    Stockexchange()
    {
        name=" ";
        company=" ";
        age=0;
        shares=0;
        totalamt=0.0d;
    }
    public void input()
    {
        System.out.println("Enter your name and age=");
        name=sc.nextLine();
        age=sc.nextInt();
    }
    public void calculate()
    {
        if(age<18)
        {
            System.out.println("Only for adults");
            System.exit(0);
        }
        else
        {
            System.out.println("Welcome to Asian stock brokers");
            System.out.println("The data is as of 5 may 2021 so there may be differences");
            System.out.println("We are giving a list of 10 top companies with their current 1 share value and profit or loss.You have to buy atleast 50 shares.Choose wisely");
            System.out.println("Choose from following companies:");
            System.out.println("1.JSW Steels (715.40) Loss:7.85");
            System.out.println("2.GAIL India (143.75) Profit:6.25");
            System.out.println("3.Reliance Industries (1916.60) Loss:42.45");
            System.out.println("4.Tata Consultancy services (3049.75) Profit:12.75");
            System.out.println("5.State bank of India (351.50) Profit:0.90");
            System.out.println("6.WIPRO (481.95) Loss:5.40");
            System.out.println("7.Burger King (129.00) Loss:0.15");
            System.out.println("8.Titan (1402.90) Loss:21.05");
            System.out.println("9.Nestle (16546.60) Profit:39.85");
            System.out.println("10.Punjab National Bank (37.45) Profit:2.95");
            company=sc.nextLine();
            System.out.println("Enter number of shares");
            shares=sc.nextInt();
            if(shares<50)
            {
                System.out.println("Enter at least 50 shares");
            }
            else
            {
                if(company=="JSW Steels")
                {
                    totalamt=shares*value1;
                }
                else if(company=="GAIL India")
                {
                    totalamt=shares*value2;
                }
                else if(company=="Reliance")
                {
                    totalamt=shares*value3;
                }
                else if(company=="Tata consultancy services")
                {
                    totalamt=shares*value4;
                }
                else if(company=="State bank of India")
                {
                    totalamt=shares*value5;
                }
                else if(company=="WIPRO")
                {
                    totalamt=shares*value6;
                }
                else if(company=="Burger King")
                {
                    totalamt=shares*value7;
                }
                else if(company=="Titan")
                {
                    totalamt=shares*value8;
                }
                else if(company=="Nestle")
                {
                    totalamt=shares*value9;
                }
                else if(company=="Punjab National Bank")
                {
                    totalamt=shares*value10;
                }
                else 
                {
                    System.exit(0);
                }
            }
        }


    }
    public void display()
    {
        System.out.println("Your name="+name);
        System.out.println("Your company="+company);
        System.out.println("Your total amount="+totalamt);
    }
    public static void main(String args[])
    {
        Stockexchange obj=new Stockexchange();
        obj.input();
        obj.calculate();
        obj.display();

    }
}