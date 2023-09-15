package day12;
import java.io.PrintStream;
import java.util.Scanner;

public class Ternary_Op {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age= sc.nextInt();
        String str= (age<=18)?((age<5)?("Playway"):("Minor")):((age>=50)?("Old"):("Adult"));
        System.out.println(str);
        }

    }


