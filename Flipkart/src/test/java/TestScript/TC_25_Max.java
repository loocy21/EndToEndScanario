package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider3;
import Pom_Page_MAX.Girl_Page;
/**
 * Test Case:TC_25_Max
 * Description:This Test Script contains one end to end scenario
 * @author Shobha
 *
 */

public class TC_25_Max extends BaseClass
{
	
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider3.class)
	public void Max (String logo,String value,String value2,String	filterPrice,String filterDesign	,String selectDesign,
			String	filterColour,String	selectColour,String	filterSize	,String selectSize	,
			String filterPromo	,String selectPromo,String seltSize,String addProduct) throws Throwable
	{
		Girl_Page gp = new Girl_Page(driver);
		/* search and filter the product*/ 
		gp.selectlogoApplyFilter(logo, value, value2, filterPrice, filterDesign, selectDesign);
		
		/*search and filter the product and choose one product */
		gp.applyFilter(filterColour, selectColour, filterSize, selectSize, filterPromo, selectPromo);
		
		/* validate the filters */
        gp.validateFilter();
        
        /*switch the window and add to cart product */
        gp.switchingWindow(seltSize, addProduct);
}
}
