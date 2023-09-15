package day11;
// 2-D ARRAY USING INSTANCE VARIABLE//

public class ArrayPr2D {
    String days[][] = {
            {"Sunday", "Monday", "Tuesday"},
            {"Wednesday", "Thursday", "Friday"}
    };


        public static void main(String[] args) {
            ArrayPr2D d = new ArrayPr2D();
                for (int r=0; r<2; r++){
                    for (int c=0; c<3; c++) {
                        System.out.print(d.days[r][c] + "\t");
                    }
                    System.out.println("\n");
                }



        }
    }


