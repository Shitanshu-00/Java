package Exception_Handling;

public class Try {
    public static void main(String[] args) {
        int c=0;
        try {
            c=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Division Error :"+e.getMessage());
        }
        System.out.println(c);
        }
    }

class Try2{
    public static void main(String[] args) {
        int c=0, a=10, b[]={2,0,5};
        try{
            c=a/b[0];
            String str=null;
            int i= str.charAt(0);
        }
        catch(ArithmeticException e){
            System.out.println("Division Error :"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error :"+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unknown Error :"+e.getMessage());
        }
        System.out.println(c);
    }
}