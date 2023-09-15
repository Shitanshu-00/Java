package day9;

class array {
    int num[]= new int[4];
    void SetData(){
        num[0]=65;
        num[1]=70;
        num[2]=60;
        num[3]=75;
    }
    void OutData(){
        System.out.println("Marks of 4 subjects:- "+num[0]+"\t"+num[1]+"\t"+num[2]+"\t"+num[3]);
    }
    public static void main(String args[]){
        array ar= new array();
        ar.SetData();
        ar.OutData();
    }
}
