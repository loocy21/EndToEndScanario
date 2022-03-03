package String;

public class PrintAlternateCapital {
	
	public static void main(String[] args) {
		
		String s = "shobha";
		String str = s.toLowerCase();
		char[]ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i=i+2)
		{
			ch[i]= Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}

}
