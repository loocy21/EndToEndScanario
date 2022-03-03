package String;

public class SegregateString {

	public static void main(String[] args) 
	{
		String s = "Shobharaj860@gmail.com";
		String number = "";
		String special = "";
		String alpha = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alpha = alpha + s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				number = number + s.charAt(i);
			}
			else
			{
				special = special + s.charAt(i);
			}
			
		}
		
		System.out.println(alpha);
		System.out.println(number);
	}
	

	
		
	}
	



