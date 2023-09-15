package day9;

public class Array2D1 {
    public static void main(String[] args) {
        //ELEMENT BY ELEMENT INITIALIZATION OF 2D ARRAY//
        String days[][]=new String[2][3];
        days[0][0]="Monday";
        days[0][1]="Tuesday";
        days[0][2]="Wednesday";
        days[1][0]="Thursday";
        days[1][1]="Friday";
        days[1][2]="Saturday";
        System.out.println(days[0][0]+"\t"+days[0][1]+'\t'+days[0][2]+"\t"+days[1][0]+"\t"+days[1][1]+"\t"+days[1][2]);
}
}
