package ElementRepo_07;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;

public class HomePage 
{
	/*
	 * Description:Page is used for mouseOver On Element and click the first ring and apply Filtering
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
	@FindBy(xpath="//header[@class='white-header white-bg']/descendant::a[contains(text(),'Rings')]")
	private WebElement mouseOverOptions;

	/* mouseOver On Element */
	@FindBy(xpath="//header[@class='white-header white-bg']/descendant::span[contains(text(),'Solitaires ')]")
	private WebElement mouseOverOptions1;

	/* Genric xpath */
	private WebElement options(String value) {
		String xpath = "//header[@class='white-header white-bg']/descendant::a[contains(text(),'"+value+"')]";
		return driver.findElement(By.xpath(xpath));
	}

	/* Genric xpath */
	private WebElement options1(String value1) {
		String xpath1 = "//header[@class='white-header white-bg']/descendant::span[contains(text(),'"+value1+"')]";
		return driver.findElement(By.xpath(xpath1));
	}
	/* mouseOver */
	@FindBy(xpath = "//span[text()='Solitaires ']")
	private WebElement solMO;

	/*Rings click */
	@FindBy(xpath="//a[text()='Rings ']")
	private WebElement clkRingIcn;

	/*Engagmnt click*/
	@FindBy(xpath="//a[text()='Engagement']")
	private WebElement clkEngagmnttxt;

	/* price Icon */
	@FindBy(id="Price-form")
	private WebElement clkPriceIcon;

	/* select price */ 
	@FindBy(xpath="//span[@data-displayname=\"rs 10000 to rs 20000\"]")
	private WebElement seltPrice;

	/* mouseOver metal */ 
	@FindBy(xpath="//span[text()='Metal']")
	private WebElement metalClk;

	/*select metal*/
	@FindBy(xpath="//span[text()=' Gold ']")
	private WebElement seltGold;



	/*firstRing click*/
	@FindBy(xpath="//img[@alt=\"The Celestina Ring\"]")
	private WebElement clkFstRing;

	/**
	 * Description:Method is used for mouseOver all Element
	 * @author Shobha
	 * @param value
	 * @throws Throwable
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
	 * Description:Method is used for perform mouseOver
	 * @author Shobha
	 * @param value1
	 * @throws Throwable
	 */
	public void mousOvrOnElmnt(String value1) throws Throwable
	{
		try {
			options1(value1).click();
			System.out.println("===mouseOver performed Succesfully===");
		}catch(Exception e)
		{
			System.out.println("mouseOver not performed");
			Assert.fail("mouseOver not performed");
		}
	}
	/**
	 * Description:Method is used for click the Ring
	 * @author Shobha
	 * @throws Throwable 
	 */
	public void clkRing() throws Throwable
	{
		try {
			web.mouseOver(driver, solMO);
			web.mouseOver(driver, clkRingIcn);
			web.ClickableElement(driver, clkEngagmnttxt);
			//clkFstRing.click();
			System.out.println("===able to click first ring===");
		}catch(Exception e)
		{
			System.out.println("not able to click on ring");
			Assert.fail("not able to click on ring");

		}
	}
	/**
	 * Description:Method is used for filter the product
	 * @author Shobha
	 * 
	 */
	public void seltPriceMetal()
	{
		try {

			clkPriceIcon.click();
			seltPrice.click();
			metalClk.click();
			seltGold.click();
			clkFstRing.click();
			System.out.println("filter price and metal");
		}catch(Exception e)
		{
			System.out.println(" not filter price and metal");
			Assert.fail("not filter price and metal");
		}
	}


}















