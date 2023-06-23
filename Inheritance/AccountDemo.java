class Account{
    int acc_Amount;
    public void open_Acc(){}
    void deposit_Amount(int amount){
        this.acc_Amount = this.acc_Amount + amount;
    }
    public int get_Bal(){
        return this.acc_Amount;
    }
}
public class AccountDemo{

    public static void main(String[] args){
                Account a1=new Account(); //Rahul
                a1.open_Acc();
                a1.deposit_Amount(50000);
                a1.deposit_Amount(10);
                int bal =a1.get_Bal();
                System.out.println(bal);

                Account a2=new Account(); //Priya

                a2.open_Acc();
                a2.deposit_Amount(20000);
                a2.deposit_Amount(2);
                
                System.out.println(a2.get_Bal());

    }


}