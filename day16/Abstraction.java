//Abstraction:- Focusing on essential details without considering background information;
package day16;

 abstract class Car {
  /*String acceleration;
  String clutch;
  String Break;
  String model;*/
  abstract void setModel();
  abstract void setAcceleration();
  abstract void setBreak();
  abstract void setClutchIntensity();
}
class BMW extends Car {
 String acceleration;
 String Break;
 String clutch;
 String model;
 void setModel(){
  model="BMW X7";
 }

 void setAcceleration() {
  acceleration = "Rapid Acceleration";
 }

 void setBreak() {
  Break = "Disc Break";
 }

 void setClutchIntensity() {
  clutch = "High";
 }

 void getAcceleration() {
  System.out.println(acceleration);
 }

 void getBreak() {
  System.out.println(Break);
 }

 void getClutchIntensity() {
  System.out.println(clutch);
 }
 void getModel(){
  System.out.println(model);
 }
}
  class Maruti extends Car{
   String acceleration;
   String Break;
   String clutch;
   String model;
   void setModel(){
    model="Brezza";
   }
   void setAcceleration(){
    acceleration="Stress Acceleration";
   }
   void setBreak(){
    Break="Disc Break";
   }
   void setClutchIntensity(){
    clutch="Low";
   }
   void getModel(){
    System.out.println(model);
   }
   void getAcceleration(){
    System.out.println(acceleration);
   }
   void getBreak(){
    System.out.println(Break);
   }
   void getClutchIntensity(){
    System.out.println(clutch);
   }
  }
 public class Abstraction{
  public static void main(String args[]){
    BMW b=new BMW();
    Maruti m= new Maruti();
    b.setModel();
    b.setAcceleration();
    b.setBreak();
    b.setClutchIntensity();
    b.getModel();
    b.getAcceleration();
    b.getBreak();
    b.getClutchIntensity();

    m.setModel();
    m.setAcceleration();
    m.setBreak();
    m.setClutchIntensity();
    m.getModel();
    m.getAcceleration();
    m.getBreak();
    m.getClutchIntensity();
  }
 }


