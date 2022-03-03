package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;

import GenricUtilities.SampleDataProvider5;
import Pom_Page_MAX.Boys_Page;
/**
 * Test Case:TC_27_Max
 * Description:This Test Script contains one end to end scenario
 * @author Shobha
 * 
 *
 */

public class TC_27_Max extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider5.class)
	public void Max (String Category,String	selectType	,String shop,String	filterPrice,String 	filterType,String	selecttype,
			String filterDesign	,String selectDesign,	String dressName	,String selectSize	,String addProduct) throws Throwable
	{
		Boys_Page bp = new Boys_Page(driver);
		
		/*select boy icon and filter the product */
		bp.filterBoysdress(Category, selectType, shop, filterPrice, filterType, selecttype, filterDesign, selectDesign, dressName, 
				selectSize, addProduct);
		
		
		
       /* click filtered product and add to cart*/
		bp.switchingWindow(dressName, selectSize, addProduct);
}
}
