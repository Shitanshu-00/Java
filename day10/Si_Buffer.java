package day10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Si_Buffer {
    public static void main(String[] args) throws IOException {
        double si,p,r,t;
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter principle");
        p= Double.parseDouble(br.readLine());
        System.out.println("Enter rate ");
        r= Double.parseDouble(br.readLine());
        System.out.println("Enter time");
        t= Double.parseDouble(br.readLine());
        si= (p*r*t)/100;
        System.out.println("Simple Interest is: "+si);

    }
}
