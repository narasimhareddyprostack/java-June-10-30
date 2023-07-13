package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Rahul");
		enames.add("Sonai");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Shaw");
		
		System.out.println(enames);
		enames.addFirst("Vignesh");
		enames.addLast("Vijay");
		System.out.println(enames);
		
		
		
	}
}
