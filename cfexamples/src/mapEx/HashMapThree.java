package mapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapThree {

	public static void main(String[] args) {
		
		Map<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priya");
		emp.put(104, "Modi");
		emp.put(103, "Priyanka");
		Set<Integer> keys = emp.keySet();
		
		Collection<String> values = emp.values();
		
		//System.out.println(keys);
		//System.out.println(values);
		
		for(Integer key:keys) {
			System.out.println(key);
		}
		
		for(Object value:values) {
			System.out.println(value);
		}
		
	}

}
