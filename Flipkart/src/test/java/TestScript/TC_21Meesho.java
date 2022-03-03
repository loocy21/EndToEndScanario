package TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider2;
import GenricUtilities.SampleDataProvider3;
import Pom_Class_Meesho.Product_Page2;
@Listeners(GenricUtilities.Listeners.class)

public class TC_21Meesho extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider3.class)
	public void Meesho(String fstElement,String subTitle,String secElement,	String subTitle2) throws Throwable
	{
		Product_Page2 pm = new Product_Page2(driver);
		
		/*mouse over on subTitle*/
		pm.headers(fstElement, subTitle, secElement, subTitle2);
	}

}
