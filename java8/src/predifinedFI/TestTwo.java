package predifinedFI;

interface TestInterface{
	public abstract boolean test(int a);
}
public class TestTwo {
	public boolean test(int a) {
		if(a>100) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
	TestTwo	t1 = new TestTwo();
	System.out.println(t1.test(40));

	}

}
