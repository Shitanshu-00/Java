package Assignment;
import java.util.Scanner;

public class Triangle_Sides {
    public static void main(String[] args) {
        int a, b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sides of Triangle");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         int sum= a+b+c;
            if (sum ==180)
            {
            System.out.println("This is a valid Triangle");
            }
            else
                System.out.println("This is not a valid Triangle");
    }
}
