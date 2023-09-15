package Assignment;
import java.util.Scanner;

public class SignNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();
        String str=(a<0)?("Number is Negative"):("Number is Positive ");
        System.out.println(str);
    }
}
