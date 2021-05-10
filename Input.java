import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Input
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileWriter fileWriter=new FileWriter("IOS.csv");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        System.out.println("Enter your name and age=" );
        String name=sc.next();
        String age=sc.next();
        String sentence="\n"+name+","+age;
        System.out.println(sentence);
        printWriter.append(sentence);
        printWriter.close();
    }

}
