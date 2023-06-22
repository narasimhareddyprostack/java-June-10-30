class Account{
    private double min_Bal;
    //generate or create setter and getter
    public double get_Min_Bal(){
        return this.min_Bal;
    }
    public void set_Min_Bal(double bal){
        this.min_Bal = bal;
    }
}

public class Test{
    public static void main(String[] args){
       Account  a1 = new Account();
       Account  a2=new Account();

       a1.set_Min_Bal(10000.00);
       System.out.println(a1.get_Min_Bal());
    }
}