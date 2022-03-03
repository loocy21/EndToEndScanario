package TestScript;


import org.testng.annotations.Test;

import ElementRepositoryTC_03.HomePage;
import ElementRepositoryTC_03.LoginPage;
import GenricUtilities.BaseClass;
/**
 * TC_03Flipkat
 * Description:Login The Application and validate the homepage
 * @author Shobha
 
 */

public class TC_03Flipkat extends BaseClass
{
	@Test
	public void Flipkart() throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		/*Login To the application*/
		String USERNAME= jsonLib.readDataFromJSon("username");
		String PASSWORD= jsonLib.readDataFromJSon("Password");
		lp.LoginPage1(USERNAME, PASSWORD);
		
		/*Landing to my profile page*/
		HomePage hp = new HomePage(driver);
		hp.Myaccount(driver);
		
		
	
	}

}
