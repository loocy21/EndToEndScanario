package NumberRelated;

public class AddNumbers {

	public static void main(String[] args)
	{
		int num = 1234;
		int sum =0;
		while(num>0)
		{
			int temp= num%10;
			sum = sum + temp;
			num = num/10;
		}
		System.out.println(sum);

	}

}
