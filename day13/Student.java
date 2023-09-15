package day13;
import java.util.Scanner;

public class Student {
    int roll;
    String name;
    static String college;
    void setRollName(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Your Name & Roll ");
        name=sc.nextLine();
        roll=sc.nextInt();
    }
    void getRollName(){
        System.out.println("Your Name is "+name+"\n"+"Your Roll is "+roll);
    }
    static void setCollege(){
        System.out.println("Enter Your College ");
        Scanner sc= new Scanner(System.in);
        college=sc.nextLine();
    }
    static void getCollege(){
        System.out.println("Your College is "+college);
    }
}
class Detail{
    public static void main(String[] args) {
        Student.setCollege();
        Student s1= new Student();
        s1.setRollName();
        Student s2= new Student();
        s2.setRollName();
        System.out.println("******* Student 1 Details **********");
        s1.getRollName();
        Student.getCollege();
        System.out.println("******* Student 2 Details **********");
        s2.getRollName();
        Student.getCollege();
    }
}
