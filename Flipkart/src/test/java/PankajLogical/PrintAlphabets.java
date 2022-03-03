package PankajLogical;

import java.util.Scanner;
// wap to print alphabets
public class PrintAlphabets {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alphabets are:");
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.println(c+ " ");
		}
	}

}
