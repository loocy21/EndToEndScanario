package String;

public class AddTwoString {

	public static void main(String[] args)
	{
		String s = "shobha raj";
		String str[] = s.split(" ");
		int count = str[1].length();
		if(count>str[1].length())
		{
			count = str[1].length();
		}
		for(int i=0; i<count; i++)
		{
			System.out.println(str[0].charAt(i)+" "+str[1].charAt(i));
		}

	}

}
