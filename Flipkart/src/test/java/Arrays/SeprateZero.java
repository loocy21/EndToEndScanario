package Arrays;

public class SeprateZero {

	public static void main(String[] args) 
	{
		int a [] = {1,0,3,0,1,0,5,0};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
