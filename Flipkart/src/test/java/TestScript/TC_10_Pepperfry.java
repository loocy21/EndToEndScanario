package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import PomClass_PaperFry.HomePage;
import PomClass_PaperFry.Login1;
import PomClass_PaperFry.LoginPage;
import PomClass_PaperFry.ValidationPage;


public class TC_10_Pepperfry extends BaseClass
{
	/**
	 * Description:Initialization of all PomPages
	 * @author Shobha
	 * @throws Throwable
	 */
	@Test(description="",dataProvider="TestDataProvider",dataProviderClass=SampleDataProvider.class)
		public void Pepperfry(String TC_ID,String TC_Name,String MobileNumber,String Password,String sofa,String SortBy,String Price,String Style,
				String Color,String FilteredProduct)throws Throwable 
		{
		HomePage hp = new HomePage(driver);
		Login1 lp = new Login1(driver);
		ValidationPage vp = new ValidationPage(driver);
		 
		/* perform mouseOver */
		lp.usrIcon();
		
		/* get data by excel */
		lp.getCategories(MobileNumber);
		lp.getCategories(Password);
		
		/* get data */
		hp.filterProdt(driver);
		
		/* validation all elements  */
		vp.validatelogo();
		
		/* buy now page*/
		vp.validation();
		}
		
		
		
		 


}

