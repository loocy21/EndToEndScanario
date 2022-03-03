package NumberRelated;

public class PrintReverseNumberWithoutLoop 
{
	static void test(int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			a--;
			test(a);
		}
	}

	public static void main(String[] args)
	{
		test(100);

	}

}
