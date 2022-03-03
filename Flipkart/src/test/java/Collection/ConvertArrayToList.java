package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

	public static void main(String[] args) 
	{
		String [] arr = {"shobha","raj","puchi"};
		
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(arr));
		for(String st : names)
		{
			System.out.println(st);
		}
		

	}

}
