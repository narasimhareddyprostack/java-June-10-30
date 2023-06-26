interface Dao{
                        void getData();
        public abstract void setData();
}
class DaoImpl implements Dao{
   public  void getData(){
    System.out.println("DaoImpl class - method ");
   }
   public void setData(){
     System.out.println("DaoImpl class - set method ");
   }
}

class InterfaceEx{

    public static void main(String[] args){
        DaoImpl obj=new DaoImpl();
        obj.getData();
        obj.setData();
    }
}