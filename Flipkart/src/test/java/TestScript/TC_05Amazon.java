package TestScript;

import org.testng.annotations.Test;

import ElementReopTC_05.HomePage;
import ElementReopTC_05.ProductPage;
import GenricUtilities.BaseClass;
/**
 * TC_05Amazon
 * Description:Search Product and Validate the Particular Page
 * @author Shobha
 */

public class TC_05Amazon extends BaseClass
{
	@Test
	public void Amazon () throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		ProductPage pg = new ProductPage(driver);
		
		/*Search Product and get all text*/
		hp.homepage();
		hp.click();
		
		
		/*click and validate */
		pg.Validate();
		

	}

}
