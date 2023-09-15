package day10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;

public class Add_Buffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter num1 ");
        int a= Integer.parseInt(br.readLine());
        System.out.println("Enter num2");
        int b= Integer.parseInt(br.readLine());
        int c= a+b;
        System.out.println(c);

    }
}
