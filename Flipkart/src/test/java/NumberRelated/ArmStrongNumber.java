package NumberRelated;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		int num = 153;
		int temp = num;
		int arm = 0;
		int a;
		while(num>0)
		{
			a = num%10;
			num = num/10;
			arm = arm+a*a*a;
			
		}
		if(temp==arm)
		{
			System.out.println("this is armstrong");
		}
		else
		{
			System.out.println("this is not armstrong number");
		}

	}

}
