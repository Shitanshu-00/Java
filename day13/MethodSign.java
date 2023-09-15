package day13;
import java.util.Scanner;
public class MethodSign {
    String show(String name){
        return "Hello "+name;
    }

    public static void main(String[] args) {
        System.out.println("Enter your Name ");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        MethodSign m= new MethodSign();
        String str=m.show(name);
        System.out.println(str);
    }
}
