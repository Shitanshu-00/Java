package Loop;
import java.util.Scanner;

public class Even_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the value of n");
        int n= sc.nextInt();
        //int n=100;
        for (int i=1; i<=n;i++){
            if (i % 2 == 0) {
                System.out.println(i+ " is Even Number");
            }
        }
    }
}
