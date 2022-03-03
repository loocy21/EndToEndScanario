package TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import Pom_Page_Bigbazaar.Home_Page;
/**
 * Test Case:TC_28Bigbazaar
 * Description:This test script contains one end to end scanarion in the application
 * @author Shobha
 *
 */
@Listeners(GenricUtilities.Listeners.class)
public class TC_28Bigbazaar extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Bigbazaar (String category	,String selectType,String selectType1,	String filterFruits	,
			String selectFruits,String addFruit,String addToCart) throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		/* mouse over on shot by and filter the product */
		hp.searchPage(category, selectType, selectType1,filterFruits, selectFruits);
		
		/*validate the fruit name*/
		hp.validateFilteredFruit();
		
		/*add fruit into list*/
		hp.addFruit(addFruit);
		
		
		/*click on add to basket*/
		hp.addToCart(addToCart);
		
	}

}
