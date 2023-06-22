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
        Parent c2 =new Child();
        //due to inheritance, Parent Class can hold child Object
        c2.m1();
        c2.m2();
        c2.m3(); // CE
    }
}
