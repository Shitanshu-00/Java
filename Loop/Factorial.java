package Loop;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        float a = 1.0F;
        for(int i=1; i<=n; i++){
            a*=i;
        }
        System.out.println(a);
    }
}
