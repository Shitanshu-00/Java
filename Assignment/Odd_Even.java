package Assignment;
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int a= sc.nextInt();
        if (a%2==0){
            System.out.println(" Number is Even ");
        }
        else System.out.println(" Number is Odd ");
    }
}
 class OddEvTernary{
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter Any Num : ");
         int b=sc.nextInt();
         String str=(b%2==0)?("Number is Even"):("Number is Odd");
         System.out.println(str);
     }
 }