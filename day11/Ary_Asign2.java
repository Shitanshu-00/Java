package day11;
import java.util.Scanner;

public class Ary_Asign2 {
    static String d[][]= {{"mon","tue","wed",
                            "thu","fri","sat"}};
    String a[][]={{"mon","tue","wed",
                   "thu","fri","sat"}};

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String y[][]= new String[2][3];
        System.out.println("Enter Weekdays\n");
        for (int r=0; r<2; r++){
            for (int c=0; c<3; c++){
                y[r][c]= sc.nextLine();
            }
        }
        System.out.println("Weekdays are\n");
         for (int r=0; r<2; r++){
            for (int c=0; c<3; c++){
                System.out.print(y[r][c]+"\t\t");
            }
        }
    }
}
