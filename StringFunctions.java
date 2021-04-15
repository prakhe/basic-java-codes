import java.util.*;
public class StringFunctions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("This program is to perform all string functions");
        System.out.println("Enter a string=");
        String a=sc.next();
        String b=a.toLowerCase();
        String c=a.toUpperCase();
        System.out.println("Lowercase="+b);
        System.out.println("Uppercase="+c);
        System.out.println("Enter a character to be replaced(it should be in the string) and also enter the desired character= ");
        char x=sc.next().charAt(0); 
        char y=sc.next().charAt(0);
        String d=a.replace(x,y);
        System.out.println("The result is="+d);
        System.out.println("Enter a string to check,concat and compare your first entered string=");
        String check=sc.next();
        boolean e=a.equals(check);
        boolean f=a.equalsIgnoreCase(check);
        String g=a.concat(check);
        int p=a.compareTo(check);
        int q=a.compareToIgnoreCase(check);
        int r=a.length();
        System.out.println("Check equal="+e+" Check equal ignoring case="+f);
        System.out.println("Concat two strings="+g);
        System.out.println("Compare="+p+" Compare ignoring case="+q);
        System.out.println("Check length="+r);
        System.out.println("Enter a character to get index,last index =");
        char k=sc.next().charAt(0);
        int s=a.indexOf(k);
        int t=a.lastIndexOf(k);
        System.out.println("Index="+s+" Last index="+t);
        
        

    }
}