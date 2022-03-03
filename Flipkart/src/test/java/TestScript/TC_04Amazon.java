package TestScript;


import org.testng.annotations.Test;

import ElementRepoTC_04.HomePage;
import ElementRepoTC_04.LoginPage;
import ElementRepoTC_04.MonitorPage;
import GenricUtilities.BaseClass;
/**
 * TC_04Amazon
 * Description:Enter URL end Search The Product 
 * @author Shobha
 */

public class TC_04Amazon extends BaseClass
{
	@Test
	public void Amazon() throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		MonitorPage mp = new MonitorPage(driver);
		LoginPage lp = new LoginPage(driver);
		
		
		/*Search Product into homepage*/
		hp.homepage();
		hp.ProductList();
		
		/*get text */
		mp.product();
		
		/*Login the application*/
		lp.LoginPage();
		
		
	
	}

}
