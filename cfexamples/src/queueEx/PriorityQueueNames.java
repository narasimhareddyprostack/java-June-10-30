package queueEx;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueNames {

	public static void main(String[] args) {
		PriorityQueue names=new PriorityQueue();
		
		names.add("Rahul");
		names.add("Sonai");
		names.add("Priyanka");
		names.add("Modi");
		names.add("Madhu");
		
		/*
		for(Object name:names) {
				System.out.println(name);
		}
		*/
		Iterator itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
