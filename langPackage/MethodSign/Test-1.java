class Test{
    void m1(){
        System.out.println("method m1- zero argument");
    }
    void m1(int a){
        System.out.println("method m1- 1 argument - int");
    }
    void m1(int a, int b){
        System.out.println("method m1- Two argument");
    }

    public static void main(String[] args){
       Test t1 =new Test();
       t1.m1();
       t1.m1(10);
       t1.m1(10,20);
    }
}