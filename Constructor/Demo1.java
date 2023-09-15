package Constructor;

public class Demo1 {
   private int id;
    private String name;
    public Demo1(){
        id = 0;
        name = "Ananymous";
    }
    public int getId() {return id;}
    public String getName(){return name;}

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println(d.getId());
        System.out.println(d.getName());
    }
}
