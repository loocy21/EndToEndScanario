package Arrays;

public class DeleteElementBwArray {

	public static void main(String[] args) 
	{
		int a[] = {1,3,4,6,2};
		int del_ele = 4;
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			if(del_ele ==0)
			{
		
			for(int j=i; j<a.length-1; j++)
			{
				a[j] = a[j+1];
			}
			count = count +1;
			break;
		}

	}

	for(int i=0; i<a.length-1; i++)
	{
		System.out.println(a[i]+" ");
	}

}
}
