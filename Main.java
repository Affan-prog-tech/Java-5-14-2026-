import java.util.Scanner;

abstract class Employee
{
    String Name;

    Employee(String Name)
    {
        this.Name=Name;
    }

    abstract void calculateSalary();

    void displayInfo()
    {
        System.out.println("I am an Employee");
    }
}

class FullTimeEmployee extends Employee
{

    FullTimeEmployee(String Name)
    {
        super(Name);
    }

    void calculateSalary()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Full Month Salary:");
        int salary=scan.nextInt();
        
        System.out.println("Full Time Employee Salary: "+salary);
    }

    void display_FullTimeEmployee()
    {
        System.out.println("I am an Full Time Employee");
    }
}

class PartTimeEmployee extends Employee
{
    
    PartTimeEmployee(String Name)
    {
        super(Name);
    }

    void calculateSalary()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Hours:");
        int hours=scan.nextInt();

        System.out.println("Enter Rate per Hour:");
        int rate=scan.nextInt();
        
        System.out.println("Part Time Employee Salary: "+(hours*rate));
    }

    void display_PartTimeEmployee()
    {
        System.out.println("I am an Part Time Employee");
    }
  
}

public class Main {

    public static void main(String[] args) {
        Employee emp1=new FullTimeEmployee("Affan");
        Employee emp2=new PartTimeEmployee("Hasher");

        emp1.calculateSalary();
        emp2.calculateSalary();

        FullTimeEmployee FTE=(FullTimeEmployee)emp1;
        PartTimeEmployee PTE=(PartTimeEmployee)emp2;

        FTE.display_FullTimeEmployee();
        PTE.display_PartTimeEmployee();
    }
}