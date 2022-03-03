package Arrays;

import java.util.Arrays;

public class FindMiniumMaximum {

	public static void main(String[] args) 
	{
		int a[] = {1,4,5,6,33,77};
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);

	}

}
