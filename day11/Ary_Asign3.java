package day11;
import java.util.Scanner;

public class Ary_Asign3 {
    static String d[][]= new String[2][3];
    String a[][]= new String[2][3];

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Ary_Asign3 ar= new Ary_Asign3();
        String y[][]= new String[2][3];
        for (int r=0; r<2; r++){
            for (int c=0; c<3; c++){
                Ary_Asign3.d[r][c]= ar.a[r][c]=y[r][c]= sc.nextLine();
            }
        }
        for (int r=0; r<2;r++){
            for (int c=0; c<3;c++){
                System.out.print(Ary_Asign3.d[r][c]+"\t");
                System.out.print(ar.a[r][c]+"\t");
                System.out.print(y[r][c]+"\t");
            }
        }
    }

}
