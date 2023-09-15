package day10;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Circle_Buffer {
    public static void main(String[] args) throws IOException {
        double r,ar,c;
        double pi= 3.14;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Radius");
        r= Double.parseDouble(br.readLine());
        ar= pi*r*r;
        c= 2*pi*r;
        System.out.println("Area "+ar);
        System.out.println("Circumference "+c);
    }
}
