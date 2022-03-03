package TestScript;

import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider4;
import Pom_Page_Bigbazaar.SearchPage;
/**
 * Test Case:TC_31BigBazaar
 * Description:This script contain search page related test case
 * @author Shobha
 *
 */public class TC_31Bigbazaar extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider4.class)
	public void Bigbazaar (String category,String selectType,String button,String scroll,String brand,String types,
			String size,String maggiName,String	addItem,String addToCart) throws Throwable
	{
		SearchPage sp = new SearchPage(driver);
		
		/* search the product */
		sp.searchProduct(category, selectType);
		
		/* click and filter the product */
		sp.clickViewAndFilter(button, scroll, brand, types, size);
		
		/* validate the product name */
		sp.validateMaggiName(maggiName);
		
		/* add to cart product */
		sp.addToCartFilteredMaggi(maggiName, addItem, addToCart);
	}

}
