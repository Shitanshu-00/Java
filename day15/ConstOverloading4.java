package day15;

class Person3 {
    // BY CHANGING TYPE OF PARAMETER
    Person3(String name, String city){
        System.out.println("Name of Person ="+name+"\nName of the City ="+city);
    }
    Person3(String name, int voterId){
        System.out.println("Name of Person ="+name+"\n Voter ID of "+name+" is "+voterId);
    }

    public static void main(String[] args) {
        Person3 p= new Person3("Ravi","Gorakhpur");
        Person3 p1= new Person3("Ram",152498);
    }
}
