package OopsConcept;

class CoreJava
{
	void KnowlwdgeOfCoreJava()
	{
		System.out.println("core java");
	}
}
class AdvanceJava extends CoreJava
{
	void KnowlwdgeOfAdvanceJava()
	{
		System.out.println("j2ee");
	}
}
class Frameworks extends AdvanceJava
{
	
	void KnowlwdgeOfFramework()
	{
		System.out.println("hibernate and Strings");
	}
}
class Company
{
	void requirement(CoreJava c1)
	{
		c1.KnowlwdgeOfCoreJava();
	}
	void requirement2(AdvanceJava c2)
	{
		c2.KnowlwdgeOfCoreJava();
		c2.KnowlwdgeOfAdvanceJava();
	}
	void requirement3(Frameworks c3)
	{
		c3.KnowlwdgeOfCoreJava();
		c3.KnowlwdgeOfAdvanceJava();
		c3.KnowlwdgeOfFramework();
	}
}

public class UpCasting {

	public static void main(String[] args)
	{
		Company ref = new Company();
		ref.requirement(new CoreJava());
		ref.requirement(new AdvanceJava());
		ref.requirement(new Frameworks());
		
		//ref.requirement2(new CoreJava());
		ref.requirement2(new AdvanceJava());
		ref.requirement2(new Frameworks());
		
		//ref.requirement3(new CoreJava());
		//ref.requirement3(new AdvanceJava());
		ref.requirement3(new Frameworks());
		
	}
}
