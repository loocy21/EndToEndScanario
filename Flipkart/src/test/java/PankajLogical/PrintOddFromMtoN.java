package PankajLogical;

//Java Program to Print odd Numbers between m to n 
import java.util.Scanner;

public class PrintOddFromMtoN 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		System.out.println("enter the m value");
		m = sc.nextInt();
		System.out.println("enter the n value");
		n = sc.nextInt();
		System.out.println("printing the odd numbers from m to n");
		for(int i=m; i<=n; i++ )	
		{
			if(i % 2!= 0)
			{
				System.out.print(i+" "); 
			}
		}	
	}
}
