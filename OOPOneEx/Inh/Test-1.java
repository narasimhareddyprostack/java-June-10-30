class Parent{
    //super class
    public void m1(){}
    public void m2(){}
}
class Child extends Parent{
    //derived class
    public void m3(){}
}
public class Test{
    public static void main(String[] args){
        Parent p1=new Parent();
        p1.m1();
        p1.m2();
        p1.m3();  //CE
    }
}
