package Arrays;

public class DecendingOrder {

	public static void main(String[] args)
	{
		int a[] = {1,4,3,5,5,7,2,5};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
