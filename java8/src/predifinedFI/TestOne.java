package predifinedFI;

import java.util.function.Predicate;

//writea program given number is greaterthan 100 or not?

public class TestOne {
	static Predicate<Integer> p = a-> a>100;
	public static void main(String[] args) {
		System.out.println(p.test(140));

	}

}
