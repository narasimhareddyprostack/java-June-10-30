package queueEx;

import java.util.PriorityQueue;

public class PriorityQueueThree {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(10);
		System.out.println(pq.offer("20"));
	}

}
