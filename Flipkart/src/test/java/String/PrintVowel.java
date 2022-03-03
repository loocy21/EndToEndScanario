package String;

public class PrintVowel {

	public static void main(String[] args) 
	{
		String s = "shobha";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' )
			{
				System.out.println(s.charAt(i));
			}
		}
		

	}

}
