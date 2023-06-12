class Demo{
    int a = 100;
    public void m1(){
        int b = 200;
        System.out.println(b);
    }
    public static void main(String[] args){
        Demo d =new Demo();
        d.m1();
        System.out.println(d.a);
        System.out.println(b);
    }
}