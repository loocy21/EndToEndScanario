package String;

public class FirstLetterCapital {

	public static void main(String[] args) 
	{
		String s = "shobha";
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++)
		{
			char ch[] = s.toCharArray();
			String FirstLetter = String.valueOf(ch[0]).toUpperCase();
			
			for(int j=1; j<ch.length; j++)
			{
				FirstLetter = FirstLetter+ s.charAt(j);
			}
			System.out.println(FirstLetter);
		}

	}

}
