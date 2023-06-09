class Emp{
    int a=100;
    static int b=200;
}
class Test{
    public static void main(String[] args){
        Emp e1 =new Emp();
        Emp e2 =new Emp();


        System.out.println(e1.a);
        e2.a = 777;
        System.out.println(e2.a);
    }
}