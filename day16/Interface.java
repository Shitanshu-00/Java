package day16;

/* Interface is just like Class;
* Every  method in interface - by default  public, abstract;
* Every DM of interface is - by default public, static,final;
* Interface can't be instantiated;
* Interface is inherited with implements keyword.
*/

interface MyInterface {
    String str="Hello From MyInterface";
    void showMyInterface();
}
class MyClass implements MyInterface{
    public void showMyInterface(){
        System.out.println(str);
    }
}
class MainClass{
    public static void main(String args[]){
        MyClass my=new MyClass();
        my.showMyInterface();
    }
}

/*
* An Interface can inherit multiple interfaces.
*  Ex:- interface I implements I1,I2
* An interface can't inherit any class.
*   Ex:- interface I extends C1;[Error]
* A class can inherit only one class but one or more than one interfaces.
*   Ex:- class C1 extends C2 implements I1,I2...
* A class must inherit parent-class first, and then interfaces
*   Ex:- class C1 extends C2 implements I1[Correct]
*   Ex:- class C1 implements I1 extends C2[Incorrect]
 */

interface I1{

}
interface I2{

}
interface I extends I1,I2 {

}