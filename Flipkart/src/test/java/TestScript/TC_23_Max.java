package TestScript;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import Pom_Page_MAX.Home_Page;
/**
 * Test Case:TC_23_Max
 * Description:This Test Script contains one end to end scenario
 * @author Shobha
 *
 */
@Listeners(GenricUtilities.Listeners.class)
public class TC_23_Max extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Max (String gender,	String ShopFor	,String filterBrowse,	String filterSize	,String filterColour,String discount,String dressName,String addProduct,String selectSize) throws Throwable
	{
		
		Home_Page hp = new Home_Page(driver);
		
		/* search the product and filter the product by category */
		hp.selectProduct(gender, ShopFor, filterBrowse, filterSize, filterColour, discount,dressName);
		
		/*validate the add to cart page*/
		hp.validateaddToCartPage();
		
		/* Switch the window and select size and add to cart */
		hp.switchingWindow(filterSize, selectSize,addProduct);
	

}
}
