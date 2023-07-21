package predifinedFI;

import java.util.function.Predicate;

@FunctionalInterface
interface PredicateOne{
	boolean test(String name);
}
public class TestSix implements PredicateOne{

	@Override
	public boolean test(String name) {
		return name.length()>4;
	}
	public static void main(String[] args) {
		//PredicateOne	t1= new TestSix();
		PredicateOne	t1= name-> name.length()>4;
		//Predicate<String> t1 = name-> name.length()>4;
		System.out.println(t1.test("Rahul"));
	}


}
