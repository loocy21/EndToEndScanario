package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterate {

	public static void main(String[] args) 
	{
		HashSet<String>set = new HashSet<String>(); 
		set.add("apple");
		set.add("mango");
		set.add("pear");
		set.add("banana");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
