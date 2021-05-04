import java.util.*;
public class CurrencyConvertor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Welcome to currency convertor");
        System.out.println("Enter amount in indian currency=");
        double amt=sc.nextDouble();
        double converted=0.0d;
        int choice;
        System.out.println("Enter 1 to convert in us dollars 2 to canadian dollars 3 to australian dollars 4 to yen 5 to japanese yen and 6 to euros");
        choice=sc.nextInt();
        if(choice==1)
        {
            converted=0.014*amt;
        }
        else if(choice==2)
        {
            converted=0.017*amt;
        }
        else if(choice==3)
        {
            converted=0.018*amt;
        }
        else if(choice==4)
        {
            converted=0.088*amt;
        }
        else if(choice==5)
        {
            converted=1.48*amt;
        }
        else if(choice==6)
        {
            converted=0.011*amt;
        }
        else
        {
            System.out.println("Please choose a correct option");
            System.exit(0);
        }
        System.out.println("Conversion="+converted);

    }
}