package arrayListExOne;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList(); //heterogenous data object
		System.out.println(al1.toString());//[]
		al1.add(10);
		al1.add("Rahul");
		al1.add(450000.00);
		System.out.println(al1);
		
		//create AL allowed only integer values/object
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(101);
		al2.add(102);
		al2.add(103);
		al2.add(104);
		//al2.add("ten");
		
		//addAll() method
		al1.addAll(al2);
		System.out.println(al1);
		
		//methods
		System.out.println(al1.size());
		System.out.println(al1.isEmpty());
		System.out.println(al1.contains("Rahul"));
		
	}

}
