package setex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetThree {

	public static void main(String[] args) {
	
		HashSet hs1=new HashSet(); 
		
		hs1.add(10);
		hs1.add("Twenty");
		hs1.add(true);
		hs1.add(null);
		hs1.add(null);
		hs1.add(10);
		//iterating using forEach
		/*
		for(Object obj:hs1) {
				System.out.println(obj);
		}
		*/
		Iterator itr=hs1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
