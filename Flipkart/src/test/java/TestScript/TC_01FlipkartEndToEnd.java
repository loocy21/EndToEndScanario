package TestScript;



import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import ObjectRepositoryTC_01.HomePage;
import ObjectRepositoryTC_01.ProductPage;

/**
 * TestCase_TC_01FlipkartEndToEnd
 * Description:Search Product and validate the ProductPage
 * @author Shobha
 *
 */
public class TC_01FlipkartEndToEnd extends BaseClass
{
	
	@Test
	public void Flipkart() throws Throwable  
	{
		
		HomePage hp=new HomePage(driver);
		/*Search Product By HomePage*/
		hp.HomePage(driver, null);
		
		ProductPage pp = new ProductPage(driver);
		/*Search Product and AddToCart*/
		String USERNAME= jsonLib.readDataFromJSon("username");
		String PASSWORD= jsonLib.readDataFromJSon("Password");
		pp.Productpage(driver, USERNAME, PASSWORD);
		
		
	}
}
		
	
		
		
		
		
		
		
		
	

	
	
	
	
	
	



