package Practice;

import java.util.Scanner;

public class Scanario {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the avilable balance:");
		int avilableBalance = sc.nextInt();
		
		System.out.println("Enter the withdrawal money");
		int withdrawal = sc.nextInt();
		
		if(avilableBalance>=withdrawal)
		{
			System.out.println("Aarna is able to withdrawal money");
		}
		else
		{
			System.out.println("Aarna is not able to withdrawal money");
		}

	}
		
	
	
		

}
