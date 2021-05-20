import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Try
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileWriter fileWriter=new FileWriter("Excel.csv");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        System.out.println("Enter names of five children=");
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        String d=sc.next();
        String e=sc.next();
        System.out.println("Enter marks of five children=");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        printWriter.print(a+","+x);
        String sentence=b+","+y;
        printWriter.append(sentence);
        printWriter.print(sentence);
        String sentence1=c+","+z;
        printWriter.append(sentence1);
        printWriter.print(sentence1);
        String sentence2=d+","+p;
        printWriter.append(sentence2);
        printWriter.print(sentence2);
        String sentence3=e+","+q;
        printWriter.append(sentence3);
        printWriter.print(sentence3);
        printWriter.close();            
    }
}
