package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListThree {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("Rahul");
		l1.add("Rahul");
		System.out.println(l1);
		
		for(Object value:l1) {
			System.out.println(value);
		}
	}
}
