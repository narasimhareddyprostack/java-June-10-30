package functionFIEx;

public class TestTwo {
		public int apply(String name){
			return name.length();
		}
	public static void main(String[] args) {
		TestTwo f = new TestTwo();
		System.out.println(f.apply("Rahul"));

	}

}
