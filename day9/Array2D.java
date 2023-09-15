package day9;

public class Array2D {
    public static void main(String[] args) {
        //ELEMENT BY ELEMENT INITIALIZATION OF 2D ARRAY//
        String days[][]=new String[2][3];
        days[0][0]="Monday";
        days[0][1]="Tuesday";
        days[0][2]="Wednesday";
        days[1][0]="Thursday";
        days[1][1]="Friday";
        days[1][2]="Saturday";
        for(int r=0; r<=1; r++){
            for(int c=0; c<=2; c++){
                System.out.print(days[r][c]+"\t");
            }
            System.out.println();
        }

    }
}
