package Exception_Handling;

class Parent{
    Parent(String str){
        System.out.println(str);
    }
}
class Child  extends Parent {
    Child(String str1, String str2) {
        super(str1);
        System.out.println(str2);
    }
}
class ManCls{
    public static void main(String[] args) {
        Child c=new Child("Parent","Child");
    }
}