package PankajLogical;

import java.util.Scanner;

public class PrintOddBetweenMtoN {
// wap to print odd number from m and n
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		System.out.println("enter the m value");
		m = sc.nextInt();
		System.out.println("enter the n value");
		n = sc.nextInt();
		System.out.println("printing the odd numbers between m and n");
		for(int i=m+1; i<=n-1; i++ )
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
		
		

	}

}
