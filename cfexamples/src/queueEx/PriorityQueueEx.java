package queueEx;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		//empty Queue
		System.out.println(pq);
		//add element - tail part
		pq.add("rahul@gmail.com");
		pq.add("sonia@gmail.com");
		pq.add("priyanka@gmail.com");
		pq.add("modi@gmail.com");
		pq.add("100");
		pq.add("200");
		System.out.println(pq);
	}

}
