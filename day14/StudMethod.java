package day14;
import java.util.Scanner;

public class StudMethod {
    String name;
      void Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        name=sc.nextLine();
        showName();
    }
    void showName(){
        System.out.println("Namaste "+name);
    }
}
class MainClas{
    public static void main(String[] args) {
        StudMethod s=new StudMethod();
        s.Student();
        //s.showName();
    }
}