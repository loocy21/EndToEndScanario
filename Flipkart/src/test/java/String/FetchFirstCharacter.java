 package String;

public class FetchFirstCharacter {

	public static void main(String[] args) 
	{
		String s = "Good";
		char a[] = s.toCharArray();
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!= ' ')
			{
				if(i==0)
				{
					System.out.print(a[i]);
				}
				else if(a[i-1]== ' ')
				{
					System.out.print(a[i]);
				}
			}
		}
	

	}

}
