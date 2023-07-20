package mapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapTwo {

	public static void main(String[] args) {
		
		Map<Integer,String> emp=new HashMap<Integer,String>();
		emp.put(101, "Rahul");
		emp.put(102, "Sonia");
		emp.put(103, "Priya");
		emp.put(104, "Modi");
		emp.put(103, "Priyanka");
		emp.put(null, null);
		emp.putIfAbsent(103, "Vignesh");
		System.out.println(emp);
	}

}
