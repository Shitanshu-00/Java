package day9;

import java.util.Scanner;

class Chr{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.next().charAt(0);
        System.out.println("Character is\t"+ch);
    }
}
