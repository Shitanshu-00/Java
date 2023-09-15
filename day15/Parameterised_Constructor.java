package day15;

class Student {
    String name, className;
    int rollNo;
    boolean isFromCity;
    Student(String name, int rollNo, String className,boolean isFromCity){
        this.name=name;
        this.rollNo= rollNo;
        this.className= className;
        this.isFromCity= isFromCity;
    }
    public void  StudentData(){
        System.out.println("Name of Student= "+name+"\n Roll no= "+rollNo+"\n Class Name= "+className+"\nIs Student belongs to city? = "+isFromCity);
    }

    public static void main(String[] args) {
        //CREATING OBJECT & PROVIDING SOME VALUES BY USING PARAMETERISED CONSTRUCTOR
        Student s1= new Student("Ravi", 1, "MCA", false);
        s1.StudentData();
        System.out.println("*********************^^^^^^^^^^^^^^^********************");
        Student s2=new Student("Ram",2,"MCA", true);
        s2.StudentData();
    }
}
