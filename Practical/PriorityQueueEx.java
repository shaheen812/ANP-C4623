package Collection;

import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		//add elements
		pq.add(11);
		pq.add(20);
		pq.add(22);
		pq.add(12);
		
		//printing the  element
		System.out.println("Top element is:" +pq);
		
		//printing the top element
		System.out.println("Top element is:" +pq.peek());
		
		//removing the top element
		System.out.println("Top element is:" +pq.poll());
		
		System.out.println("Totat element is:" +pq);
	}

}
