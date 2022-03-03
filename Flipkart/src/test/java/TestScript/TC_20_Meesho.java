package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider2;
import Pom_Class_Meesho.Product_Page;

public class TC_20_Meesho extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider2.class)
	public void Meesho(String product,String categeory,String selectOne,String colour,String button) throws Throwable
	{
		Product_Page pp = new Product_Page(driver);
		
		/* mouseOver on element */
		pp.getTextProductName(product, categeory);
		
		/* get text of all sunglasses */
		pp.getText();
		
		/* validate the sunglasses page */
		pp.validatePage();
		
		/* scroll down on selected sunglass */
		pp.scrollDown(selectOne);
		
		/* validate the colour of sunglass */
		pp.validateColour(colour);
		
		/*add to Cart Button */
		pp.btnAddTocart(button);

}
}
