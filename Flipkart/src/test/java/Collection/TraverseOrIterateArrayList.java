package Collection;

import java.util.ArrayList;

public class TraverseOrIterateArrayList {

	public static void main(String[] args)
	{
	ArrayList<Integer>list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	for(Integer in : list)
	{
		System.out.println(in);
	}

	}

}
