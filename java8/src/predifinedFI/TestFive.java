package predifinedFI;

interface CheckLength{
	boolean test(String name);
}
public class TestFive implements CheckLength{

	@Override
	public boolean test(String name) {
		// TODO Auto-generated method stub
		return name.length()>4;
	}
	
	public static void main(String[] args) {
		CheckLength	t1=new TestFive();
		System.out.println(t1.test("Rahul"));
	}

}
