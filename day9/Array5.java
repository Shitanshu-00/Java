package day9;

import java.util.Scanner;

class Example {
    public static void main(String args[]){
        int a[]= new int[10], i; // Array Declaration
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(i=0; i<10; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("List of even numbers ");
        for(i=0; i<10; i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" ");
            }
        }
    }

}
