package TestScript;

import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider2;
import Pom_Page_Bigbazaar.GroceryPage;
/**
 * Test case:TC_29Bigbazaar
 * Description:This script contain grocery page related test case
 * @author Shobha
 *
 */

public class TC_29Bigbazaar extends BaseClass
{
	
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider2.class)
	public void Bigbazaar (String category,	String selectType,String selectType1,String filterFood,String selectFood,
			String foodName,String pastaName,String addItem	,String addToCart) throws Throwable
	{
		GroceryPage gp = new GroceryPage(driver);
		
		/* mouseOver and search then filter the grocery */
		gp.selectGrocery(category, selectType, selectType1, filterFood, selectFood, foodName);
		
		/* validate the pasta name */
		gp.clickOnName(pastaName);
		
		/*add the food into cart */
	    gp.addGrocery(addItem, addToCart);

}
}
