package PankajLogical;

import java.util.Scanner;
// wap to print largest of two  numbers
public class LargestOfTwoNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = sc.nextInt();
		System.out.println("enter the n value");
		int n = sc.nextInt();
		if(n<m)
		{
			System.out.println("smallest number:"+m);
		}
		else if(m<n)
		{
			System.out.println("greatest number:"+n);
		}

	}

	}


