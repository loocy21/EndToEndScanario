package ElementRepo_Ajio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	/*
	 * Description:Page is used for mouseOver On Element and get text
	 * @Author Shobha
	 * @param
	 * */

	WebDriverUtility web = new WebDriverUtility();
	WebDriver driver = null;
	public  HomePage(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/* mouseOver on Element */
	@FindBy(xpath="//div[@class='main-header dodShadow']//a[@title='MEN']")
	private WebElement mouseOvrOptions;

	/* mouseOver On Element */
	@FindBy(xpath="//div[@class='menu-flyout']/descendant::a[contains(text(),'CATEGORIES')]")
	private WebElement mouseOvrOption1;

	/* Genric xpath */
	private WebElement options(String value) {
		String xpath = "//div[@class='main-header dodShadow']/descendant::a[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath */
	private WebElement options1(String value1) {
		String xpath1 = "//header[@class='white-header white-bg']//descendant::a[@title,'"+value1+"')]";
		return driver.findElement(By.xpath(xpath1));
	}
	
	/* mouseOver on men */
	@FindBy(xpath = "//a[@title='MEN']")
	private WebElement mouseOverMen;
	
	/* Bag click */
	@FindBy(xpath = "//a[text()='Bags & Wallets']")
	private WebElement clkBags;
	
	/**
	 * Description:Method is used for mouseOver on all Elements
	 * @author Shobha
	 * @param value
	 * @throws Throwable
	 * 
	 */
	public void mousOvrOnElmnts(String value) throws Throwable
	{
		try {
			options(value).click();
			System.out.println("able to mouseOver");
		}catch(Exception e)
		{
			System.out.println("unable to mouseOver");
			Assert.fail("unable to mouseOver");
	}

}
	/**
	 * Description:Method is used for mouseOver on man and selt one element
	 * @author Shobha
	 * @throws Throwable
	 */
		public void seltProduct() throws Throwable
		{
			try {
			web.mouseOver(driver, mouseOverMen);
			clkBags.click();
			System.out.println("mouseOver and select one element succesfully");
			}catch(Exception e) 
			{
				System.out.println("mouseOver and select one element not succesfully");
				Assert.fail("mouseOver and select one element not succesfully");
			}
		}
	



}

