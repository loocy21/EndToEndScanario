package TestScript;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import GenricUtilities.BaseClass;

import GenricUtilities.SampleDataProvider;
import Pom_Class_Meesho.Meesho_Search_Page;


@Listeners(GenricUtilities.Listeners.class)
public class TC_19_Meesho extends BaseClass
{
	
	 
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Meesho(String search,String clothe,String subTitle,String dressName,String firstDressName,String size,String button) throws Throwable
	{
		
		Meesho_Search_Page sp = new Meesho_Search_Page(driver);
		
		/* get data by excel sheet */
		sp.searchPage(search, clothe,subTitle,dressName,firstDressName);
		
		
		/*validate dress name */
		sp.validateDressname();
		
		/*validate dress price */
		sp.validatePrice();
		
		/*select size and add to cart*/
		sp.selectSizeandAddtoCart(size, button);
		
	}
		
}
