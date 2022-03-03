package Collection;

import java.util.HashSet;

public class TraverseOrIterateHashSet {

	public static void main(String[] args) 
	{
		HashSet<Integer>set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		for(Integer in : set)
		{
			System.out.println(in);
		}

	}

}
