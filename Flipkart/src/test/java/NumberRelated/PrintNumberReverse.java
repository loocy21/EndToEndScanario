
package NumberRelated;

public class PrintNumberReverse 
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
