package String;

import java.util.HashSet;

public class OccuranceCharacterInString {

	public static void main(String[] args) 
	{
		String s = "MALYALAM";
		HashSet<Character>set = new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch : set)
		{
			int count = 0;
			for(int j=0; j<s.length(); j++)
			{
				if(ch==s.charAt(j))
				{
				count++;
			}
		}
		System.out.println(ch+"==>"+count);

	}

}
}
