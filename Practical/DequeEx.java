package Collection;

import java.util.*;

public class DequeEx 
{

	public static void main(String[] args) 
	{
		Deque<String> dq =new ArrayDeque<String>();
		//add elements
		 dq.add("Ball");
		 dq.addFirst("Appe");
		 dq.addLast("Cat");
		 dq.add("Dog");
		 
		 //printing element
		 System.out.println("Element are:"+dq);
		 
		 //remove & return the head of the deque
		 System.out.println("Element are:"+dq.pop());
		 
		 //remove & return first element of deque
		 System.out.println("first elemnet remove:"+dq.peekFirst());
		 
		 //remove & return the last element of the deque
		 System.out.println("last Element remove :"+dq.pollLast());

	}

}
