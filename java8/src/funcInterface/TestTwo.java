package funcInterface;

@FunctionalInterface
interface TestInterface{
	public abstract void login();
}

public class TestTwo {

	public static void main(String[] args) {
	TestInterface	i=()->{
		              System.out.println("Login Success");
		              };
     i.login();

	}

}
