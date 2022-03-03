package PankajLogical;
//java program for count even and odd number from m to n

import java.util.Scanner;

public class CountEvenOddFromMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the m value");
		int m = sc.nextInt();
		System.out.println("enter the n value");
		int n = sc.nextInt();
		System.out.println("printing the even numbers from m to n");
		int count = 0;
		for(int i=m; i<=n+1; i++)	
		{
			if (i % 2 == 0)
			{
				System.out.println("even number present:"+i);
				count++;
			}


		}
		System.out.println("Number of even digits:"+count);


		System.out.println("printing the odd numbers from m to n");
		int count1 = 0;
		for(int i=m; i<=n+1; i++)	
		{
			if (i % 2!= 0)
			{
				System.out.println("odd number present:"+i);
				count1++;
			}


		}
		System.out.println("Number of odd digits:"+count1);


	}
}

















