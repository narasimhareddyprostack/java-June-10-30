package predifinedFI;

import java.util.function.Predicate;

//given string length is above 4 or not?

public class TestFour {
	//static Predicate<String > p = name -> name.length() > 4;
	public static void main(String[] args) {
	Predicate<String > p = name -> name.length() > 4;
	System.out.println(p.test("Rahul"));
	}

}
