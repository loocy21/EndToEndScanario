package TestScript;

import java.util.ArrayList;

import org.testng.annotations.Test;

import ElemetRepo_Myntraa.BuyNowPage;
import ElemetRepo_Myntraa.HomePage_Myntra;
import ElemetRepo_Myntraa.Pom_Page;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import PomRepoTC_06.LoginPage;


/**
 * TC_11_Myntra
 * Description:Script is used for Login the application and filtering the product
 * @author Shobha
 *
 */public class TC_11_Myntra extends BaseClass
{
	/**
	 * Description:initialization of login and HomePage
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Myntra (String username,String Password	,String name1 ,
String Brand ,String Price	,String Colour	,String Discount) throws Throwable
	{
		LoginPage lp = new LoginPage(driver);
		HomePage_Myntra mp = new HomePage_Myntra(driver);
		BuyNowPage bp = new BuyNowPage(driver);
		Pom_Page pp = new Pom_Page(driver);
		/* login page */
		//lp.login();

		/* search product */
		mp.homepage();
		
		pp.clkOnCategory(Brand);
		
		pp.clkOnBrand(Price);
		/* filter the Brand */
//		mp.filterProdt(Brand);
//		
//		mp.filterPrice(Price);
//
//		/* filter the Price */
//		//mp.filterProdt(Price);
//
//		/* filter the colour */ 
//		mp.filterProdt(Colour);
//
//		/* filter the discount */ 
//		mp.filterProdt(Discount);
//
//		/* validate the filtered product */
//		mp.validateFilter(null);
//
//		bp.ValidateName();
//		bp.validatePrice();
//		bp.ValidateSize();
//		bp.setPincodeAndVerify("pincode", "expectedDeliveryBy");
//		
//		
//	
//	
//	}
//
	}
}
