package Pom_Class_Zomato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Home_Page2 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Home_Page2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* text field search Place */
	@FindBy(xpath="//input[@placeholder='Bengaluru']")
	private WebElement tfPlace;
	
	
	/* Button autoSuggestion */
	@FindBy(xpath="//p[text()='Delhi NCR']")
	private WebElement autoSuggestion;
	
	/*xpath for foodName*/
	private WebElement placeName(String autoSugg) {
		String xpathValue1 ="//p[text()='"+autoSugg+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	/* filter food name */
	@FindBy(xpath="//div[@class='sc-1mo3ldo-0 sc-hPeUyl hISTdP']/descendant::h4[text()='KFC']")
	private WebElement getText;
	
	/* xpath for foodName*/
	private WebElement allFood(String firstFoodName) {
		String xpath ="//div[@class='sc-1mo3ldo-0 sc-hPeUyl hISTdP']/descendant::h4[text()='"+firstFoodName+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/* first product click */
	@FindBy(xpath="//h4[text()='KFC']")
	private WebElement clkFirstOne;
	
	/* button add */
	@FindBy(xpath="(//span[@class='sc-15orjsw-8 dmsiBQ'])[1]")
	private WebElement btnAdd;
	
	
	/**
	 * Description:This Method is used for get food name by Excel Sheet
	 * @author Shobha
	 * @param place
	 * @param autoSugg
	 * @param firstFoodName
	 * @param SecfoodName
	 * @param thirdFoodName
	 * @param fourFoodName
	 */
	

	public void getData(String place,String autoSugg,String firstFoodName,String SecfoodName,String thirdFoodName,String fourFoodName)
	{
		try {
		tfPlace.sendKeys(place);
		tfPlace.click();
		placeName(autoSugg).click();
		String first= allFood(firstFoodName).getText();
		System.out.println(first);
		String second = allFood(SecfoodName).getText();
		System.out.println(second);
		String third = allFood(thirdFoodName).getText();
		System.out.println(third);
		String fourth = allFood(fourFoodName).getText();
		System.out.println(fourth);
		System.out.println("===able to take data by excel  data===");
		}catch(Exception e) {
			System.out.println("unable to get data by excel sheet");
			Assert.fail("unable to get data by excel sheet");
		}
	}
	/**
	 * Description:Method is used for validate and add the food 
	 * @throws Throwable
	 */
		
		public void validatefoodName() throws Throwable
		{
			try {
				clkFirstOne.click();
				String actualName = "Checkout Best Food Places To Eat In Delhi NCR | Zomato";
				String expectedName = driver.getTitle();
				Assert.assertEquals(actualName, expectedName);
				System.out.println("actualName="+actualName);
				System.out.println(" first food validate succesfully ");
				}catch(Exception e)
				{
					System.out.println("unable to validate food name");
					Assert.fail("unable to validate food name");
				}
			web.ScrollDown(driver);
			web.ClickableElement(driver, btnAdd);
		}
		
		
	}
