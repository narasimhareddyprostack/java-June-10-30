 class Emp{
        
    }
class Test{
    void m1(String name){
        System.out.println("String Version");
    }
    void m1(StringBuffer name){
        System.out.println("String Buffer Version");
    }
    void m1(Object obj){
        System.out.println("Object Version");
    }
    public static void main(int[] args){}
    public static void main(float[] args){}
    public static void main(Object[] args){
       Test t1 =new Test();
       t1.m1("Rahul");
       t1.m1(new StringBuffer("Rahul"));
       t1.m1(10.000);
       t1.m1(new Emp());
    }
}