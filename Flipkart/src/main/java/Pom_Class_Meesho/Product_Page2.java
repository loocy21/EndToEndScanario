package Pom_Class_Meesho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilities.WebDriverUtility;

public class Product_Page2
{
	WebDriverUtility web = new  WebDriverUtility();
	WebDriver driver;
	public Product_Page2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/* search text field */
	@FindBy(xpath="//span[text()='Women Ethnic']")
	private WebElement mouseOver;
	
	public WebElement firstEle(String fstElement) {
		String xpathValue ="//p[text()='"+fstElement+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
		
		/* search text field */
		@FindBy(xpath="//span[text()='Women Western']")
		private WebElement mouseOver2;
		
	
	/* search text field */
	@FindBy(xpath="//div[@class='nav-sub-list-cont']/descendant::span[text()='All Women Ethnic']")
	private WebElement getText;

	/*xpath for text field */
	public WebElement selectOne(String subTitle) {
		String xpathValue ="//div[@class='nav-sub-list-cont']/descendant::span[text()='"+subTitle+"']";
		return driver.findElement(By.xpath(xpathValue));
	}
	public WebElement clkOne(String subTitle2) {
		String xpathValue ="//div[@class='nav-sub-list-cont']/descendant::span[text()='"+subTitle2+"']";
	
		return driver.findElement(By.xpath(xpathValue));
	}
		
		
		public void headers(String fstElement,String subTitle,String secElement,String subTitle2) throws Throwable
		{
		web.mouseOver(driver, mouseOver);
		firstEle(fstElement).click();
		selectOne(subTitle).click();
		Thread.sleep(3000);
		web.mouseOver(driver, mouseOver2);
		//secEle(secElement).click();
		clkOne(subTitle2).click();
		
		}
		
		

}

