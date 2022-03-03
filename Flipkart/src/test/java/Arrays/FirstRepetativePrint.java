
package Arrays;

public class FirstRepetativePrint {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,1,4,5,1};
		int temp = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					temp++;
					System.out.println(a[i]);
					break;
					
				}
			}
			if(temp>0)
			{
				break;
			}
		}
		

	}

}
