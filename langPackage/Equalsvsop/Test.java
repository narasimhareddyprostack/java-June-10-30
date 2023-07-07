class Emp{}
class User{}
class Test{
    public static void main(String[] args){
            int a =10;
            int b = 20;
            int c = 10;
            //System.out.println(a==c); //true
                   Emp e1=new Emp();
                   Emp e2=new Emp();
                   User u1=new User();
            //System.out.println(e1==e2); //falae
            //System.out.println(e1==u1); //CE rel require
            String s1 = "Rahul";
            String s2=new String("Rahul"); //Two object are going to crate
            String s3=new String("Rahul"); //Two object are going to crate
            System.out.println(s1==s2);  //false
            System.out.println(s1.equals(e1));  //false
            System.out.println(s1.equals(s2));  //true
            System.out.println(s2.equals(s3));  //true
    }
}