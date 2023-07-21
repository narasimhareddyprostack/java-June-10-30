package predifinedFI;

interface TestI{
	public abstract boolean test(int a);
}
public class TestThree {
	//TestI i =(int a)->{ return a>100; };
	
	public static void main(String[] args) {
	TestI i = a-> a>100; ;
	System.out.println(i.test(105));
	}
	
}
