import java.util.*;
public class RockPaperScissor
{
    Scanner sc=new Scanner(System.in);
    String a,b,c,d,e;
    String x="paper",y="rock",z="scissors";
    int points=0,points1=0;
    RockPaperScissor()
    {
        a=" ";
        b=" ";
        c=" ";
        d=" ";
        e=" ";
    }
    public void function1()
    {
        System.out.println("WELCOME TO ROCK,PAPER,SCISSOR game");
        System.out.println("Please enter your values in small letter");
        System.out.println("Enter rock,paper or scissors");
        a=sc.next();
        if(a==x)
        {
            System.out.println("DRAW");
        }
        else if(a=="scissors")
        {
            System.out.println("You won");
            points++;
        }
        else
        {
            System.out.println("You lose");
            points1++;
        }
        System.out.println("Enter rock,paper or scissors");
        b=sc.next();
        if(b==x)
        {
            System.out.println("DRAW");
        }
        else if(b=="scissors")
        {
            System.out.println("You won");
            points++;
        }
        else
        {
            System.out.println("You lose");
            points1++;
        }
        System.out.println("Enter rock,paper or scissors");
        c=sc.next();
        if(c==z)
        {
            System.out.println("DRAW");
        }
        else if(c=="rock")
        {
            System.out.println("You won");
            points++;
        }
        else
        {
            System.out.println("You lose");
            points1++;
        }
        System.out.println("Enter rock,paper or scissors");
        d=sc.next();
        if(d==y)
        {
            System.out.println("DRAW");
        }
        else if(d=="paper")
        {
            System.out.println("You won");
            points++;
        }
        else
        {
            System.out.println("You lose");
            points1++;
        }
        System.out.println("Enter rock,paper or scissors");
        e=sc.next();
        if(e==y)
        {
            System.out.println("DRAW");
        }
        else if(e=="paper")
        {
            System.out.println("You won");
            points++;
        }
        else
        {
            System.out.println("You lose");
            points1++;
        }
    }
    public void function2()
    {
        if(points>points1)
        {
            System.out.println("YOU WON THE MATCH");
        }
        else
        {
            System.out.println("YOU LOSE THE MATCH");
        }
    }
    public static void main(String args[])
    {
        RockPaperScissor obj=new RockPaperScissor();
        obj.function1();
        obj.function2();
    }
}