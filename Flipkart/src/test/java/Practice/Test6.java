package Practice;

import java.util.HashSet;

public class Test6
{
	public static void main(String[] args) {

	

		String s = "Good noon noon";
		String [] str = s.split(" ");
		HashSet<String>set = new HashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word : set)
		{
			
			int count = 0;
			for(int j=0; j<str.length; j++)
			{
				if(str.equals(str[j]))
				{
					count++;
				}
			}
			
		
		if(count>1)
		{
			System.out.println("word=="+count);
		}
		


	}
}
}

