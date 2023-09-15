package Assignment;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Three Numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String str=(a>b)?((a>c)?(a+" is largest"):(c+" is largest")):((b>c)?(b+" is largest"):(c+" is largest"));
        System.out.println(str);
    }
}
