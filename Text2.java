import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Text2
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileWriter fileWriter=new FileWriter("File2.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        System.out.println("Enter your name and age=");
        String name=sc.next();
        int age=sc.nextInt();
        printWriter.print(name+" "+age);
        printWriter.close();
    }
}