interface Test{

    public static void m1(){
        System.out.println("GM");
    }
    public abstract void m2();
    public default  void m3(){}
    public static void main(String[] args){
        m1();
        m3();
    }
}