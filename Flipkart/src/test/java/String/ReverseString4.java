package String;

public class ReverseString4 {

	public static void main(String[] args) 
	{
		String s = "one two three four";
		String str[] = s.split(" ");
		
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}
	}

}
