package functionFIEx;

import java.util.function.Function;

//find the given string lenght using Funciton FI
public class TestOne {

	 static Function<String, Integer> f = (name)->{
		                      return name.length();
		                      };	
	public static void main(String[] args) {
	
		System.out.println(f.apply("Rahul"));
	}

}
