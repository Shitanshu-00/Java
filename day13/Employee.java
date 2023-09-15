package day13;
import java.util.Scanner;

public class Employee {
    String name;
    int salary;
    static String company;
    Scanner sc= new Scanner(System.in);
    void setName(){
        System.out.println("Enter Your Name : ");
        name=sc.nextLine();
    }
    void setSalary(){
        System.out.println("Enter Your Salary : ");
        salary=sc.nextInt();
    }
    static void setCompany(){
        System.out.println("Enter the name of Company : ");
        Scanner sc= new Scanner(System.in);
        company= sc.nextLine();
    }
    void getName(){
        System.out.println("Your name is "+name);
    }
    void getSalary(){
        System.out.println("Salary is :"+ salary);
    }
    static void getCompany(){
        System.out.println("Your company is : "+company);
    }
}
class Details{
    public static void main(String[] args) {
        Employee.setCompany();
        Employee e1= new Employee();
        e1.setName();
        e1.setSalary();
        Employee e2= new Employee();
        e2.setName();
        e2.setSalary();
        System.out.println("****** Details of Employee 1 ******");
        e1.getName();
        e1.getSalary();
        Employee.getCompany();
        System.out.println("****** Details of Employee 2 ******");
        e2.getName();
        e2.getSalary();
        Employee.getCompany();
    }
}