class Emp{

}
class Test{
    public static void main(String[] args){
     Emp e1= new Emp();
     Emp e2= new Emp();
     System.out.println(e1 == e2); //false
     System.out.println(e1.equals(e2)); //false

    }
}