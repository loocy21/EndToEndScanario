package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider2;
import Pom_Class_Zomato.Home_Page2;

public class TC_18_Zomato extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider2.class)
	public void Zomato(String place ,String autoSugg,String firstFoodName, String SecfoodName,String thirdFoodName,String fourFoodName) throws Throwable
	{
		Home_Page2 hw = new Home_Page2(driver);
		
		/*get data by excel sheet*/
		hw.getData(place,autoSugg,firstFoodName,SecfoodName,thirdFoodName,fourFoodName);
		
		/* validate and click add on food */
		hw.validatefoodName();

}
}
