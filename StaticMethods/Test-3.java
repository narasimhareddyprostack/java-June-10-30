interface TestI{
    public static void m1(){
        System.out.println("TestI - interface static method");
    }
    public static void main(String[] args){
        System.out.println("TestI - interaface main method");   
    }
}
class Test implements TestI{
    public static void main(String[] args){
       TestI  i = new Test();
       TestI.m1();
    }
}