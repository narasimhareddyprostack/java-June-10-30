class Account{
    int acc_Id;
    String acc_Name;
    
    Account(int id, String name){
        this.acc_Id = id;
        this.acc_Name = name;
        System.out.println("Id:"+ this.acc_Id + ":Name :"+ this.acc_Name);
    }
    void open_Account(){
        System.out.println("Account Opened Successfully By:"+ this.acc_Name);
    }
    public static void main(String[] args){

       Account a1=new Account(101, "Rahul");
       a1.open_Account();
       Account a2=new Account(102, "Sonia");
       a2.open_Account();
       Account a3=new Account(103, "Vignesh");
       a3.open_Account(); 
    }
}