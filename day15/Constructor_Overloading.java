package day15;

 class stu {
  String name, className;
  int rollNo;
  boolean isFromCity;
  stu(String name, int rollNo){
   this.name= name;
   this.rollNo=rollNo;
  }
  stu(String name, int rollNo, String className, boolean isFromCity){
   this.name= name;
   this.rollNo=rollNo;
   this.className=className;
   this.isFromCity=isFromCity;
  }

  void stuData(){
   System.out.println("Name of Student= "+name+"\n Roll no= "+rollNo+"\n Class Name= "+className+"\nIs Student belongs to city? = "+isFromCity);
  }

  public static void main(String[] args) {
   stu s1= new stu("Ram",1);
   s1.stuData();
   stu s2= new stu("Ravi",2,"MCA",true);
   s2.stuData();
  }
}
