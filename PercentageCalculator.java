import java.util.*;
public class PercentageCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double science,ss,computer,math,english;
        double total,perc;
        System.out.println("enter your marks in science,social studies,computer,math and english(out of hundred)=");
        science=sc.nextDouble();
        ss=sc.nextDouble();
        computer=sc.nextDouble();
        math=sc.nextDouble();
        english=sc.nextDouble();
        total=science+ss+computer+math+science;
        perc=(total/500)*100;
        System.out.println("Marks out of five hundred="+total);
        System.out.println("Percentage="+perc+"%");
    }
}