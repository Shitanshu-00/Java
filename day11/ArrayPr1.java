package day11;
//1-D ARRAY USING STATIC VARIABLE//
public class ArrayPr1 {
     static String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static void main(String args[]){
        for(int i=0; i<7; i++){
            System.out.print(ArrayPr1.days[i]+"\t");
        }
    }
}
