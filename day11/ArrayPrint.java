package day11;
// 1-D ARRAY USING INSTANCE VARIABLE//
public class ArrayPrint {
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void main(String[] args) {
        ArrayPrint d = new ArrayPrint();
        for (int i=0; i<7; i++)
            System.out.println(d.days[i]+"\t");


    }
}
