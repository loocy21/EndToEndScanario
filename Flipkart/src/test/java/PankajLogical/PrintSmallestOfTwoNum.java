package PankajLogical;

import java.util.Scanner;
//  program to print smallest of two numbers
public class PrintSmallestOfTwoNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = sc.nextInt();
		System.out.println("enter the n value");
		int n = sc.nextInt();
		if(m<n)
		{
			System.out.println("smallest number:"+m);
		}
		else if(n<m)
		{
			System.out.println("greatest number:"+n);
		}

	}

}
