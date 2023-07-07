class Test{
    public static void m1(){

            System.out.println(10/5);  //2 
            try{
                System.out.println(10/0);
            }
            catch(Exception e){
                //System.out.println(e.toString());
                e.printStackTrace();
                //System.out.println(10/2);
            }
            System.out.println(10/1);
           
          
    }
    public static void main(String[] args){
            m1();

    }
}