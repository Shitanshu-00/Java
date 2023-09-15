package day14;
import java.util.Scanner;

public class StudentM{
    String name;
    StudentM(String n){
        name=n;
    }
    StudentM(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        name=sc.nextLine();
    }
    void showName(){
        System.out.println("Hey "+name);
    }
}
class MainclaSS{
    public static void main(String[] args) {
        StudentM st= new StudentM("Human");
        st.showName();
        StudentM st1=new StudentM();
        st1.showName();

    }
}
