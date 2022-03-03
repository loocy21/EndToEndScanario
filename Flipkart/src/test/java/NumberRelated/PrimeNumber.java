package NumberRelated;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num = 7;
		int temp =0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("This is prime number");
		}
		else
		{
			System.out.println("This is not prime number");
		}

	}

}
