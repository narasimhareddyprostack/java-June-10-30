package functionFIEx;

import java.util.function.Function;

public class TestFour {
	//static Function<Integer, Integer>f = a -> a*a;
	public static void main(String[] args) {
		Function<Integer, Integer>f = a -> a*a;
		System.out.println(f.apply(10));

	}

}
