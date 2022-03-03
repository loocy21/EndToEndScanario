package TestScript;

import org.testng.annotations.Test;


import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider4;
import Pom_Class_Meesho.Home_Page2;



	public class TC_22Meesho extends BaseClass
	{

		@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider4.class)
		public void Meesho(String productName,String value) throws Throwable
		{
			Home_Page2 hw = new Home_Page2(driver);
			/* search and mouseOver product*/
			hw.selectProduct(productName, value);

}
}	