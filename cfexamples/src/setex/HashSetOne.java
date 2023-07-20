package setex;

import java.util.HashSet;
import java.util.Set;

public class HashSetOne {

	public static void main(String[] args) {
		Set hs1=new HashSet(10000, 0.95f);
		HashSet hs2=new HashSet(); //default capacity 16, fill ratio/load factor ie 0.75
		
		HashSet<Integer> hs3=new HashSet<Integer>(100);
		
		System.out.println(hs1);
		System.out.println(hs1);
		System.out.println(hs1);
		

	}

}
