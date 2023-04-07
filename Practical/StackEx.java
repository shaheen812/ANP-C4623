package Collection;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> stc =new Stack();
		//Push object in stack
		stc.push("shaheen");
		stc.push("khan");
		stc.push("khan");
		stc.push("sha");
		stc.pop();
		//Traversing list to iterator
		Iterator itr=stc.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
