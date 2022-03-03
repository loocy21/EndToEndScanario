package NumberRelated;

public class PrintNumberWithoutLoop {
	
	static void test(int a)
	{
		if(a<=100)
		{
			System.out.println(a);
			a++;
			test(a);
		}
	}

	public static void main(String[] args) 
	{
		test(1);

	}

}
