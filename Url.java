import java.net.*;
import java.io.*;
import java.util.*;
public class Url
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Url url=new Url("http://java.sun.com:80/docs/books/"+"tutorial/index.html#DOWNLOADING");
        System.out.println("Protocol = " + url.getProtocol());
        System.out.println("Host = " + url.getHost());
        System.out.println("Filename = " + url.getFile());
        System.out.println("Port = " + url.getPort());
        System.out.println("Reference = " + url.getRef());
    }
} 