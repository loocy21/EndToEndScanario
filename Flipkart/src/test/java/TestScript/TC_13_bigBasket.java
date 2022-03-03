package TestScript;

import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import PomPage_bigBasket.BuyNowPage;
import PomPage_bigBasket.HomePage;
/**
 * Description :This script is used for perform end to end scanario 
 * @author Shobha
 *
 */

public class TC_13_bigBasket extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void bigBasket(String name,String Brand,String	Brand1,String	Seasonal,String	CountryOfOrigin,String	PackSIze) throws Throwable
	{
		
	HomePage hp = new HomePage(driver);
	//ValidationPage vp = new ValidationPage(driver);
	BuyNowPage bn = new BuyNowPage(driver);
	
	/*search product */
	hp.tfSearch(name);
	
	/*filter brand */
	hp.clkOnCategory(Brand);
	
	/* filter second brand */
	hp.clkOnBrand(Brand1);
	
	/* filter country */
	hp.clkOnBrand(CountryOfOrigin);
	
	/*filter season */
	hp.clkOnBrand(Seasonal);
	
	/*filter size */
	hp.clkOnBrand(PackSIze);
	
	/*validate the filtered product */
	//vp.validateFilter(filteredItems);
	
	/*click on first filtered product */
	hp.clkFst();
	
	/* window switching */
	//bn.switchWindow();
	
	/*validate the product name */
	bn.getProductName();
	
	/*validate the price */
	bn.getProducPrice();
	
	/* validate the colour and add to basket*/
	bn.getColor();
	
	
	

}
}

