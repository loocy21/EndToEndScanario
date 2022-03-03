package TestScript;

import org.testng.annotations.Test;


import GenricUtilities.BaseClass;
import Pom_Page_pokerBaazi.Login_Page;

public class TC_32Pokerbaazi extends BaseClass
{
	@Test
	public void Pokerbaazi (String username) throws Throwable
	{
		Login_Page lp = new Login_Page(driver);
		{
		lp.username(username, username);
		
			
		}
	}

}
