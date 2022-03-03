package TestScript;

import org.testng.annotations.Test;


import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider4;
import Pom_Page_MAX.Men_Page;
/**
 * 
 * Test Case:TC_26_Max
 * Description:This Test Script contains one end to end scenario
 * @author Shobha
 *
 */

public class TC_26_Max extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider4.class)
	public void Max (String Category,String	selectType,String shop,String	filterPrice,String	filterType,
			String	selecttype,String filterDesign,String	selectDesign,String dressName	,String selectSize	,String addProduct) throws Throwable
	{
		Men_Page mp = new Men_Page(driver);
		
		/* select brand and filter the product */
		mp.selectBrandandfilter(Category, selectType, shop, filterPrice, filterType, selecttype, filterDesign, selectDesign);
		
		
		/* click on first product select size and add to cart */
		mp.clkProduct(dressName, selectSize, addProduct);
	
	}

}	
