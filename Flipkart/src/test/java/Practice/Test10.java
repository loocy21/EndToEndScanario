package Practice;

public class Test10 {

	public static void main(String[] args) {
		Long num = 9560295476L;
		int large_digit = 0;
		while(num>0)
		{
			long mod  = num%10;
			if(large_digit<mod)
			{
				large_digit = (int) mod;
			}
			
			num = num/10;
		}
System.out.println("largest digit:"+large_digit);
	}

}

