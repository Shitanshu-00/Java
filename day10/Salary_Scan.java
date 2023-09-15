package day10;
import java.util.Scanner;

public class Salary_Scan {
    public static void main(String[] args) {
        double bs, da, ta, hra, gs;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Base Salary ");
        bs= sc.nextDouble();
        da=(bs*5)/100;
        ta=(bs*10)/100;
        hra=(bs*15)/100;
        gs= bs+ta+da+hra;
        System.out.println("Gross Salary is  "+gs);


    }
}
