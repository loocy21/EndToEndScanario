package Collection;

import java.util.HashMap;

public class HashMapEmptyOrNot {

	public static void main(String[] args) 
	{
		HashMap<Integer , String>map = new HashMap<Integer,String>();
		
		System.out.println(map.isEmpty());
		
		map.put(1,"String" );
		map.put(1, "Stris");
		
		for(Integer st : map.keySet())
		
			System.out.println(st);
		for(String st1 : map.values())
			
			System.out.println(st1);
		
		
		
		
	//	System.out.println(map.isEmpty());
	

	}

}
