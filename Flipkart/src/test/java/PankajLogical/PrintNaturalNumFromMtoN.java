package PankajLogical;

import java.util.Scanner;

public class PrintNaturalNumFromMtoN 
{
//wap to print natural number from m to n
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		System.out.println("enter the m value");
		m = sc.nextInt();
		System.out.println("enter the n value");
		n = sc.nextInt();
		
		
		System.out.println("printing natural numbers from m to n");
		for(int i=m; i<=n; i++ )
		{

			System.out.print(i+"\t"); 
		}
	}

}


