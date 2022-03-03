package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider3;
import Pom_Page_Bigbazaar.Sweet_Page;
/**
 * Test Case:TC_30BigBazaar
 * Description:This script contain sweet page related test case
 * @author Shobha
 *
 */

public class TC_30BigBazaar extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider3.class)
	public void Bigbazaar (String category	,String selectType	,String scroll,String brand	,String filterType,String types	,String size	
			,String discount,String sweetName,String addItem	,String addToCart) throws Throwable
	{
		Sweet_Page sp = new Sweet_Page(driver);
		
		/* mouseOver on sweet and click */
		sp.mouseOverAndFilter(category, selectType, scroll, brand, filterType, types);
		
		/* filter the sweet */
		sp.filterSweet(types, size, discount);
		
		
		/* validate the filtered sweet */
		sp.validateSweetName(sweetName);
		
		/*click filtered sweet and add to basket*/
		sp.clkOnSweetAddToCart(sweetName, addItem, addToCart);

	
}
}
