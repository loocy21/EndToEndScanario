package String;

public class VowelOccurance {

	public static void main(String[] args) {
		String s = "educaation";
		String vowel = "aeiou";
		for(int i=0; i<vowel.length(); i++)
		{
			int count = 0;
			for(int j=0; j<s.length(); j++)
			{
				if(vowel.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(vowel.charAt(i)+" "+count);
			}
		}

	}

}
