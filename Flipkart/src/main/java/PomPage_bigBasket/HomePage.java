package PomPage_bigBasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	WebDriver driver;
	WebDriverUtility web  = new WebDriverUtility();
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/* search Box */
	@FindBy(xpath="//input[@qa='searchBar']")
	private WebElement searchBox;
	
	/* Button search */
	@FindBy(xpath="//button[@qa='searchBtn']")
	private WebElement btnSrch;
	
	/*category*/
	private WebElement category(String value) {
		String xpath= "//div[@class='col-md-12 pad-0 quick-styles']/descendant::span[text()='Fresho']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*brand*/
	private WebElement brand(String value) {
		String xpath="//div[@class='col-md-12 pad-0 quick-styles']/descendant::span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/*filter the Brand*/
	private WebElement filterBrand(String value) {
		String xpath= "//div[@class='col-xs-12 ng-scope']/descendant::span[text()='Again']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*filter the second brand*/
	private WebElement brand1(String value) {
		String xpath="//div[@class='col-xs-12 ng-scope']/descendant::span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/*filter the Country */
	private WebElement filterCountry(String value) {
		String xpath= "//div[@class='col-xs-12 ng-scope']/descendant::span[text()='India']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*filter country*/
	private WebElement filterCtry(String value) {
		String xpath="//div[@class='col-xs-12 ng-scope']/descendant::span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	/* f*/
	private WebElement filterSeason(String value) {
		String xpath= "//div[@class='col-xs-12 ng-scope']/descendant::span[text()='Summer Fruits']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*brand*/
	private WebElement filterSeson(String value) {
		String xpath="//div[@class='col-xs-12 ng-scope']/descendant::span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	private WebElement filterPack(String value) {
		String xpath= "//div[@class='col-xs-12 ng-scope']/descendant::span[text()='1 pc']";
		return driver.findElement(By.xpath(xpath));
	}
	
	
	/*brand*/
	private WebElement filterPck(String value) {
		String xpath="//div[@class='col-xs-12 ng-scope']/descendant::span[text()='"+value+"']";
		return driver.findElement(By.xpath(xpath));
	}
	
	/*Click Product*/
	@FindBy(xpath="//img[@alt='Fresho Guava - Thai 1 pc']")
	private WebElement clkFstPdt;
	/**
	 * Description:Method is used for search the product
	 * @param Shobha
	 * @throws Throwable
	 */
	
	public void tfSearch(String name) throws Throwable
	{
		try {
		searchBox.sendKeys(name);
		btnSrch.click();
		System.out.println("===able to search product Succesfully===");
		}catch(Exception e)
		{
			System.out.println("not able to search the product");
			Assert.fail("not able to search the product");
		}
	}
	/**
	 * Description:Method is used for filter the brand 
	 * @author Shobha
	 * @param Brand
	 * @throws Throwable
	 */
		
		public void clkOnCategory(String Brand) throws Throwable
		{
			try
			{
				web.ClickableElement(driver, brand(Brand));
				System.out.println("===able to filter brand Succesfully===");
				}catch(Exception e)
				{
					System.out.println("not able to filter brand");
					Assert.fail("not able to filter brand");
				}
			}
			/**
			 * Description:Method is used for scroll down the page and  filter the second Brand
			 * @author Shobha
			 * @param Brand1
			 * @throws Throwable
			 */
		public void clkOnBrand(String Brand1) throws Throwable
		{
			try {
			web.ScrollDown(driver);
			web.ClickableElement(driver, brand1(Brand1));
			System.out.println("===able to filter brand Succesfully===");
			}catch(Exception e)
			{
				System.out.println("not able to filter brand");
				Assert.fail("not able to filter brand");
			}
		}
		/**
		 * Description:Method is used for scroll down the page and  filter country
		 * @author Shobha
		 * @param CountryOfOrigin
		 * @throws Throwable
		 */
		public void filterCntry(String CountryOfOrigin) throws Throwable
		{
			try {
			web.ScrollDown(driver);
			web.ClickableElement(driver, filterCountry(CountryOfOrigin));
			System.out.println("===able to filter CountryOfOrigin Succesfully===");
			}catch(Exception e)
			{
				System.out.println("not able to filter CountryOfOrigin");
				Assert.fail("not able to filter CountryOfOrigin");
			}
		}
		/**
		 * Description:Method is used for scroll down the page and  filter season
		 * @author Shobha
		 * @param Seasonal
		 * @throws Throwable
		 */
		public void filterSeasn(String Seasonal) throws Throwable
		{
			try {
			web.ScrollDown(driver);
			web.ClickableElement(driver, filterCountry(Seasonal));
			System.out.println("===able to filter CountryOfOrigin Succesfully===");
			}catch(Exception e)
			{
				System.out.println("not able to filter Seasonal");
				Assert.fail("not able to filter Seasonal");
			}
			
		}
		/**
		 * Description:Method is used for scroll down the page and  filter PackSIze
		 * @param PackSIze
		 * @throws Throwable
		 */
		public void filterPackSize(String PackSIze) throws Throwable
		{
			try {
			web.ScrollDown(driver);
			web.ClickableElement(driver, filterCountry(PackSIze));
			System.out.println("===able to filter PackSIze Succesfully===");
			}catch(Exception e)
			{
				System.out.println("not able to filter PackSIze");
				Assert.fail("not able to filter PackSIze");
			}
}
		/**
		 * Description:Method is used for click First product and switching window
		 * @author Shobha
		 */
		public void clkFst()
		{
			try {
				web.ClickableElement(driver, clkFstPdt);
			System.out.println("able to clk fst Product");
			} catch (Exception e) {
				System.out.println("unable to clk fst Product");
				Assert.fail("unable to clk fst Product");
		}
}
}

