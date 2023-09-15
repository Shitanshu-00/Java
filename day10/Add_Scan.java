package day10;
import java.util.Scanner;

public class Add_Scan {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        a=sc.nextInt();
        System.out.println("Enter num2");
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
