package String;

public class FetchDuplicateWord {

	public static void main(String[] args)
	{
		String s = "good noon mam";
		char[] ch= s.toCharArray();
		
		
		for (int i = 0; i< s.length(); i++) 
		{
		   for (int j = i+1; j<s.length(); j++) 
		   {
		      if (ch[i]==ch[j])
		      {
		         System.out.print(ch[j]+" ");
		         break;
		      }
		   }
		}

	}

}
