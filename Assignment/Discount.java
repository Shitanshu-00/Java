package Assignment;
import java.util.Scanner;

public class Discount {
    public static void main(String args[]) {
        int am;
        double d, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        am=sc.nextInt();
        if(am>1000){
            d=am*15/100;
            p=am-d;
            System.out.println("Price is "+p+"\nDiscount given : "+d);
        }
        else{
          d=am*5/100;
          p=am-d;
          System.out.println("Price is "+p+"\nDiscount given : "+d);
        }
    }
}
