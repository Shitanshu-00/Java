package Assignment;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); System.out.println("Enter Year");
        int y=sc.nextInt();
        if(y%4==0) {
            System.out.println(y + " is a Leap Year ");
        }
        else if (y%100==0) {
            if (y % 4 == 0) {
                System.out.println(y + " is Leap Year");
            }
        }
            else System.out.println(y+" is not a Leap Year");

    }
}
