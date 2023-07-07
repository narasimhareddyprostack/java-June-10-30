class Parent{
    Parent(String name){
         System.out.println(name);
    }
}
class Child extends Parent{
   Child(String name){
    super(name);
   }
    public static void main(String[] args){
            new Child("Rahul");    

    }
}

