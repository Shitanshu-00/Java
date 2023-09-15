package Assignment;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int a,b,c,d,e,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of 5 Subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        sum=(a+b+c+d+e);
        double pr =(sum/5);
        if (pr>=81 && pr<=100){
            System.out.println("A "+pr);
        }
        if (pr>=71 && pr<=80){
            System.out.println("B "+pr);
        }
        if (pr>=61 && pr<=70){
            System.out.println("C "+pr);
        }
        if (pr>=40 && pr<=60){
            System.out.println("D "+pr);
        }
        else
         {
            System.out.println("Fail "+pr);
         }
    }
}

