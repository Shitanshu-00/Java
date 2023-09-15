package day15;

 class Person {
    //BY CHANGING NUMBER OF PARAMETERS
    Person(String name){
        System.out.println("Name of Person "+name);
    }
    Person(String name, String voterId){
        System.out.println("Name of Person ="+name+"\n Voter Id of "+name+" is "+voterId);
    }

     public static void main(String[] args) {
         // IF USER DOESN'T HAVE VOTER ID THEN JUST PRINT NAME
         Person p1= new Person("Shiva");
         //IF USER HAVE VOTER ID THEN PRINT NAME & VOTER ID
         Person p2= new Person("Ram","248943");
     }
}
