package day14;

public class ThisPointer {
    void showOne(){
        System.out.println("Hello from showOne");
        this.showTwo();
    }
    void showTwo(){
        System.out.println("Hello from showTwo");
    }
}
class MainClass{
    public static void main(String[] args) {
        ThisPointer t= new ThisPointer();
        t.showOne();
    }
}