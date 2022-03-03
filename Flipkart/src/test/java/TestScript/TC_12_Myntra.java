package TestScript;
import org.testng.annotations.Test;
import ElemetRepo_Myntraa.Product_Page;
import ElemetRepo_Myntraa.HomePage_Myntra;
import GenricUtilities.BaseClass;
import PomRepoTC_06.LoginPage;
import PomRepoTC_06.SearchPage;

/**
 * TC_12_Myntra
 * Description:Script is used for mouseOver and get text all elements
 * @author Shobha
 *
 */

public class TC_12_Myntra extends BaseClass
{
	/**
	 * Description:initialization of Product Page
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test
	public void Myntra () throws Throwable
	{
		Product_Page pp = new Product_Page(driver);
		
		/* get text men  */
		pp.menGetAllText();
		
		/* get text woman */
		pp.wmnsGetAllText();
		
		/* get text kids */
		pp.kidsGetAllText();
		
		/* get text home&Living */
		pp.hlGetAllText();
		
		/* get text Beauty*/
		pp.btyGetAllText();
	}
	
	}
		
		
		

