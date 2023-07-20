package queueEx;

import java.util.PriorityQueue;

public class PriorityQueueTwo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("E");
		System.out.println(pq);
		
		//remove operation
		pq.remove();
		System.out.println(pq);
		System.out.println(pq.element());
		
		
	}

}
