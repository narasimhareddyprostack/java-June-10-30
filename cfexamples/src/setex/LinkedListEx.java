package setex;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListEx {

	public static void main(String[] args) {
		Set<String> enames=new LinkedHashSet<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Amith Shaw");
		
		System.out.println(enames);
		
		for(String ename:enames) {
			System.out.println(ename);
		}
		
		
	}

}
