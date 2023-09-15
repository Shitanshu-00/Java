package day15;

 class Person2{
    //By changing order of Parameters
    Person2(String name, int PAN){
        System.out.println("Name of Person ="+name+"\nPAN Card details ="+PAN);
    }
    Person2(int VoterId, String name){
        System.out.println("Name of Person ="+name+"\nVoter ID of "+name+" is "+VoterId);
    }

     public static void main(String[] args) {
         Person2 p= new Person2("Ravi",15879);
         Person2 p1= new Person2(123654,"Ram");
     }
}
