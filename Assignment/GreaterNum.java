package Assignment;
import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any two num :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String str=(a>b)?(a+">"+b):(b+">"+a);
        System.out.println(str);
    }
}
