package day14;
//Single Inheritance//
public class Parent {
    void Parent() {
        System.out.println("Hello from Parent!");
    }
}
 class Child extends Parent{
    void Child(){
        System.out.println("Hello from Child!");
    }

     public static void main(String[] args) {
         Child c= new Child();
         c.Parent();
         c.Child();
     }
}
// Multilevel Inheritance
class GP{
    void GP(){
        System.out.println("Hello from GP !");
    }
}
class PR extends GP{
    void PR(){
        System.out.println("Hello from PR !");
    }
}
class CH extends PR{
    void CH(){
        System.out.println("Hello from CH !");
    }

    public static void main(String[] args) {
        CH c= new CH();
        c.GP();
        c.PR();
        c.CH();
    }
}
//Hiearchical Inheritance
class GrandParent{
    void GrandParnt(){
        System.out.println("Hello from GrandParent !");
    }
}
class Parent1 extends GrandParent{
    void Parent1(){
        System.out.println("Hello from Parent1 !");
    }
}
class Parent2 extends GrandParent{
    void Parent2(){
        System.out.println("Hello from Parent2 !");
    }

    public static void main(String[] args) {
        Parent1 p1= new Parent1();
        p1.GrandParnt();
        p1.Parent1();
        Parent2 p2= new Parent2();
        p2.GrandParnt();
        p2.Parent2();
    }
}