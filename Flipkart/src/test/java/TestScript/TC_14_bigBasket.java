package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.SampleDataProvider;
import Pom_Page_BigBasket2.HomePage;


public class TC_14_bigBasket extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	
	public void bigBasket(String FruitsVegetables,String foodgrainsOilMasala,String bakeryCakesDairy,String	beverage,String	snacksBrandedFoods,String beautyHygiene	,
			String cleaningHousehold,String	kitchenGardenPets,String eggsMeatFish,String gourmetWorldFood ,String babyCare) throws Throwable
	{
		
	HomePage hp = new HomePage(driver);
	{
	hp.tfSearch(FruitsVegetables);
	
	hp.tfSearch(foodgrainsOilMasala);
	
	hp.tfSearch(bakeryCakesDairy);
	
	hp.tfSearch(beverage);
	
	hp.tfSearch(snacksBrandedFoods);
	
	hp.tfSearch(beautyHygiene);
	
	hp.tfSearch(cleaningHousehold);
	
	hp.tfSearch(kitchenGardenPets);
	
	hp.tfSearch(eggsMeatFish);
	
	hp.tfSearch(gourmetWorldFood);
	
	hp.tfSearch(babyCare);
	
	}
	}
}
	
