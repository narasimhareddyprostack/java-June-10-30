class Test{
    public static void main(String[] args){
          
          try{
                int a =Integer.parseInt("Ten");
                System.out.println(a);
          }
          catch(NumberFormatException e){
                System.out.println(e);
                int a =Integer.parseInt("10");
                System.out.println(a);
          }
         
         

    }
}