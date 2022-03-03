package Pom_Class_Zomato;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import GenricUtilities.WebDriverUtility;
/**
 * Description:This page contains search the food and apply filter 
 * @author Shobha
 *
 */
public class Home_Page_Zomato 
{
	
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Home_Page_Zomato(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* text field search Box dishes */
	@FindBy(xpath="//input[@placeholder='Search for restaurant, cuisine or a dish']")
	private WebElement tfDish;
	
	
	/* text field search box input*/
	@FindBy(xpath="//p[text()='South Indian - Delivery']")
	private WebElement autoSuggestion;
	
	/*xpath for hotelName*/
	private WebElement hotelName(String hotelName) {
		String xpathValue1 ="//p[text()='"+hotelName+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/* filter ratings */
	@FindBy(xpath="//div[text()='Rating: 4.0+']")
	private WebElement btnFilter;
	
	/* filter ratings */
	private WebElement filterRating(String ratings) {
		String xpathValue2 ="//div[text()='"+ratings+"']";
		return driver.findElement(By.xpath(xpathValue2));
	}
	
	/* filter type of food */
	@FindBy(xpath="//div[text()='Pure Veg']")
	private WebElement filterBtnVeg;
	
	/* filter type of food */
	private WebElement filterFoodType(String typeOfFood) {
		String xpathValue1 ="//div[text()='"+typeOfFood+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/* filter Delivery Button */
	@FindBy(xpath="//div[text()='Delivery Time']")
	private WebElement filterDeliveryBtn;
	
	/* filter Delivery Button */
	private WebElement filterDelivry(String filterDelivery) {
		String xpathValue3 ="//div[text()='"+filterDelivery+"']";
		return driver.findElement(By.xpath(xpathValue3));
	}
	/* filter offer Button */
	@FindBy(xpath="//div[text()='Great Offers']")
	private WebElement btnOffer;
	
	/* filter offer Button */
	private WebElement filterOffer(String offer) {
		String xpathValue4 ="//div[text()='"+offer+"']";
		return driver.findElement(By.xpath(xpathValue4));
	}
	/**
	 * Description:Method is used for search the food and apply filters
	 * @author Shobha
	 * @param dish
	 * @param hotelName
	 * @param ratings
	 * @param typeOfFood
	 * @param filterDelivery
	 * @param offer
	 * @throws Throwable
	 */
	 
	public void applyFilters(String dish,String hotelName,String ratings,String	typeOfFood,String filterDelivery,String	offer) throws Throwable
	{
		try {
		tfDish.sendKeys(dish);
		tfDish.click();
		hotelName(hotelName).click();
		
		Thread.sleep(13000);
		btnFilter.click();
		filterRating(ratings).click();
		Thread.sleep(9000);
		filterBtnVeg.click();
		filterFoodType(typeOfFood).click();
		Thread.sleep(9000);
		filterDelivry(filterDelivery).click();
		Thread.sleep(9000);
		filterOffer(offer).click();
		System.out.println("search and filter product succesfully");
		}catch(Exception e) {
			System.out.println("unable to filter product succesfully");
			Assert.fail("unable to filter product succesfully");
		}
	}
		public void validateFilter(ArrayList<String> expected)
		{
			try 
			{	
				List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"sc-SxrYz ZaDqI\"]"));
				ArrayList<String> actual = new ArrayList<String>();
				for(WebElement wb : list )
		    	{
		    		actual.add(wb.getText());
		    		System.out.println(wb.getText());
		    	
		    	}
		
					Assert.assertEquals(expected, actual);
				System.out.println("Able to verify actual Filtered ");
			}
			
			catch(Exception e) 
			{
				System.out.println("unable to  verify actual Filtered ");
				Assert.fail("unable to verify actual Filtered ");
			}
		} 
						 
		
		
		
		
		
	}


