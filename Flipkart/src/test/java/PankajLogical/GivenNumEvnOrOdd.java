package PankajLogical;

import java.util.Scanner;

public class GivenNumEvnOrOdd {
//wap to check weather given number is even or odd
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	if(num%2==0)
	
	
	{
		System.out.println("This is even number");
	}
	else
	{
		System.out.println("This is odd number");
	}

	}

}
