package Loop;
import java.util.Scanner;

public class Natural_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for (int i=0; i<=n; i++){
            a= a+i;
        }
        System.out.println("Sum of "+n+" Natural Numbers are = "+a);
    }
}
