package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import PomRepoTC_06.LoginPage;
import PomRepoTC_06.SearchPage;

/**
 * TC_07Myntra
 * Description:Script is used for login and SearchProduct
 * @author Shobha
 *
 */

public class TC_07Myntra extends BaseClass
{
	/**
	 * Description:initialization of login and Search Page
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test
	public void Myntra () throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		SearchPage sp = new SearchPage(driver);
		
		/* login page */
		lp.login();
		
		/* search product */
		lp.SearchProduct();  
		
		/* get gext product */
		lp.getText();
		
		/* search Product and Add To Cart */
		sp.searchPage();
		
		/* Switch To new Tab */
		sp.newTab(driver);
	
	}

}
