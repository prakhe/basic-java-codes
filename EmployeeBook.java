import java.util.Scanner;

public class EmployeeBook {
    //Variables to store input
    private String name, designation;
    private int age;
    private double basic_salary;

    //Variables to store the calculations
    private double hra,da,travel_allowance,med_allowance,pf,gross_sal,net_sal,taxable_income,tax_amount;

    //Constructor to initialise input variables
    EmployeeBook()
    {
        this.name = "";
        this.designation = "";
        this.age = 0;
        this.basic_salary = 0.0d;
    }

    //Method to take input from user
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        name = sc.nextLine();
        System.out.println("Enter the designation of the employee:");
        designation = sc.nextLine();
        System.out.println("Enter the age of the employee:");
        age = sc.nextInt();
        System.out.println("Enter the basic salary of the employee:");
        basic_salary = sc.nextDouble();
    }

    //Method to perform all the calculations
    void calculate()
    {
        hra=(25*basic_salary)/100;
        da=(15*basic_salary)/100;
        travel_allowance=2000;
        med_allowance=1000;
        pf=(10*basic_salary)/100;
        gross_sal=hra+da+travel_allowance+med_allowance+basic_salary;
        net_sal=gross_sal-pf;
        taxable_income=net_sal*12;

        //Calculate tax according to the taxable income
        if(taxable_income<=250000)
            tax_amount=0;
        else if(taxable_income>250000 && taxable_income<=500000)
            tax_amount=((taxable_income-160000)*10)/100;
        else if(taxable_income>500000 && taxable_income<=1000000)
            tax_amount=(((taxable_income-500000)*20)/100) + 34000;
        else
            tax_amount=(((taxable_income-1000000)*30)/100) + 94000;
    }

    //Method to display according to format provided
    void display()
    {
        
        System.out.println("----------------------------SALARY SLIP-------------------------------------");
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("BASIC PAY: "+basic_salary);
        System.out.println("Providend Fund: "+pf);
        System.out.println("DEARNESS ALLOWANCE: "+da);
        System.out.println("TRAVEL ALLOWANCE: "+travel_allowance);
        System.out.println("MEDICAL ALLOWANCE: "+med_allowance);
        System.out.println("HRA: "+hra);
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("GROSS SALARY: "+gross_sal);
        System.out.println(" DEDUCTION: "+pf);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("NET SALARY: "+net_sal);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Taxable Income = Monthly salary* 12= "+taxable_income);
        System.out.println("Tax to be paid: "+tax_amount);
        
        System.out.println("========================================================");
    }

    //Main method to call all the functions
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();
        employee.input();
        employee.calculate();
        employee.display();
    }
}