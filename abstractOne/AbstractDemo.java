abstract class Dao{
   public abstract void getData();
   public void getEmployeeInfo(){
    System.out.println("Abstract Class - concrete method");
   }
}
class DaoImpl extends Dao{
   public void getData(){
    System.out.println("Inside Impl Class - getData() method");
    }
}
class AbstractDemo{
    public static void main(String[] args){
        //new Dao(); we cant create object for abstrac class
       DaoImpl a=new DaoImpl();
        a.getData();
        a.getEmployeeInfo
    }
}