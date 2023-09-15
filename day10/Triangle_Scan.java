package day10;
import java.util.Scanner;

public class Triangle_Scan {
    public static void main(String[] args) {
        double b,h,ar;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base ");
        b= sc.nextDouble();
        System.out.println("Enter Height");
        h=sc.nextDouble();
        ar=(b*h)/2;
        System.out.println(ar);
    }
}
