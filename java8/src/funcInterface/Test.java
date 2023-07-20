package funcInterface;

interface TestI{
		public abstract void login();
}
public class Test implements TestI {
	public void login(){
		System.out.println("Login Success");
	}
	public static void main(String[] args) {
		TestI t1=new Test();
		t1.login();

	}

}
