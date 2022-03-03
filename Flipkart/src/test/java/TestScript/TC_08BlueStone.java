package TestScript;

import org.testng.annotations.Test;

import ElementRepo_07.HomePage;
import ElementRepo_07.ValidationPage;
import ElementRepo_07.BuyNowPage;
import GenricUtilities.BaseClass;
/**
 * TestCase:TC_08BlueStone
 * Description:Script is used for mouseOver on all elements
 * @author Shobha
 *
 */

public class TC_08BlueStone extends BaseClass
{
	/**
	 * Description:Initialization of Homepage and BuyNow Page
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test
	public void blueStone() throws Throwable
	{
		HomePage hp = new HomePage(driver);	
		BuyNowPage rp = new BuyNowPage(driver);
		ValidationPage vp = new ValidationPage(driver);
		
		
		/* mouseOvr on rings */
		hp.mousOvrOnElmnts("Rings ");
		
		/* mouseOvr on earrings */
		hp.mousOvrOnElmnts("Earrings ");
		
		/* mouseOvr on Pendants */
		hp.mousOvrOnElmnts("Pendants");
		
		/* mouseOvr on solitaire */
		hp.mousOvrOnElmnt("Solitaires ");
		
		/* mouseOvr on all Jewelry */
		hp.mousOvrOnElmnts("All Jewellery ");
		
		/* mouseOvr on gifts */
		hp.mousOvrOnElmnt("Gifts ");
		
		/* mouseOvr on coins */
		hp.mousOvrOnElmnts("Coins ");
		
		/* click on engagement ring */
		hp.clkRing();
		
		
		/* click on engagement ring */
		hp.clkRing();
		
		/* filter the product */
		hp.seltPriceMetal();
		
		/* get text of name and price*/
		rp.getName();
		
		/* validate the ring name */
		rp.validateProductName();

		/* validate the name */
		vp.validateName();
		
		/* validate the Price */
		vp.validatePrice();
		
		/* validate the Size */
		vp.validateSize();
		
		
	
	}

}
