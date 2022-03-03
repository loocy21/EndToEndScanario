package Practice;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int temp = num;
		int rev=0,rem;
		while(temp!=0)
		{
		rem = temp%10;
		rev = rev*10+rem;
		temp=temp/10;
		}

		if(num==rev)
		{
			System.out.println("--");
			
		}
		else
		{
			System.out.println("---");
		}

	}

}
