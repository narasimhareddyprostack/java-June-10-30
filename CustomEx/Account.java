class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }
}
class Account{
    public void withdrawl(int amount)  {
        try{
            if(amount > 200000){
             
            //generate custom exception object simply throw
            throw new InsuffientFundsException("Can't Withdraal");
            }
            else{
            System.out.println("Enjoy with Money!");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finaly blockExecuting Always");
        }
       
    }
    public static void main(String[] args) {
        Account a1=new Account();
        try{
            a1.withdrawl(300000);
        }
        catch(Exception e){

        }
      
    }
}