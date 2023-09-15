package day11;
//2-D ARRAY USING STATIC VARIABLE//
public class ArrayPr2D2 {
     static String days[][] = {
            {"Sunday", "Monday", "Tuesday"},
            {"Wednesday", "Thursday", "Friday"}
    };
    public static void main(String[] args) {
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(ArrayPr2D2.days[r][c] + "\t");
            }
            System.out.println();

        }
    }
}