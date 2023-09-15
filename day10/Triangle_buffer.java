package day10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Triangle_buffer {
    public static void main(String[] args) throws IOException {
        double b,h,ar;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter base");
        b= Double.parseDouble(br.readLine());
        System.out.println("Enter Height");
        h= Double.parseDouble(br.readLine());
        ar=(b*h)/2;
        System.out.println("Area is "+ar);
    }
}
