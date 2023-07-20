package mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapFour {

	public static void main(String[] args) {
		
		Map<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priya");
		emp.put(104, "Modi");
		emp.put(103, "Priyanka");
		
		System.out.println(emp);
		Set<Entry<Integer,String>>  entries= emp.entrySet();
		System.out.println(entries);
		
		/*
		for(Object entry:entries) {
				System.out.println(entry);
		}
		*/
		for(Entry<Integer,String> entry:entries) {
			System.out.println("Employee Id:"+ entry.getKey()+","+"Emp Name:"+entry.getValue());
		}
		
	}

}
