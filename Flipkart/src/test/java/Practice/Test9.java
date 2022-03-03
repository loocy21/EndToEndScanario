package Practice;

public class Test9 {

	public static void main(String[] args) {
		int a[] = {1,4,5,3,4,2,4};
		int temp =0; 
		int item = 3;

		for(int i=0; i<a.length; i++)
		{
			if(a[i]==item)
			{
				System.out.println("element is present in" +i+ "position");
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("element is not found in list");
		}
	}

}

