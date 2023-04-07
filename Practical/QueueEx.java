package Collection;
import java.util.*;
public class QueueEx 
{

	public static void main(String[] args) 
	{
		//Create an object of queue interface
		Queue<Integer> q = new LinkedList<>();
		//add elements
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		//Display the element of the queue
		System.out.println("Element of queue:" +q);
		//To remove the head of queue
		int r=q.remove();
		System.out.println("Remove element is:" +r);
		System.out.println("element of queue:" +q);//After removal
		
		//To view the head element of queue
		int h=q.peek();
		System.out.println("head of queue:" +h);
		
		//size of queue
		int s=q.size();
		System.out.println("size of queue:" +s);

	}

}
