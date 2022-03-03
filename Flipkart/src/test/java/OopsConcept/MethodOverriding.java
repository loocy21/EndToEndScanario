package OopsConcept;

class GmailOldVersion
{
	void ComposeMsg()
	{
		System.out.println("full Screen implementation");
	}
	
}
class GmailNewVersion extends GmailOldVersion
{
	void ComposeMsg()
	{
		System.out.println("pop-up implementation");
	}
}

public class MethodOverriding {

	public static void main(String[] args) 
	{
		GmailOldVersion gm = new GmailOldVersion();
		gm.ComposeMsg();
		
		GmailNewVersion gm1 = new GmailNewVersion();
		gm1.ComposeMsg();

	}

}
