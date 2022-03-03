package TestScript;
import org.testng.annotations.Test;

import ElementRepo_Ajio.AddToBagPage;
import ElementRepo_Ajio.FilterPage;
import ElementRepo_Ajio.HomePage;
import ElementRepo_Ajio.ValidationPage;
import GenricUtilities.BaseClass;
/**
 * TestCase:TC_09Ajio
 * Description:Script is used for perform EndToEnd Scanario
 * @author Shobha
 *
 */

public class TC_09Ajio extends BaseClass
{
	/**
	 * Description:Initialization of all PomPages
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test
	public void Ajio() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		FilterPage fp = new FilterPage(driver);
		ValidationPage vp = new ValidationPage(driver);
		AddToBagPage ab = new AddToBagPage(driver);
		
		/* mouse over on men */
		hp.mousOvrOnElmnts("MEN"); 
		
		/* mouse over on men */
		hp.mousOvrOnElmnts("WOMEN");
		
		/* mouse over on men */
		hp.mousOvrOnElmnts("KIDS");
		
		 /* mouse over on men */
		 hp.mousOvrOnElmnts("INDIE");
		 
		 /* mouse over on men */
		 hp.mousOvrOnElmnts("HOME AND KITCHEN"); 
		 
		 /* mouse over on men */
		 hp.mousOvrOnElmnts("MEN");
		 
		
		 /*select one element inside men*/
		hp.seltProduct();
		
		/* filter the product */
		fp.fltrProduct();
		
		/* validate Bag logo*/ 
		vp.validatelogo();
		
		vp.validation();
		
		
		/*get text of all product */
		fp.gettxtall();
		
		/* switch to Window */
		ab.switchToWndo();
		
		/*get text Bag name and price */
		ab.getTxtBag();
		
		/* fetch pincode by jsonfile */
		String PINCODE1= jsonLib.readDataFromJSon("pinCode1");
		String PINCODE2= jsonLib.readDataFromJSon("PinCode2");
		
		/* pin code text field */
		ab.pinCodeTb( PINCODE1);
		
		/*pin code text field */
		ab.pinCodeChnge(PINCODE2);
		
		
		
		
	}
}
