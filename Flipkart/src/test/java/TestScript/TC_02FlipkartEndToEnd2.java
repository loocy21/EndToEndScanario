package TestScript;


import org.testng.annotations.Test;


import ElementRepoTC_02.java.HomePage;
import ElementRepoTC_02.java.ProductLandingPage;
import GenricUtilities.BaseClass;
/**
 * TC_02FlipkartEndToEnd2
 * Description:Search Product and validate the ProductLandingPage
 * @author Shobha
 *
 */
public class TC_02FlipkartEndToEnd2 extends BaseClass
{
	@Test
	public void Flipkart2() throws Throwable 
	{
		
		HomePage hp = new HomePage(driver);
		/*Search Product By HomePage*/
		hp.HomePage();
		
		ProductLandingPage lp = new ProductLandingPage(driver);
		
		/*Search First Product and AddToCart*/
		
		String USERNAME= jsonLib.readDataFromJSon("username");
		String PASSWORD= jsonLib.readDataFromJSon("Password");
		lp.ProductPage(driver, USERNAME, PASSWORD);
	
		
		
		
	}
		
		
		
		
	
		
		

}
	
