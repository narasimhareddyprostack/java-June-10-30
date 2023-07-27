package functionFIEx;

interface FunctionOne{
	int apply(String name);
}

public class TestThree implements FunctionOne {
		public int apply(String name){
			return name.length();
		}
	public static void main(String[] args) {
		TestThree f = new TestThree();
		System.out.println(f.apply("Rahul"));

	}

}
