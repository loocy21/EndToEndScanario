package String;

public class ReverseString3 {

	public static void main(String[] args)
	{
		String s = "shobha raj";
		
		int count = 0;
		char[]ch = s.toCharArray();
		for(char c : ch)
		{
			count++;
		}
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}

	}

}
