package Practice;

public class test1 
{
	public static void main(String[] args)
{
		int a[] = {1,3,5,2,3};
		int temp = 0;
		 for(int i=0; i<a.length; i++)
		 {
			 for(int j=i; j<a.length; j++)
			 {
				 if(a[i]==a[j]&& i!=j)
				 {
					 temp = temp +1;
					 System.out.println(a[i]);
					 break;
				 }
			 }
			 if(temp>0)
			 {
				 break;
			 }
		 }
	}

}
