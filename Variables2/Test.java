class Test{
    int a = 100;
    int b = 200;
    static int c = 300;

    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        
        System.out.println(Test.c); 
        t2.c = 3;
        System.out.println(c); 
        System.out.println(t1.c); 
        System.out.println(t2.c); 
    }
}