package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import PomRepoTC_06.ClockPage;
import PomRepoTC_06.HomePage;
import PomRepoTC_06.ProductPage;

/**
 * TC_06Myntra
 * Description:Script is used for Fusion wear And Add to Cart Product
 * @author Shobha
 */

public class TC_06Myntra extends BaseClass
{
	/**
	 * Description:initialization of HomePage and ClockPage
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test
	public void Myntra() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		ClockPage cp = new ClockPage(driver);
		ProductPage sw = new ProductPage(driver);
		
		
		/* mouseOver and SearchProduct */
		hp.homepage();
		
		/* all Product get text */
		hp.getAllText();
		
		/* Add to Cart and Window handle */
		hp.WindowHandling();
		
		/* select clock switch two windows */
		cp.clockPage();
		
		/*Switch To Window*/
		cp.switchTab();
		
		/* Search Product */
		sw.findProduct();
		
		/*switch window in new tab*/
		sw.WindowHandle();
		
}
}
