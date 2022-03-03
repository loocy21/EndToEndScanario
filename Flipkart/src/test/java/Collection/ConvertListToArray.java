
package Collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) 
	{
		List<Integer>li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		Integer[] array = new Integer[li.size()];
		li.toArray(array);
		
		for(Integer in : array)
		{
			System.out.println(in);
		}

	}

}
