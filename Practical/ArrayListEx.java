package Collection;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args)
	{
		ArrayList<String> arraylist =new ArrayList();
		//Adding object in arraylist
		arraylist.add("shaheen");
		arraylist.add("khan");
		arraylist.add("shaa");
		arraylist.add("khan");
		//Traversing list to iterator
		Iterator itr=arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
