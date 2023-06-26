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
        Child p2 =new Parent();
        //child Ref - can nt hold parent Object
       
    }
}
