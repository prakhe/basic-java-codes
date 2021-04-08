import java.util.*;
public class Exotica
{
    Scanner sc=new Scanner(System.in);
    double amt,tax,bill;
    String car,type,name;
    Exotica()
    {
        amt=0.0d;
        tax=0.0d;
        bill=0.0d;
        car=" ";
        type=" ";
        name=" ";
    }
    public void input()
    {
        System.out.println("Welcome to exotica cars!!");
        System.out.println("All cars are of premium model with most costliest features");
        System.out.println("Enter your name and car name=");
        name=sc.nextLine();
        car=sc.next();

    }
   
    public void billing()
    {
            switch(car)
            {
            case "JIMNY" :{
                            amt=1250000;
                            tax=(18*1250000)/100;
                            bill=amt+tax;
                            }
                            break;
            case "THAR":    
                            {
                                amt=1400000;
                                tax=(18*1400000)/100;
                                bill=amt+tax;
                            }
                            break;
             case "WRANGLER":
                                {
                                    amt=8500000;
                                    tax=(18*8500000)/100;
                                    bill=amt+tax;
                                }
                                break;
            
            case "SANTRO":
                            {
                                amt=700000;
                                tax=(18*700000)/100;
                                bill=amt+tax;
                            }
                            break;
            case "ALTO 800":
                            {
                                amt=400000;
                                tax=(18*400000)/100;
                                bill=amt+tax;
                            }
                            break;
            case "KWID":
                        {
                            amt=450000;
                            tax=(18*450000)/100;
                            bill=amt+tax;
                        }
                        break;
            case "SWIFT":
            {
                amt=900000;
                tax=(18*900000)/100;
                bill=amt+tax;
            }
            break;
            case "AMAZE":
                            {
                                amt=950000;
                                tax=(18*950000)/100;
                                bill=amt+tax;
                            }
                            break;
            case "CITY":
                        {
                            amt=450000;
                            tax=(18*450000)/100;
                            bill=amt+tax;
                        }
                        break;
        
            default:System.out.println("Sorry dear customer,we only have JIMNY,THAR,WRANGLER,SANTRO,ALTO 800,KWID,SWIFT,HONDA AMAZE,HONDA CITY");
            } 
         
    }
    public void display()
    {
        System.out.println("YOUR NAME="+name);
        System.out.println("YOUR TYPE="+type);
        System.out.println("YOUR CAR="+car);
        System.out.println("TOTAL TAX="+tax);
        System.out.println("TOTAL AMOUNT="+amt);
        System.out.println("TOTAL BILL="+bill);
    }
    public static void main(String args[])
    {
        Exotica obj=new Exotica();        
        obj.input();
        obj.billing();
        obj.display();
    }

}