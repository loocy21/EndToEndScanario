package TestScript;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.SampleDataProvider2;
import Pom_Class_Zomato.Food_Page;
import Pom_Class_Zomato.Home_Page2;
import Pom_Class_Zomato.Home_Page_Zomato;
/**
 * Description:Script contains all the filter record in the application
 * @author Shobha
 *
 */

public class TC_17_Zomato extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Zomato(String dish,String hotelName,String ratings,String typeOfFood,String	filterDelivery,String offer,
			String pizzaName,String expected) throws Throwable
	{
		Home_Page_Zomato hp = new Home_Page_Zomato(driver);
		Food_Page fp = new Food_Page(driver);
		System.out.println(expected);
		String [] array= expected.split(",");	
		ArrayList<String> arr= new ArrayList<String>();
		
		for(int i=0; i<array.length; i++)
		{
			arr.addAll(Arrays.asList(array));
		}
		/*fetch the data by excel sheet */
		hp.applyFilters(dish, hotelName,ratings,typeOfFood,filterDelivery,offer);
		
		/* validate the filters */
		hp.validateFilter(arr);
		
		/*click on first pizza*/
		fp.addFood(pizzaName);
		
		
		/*validate the pizza name */
		fp.validateName();
	}

}
