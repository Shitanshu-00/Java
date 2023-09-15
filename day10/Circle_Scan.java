package day10;
import java.util.Scanner;

public class Circle_Scan {
    public static void main(String[] args) {
        double r, ar,c, pi=3.14;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius ");
        r= sc.nextFloat();
        ar=pi*r*r;
        c=2*pi*r;
        System.out.println("Area is "+ar+"\n"+"Circumference is "+c);
    }
}
