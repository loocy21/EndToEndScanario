package PankajLogical;

import java.util.Scanner;
//program to count number bw m and n which are divided by 5
public class CountNumDivisibleByNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = sc.nextInt();
		System.out.println("enter the n value");
		int n = sc.nextInt();
		System.out.println("printing the numbers between m and n which are divided by 3");
		int count = 0;
		for(int i=m; i<=n; i++ )
		{
			if(i%3 == 0)
			{
				System.out.println("divided numbers are:"+i);
				count++;
			}
		}
		System.out.println("count number which are divided by 3:"+count);

		System.out.println("printing the numbers between m and n which are divided by 7");
		int count1 = 0;
		for(int i=m; i<=n; i++ )
		{
			if(i%7 == 0)
			{
				System.out.println("divided numbers are:"+i);
				count1++;
			}
		}
		System.out.println("count number which are divided by 7:"+count1);



	}
}





