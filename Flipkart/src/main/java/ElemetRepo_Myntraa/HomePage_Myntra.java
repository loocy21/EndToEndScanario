package ElemetRepo_Myntraa;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.JsonFileUtility;
import GenricUtilities.SampleDataProvider;
import GenricUtilities.WebDriverUtility;

/**
 * Description:This page is used for Search and filter the product
 * 
 * @author Shobha
 *
 */

	public class HomePage_Myntra 
	{
	JsonFileUtility json = new JsonFileUtility();
	WebDriverUtility web = new WebDriverUtility();
	SampleDataProvider sp = new SampleDataProvider();
	WebDriver driver = null;

	public HomePage_Myntra(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* text Field Search Box */
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement tfSrchBx;

	/* auto suggestion option */
	@FindBy(xpath = "//li[text()='Jeans Men']")
	private WebElement clickText;
	

	/* Genric xpath for filter the product */
	private WebElement brand(String value)
	 { String xpath1 ="//span[@class=\"vertical-filters-header\"]/ancestor::div[@class=\"condition-render-verticalFilters condition-render-boundary-top\"]/descendant::label[text()='Roadster']";
	
	 return driver.findElement(By.xpath(xpath1)); }
	  
	 /* Genric xpath for filter options */
	  private WebElement Price(String value) {
	  String xpath ="//span[@class=\"vertical-filters-header\"]/ancestor::div[@class=\"condition-render-verticalFilters condition-render-boundary-top\"]/descendant::label[text()='"+value+"']";
	   return driver.findElement(By.xpath(xpath)); }
	 
	  /* Genric xpath for filter the product */
		private WebElement colour(String value1)
		 { String xpath1 ="//span[@class=\"vertical-filters-header\"]/ancestor::div[@class=\"condition-render-verticalFilters condition-render-boundary-top\"]/descendant::label[text()='Rs. 449 to Rs. 962']";
		
		 return driver.findElement(By.xpath(xpath1)); }
		  
		 /* Genric xpath for filter options */
		  private WebElement discountRange(String value1) {
		  String xpath ="//span[@class=\"vertical-filters-header\"]/ancestor::div[@class=\"condition-render-verticalFilters condition-render-boundary-top\"]/descendant::label[text()='"+value1+"']";
		   return driver.findElement(By.xpath(xpath)); }
		 
	  /**
		 * Description:Method is used for search Product
		 * 
		 * @param driver
		 * @throws Throwable
		 */
		public void homepage() throws Throwable 
		{
			try {
				web.waitForPageLoad(driver);
				tfSrchBx.sendKeys("jeans");
				clickText.click();
				System.out.println("able to search the product");
			} catch (Exception e) {
				System.out.println("unable to search the product=");
			 Assert.fail("unable tosearch the products");
	}
	}
		/**
		 * Description:Method is used for filter the Product
		 * @param value
		 * @throws Throwable
		 */

		public void filterProdt(String value ) throws Throwable {
			try {
				Price(value).click();
			
				
				 System.out.println("===able to filter Product===");
					} catch (Exception e) {
						System.out.println("unable to filter Product=");
					 Assert.fail("unable to filter Product=");

					}
				
				}
		public void filterPrice(String value1)
		{
			discountRange(value1).click();
		}
		/**
		 * Description:Method is used for validate the filtered Product
		 * @author Shobha
		 * @param expected
		 */
		public void validateFilter(ArrayList<String> expected)
		{
			try 
			{	
				List<WebElement> list = driver.findElements(By.xpath("//ul[@class='filter-summary-filterList']/li"));
				ArrayList<String> actual = new ArrayList<String>();
				for(WebElement wb : list )
		    	{
		    		actual.add(wb.getText());
		    		System.out.println(wb.getText());
		    	}
				Assert.assertEquals(expected, actual);
				
					ArrayList<String> expected1 = new ArrayList<String>();
						Thread.sleep(5000);
						expected.add("Roadster");
						Thread.sleep(5000);
						expected.add("Rs. 449 to Rs. 962");
						Thread.sleep(5000);
						expected.add("Blue");
						Thread.sleep(5000);
						expected.add("50% and above");
					
				Assert.assertEquals(expected1, actual);
				
			
				System.out.println("Able to verify actual Filtered ");
			}
			catch(Exception e) 
			{
				System.out.println("unable to  verify actual Filtered ");
				Assert.fail("unable to verify actual Filtered ");
			}
		} 
			
		

			
	}

		

	

	

	

