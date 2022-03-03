package TestScript;

import org.testng.annotations.Test;


import ElmtRepo_.BuyNowPage;
import ElmtRepo_.HomePage;
import ElmtRepo_.filterPage;
import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;

/* TestCase:1
* Description : select the sofa, apply filters and add to bag and verify the name,price,qty.
* @author Pavankumar
* @throws Throwable
*/
public class PepperFryEndToEnd1 extends BaseClass {
	 
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void testcase_01_Test( String MobileNumber, String Password,
			String sofasrecliners,String SortBy, String Price,String Style,String Color,String FilteredProduct,String SofaName,String SofaPrice,String Pincode, String expectedDeliveryBy, String Quantity)throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		filterPage fpp = new filterPage(driver);
		BuyNowPage cp = new BuyNowPage(driver);

	 /* mouseover on MEN */
		hp.mouseOverOnlnkLoginImg();
		
	 /* click on register button  */	
		hp.clkRegister();
		
	/* click on existing user */
		hp.clkExistingUser();
		
	/* enter mobile number*/	
		hp.setMobileNum(MobileNumber);
		
	/* enter the password*/
		hp.setPassword(Password);
	
	/* click on login button */	
		hp.clkLoginButton();
		
	/* mouse over on sofa and recliners*/
		hp.mouseOverOnElements(sofasrecliners);
		
	/* click on arra link*/		
		hp.clKArra();
	
	/* click on sortby check box  */		
		hp.clkCheckBox(SortBy);
		
	/* click on price check box  */
		hp.scrolldown();
		hp.clkCheckBox(Price);
		
	/* click on style check box  */
		hp.scrolldown();
		hp.clkCheckBox(Style);
		
	/* click on color  check box */
		hp.scrolldown();
		hp.clkCheckBox(Color);
		
	/* validate sortby filter */		
	 //  hp.getFiltraionsAndValidate(SortBy);
		
	/* get the filtered sofa name*/	
    	hp.getFilteredProduct(FilteredProduct);
    
    /* click on filtered sofa name*/
    	hp.clkFilteredProduct(FilteredProduct);	
    	
    	fpp.getCartSofaNameAndValidate(SofaName);
    	
    	fpp.getCartSofaPriceAndValidate(SofaPrice);
    	
    	hp.scrolldown();
    	cp.setPincodeAndVerify(Pincode, expectedDeliveryBy);
    	
        cp.setQuantity(Quantity);
        
        cp.clkAddToCart();
        
        cp.clkGoToCart();
        
        fpp.getCartSofaNameAndValidate(SofaName);
        
        fpp.getCartSofaPriceAndValidate(SofaPrice);
 
        fpp.getCartSofaQuantityAndValidate(Quantity);
        
        fpp.getColorOFSofaAndValidate(Color);
        
	}
}


