package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListFour {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Rahul");
		enames.add("Sonai");
		enames.add("Priyanka");
		enames.add("Modi");
		enames.add("Shaw");
		enames.addFirst("Vignesh");
		enames.addLast("Vijay");
		
		System.out.println(enames);
		Collections.sort(enames);
		System.out.println(enames);
		Collections.sort(enames,Collections.reverseOrder());
		System.out.println(enames);
		
	}
}
