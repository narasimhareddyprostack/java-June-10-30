package setex;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		Set s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		Set s2=new HashSet();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		
		//union onperation - addAll() method
		//s1.addAll(s2);
		//System.out.println(s1);
		
		//subset
		//s1.removeAll(s2);
		//System.out.println(s1);
		
		//intersection
		//s1.retainAll(s2);
		//System.out.println(s1);
		
		s1.containsAll(s2);
		System.out.println(s1.containsAll(s2));
		
	}

}
