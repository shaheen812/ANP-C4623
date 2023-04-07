package Collection;

import java.util.*;

public class HashSetEx 
{

	public static void main(String[] args)
	{
		Set<String> hs =new HashSet<String>();
		//add elements
		hs.add("B");
		hs.add("A");
		hs.add("C");
		hs.add("E");
		//printing the elements
		System.out.println("Elements are:" +hs);
		 
		String c="D";
		
		//check whether the String is available or not
		System.out.println("Contains element:"+c+" " + hs.contains(c));//contains method check boolean value
	}

}
