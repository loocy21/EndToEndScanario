package String;

public class ReverseStringWithoutSplit {

	public static void main(String[] args) 
	{
		String str ="one two three four";
		String s = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i)!=' ')
			{
			s=str.charAt(i)+s;
			}
			else
			{
				System.out.print(s+" ");
				s=" ";
			}
			
		}
		System.out.print(s);

	}

}
