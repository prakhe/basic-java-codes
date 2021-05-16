import java.util.*;
public class InterestCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,interest,mv;
        int t;
        System.out.println("Enter principal,rate and time(in months)=");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextInt();
        interest=((p*r*t*(t+1))/(2*12*100));
        mv=p*t+interest;
        System.out.println("Interest="+interest);
        System.out.println("Maturity value="+mv);
    }
}