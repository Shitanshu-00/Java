package day13;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        int salary, ot;
        System.out.println("Enter Working time");
        Scanner sc= new Scanner(System.in);
        int time=sc.nextInt();
        if (time<=8){
            System.out.println("Salary is 600");
        }
        else if (time>8 && time<=12) {
            ot= time-8;
            salary=600+(ot*400);
            System.out.println(salary);
        }
        else if (time>12 && time<=16) {
            ot=time-12;
            salary=2200+(ot*300);
            System.out.println(salary);
        }
        else if (time>16 && time<=20) {
            ot=time-16;
            salary=3400+(ot*200);
            System.out.println(salary);
        }
        else if (time>20 && time<=24) {
            ot=time-20;
            salary=4200+(ot*100);
            System.out.println(salary);
        }
        else{
            System.out.println("Wrong Entry");
        }
    }
}
