import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Text
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fileWriter=new FileWriter("File.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        printWriter.print("My first\n");
        String a="Java text code";
        printWriter.append(a);
        printWriter.print(a);
        printWriter.close();
    }

}