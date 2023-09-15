package day14;

public class MethodOverloading {
    void show(String msg, String str){
        System.out.println(msg+" "+str);
    }
    void show(String name){
        System.out.println(" I'm a Student. My name is "+name);
    }
}
class Name{
    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
        m.show("Hey ","Buddy !");
        m.show("Shitanshu");
    }
}