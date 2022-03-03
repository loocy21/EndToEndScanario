package TestScript;

import org.testng.annotations.Test;


import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.SampleDataProvider2;
import Pom_Page_MAX.SearchProduct;
/**
 * Test Case:TC_24_Max
 * Description:This Test Script contains one end to end scenario
 * @author Shobha
 * 
 *
 */

public class TC_24Max extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider2.class)
	public void Max (String search	,String autoSuggestion,String filterBrowse	,String selectBrowse	
			,String filterSize,String selectSize,String	filterDiscouont,String	selectDiscount,String dressName	,
			String actualDressName,String addProduct,String selectSize1) throws Throwable
	{
		SearchProduct pp = new SearchProduct(driver);
		pp.searchApplyFilter(search, autoSuggestion, filterBrowse, selectBrowse, filterSize, selectSize,  filterDiscouont, selectDiscount);
		
		/* validate the filtered	name */
		pp.validateFilteredJeans(actualDressName);
		
		/* click first dress */
		pp.clkFirstProduct(dressName);
		
		/*switch to window and add to cart*/
		pp.switchToWindow(selectSize1, addProduct);
		
	

}
}
