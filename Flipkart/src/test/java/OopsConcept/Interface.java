package OopsConcept;

interface  ATMScreen
{
	void BalanceInquiry();
	void miniStatement();
	void changePin();
	
}
class Software implements ATMScreen
{
	
	public void BalanceInquiry()
	{
		System.out.println("we can do balance inquiry");
	}
	public void miniStatement()
	{
		System.out.println("we can check miniStatement");
	}
	public void changePin()
	{
		System.out.println("also change the pin");
	}
}

public class Interface {

	public static void main(String[] args) 
	{
		Software sw = new Software();
		sw.BalanceInquiry();
		sw.miniStatement();
		sw.changePin();
		

	}

}
