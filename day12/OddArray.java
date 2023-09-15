package day12;
import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String days[][]= new String[2][];
        days[0]= new String[3];
        days[1]= new String[4];
        System.out.println("Enter WeekDays ");
        for (int r=0; r<days.length; r++){
            for (int c=0; c<days[r].length; c++){
                days[r][c]= sc.nextLine();
            }
        }
        for (int r=0; r< days.length; r++){
            for (int c=0; c< days[r].length; c++){
                System.out.print(days[r][c]+"\t");
            } System.out.println();
        }

    }
}
