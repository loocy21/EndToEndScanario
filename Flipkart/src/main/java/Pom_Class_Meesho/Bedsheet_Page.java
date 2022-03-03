package Pom_Class_Meesho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class Bedsheet_Page 
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Bedsheet_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* search text field */
	@FindBy(xpath="//span[text()='Bedsheets']")
	private WebElement clkBedsheet;
	
	public WebElement firstEle(String productName) {
		String xpathValue ="//span[text()='"+productName+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
		
		/* search text field */
		@FindBy(xpath="//span[text()='Home & Kitchen']")
		private WebElement mouseOver2;
		
	
	public WebElement secEle(String value) {
		String xpathValue ="//p[text()='"+value+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	
	public void selectProduct(String productName,String value) throws Throwable
	{
		try {
		web.ScrollDown(driver);
		web.mouseOver(driver, clkBedsheet);
		firstEle(productName).click();
		web.mouseOver(driver, secEle(value));
		secEle(value).click();
		System.out.println("search and mouseOver succesfully");
		}catch(Exception e) {
			System.out.println("search and mouseOver not done");
			Assert.fail("search and mouseOver not done");
		}
	}

}
