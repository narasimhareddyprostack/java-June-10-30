class Parent{
 public void m1(){
	System.out.println("Parent class-m1()");
 }
}
class Child extends Parent{
	public void m2(){
	System.out.println("Child class-m2()");
	}
}
class Test{
	public static void main(String[] args){
		Parent	a=new Parent();
		//a.m1();
		//a.m2();
		Child b=new Child();
		b.m1();
		b.m2();

}
}