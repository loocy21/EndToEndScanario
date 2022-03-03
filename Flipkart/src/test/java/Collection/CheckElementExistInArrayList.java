package Collection;

import java.util.ArrayList;

public class CheckElementExistInArrayList {

	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		list.add("shobha");
		list.add("banana");
		list.add("apple");
		list.add("mango");
		
		if(list.contains("apple"))
		{
			System.out.println("apple is found in the list");
		}
		else
		{
			System.out.println("apple is not found in the list");
		}

	}

}
